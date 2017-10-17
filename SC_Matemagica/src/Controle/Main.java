package Controle;

import Modelo.Jogador;




public class Main {


    public static void main(String[] args) {
        Controle ctr = new Controle();
        Jogador garotao = new Jogador();
        ctr.fluxoRanking(garotao, 1);
        ctr.printarConteudoRanking(1);
        //ctr.iniciarAplicacao();
    }
    
}
