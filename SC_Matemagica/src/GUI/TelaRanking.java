/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;

import Controle.Controle;
import Modelo.Jogador;

public class TelaRanking extends javax.swing.JFrame {

    Controle controle;
	
	public TelaRanking(Controle ctr) {
        this.controle = ctr;
		initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelRanking = new javax.swing.JLabel();
        jLabelAperteOperacao = new javax.swing.JLabel();
        jButtonSoma = new javax.swing.JButton();
        jButtonSubtracao = new javax.swing.JButton();
        jButtonMultiplicacao = new javax.swing.JButton();
        jButtonDivisao = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelJogadorTitle = new javax.swing.JLabel();
        jLabelPontosTitle = new javax.swing.JLabel();
        jLabelPrimeiro = new javax.swing.JLabel();
        jLabelSegundo = new javax.swing.JLabel();
        jLabelTerceiro = new javax.swing.JLabel();
        jLabelQuarto = new javax.swing.JLabel();
        jLabelQuinto = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        jLabelNomePriJog = new javax.swing.JLabel();
        jLabelNomeSegJog = new javax.swing.JLabel();
        jLabelNomeTerJog = new javax.swing.JLabel();
        jLabelNomeQuarJog = new javax.swing.JLabel();
        jLabelNomeQuinJog = new javax.swing.JLabel();
        jLabelPontosPriJog = new javax.swing.JLabel();
        jLabelPontosSegJog = new javax.swing.JLabel();
        jLabelPontosTerJog = new javax.swing.JLabel();
        jLabelPontosQuarJog = new javax.swing.JLabel();
        jLabelPontosQuinJog = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jLabelRanking.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        jLabelRanking.setText("Ranking de Pontos!");

        jLabelAperteOperacao.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabelAperteOperacao.setText("Aperte na operação:");

        jButtonSoma.setText("Soma (+)");
        jButtonSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSomaActionPerformed(evt);
            }
        });

        jButtonSubtracao.setText("Subtração (-)");
        jButtonSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubtracaoActionPerformed(evt);
            }
        });

        jButtonMultiplicacao.setText("Multiplicação (x)");
        jButtonMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicacaoActionPerformed(evt);
            }
        });

        jButtonDivisao.setText("Divisão (/)");
        jButtonDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivisaoActionPerformed(evt);
            }
        });

        jLabelJogadorTitle.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelJogadorTitle.setText("Jogador");

        jLabelPontosTitle.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelPontosTitle.setText("Pontos");

        jLabelPrimeiro.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabelPrimeiro.setText("1º");

        jLabelSegundo.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabelSegundo.setText("2º");

        jLabelTerceiro.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabelTerceiro.setText("3º");

        jLabelQuarto.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabelQuarto.setText("4º");

        jLabelQuinto.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabelQuinto.setText("5º");

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jLabelNomePriJog.setText("");

        jLabelNomeSegJog.setText("");

        jLabelNomeTerJog.setText("");

        jLabelNomeQuarJog.setText("");

        jLabelNomeQuinJog.setText("");

        jLabelPontosPriJog.setText("");

        jLabelPontosSegJog.setText("");

        jLabelPontosTerJog.setText("");

        jLabelPontosQuarJog.setText("");

        jLabelPontosQuinJog.setText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelAperteOperacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonMultiplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelQuinto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(jLabelQuarto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelTerceiro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelSegundo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelNomeSegJog, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelNomeTerJog, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelNomeQuarJog, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelNomeQuinJog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPontosQuinJog, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelPontosQuarJog, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPontosTerJog, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomePriJog, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelJogadorTitle))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPontosTitle)
                            .addComponent(jLabelPontosPriJog, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPontosSegJog, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSoma, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jLabelAperteOperacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSubtracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonMultiplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDivisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelJogadorTitle)
                            .addComponent(jLabelPontosTitle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPontosPriJog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelPrimeiro)
                                .addComponent(jLabelNomePriJog, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabelPontosSegJog, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelSegundo)
                                .addComponent(jLabelNomeSegJog, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTerceiro)
                            .addComponent(jLabelNomeTerJog, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPontosTerJog, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelQuarto)
                            .addComponent(jLabelNomeQuarJog, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPontosQuarJog, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelQuinto)
                            .addComponent(jLabelNomeQuinJog, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPontosQuinJog, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSair)
                        .addContainerGap())))
        );

        jLabelNomeQuinJog.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSomaActionPerformed
        preencherCamposRanking(controle.getRankingSoma());    	
    }//GEN-LAST:event_jButtonSomaActionPerformed

    private void jButtonSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubtracaoActionPerformed
    	preencherCamposRanking(controle.getRankingSubtracao());
    }//GEN-LAST:event_jButtonSubtracaoActionPerformed

    private void jButtonMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicacaoActionPerformed
    	preencherCamposRanking(controle.getRankingMultiplicacao());
    }//GEN-LAST:event_jButtonMultiplicacaoActionPerformed

    private void jButtonDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivisaoActionPerformed
    	preencherCamposRanking(controle.getRankingDivisao());
    }//GEN-LAST:event_jButtonDivisaoActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        new TelaPrincipalAreaAluno(controle).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    
    private void preencherCamposRanking(ArrayList<Jogador> jogadores) {
    	for(int i=0; i < jogadores.size(); i++) {
    		
    		if(i==0) { jLabelNomePriJog.setText(jogadores.get(i).getNome());
    				    jLabelPontosPriJog.setText(Integer.toString(( jogadores.get(i).getPontuacao() )));} else
    		if(i==1) { jLabelNomeSegJog.setText(jogadores.get(i).getNome()); 
    				    jLabelPontosSegJog.setText(Integer.toString(( jogadores.get(i).getPontuacao() )));} else
    		if(i==2) { jLabelNomeTerJog.setText(jogadores.get(i).getNome()); 
    					jLabelPontosTerJog.setText(Integer.toString(( jogadores.get(i).getPontuacao() )));} else
    		if(i==3) { jLabelNomeQuarJog.setText(jogadores.get(i).getNome()); 
    					jLabelPontosQuarJog.setText(Integer.toString(( jogadores.get(i).getPontuacao() )));} else
    		if(i==4) { jLabelNomeQuinJog.setText(jogadores.get(i).getNome()); 
    					jLabelPontosQuinJog.setText(Integer.toString(( jogadores.get(i).getPontuacao() )));}    		
    	}
    	
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDivisao;
    private javax.swing.JButton jButtonMultiplicacao;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSoma;
    private javax.swing.JButton jButtonSubtracao;
    private javax.swing.JLabel jLabelAperteOperacao;
    private javax.swing.JLabel jLabelJogadorTitle;
    private javax.swing.JLabel jLabelNomePriJog;
    private javax.swing.JLabel jLabelNomeQuarJog;
    private javax.swing.JLabel jLabelNomeQuinJog;
    private javax.swing.JLabel jLabelNomeSegJog;
    private javax.swing.JLabel jLabelNomeTerJog;
    private javax.swing.JLabel jLabelPontosPriJog;
    private javax.swing.JLabel jLabelPontosQuarJog;
    private javax.swing.JLabel jLabelPontosQuinJog;
    private javax.swing.JLabel jLabelPontosSegJog;
    private javax.swing.JLabel jLabelPontosTerJog;
    private javax.swing.JLabel jLabelPontosTitle;
    private javax.swing.JLabel jLabelPrimeiro;
    private javax.swing.JLabel jLabelQuarto;
    private javax.swing.JLabel jLabelQuinto;
    private javax.swing.JLabel jLabelRanking;
    private javax.swing.JLabel jLabelSegundo;
    private javax.swing.JLabel jLabelTerceiro;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
