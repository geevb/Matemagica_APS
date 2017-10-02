package Controle;

import GUI.TelaPrincipalAreaEducador;
import GUI.TelaLogin;

import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author getuliovb
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Controle ctr = new Controle();
        //ctr.alterarConfiguracoes(999, 999, 999);
        new TelaLogin(ctr).setVisible(true);
    }
    
}
