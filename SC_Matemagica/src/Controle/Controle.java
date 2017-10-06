
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Sistema;
import GUI.*;

import java.io.IOException;

import javax.swing.JOptionPane;

/**
 *
 * @author getuliovb
 */
public class Controle {
    
    protected Sistema sis;
    protected Mensagens msg;
    
    public Controle(){
        sis = new Sistema();
        msg = new Mensagens();
    }
    
    
    public void iniciarAplicacao(){
        //Chamar tela Inicial(login) da aplicação
    }
    
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
    
    public boolean efetuarLogin(String tipoUsuario, char[] senha){
    	if(tipoUsuario.equals("Jogador")){
            JOptionPane.showMessageDialog(null, "Bem-vindo ao Matemagica!");
            // Criar tela area do estudante.
            return true;
        } else if(tipoUsuario.equals("Educador") && this.isPasswordCorrect(senha)){
    		new TelaPrincipalAreaEducador(this).setVisible(true);
    		return true;
        } else {
            msg.msgSenhaInvalida();
            return false;
        }
    }
    
}