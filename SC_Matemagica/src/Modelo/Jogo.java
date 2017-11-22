package Modelo;

public class Jogo {
	
	private int numQuestao = 1;
	private String dificuldade;
	private String operacao;
	private int tempoDaDificuldade;
	private int tempoDaResposta;

	public void zerarAtributos() {
		this.numQuestao = 1;
		this.dificuldade = null;
		this.operacao = null;
		this.tempoDaDificuldade = 0;
		this.tempoDaResposta = 0;
	}

	public void finalizar() {
		zerarAtributos();
	}
	
	public int retornarCodigoDaPartidaAtual() {
		if (operacao.equals("(+)Adição")) return 1;
		else if (operacao.equals("(-)Subtração")) return 2;
		else if (operacao.equals("(x)Multiplicação")) return 3;
		else return 4;
	}

	public int getTempoDaDificuldade() {
		return tempoDaDificuldade;
	}

	public int getTempoDaResposta() {
		return tempoDaResposta;
	}
	
	public void setTempoDaDificuldade(int tempoDaDificuldade) {
		this.tempoDaDificuldade = tempoDaDificuldade;
	}
	
	public void setTempoDaResposta(int tempoDaResposta) {
		this.tempoDaResposta = tempoDaResposta;
	}
	
	public void passarTempo() {
		if (getTempoDaResposta() > 0) {
			this.tempoDaResposta--;
		}
		
	}

	public Jogo() {}
	
	public String getDificuldade() {
		return dificuldade;
	}
	
	public void iniciarPartida(String dificuldade, int tempoDaResposta) {		
		this.dificuldade = dificuldade;
		this.tempoDaResposta = tempoDaResposta;
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
