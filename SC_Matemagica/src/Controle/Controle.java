/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Sistema;
import GUI.Mensagens;
import GUI.TelaLogin;
import java.io.IOException;

/**
 *
 * @author getuliovb
 */
public class Controle {
    
    protected Sistema sis;
    protected Mensagens msg;
    
    public Controle(){
        sis = new Sistema();
    }
    
    
    public void iniciarAplicacao(){
        //Chamar tela Inicial(login) da aplicação
        new TelaLogin().setVisible(true);
        
    }
    
    public void alterarConfiguracoes(int tmpFacil, 
            int tmpMedio, int tmpDificil) throws IOException{
        // Verifica se as novas configurações recebidas são válidas
        if(sis.configuracoesValidas(tmpFacil, tmpMedio, tmpDificil)){
           
           // Alterar o arquivo de configurações atual.
           sis.alterarConfiguracoes(tmpFacil, tmpMedio, tmpDificil);
        }        
        else {
           // Printar mensagem de configuração inválida.
           msg.msgConfigInvalida(); 
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
            
            
    
}
