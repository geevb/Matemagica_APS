
package gui;

import controle.Controle;


public class TelaPontuacaoFinal extends javax.swing.JFrame {

    Controle controle;    
    

    public TelaPontuacaoFinal(Controle controle) {
        this.controle = controle;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelParabensTenteDenovo = new javax.swing.JLabel();
        jLabelNomeDoJogador = new javax.swing.JLabel();
        jLabelPontuacao = new javax.swing.JLabel();
        jLabelPontos = new javax.swing.JLabel();
        jButtonContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelParabensTenteDenovo.setFont(new java.awt.Font("Dialog", 3, 58)); // NOI18N
        jLabelParabensTenteDenovo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelParabensTenteDenovo.setText("Tente mais uma vez!");

        jLabelNomeDoJogador.setFont(new java.awt.Font("Dialog", 1, 50)); // NOI18N
        jLabelNomeDoJogador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNomeDoJogador.setText("Nome do Jogador");

        jLabelPontuacao.setFont(new java.awt.Font("Dialog", 3, 42)); // NOI18N
        jLabelPontuacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPontuacao.setText("9999");

        jLabelPontos.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabelPontos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPontos.setText("pontos");

        jButtonContinuar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButtonContinuar.setText("Continuar");
        jButtonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelParabensTenteDenovo, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addComponent(jLabelNomeDoJogador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelPontuacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelPontos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelParabensTenteDenovo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jLabelNomeDoJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabelPontuacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPontos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jButtonContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContinuarActionPerformed
        this.dispose();
        new TelaPrincipalAreaAluno(controle).setVisible(true);
    }//GEN-LAST:event_jButtonContinuarActionPerformed

    public void atualizarDadosDoJogador(String nomeDoJogador, String pontuacaoFinal, boolean entrouNoRanking) {
        jLabelNomeDoJogador.setText(nomeDoJogador);
        jLabelPontuacao.setText(pontuacaoFinal);
        
        if(entrouNoRanking){
            jLabelParabensTenteDenovo.setText("Novo Recorde!");
        } else {
            jLabelParabensTenteDenovo.setText("Tente mais uma vez!");
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonContinuar;
    private javax.swing.JLabel jLabelNomeDoJogador;
    private javax.swing.JLabel jLabelParabensTenteDenovo;
    private javax.swing.JLabel jLabelPontos;
    private javax.swing.JLabel jLabelPontuacao;
    // End of variables declaration//GEN-END:variables
}
