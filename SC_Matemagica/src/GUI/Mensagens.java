/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author getuliovb
 */
public class Mensagens {
    
    public Mensagens(){};
    
    public void msgConfigInvalida(){
        JOptionPane.showMessageDialog(null,"Configuração inválida!"
                + " \nPor favor, insira apenas números maiores que zero!");
    }
    
    
    
}