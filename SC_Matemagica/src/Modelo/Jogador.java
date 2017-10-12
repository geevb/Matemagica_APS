package Modelo;

import java.io.Serializable;

public class Jogador implements Serializable {

	private static final long serialVersionUID = 1L;
	protected String nome = "";
	protected int pontuacao = 0;
	
	public Jogador() {}
	
	public int getPontuacao() {
		return pontuacao;
	}
	
	public String getNome() {
		return nome;
	}
}
