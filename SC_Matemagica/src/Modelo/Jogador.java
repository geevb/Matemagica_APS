package Modelo;

import java.io.Serializable;

public class Jogador implements Serializable {

	private static final long serialVersionUID = 1L;
	protected String nome = "Jogador 3";
	protected int pontuacao = 102;
	
	public Jogador() {}
	
	public int getPontuacao() {
		return pontuacao;
	}
	
	public String getNome() {
		return nome;
	}
}
