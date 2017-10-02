/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author getuliovb
 */
public class Sistema {
    
    protected int tmpFacil;
    protected int tmpMedio;
    protected int tmpDificil;
    protected Scanner scan;
    
    protected String path_arq_config = "config/sis.config";
    
    public Sistema(){
        carregarTempos();        
    }
    
    private void carregarTempos(){
        try {
        scan = new Scanner(new File(path_arq_config));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
            setTmpFacil(scan.nextInt());
            setTmpMedio(scan.nextInt());
            setTmpDificil(scan.nextInt());
    }
    
    public void alterarConfiguracoes(int tmpFacil, 
            int tmpMedio, int tmpDificil) throws IOException{
        
            this.setTmpFacil(tmpFacil);
            this.setTmpFacil(tmpFacil);
            this.setTmpFacil(tmpFacil);            
            this.escreverNovoArquivoConfig(tmpFacil, tmpMedio, tmpDificil);
    }   
    
    public boolean configuracoesValidas(int tmpFacil, 
            int tmpMedio, int tmpDificil){
        
        if(tmpFacil > 0){} else { return false; }
        if(tmpMedio > 0){} else { return false; }
        if(tmpDificil > 0 ){} else { return false; }
        return true;        
    }
    
    
   public void escreverNovoArquivoConfig(int tmpFacil, 
            int tmpMedio, int tmpDificil) throws IOException{
        
        File novoArq = new File(path_arq_config);
        FileWriter arqWriter = null;
        try {
            arqWriter = new FileWriter(novoArq, false);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        arqWriter.write(tmpFacil + " " + tmpMedio + " " + tmpDificil);
        arqWriter.close();
   }
    
    
    public int getTmpFacil(){
        return tmpFacil;
    }
    
    public int getTmpMedio(){
        return tmpMedio;
    }
    
    public int getTmpDificil(){
        return tmpDificil;
    }

    public void setTmpFacil(int tmpFacil) {
        this.tmpFacil = tmpFacil;
    }

    public void setTmpMedio(int tmpMedio) {
        this.tmpMedio = tmpMedio;
    }

    public void setTmpDificil(int tmpDificil) {
        this.tmpDificil = tmpDificil;
    }
    
    
    
}
