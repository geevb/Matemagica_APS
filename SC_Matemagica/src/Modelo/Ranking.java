package Modelo;

import java.util.ArrayList;

import Modelo.Jogador;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;



public class Ranking implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	protected ArrayList<Jogador> rnkSoma;
	protected ArrayList<Jogador> rnkSubtracao;
	protected ArrayList<Jogador> rnkMultiplicacao;
	protected ArrayList<Jogador> rnkDivisao;
	
	private final String PATH_RNK_SOMA = "rankings/rankingSoma";
	private final String PATH_RNK_SUBTRACAO = "rankings/rankingSubtracao";
	private final String PATH_RNK_MULTIPLICACAO = "rankings/rankingMultiplicacao";
	private final String PATH_RNK_DIVISAO = "rankings/rankingDivisao";
	
	
	public Ranking() {}
	
	public void carregarRankings() {
		this.rnkSoma = carregarArray(PATH_RNK_SOMA);
		this.rnkSubtracao = carregarArray(PATH_RNK_SUBTRACAO);
		this.rnkMultiplicacao = carregarArray(PATH_RNK_MULTIPLICACAO);
		this.rnkDivisao = carregarArray(PATH_RNK_DIVISAO);
	}
	
	public void criarArquivosDeRankings() {
		criarArquivo(PATH_RNK_SOMA);
		criarArquivo(PATH_RNK_SUBTRACAO);	
		criarArquivo(PATH_RNK_MULTIPLICACAO);	
		criarArquivo(PATH_RNK_DIVISAO);	
	}
	
	public void criarArquivo(String caminhoArquivo) {
		FileOutputStream fo;
		ArrayList<Jogador> arrayJogador = new ArrayList<Jogador>();
		Jogador jogador = new Jogador("Professor");
		arrayJogador.add(jogador);
		
		try {
			fo = new FileOutputStream(new File(caminhoArquivo));
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			
			oo.writeObject(arrayJogador);
			oo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void atualizarRanking(int cod_ranking) {
		try {
			//File ranking = new File(retornarRankingDoCodigo(cod_ranking));
			FileOutputStream f = new FileOutputStream(
					new File(retornarCaminhoDoRanking(cod_ranking)));
			ObjectOutputStream o = new ObjectOutputStream(f);
			
			o.writeObject(retornarRankingDoCodigo(cod_ranking));
			o.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@SuppressWarnings("unchecked")
	private ArrayList<Jogador> carregarArray(String caminhoAoRanking) {
		
		FileInputStream fi;
		ObjectInputStream oi;
		ArrayList<Jogador> tmpArray = null;
		
		try {
			fi = new FileInputStream(new File(caminhoAoRanking));
			oi = new ObjectInputStream(fi);
			
			tmpArray = (ArrayList<Jogador>) oi.readObject();
			
			oi.close();
			fi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return tmpArray;

	}

	public void fluxoRanking(Jogador jogador, int cod_ranking) {
			
		// Verificar se o jogador entrar no Ranking respectivo ao código do ranking recebido
		int posicaoDoNovoJogador = entraNoRanking(jogador, cod_ranking);
		if(posicaoDoNovoJogador != -1) {
			//Adicionar jogador ao respectivo ranking.
			adicionarAoRanking(jogador,
							   cod_ranking,
							   posicaoDoNovoJogador);
		} else {
			// Jogador não entra no ranking
		}
		
		//carregarRankings();
		
	}

	public void printarConteudoRankings(int cod_ranking) {
		ArrayList<Jogador> tmpArray = retornarRankingDoCodigo(cod_ranking);		
		for ( Jogador i : tmpArray ) {
			System.out.println(i.nome + " " + i.pontuacao);
		}
		
	}
	
	public void adicionarAoRanking(Jogador jogador, int cod_ranking, int posicao) {
		retornarRankingDoCodigo(cod_ranking).add(posicao, jogador);
		//Corta jogadores que ultrapassem o tamanho de 5 pesoas no ranking
		if (retornarRankingDoCodigo(cod_ranking).size() > 5) {
			retornarRankingDoCodigo(cod_ranking).subList(5, 
					retornarRankingDoCodigo(cod_ranking).size()).clear();
		}
		atualizarRanking(cod_ranking);
	}
	
	public ArrayList<Jogador> retornarRankingDoCodigo(int cod_ranking) {
		/*Código dos rankings: 
		 * 1 = Soma
		 * 2 = Subratacao
		 * 3 = Multiplicacao
		 * 4 = Divisao
		 */
		
		if (cod_ranking == 1) { return rnkSoma; }			
		else if (cod_ranking == 2) { return rnkSubtracao; }
		else if (cod_ranking == 3) { return rnkMultiplicacao; }
		else { return rnkDivisao; }
	}
	
	public String retornarCaminhoDoRanking(int cod_ranking) {
		if (cod_ranking == 1) { return PATH_RNK_SOMA; }			
		else if (cod_ranking == 2) { return PATH_RNK_SUBTRACAO; }
		else if (cod_ranking == 3) { return PATH_RNK_MULTIPLICACAO; }
		else { return PATH_RNK_DIVISAO; }		
	}
	
	//Retorna se o jogador entra no ranking com a sua futura posicao.
	//Caso não entre, retorna -1
	public int entraNoRanking(Jogador jogador, int cod_ranking) {		
		
		if(retornarRankingDoCodigo(cod_ranking).isEmpty()) { return 0; }
		
		for(int i=0; i < retornarRankingDoCodigo(cod_ranking).size(); i++) {
			if (jogador.getPontuacao() > retornarRankingDoCodigo(cod_ranking).get(i).getPontuacao()) {
				return i;				
			}
		}
		return -1;
	}

	public String getRankingCsv() {
		String titulo = "Ranking; \r\n";
		String subTituloOperacoes = "Soma;Subtracao;Multiplicacao;Divisao;\r\n";
		StringBuilder sb = new StringBuilder();
		
		sb.append(titulo);
		sb.append(subTituloOperacoes);
		

		for(int i = 0; i < 5; i++) {
			sb.append(getRankingSoma().get(i).getNome() + ";");
			sb.append(getRankingSubtracao().get(i).getNome() + ";");
			sb.append(getRankingMultiplicacao().get(i).getNome() + ";");
			sb.append(getRankingDivisao().get(i).getNome() + ";");
			sb.append("\r\n");
		}
		

		return sb.toString();		
	}
	
	public ArrayList<Jogador> getRankingSoma() {
		return rnkSoma;
	}

	public ArrayList<Jogador> getRankingSubtracao() {
		return rnkSubtracao;
	}

	
	public ArrayList<Jogador> getRankingMultiplicacao() {
		return rnkMultiplicacao;
	}

	public ArrayList<Jogador> getRankingDivisao() {
		return rnkDivisao;
	}


	public void salvarRankingsCsv(String destinoArquivo) {
		String nomeFinalDoArquivo = destinoArquivo + "/" + "RelatorioRankings.csv";
		System.out.println(nomeFinalDoArquivo);
        try {
			Files.write(Paths.get(nomeFinalDoArquivo), getRankingCsv().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

}
