
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;

import Modelo.*;
import gui.*;

public class Controle {
    
    protected Sistema sis;
    protected Mensagens msg;
    protected Ranking rnk;
    protected Questao qst;
    protected Jogo jogo;
    protected TelaJogo jogogui;
    protected Jogador jogador1;
    protected Jogador jogador2;
    
    public Controle() {

        this.sis = new Sistema();
        this.msg = new Mensagens();
        this.rnk = new Ranking();
        this.jogo = new Jogo();
        this.qst = new Questao();
        this.jogogui = new TelaJogo(this);
        
        verificarSePastasObrigatoriasExistem();
        carregarInformacoes();
    }
    
    ///////////////////// CONTROLE /////////////////////
    private void verificarSePastasObrigatoriasExistem() {
    	/* Pastas obrigatórias
    	 * 
    	 * 1 - Pasta de Configurações: "config"
    	 * 2 - Pasta de Rankings: "rankings"
    	 */
    	File PATH_DIR_CONFIG = new File("config");
    	File PATH_DIR_RANKINGS = new File("rankings");
    	
    	// Verificação de pastas existentes
    	if (!PATH_DIR_CONFIG.exists()) {
    		PATH_DIR_CONFIG.mkdir();
    		sis.criarArquivoConfiguracao();

    	}
    	
    	if (!PATH_DIR_RANKINGS.exists()) {
    		PATH_DIR_RANKINGS.mkdir();
    		rnk.criarArquivosDeRankings();
    	}
		
    }
    
    private void carregarInformacoes() {
    	sis.carregarTempos();
    	rnk.carregarRankings();    	
    }
    ///////////////////////////////////////////////////////////

    
    
    
    //////////////////////////// GUI ////////////////////////////
    public void iniciarAplicacao(){
    	new TelaLogin(this).setVisible(true);
    }
   
    ////////////////////////////////////////////////////////////

//    
    
    public void iniciarPartidaUmJogador(String nomeJogador, String dificuldade, String operacao){   
    	jogo.setDificuldade(dificuldade);
    	jogo.setOperacao(operacao);
    	jogo.setTempo(sis.getTempoDaPartida(dificuldade));
        jogador1 = new Jogador(nomeJogador);
    	jogogui.criarTelaJogoUmJogador();
    	criarThreadTempo();
    }
    
      
    public void proximaRodada() {   	
    	jogogui.iniciarPartida();
    	if(jogo.getNumQuestao() == 10) { 
    		//terminarJogo(); 
    		System.out.println("TERMINEI"); 
    	}
    	

    	Questao tmp = new Questao();
    	qst = tmp.criarQuestao(jogo.getDificuldade(), jogo.getOperacao());
    	ArrayList<String> botoes = new ArrayList<>();
    	botoes = sortearBotoes(qst.getResposta());

 	
    	jogogui.atualizarInformacoes(sis.getTempoDaPartidaString(jogo.getDificuldade()),
    			jogo.getNumQuestaoString(), jogador1.getPontuacaoString(), qst.getNumEsquerda(),
        		qst.getNumDireita(), qst.getSimboloOperacao(),
        		botoes.get(0), botoes.get(1), botoes.get(2), botoes.get(3));
    	jogo.incrementarNumQuestao();   	
    }

    public void criarThreadTempo() {
    	int tempoLocal = Integer.parseInt(sis.getTempoDaPartidaString(jogo.getDificuldade()));
    	Runnable tempo = () -> {
            System.out.println(Thread.currentThread().getName() + " is running");
            Timer timer = new Timer();
    		TimerTask timerTask = new TimerTask() {
    			@Override
    			public void run() {
    				System.out.println("Rodando");
    				if (tempoLocal == 0) {
    						System.out.println("CABEI!");
    						timer.purge();
        					timer.cancel();
    					}

    					
    				}

    			

    		};
    		timer.schedule(timerTask, 0, 500);
        
           	
    	
    	};
    	new Thread(tempo).start(); 
    }
    
    public ArrayList<String> sortearBotoes(String respostaCorreta){
    	ArrayList<String> arrayBotoes = new ArrayList<>();
    	int respostaCorretaInt = Integer.parseInt(respostaCorreta);
    	int randomPos = ThreadLocalRandom.current().nextInt(0, 3 + 1);
    	
    	for(int i = 0; i < 3; i++) {
    		int randomNum = ThreadLocalRandom.current().nextInt(-20, 10 +1);
    		String numeroAleatorio = Integer.toString((randomNum + respostaCorretaInt));
    		arrayBotoes.add(i, numeroAleatorio);    		
    	}
    	
    	System.out.println("Botao correto na posicao: " + (randomPos +1));
    	System.out.println("Resposta: " + respostaCorreta);
    	arrayBotoes.add(randomPos, respostaCorreta);
    	
    	return arrayBotoes;
    }
    
    public String getResposta() {
    	return jogogui.getResposta();
    }
    
    public void verificarResposta(String resposta) {
    	if (qst.getResposta().equals(resposta)) {
        	jogador1.pontuar(1);
        	System.out.println("Pontuei!");
        }
    }
    
    ////////////////////////// RANKING //////////////////////////
    
	public void fluxoRanking(Jogador jogador, int cod_ranking) {
    	rnk.fluxoRanking(jogador, cod_ranking);    	
    }
    
    public void printarConteudoRanking(int cod_ranking) {
    	rnk.printarConteudoRankings(cod_ranking);
    }
    
    ////////////////////////////////////////////////////////////
    

    
    
    
    
    
    ///////////////////// SISTEMA /////////////////////
    public void alterarConfiguracoes(String tmpFacil, 
            String tmpMedio, String tmpDificil) throws IOException{
           // Verifica se as novas configurações recebidas são válidas          
           // Alterar o arquivo de configurações atual.
           sis.alterarConfiguracoes(tmpFacil, tmpMedio, tmpDificil);
    }

    public boolean configuracoesValidas(String tmpFacil, 
            String tmpMedio, String tmpDificil){
        return sis.configuracoesValidas(tmpFacil, tmpMedio, tmpDificil);
    }
    
    public boolean efetuarAlteracoes(String tmpFacil, 
            String tmpMedio, String tmpDificil) throws IOException{
        if(sis.configuracoesValidas(tmpFacil, tmpMedio, tmpDificil)){
            sis.alterarConfiguracoes(tmpFacil, tmpMedio, tmpDificil);
            return true;
        } else {
            msg.msgConfigInvalida();
            return false;
        }
    }
       
    public int getTmpFacil() {
        return sis.getTmpFacil();
    }
    
    public int getTmpMedio() {
        return sis.getTmpMedio();
    }
    
    public int getTmpDificil() {
        return sis.getTmpDificil();
    }
    
    public boolean isPasswordCorrect(char[] senha) {
    	return sis.isPasswordCorrect(senha);
    }

    public void iniciarAreaEducador() {
    	new TelaPrincipalAreaEducador(this).setVisible(true);
    }
    
    public void iniciarAreaAluno() {
    	new TelaPrincipalAreaAluno(this).setVisible(true);
    }
    
    public boolean efetuarLogin(String tipoUsuario, char[] senha){

    	if(tipoUsuario.equals("Jogador")){
            //msg.msgBemVindo();
            iniciarAreaAluno();
            return true;
        } else if(tipoUsuario.equals("Educador") && this.isPasswordCorrect(senha)){
        	iniciarAreaEducador();
    		return true;
        } else {
            msg.msgSenhaInvalida();
            return false;
        }
    }
    ///////////////////////////////////////////////////////////

	public ArrayList<Jogador> getRankingSoma() {
		return rnk.getRankingSoma();
	}

	public ArrayList<Jogador> getRankingSubtracao() {
		return rnk.getRankingSubtracao();
	}

	public ArrayList<Jogador> getRankingMultiplicacao() {
		return rnk.getRankingMultipliacao();
	}

	public ArrayList<Jogador> getRankingDivisao() {
		return rnk.getRankingDivisao();
	}

}