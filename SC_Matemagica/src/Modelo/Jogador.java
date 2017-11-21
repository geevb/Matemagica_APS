package Modelo;

import java.io.Serializable;

public class Jogador implements Serializable {

	private static final long serialVersionUID = 1L;
	protected String nome = "";
	protected int pontuacao = 0;
	
	public Jogador(String nomeJogador) {
        this.nome = nomeJogador;
    }
	
	public void pontuar(int pontos) {
		pontuacao = pontuacao + pontos;		
	}
	
	public int getPontuacao() {
		return pontuacao;
	}
	
	public String getPontuacaoString() {
		return Integer.toString(pontuacao);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
