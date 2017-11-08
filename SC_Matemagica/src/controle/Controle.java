
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
    protected Timer timer;
    
    private boolean partidaFinalizada = false;
    
    public Controle() {

        this.sis = new Sistema();
        this.msg = new Mensagens();
        this.rnk = new Ranking();
        this.qst = new Questao();
        
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
    	setPartidaFinalizada(false);
    	this.jogo = new Jogo();
    	jogo.setDificuldade(dificuldade);
    	jogo.setOperacao(operacao);
    	jogo.setTempoDaDificuldade(sis.getTempoDaPartida(dificuldade));
        jogador1 = new Jogador(nomeJogador);
        
        this.jogogui = new TelaJogo(this);
    	jogogui.criarTelaJogoUmJogador();
    	jogogui.iniciarPartida();
    	
    	this.timer = new Timer();
    }
    
      
    public void proximaRodada() {
    	if(jogo.getNumQuestao() == 11) {    		
    		terminarJogo();
    	} else {
    	    	
    		Questao tmp = new Questao();
    		qst = tmp.criarQuestao(jogo.getDificuldade(), jogo.getOperacao());
    		ArrayList<String> botoes = new ArrayList<>();
    		botoes = sortearBotoes(qst.getResposta());

    	
    		jogogui.atualizarInformacoes(
    			jogo.getNumQuestaoString(), jogador1.getPontuacaoString(), qst.getNumEsquerda(),
        		qst.getNumDireita(), qst.getSimboloOperacao(),
        		botoes.get(0), botoes.get(1), botoes.get(2), botoes.get(3));
    		jogo.incrementarNumQuestao();
    		//criarThreadTempo();
    		atualizarTempoDaTela();
    	}
    }

    private void setPartidaFinalizada(boolean b) {
		this.partidaFinalizada = b;		
	}

    
    public void atualizarTempoDaTela() {
    	int tempoLocal = jogo.getTempoDaDificuldade();
    	jogo.setTempoDaResposta(tempoLocal);
    	if (timer != null) { timer.cancel(); }    	
    	
    	TimerTask timerTask = new TimerTask() {
    	
			@Override
			public void run() {
				jogogui.passarTempo(jogo.getTempoDaResposta());
				if (jogo.getTempoDaResposta() == 0 ||  getPartidaFinalizada()) {
					System.out.println("CABEI!");
				
					timer.purge();
					timer.cancel();
				} else {    			
					jogo.passarTempo(); // Decrementa uma unidade de tempo
				 // Altera a label de tempo com o tempo atual
				// Verificar se o tempo para pontuacao esgotou ou botao de resposta foi clicado.
				}
			}
    	};
    	
    	timer = new Timer();
		timer.scheduleAtFixedRate(timerTask, 0, 50);

    }
    
//	public void criarThreadTempo() {
//    	Thread thread;
//    	int tempoLocal = jogo.getTempoDaDificuldade();
//    	jogo.setTempoDaResposta(tempoLocal);
//    	Runnable tempo = () -> {
//            System.out.println(Thread.currentThread().getName() + " is running");
//            Timer timer = new Timer();
//    		TimerTask timerTask = new TimerTask() {
//				@Override
//    			public void run() {
//    				jogogui.passarTempo(jogo.getTempoDaResposta());
//    				if (jogo.getTempoDaResposta() == 0 || getPartidaFinalizada()) {
//						System.out.println("CABEI!");
//						timer.purge();
//    					timer.cancel();
//    					//setNovaRodada(false);        					
//    					try {	
//    						Thread.currentThread().join();
//							Thread.currentThread().interrupt();
//						} catch (InterruptedException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//				}    			
//    				jogo.passarTempo(); // Decrementa uma unidade de tempo
//    				 // Altera a label de tempo com o tempo atual
//    				// Verificar se o tempo para pontuacao esgotou ou botao de resposta foi clicado.
//    						
//    			}
//    		};
//    		// Tempo em ms.
//    		timer.schedule(timerTask, 0, 100);   	
//    	};
//    	
//    	thread = new Thread(tempo);
//    	thread.start();
//    }
    
    public void terminarJogo() {
    	setPartidaFinalizada(true);
    	finalizarGuiJogo();
        boolean entrouRanking = false;
    	
    	// Verifica se entra no ranking e retorna com a futura posicao
    	int posicaoNoRanking = rnk.entraNoRanking(jogador1, getCodDaOperacaoDaPartida());
    	if(posicaoNoRanking != -1) {
    		rnk.adicionarAoRanking(jogador1, getCodDaOperacaoDaPartida(), posicaoNoRanking);
                entrouRanking = true;
    	} else {}
        
    	TelaPontuacaoFinal telaFinal = new TelaPontuacaoFinal(this);
        telaFinal.atualizarDadosDoJogador(jogador1.getNome(), jogador1.getPontuacaoString(), entrouRanking);
        telaFinal.setVisible(true);
        
    }
   
    public void finalizarGuiJogo() {
    	jogogui.finalizarTelaGui();
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
    	
    	arrayBotoes.add(randomPos, respostaCorreta);
    	
    	return arrayBotoes;
    }
    
    public int getCodDaOperacaoDaPartida() {
    	return jogo.retornarCodigoDaPartidaAtual();
    }
    
    public String getResposta() {
    	return jogogui.getResposta();
    }
    
    public void verificarResposta(String resposta) {
    	if (qst.getResposta().equals(resposta)) {
        	jogador1.pontuar(jogo.getTempoDaResposta());
        	System.out.println("Pontuei: " + jogo.getTempoDaResposta());
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
    

	private boolean getPartidaFinalizada() {					
		return partidaFinalizada;
	}
    
    
    
    
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