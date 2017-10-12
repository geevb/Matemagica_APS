package Modelo;

import Modelo.Jogador;
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class Ranking implements Serializable {
	
	protected ArrayList<Jogador> rnkSoma;
	protected ArrayList<Jogador> rnkSubtracao;
	protected ArrayList<Jogador> rnkMultiplicacao;
	protected ArrayList<Jogador> rnkDivisao;
	
	protected String PATH_RNK_SOMA = "rankings/rankingSoma";
	protected String PATH_RNK_SUBTRACAO = "rankings/rankingSubtracao";
	protected String PATH_RNK_MULTIPLICACAO = "rankings/rankingMultiplicacao";
	protected String PATH_RNK_DIVISAO = "rankings/rankingDivisao";
	
	
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
		Jogador jogador = new Jogador();
		arrayJogador.add(jogador);
		
		try {
			fo = new FileOutputStream(new File(caminhoArquivo));
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			
			oo.writeObject(arrayJogador);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void atualizarRankings() {
//		try {
//			f = new FileOutputStream(new File(".txt"));
//			ObjectOutputStream o = new ObjectOutputStream(f);
//			
//			o.writeObject(rnkSoma);
//			o.writeObject(rnkSubtracao);
//			o.writeObject(rnkMultiplicacao);
//			o.writeObject(rnkDivisao);
//			
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
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
		int posicaoDoNovoJogador = entraNoRanking(jogador, retornarRankingDoCodigo(cod_ranking));
		if(posicaoDoNovoJogador != -1) {
			//Adicionar jogador ao respectivo ranking.
			adicionarAoRanking(jogador, 
							   retornarRankingDoCodigo(cod_ranking), 
					           posicaoDoNovoJogador);
		} else {}
		
	}
	
	public void adicionarAoRanking(Jogador jogador, ArrayList<Jogador> ranking, int posicao) {
		if(ranking.isEmpty()) {ranking.add(posicao, jogador);}
		else {
			ranking.add(posicao, jogador);
		}
		//Corta jogadores que ultrapassem o tamanho de 5 pesoas no ranking
		ranking.subList(5, ranking.size()).clear();
		atualizarRankings();
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
	
	//Retorna se o jogador entra no ranking com a sua futura posicao.
	//Caso não entre, retorna -1
	public int entraNoRanking(Jogador jogador, ArrayList<Jogador> ranking) {
		
		
		if(ranking.isEmpty()) { return 0; }
		
		for(int i=0; i < ranking.size(); i++) {
			System.out.println("Pontuacao: " + ranking.get(i).getPontuacao());
			if (jogador.getPontuacao() > ranking.get(i).getPontuacao()) {
				return i;				
			}
		}
		return -1;
	}



}
