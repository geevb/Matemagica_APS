package Modelo;

public class Jogo {
	
	private int numQuestao = 1;
	private String dificuldade;
	private String operacao;
	private int tempo;

	public void zerarAtributos() {
		this.numQuestao = 1;
		this.dificuldade = null;
		this.operacao = null;
		this.tempo = 0;
	}

	public int retornarCodigoDaPartidaAtual() {
		if (operacao.equals("(+)Adição")) return 1;
		else if (operacao.equals("(-)Subtração")) return 2;
		else if (operacao.equals("(x)Multiplicação")) return 3;
		else return 4;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	public void passarTempo() {
		if (getTempo() > 0) {
			this.tempo--;
		}
		
	}

	public Jogo() {}
	
	public String getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(String dificuldade) {
		this.dificuldade = dificuldade;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public void setNumQuestao(int numQuestao) {
		this.numQuestao = numQuestao;
	}

	public void fluxoJogoUmJogador(Jogador jogador) {
		
		/*
		 * 0 - Chamar tela do jogo
		 * 1 - Verificar quantidade de questões apresentadas
		 * 2 - Apresentar questão
		 * 3 - Receber resposta
		 * 4 - Validar(Pontuar ou não) questão
		 * 5 - Cabou? Contabilizar resultado
		 * 6 - Verificar se entra no ranking
		 * 7 - Adicionar ou não ao ranking
		 * 8 - Deseja jogar novamente?		  
		 */		
		
	}
	
        public void iniciarPartidaUmJogador(Jogador jogador){
        
            
        
        }
        
	public void fluxoJogoDoisJogadores() {
		
		/*
		 * 0 - Chamar tela do jogo
		 * 1 - Verificar quantidade de questões apresentadas
		 * 2 - Apresentar questões ao jogador 1,
		 * 3 - Apresentar questão escolhida ao jogador 2; 
		 * 3 - Receber resposta
		 * 4 - Validar(Pontuar ou não) questão
		 *   - Apresentar questões ao jogador 2
		 *   - Apresentar questão escolhida ao jogador 1
		 * 5 - Cabou? Contabilizar resultado
		 * 6 - Verificar se entra no ranking
		 * 7 - Adicionar ou não ao ranking
		 * 8 - Deseja jogar novamente?		  
		 */	
		
		
	}
	
	public int getNumQuestao() {
		return numQuestao;
	}
	
	public String getNumQuestaoString() {
		return Integer.toString(numQuestao);
	}

	public void incrementarNumQuestao() {
		numQuestao++;
	}
		
}
