package Modelo;
import java.util.concurrent.ThreadLocalRandom;


public class Questao {
	
	protected String numEsquerda;
	protected String numDireita;
	protected String operacao;
	protected String resposta;
	protected String simboloOperacao;
	
	public Questao() {}
	
	public Questao(String numEsquerda, String numDireita, String operacao, String simboloOperacao, String resposta) {
		this.numEsquerda = numEsquerda;
		this.numDireita = numDireita;
		this.operacao = operacao;
		this.simboloOperacao = simboloOperacao;
		this.resposta = resposta;
	}
	
	public Questao criarQuestaoFacil(String operacao) {
		int randomNumEsq = ThreadLocalRandom.current().nextInt(0, 9 + 1);
		int randomNumDir = ThreadLocalRandom.current().nextInt(0, 9 + 1);
		int resposta = verificarEExecutarOperacao(operacao, randomNumEsq, randomNumDir);
		String simboloOp = verificarSimboloOp(operacao);
		
		return new Questao(
				Integer.toString(randomNumEsq),
				Integer.toString(randomNumDir),
				operacao,
				simboloOp,
				Integer.toString(resposta)
				);
	}
	
	private String verificarSimboloOp(String nomeOperacao) {
		if (nomeOperacao.equals("(+)Adição")) { return "+"; }
			else if (nomeOperacao.equals("(-)Subtração")) { return "-"; }
				else if (nomeOperacao.equals("(x)Multiplicação")) { return "x"; }
		else { return "÷"; }
	}

	public Questao criarQuestaoMedio(String operacao) {
		int randomNumEsq = ThreadLocalRandom.current().nextInt(0, 50 + 1);
		int randomNumDir = ThreadLocalRandom.current().nextInt(0, 50 + 1);
		int resposta = verificarEExecutarOperacao(operacao, randomNumEsq, randomNumDir);
		String simboloOp = verificarSimboloOp(operacao);
	
		return new Questao(
				Integer.toString(randomNumEsq),
				Integer.toString(randomNumDir),
				operacao,
				simboloOp,
				Integer.toString(resposta)
				);
	
	}

	public String getSimboloOperacao() {
		return simboloOperacao;
	}

	public Questao criarQuestaoDificil(String operacao) {
		int randomNumEsq = ThreadLocalRandom.current().nextInt(0, 100 + 1);
		int randomNumDir = ThreadLocalRandom.current().nextInt(0, 100 + 1);
		int resposta = verificarEExecutarOperacao(operacao, randomNumEsq, randomNumDir);
		String simboloOp = verificarSimboloOp(operacao);
	
		return new Questao(
				Integer.toString(randomNumEsq),
				Integer.toString(randomNumDir),
				operacao,
				simboloOp,
				Integer.toString(resposta)
				);
	
	}
	
	public int verificarEExecutarOperacao(String operacao, int num1, int num2) {
		if (operacao.equals("(+)Adição")) { return somarNumeros(num1, num2); }
		else if (operacao.equals("(-)Subtração")) { return subtrairNumeros(num1, num2); }
		else if (operacao.equals("(x)Multiplicação")) { return multiplicarNumeros(num1, num2); }
		else { return dividirNumeros(num1, num2); }
	}
	
	public Questao criarQuestao(String dificuldade, String operacao) {
		
		if(operacao.equals("(/)Divisão")){ return criarQuestaoDivisao(dificuldade); }
		else {
		
			if(dificuldade.equals("Fácil")) { return criarQuestaoFacil(operacao); }
			else if (dificuldade.equals("Médio")) { return criarQuestaoMedio(operacao); }
			else { return criarQuestaoDificil(operacao); }
		}
	}
	
	private Questao criarQuestaoDivisao(String dificuldade) {
		int randomNumEsq = 0;
		int randomNumDir = 0;
		boolean divisaoInteira = false;
		int resposta = 0;		
		
		while(!divisaoInteira) {
			randomNumEsq = ThreadLocalRandom.current().nextInt(0, 50 + 1);
			randomNumDir = ThreadLocalRandom.current().nextInt(1, 5 + 1);
			
			if (randomNumEsq % randomNumDir == 0){
				divisaoInteira = true;
				resposta = (randomNumEsq/randomNumDir);
			} else {}	
	
		}
		
		return new Questao(
				Integer.toString(randomNumEsq),
				Integer.toString(randomNumDir),
				operacao,
				"÷",
				Integer.toString(resposta)
				); 		
	}


	public String getNumEsquerda() {
		return numEsquerda;
	}

	public String getNumDireita() {
		return numDireita;
	}

	public String getOperacao() {
		return operacao;
	}

	public String getResposta() {
		return resposta;
	}

	public int somarNumeros (int num1, int num2) {
		return num1 + num2;
	}
	
	public int subtrairNumeros(int num1, int num2) {
		return num1 - num2;
	}
	
	public int multiplicarNumeros (int num1, int num2) {
		return num1 * num2;
	}
	
	public int dividirNumeros (int num1, int num2) {
		return num1 / num2;
	}
	
	

	
	
}
