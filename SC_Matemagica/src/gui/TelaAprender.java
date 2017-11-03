/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controle.Controle;

/**
 *
 * @author geevb
 */
public class TelaAprender extends javax.swing.JFrame {

	Controle controle;
	
    public TelaAprender(Controle ctr) {
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

        jLabelAprendaAqui = new javax.swing.JLabel();
        jLabelOperacaoDesejada = new javax.swing.JLabel();
        jButtonAdicao = new javax.swing.JButton();
        jButtonSubtracao = new javax.swing.JButton();
        jButtonMultiplicacao = new javax.swing.JButton();
        jButtonDivisao = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelExplicacao = new javax.swing.JLabel();
        jLabelExemplos = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        jButtonOpProx = new javax.swing.JButton();
        jButtonOpAnterior = new javax.swing.JButton();
        jButtonExAnterior = new javax.swing.JButton();
        jButtonExProx = new javax.swing.JButton();
        jLabelPicExemplo = new javax.swing.JLabel();
        jLabelPicExplicacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jLabelAprendaAqui.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        jLabelAprendaAqui.setText("Aprenda aqui!");

        jLabelOperacaoDesejada.setFont(new java.awt.Font("Dialog", 2, 30)); // NOI18N
        jLabelOperacaoDesejada.setText("Aperte na operação desejada:");

        jButtonAdicao.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jButtonAdicao.setText("Adição (+)");
        jButtonAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicaoActionPerformed(evt);
            }
        });

        jButtonSubtracao.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jButtonSubtracao.setText("Subtração (-)");
        jButtonSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubtracaoActionPerformed(evt);
            }
        });

        jButtonMultiplicacao.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jButtonMultiplicacao.setText("Multiplicação (x)");
        jButtonMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicacaoActionPerformed(evt);
            }
        });

        jButtonDivisao.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jButtonDivisao.setText("Divisão (/)");
        jButtonDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivisaoActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabelExplicacao.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelExplicacao.setText("Explicação");

        jLabelExemplos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelExemplos.setText("Exemplos");

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonOpProx.setText("Próx.");

        jButtonOpAnterior.setText("Ant.");

        jButtonExAnterior.setText("Ant.");

        jButtonExProx.setText("Próx.");

        jLabelPicExemplo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/imgEx.jpg"))); // NOI18N

        jLabelPicExplicacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/imgEx.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAprendaAqui, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelOperacaoDesejada, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButtonAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButtonSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButtonDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabelExplicacao)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonOpAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonOpProx, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(238, 238, 238))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelPicExplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelExemplos)
                        .addGap(147, 147, 147))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabelPicExemplo, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonExAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonExProx, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(15, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAprendaAqui, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelOperacaoDesejada, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jButtonAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelExplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPicExplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonOpProx, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonOpAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelExemplos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabelPicExemplo, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonExAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonExProx, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivisaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDivisaoActionPerformed

    private void jButtonAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAdicaoActionPerformed

    private void jButtonSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubtracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSubtracaoActionPerformed

    private void jButtonMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMultiplicacaoActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        new TelaPrincipalAreaAluno(controle).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    //jTextAreaExplicacao.setText("Kek\n\nYolo\n\nLeru\n\nNice\n\nGG\n\nIZI\n\nMAH BOY\n\nblob\n\nYay\n\nZZ");
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicao;
    private javax.swing.JButton jButtonDivisao;
    private javax.swing.JButton jButtonExAnterior;
    private javax.swing.JButton jButtonExProx;
    private javax.swing.JButton jButtonMultiplicacao;
    private javax.swing.JButton jButtonOpAnterior;
    private javax.swing.JButton jButtonOpProx;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSubtracao;
    private javax.swing.JLabel jLabelAprendaAqui;
    private javax.swing.JLabel jLabelExemplos;
    private javax.swing.JLabel jLabelExplicacao;
    private javax.swing.JLabel jLabelOperacaoDesejada;
    private javax.swing.JLabel jLabelPicExemplo;
    private javax.swing.JLabel jLabelPicExplicacao;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}