
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.*;
import GUI.*;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;



public class Controle {
    
    protected Sistema sis;
    protected Mensagens msg;
    protected Ranking rnk;
    
    public Controle() {

        this.sis = new Sistema();
        this.msg = new Mensagens();
        this.rnk = new Ranking();
        
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
    	// Iniciar área do aluno
    }
    
    public boolean efetuarLogin(String tipoUsuario, char[] senha){

    	if(tipoUsuario.equals("Jogador")){
            msg.msgBemVindo();
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
    
}