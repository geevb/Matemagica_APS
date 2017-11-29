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
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;


public class Sistema {
    
    protected int tmpFacil;
    protected int tmpMedio;
    protected int tmpDificil;
    protected Scanner scan;
    
    private String PATH_ARQ_CONFIG = "config/sis.config";
    private String configInicial = "300 300 300";

    
    public Sistema() {}
    
    public boolean verificarExisteArquivoConfiguracao(File PATH_DIR_CONFIG) {
    	return PATH_DIR_CONFIG.exists();
    }
    
    public void criarArquivoConfiguracao() {
    	try {
    		Files.write(Paths.get(PATH_ARQ_CONFIG), configInicial.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}    	
    }
    
    public void carregarTempos(){
        try {
        	scan = new Scanner(new File(PATH_ARQ_CONFIG));
        } catch (FileNotFoundException e) {
        		e.printStackTrace();
        }
        	
        	setTmpFacil(scan.nextInt());
        	setTmpMedio(scan.nextInt());
        	setTmpDificil(scan.nextInt());	
    }
    
    public void alterarConfiguracoes(String tmpFacil, 
            String tmpMedio, String tmpDificil) throws IOException{
        
            this.setTmpFacil(Integer.parseInt(tmpFacil));
            this.setTmpMedio(Integer.parseInt(tmpMedio));
            this.setTmpDificil(Integer.parseInt(tmpDificil));            
            this.escreverNovoArquivoConfig(tmpFacil, tmpMedio, tmpDificil);
    }   
    
    public boolean configuracoesValidas(String tmpFacil, 
            String tmpMedio, String tmpDificil){
        
        try {
            if(Integer.parseInt(tmpFacil) > 0 && tmpFacil.length() <= 3){} 
            else { return false; }
            if(Integer.parseInt(tmpMedio) > 0 && tmpMedio.length() <= 3){} 
            else { return false; }
            if(Integer.parseInt(tmpDificil) > 0 && tmpDificil.length() <= 3){} 
            else { return false; }
        }
        catch(NumberFormatException nfe){
            // Printar Exception tratada
            //nfe.printStackTrace();
            return false;
        }
        return true;        
    }
    
    
   public void escreverNovoArquivoConfig(String tmpFacil, 
            String tmpMedio, String tmpDificil) throws IOException{
        
        File novoArq = new File(PATH_ARQ_CONFIG);
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

    public boolean isPasswordCorrect(char[] input) {
    	boolean isCorrect = true;
    	char[] correctPassword = { 'a', 'd', 'm', 'i', 'n' };

    	if (input.length != correctPassword.length) {
    		isCorrect = false;
    	} else {
    		isCorrect = Arrays.equals (input, correctPassword);
    	}

    	//Zero out the password.
    	Arrays.fill(correctPassword,'0');
    	return isCorrect;
    }

	public String getTempoDaPartidaString(String dificuldade) {
		if (dificuldade.equals("Fácil")) { return Integer.toString(getTmpFacil()); }
		else if(dificuldade.equals("Médio")) { return Integer.toString(getTmpMedio()); }
		else return Integer.toString(getTmpDificil());
	}

	public int getTempoDaPartida(String dificuldade) {
		if (dificuldade.equals("Fácil")) { return getTmpFacil(); }
		else if(dificuldade.equals("Médio")) { return getTmpMedio(); }
		else return (getTmpDificil());
	}
   
    
}
