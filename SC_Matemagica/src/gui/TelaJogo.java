/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controle.Controle;

public class TelaJogo extends javax.swing.JFrame {

	Controle controle;
	
	String respostaDada = "";
	
    public TelaJogo(Controle controle) {
    	this.controle = controle;
    }
    
    public void criarTelaJogoUmJogador() {
        initComponents();       
    }
    
    public void finalizarTelaGui() {
    	this.dispose();
    }
    
    public void passarTempo(int tempoAtual) {
    	this.jLabelNumTempoRestante.setText(Integer.toString(tempoAtual));
    }
    
    public void criarTelaJogoUmJogador(String numQuestao,
            String pontos, String numEsq, String numDir, String operacao,
            String bt1, String bt2, String bt3, String bt4) {
        initComponents();
        atualizarInformacoes(numQuestao, pontos, numEsq, numDir, operacao,
                bt1, bt2, bt3, bt4);        
    }
    
    public void atualizarInformacoes(String numQuestao,
            String pontos, String numEsq, String numDir, String operacao,
            String bt1, String bt2, String bt3, String bt4) {
    	
        //jLabelNumTempoRestante.setText(tmpRestante);
        jLabelNumEsquerdaQuestao.setText(numQuestao);
        jLabelNumPontuacao.setText(pontos);
        jLabelNumeroEsquerda.setText(numEsq);
        jLabelNumeroDireita.setText(numDir);
        jLabelOperacao.setText(operacao);
        jButtonPrimeiraOp.setText(bt1);
        jButtonSegundaOp.setText(bt2);
        jButtonTerceiraOp.setText(bt3);
        jButtonQuartaOp.setText(bt4);
    }
    
    
    
    public void iniciarPartida() {
    	setVisible(true);
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTempoRestante = new javax.swing.JLabel();
        jLabelNumTempoRestante = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelQuestao = new javax.swing.JLabel();
        jLabelNumEsquerdaQuestao = new javax.swing.JLabel();
        jLabelBarra = new javax.swing.JLabel();
        jLabelNumDireitaQuestao = new javax.swing.JLabel();
        jLabelPontuacao = new javax.swing.JLabel();
        jLabelNumPontuacao = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelNumeroEsquerda = new javax.swing.JLabel();
        jLabelOperacao = new javax.swing.JLabel();
        jLabelNumeroDireita = new javax.swing.JLabel();
        jButtonPrimeiraOp = new javax.swing.JButton();
        jButtonSegundaOp = new javax.swing.JButton();
        jButtonTerceiraOp = new javax.swing.JButton();
        jButtonQuartaOp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jLabelTempoRestante.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        jLabelTempoRestante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTempoRestante.setText("Tempo Restante");

        jLabelNumTempoRestante.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabelNumTempoRestante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNumTempoRestante.setText("999");

        jLabelQuestao.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelQuestao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelQuestao.setText("Questão:");

        jLabelNumEsquerdaQuestao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNumEsquerdaQuestao.setText("10");

        jLabelBarra.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabelBarra.setText("/");

        jLabelNumDireitaQuestao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNumDireitaQuestao.setText("10");

        jLabelPontuacao.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelPontuacao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPontuacao.setText("Pontuação:");

        jLabelNumPontuacao.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabelNumPontuacao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelNumPontuacao.setText("0");

        jLabel9.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Quanto é?");

        jLabelNumeroEsquerda.setFont(new java.awt.Font("Dialog", 3, 80)); // NOI18N
        jLabelNumeroEsquerda.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelNumeroEsquerda.setText("99");

        jLabelOperacao.setFont(new java.awt.Font("Dialog", 1, 70)); // NOI18N
        jLabelOperacao.setText("+");

        jLabelNumeroDireita.setFont(new java.awt.Font("Dialog", 3, 80)); // NOI18N
        jLabelNumeroDireita.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelNumeroDireita.setText("99");

        jButtonPrimeiraOp.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButtonPrimeiraOp.setText("9999");
        jButtonPrimeiraOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeiraOpActionPerformed(evt);
            }
        });

        jButtonSegundaOp.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButtonSegundaOp.setText("9999");
        jButtonSegundaOp.setToolTipText("");
        jButtonSegundaOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSegundaOpActionPerformed(evt);
            }
        });

        jButtonTerceiraOp.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButtonTerceiraOp.setText("9999");
        jButtonTerceiraOp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonTerceiraOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTerceiraOpActionPerformed(evt);
            }
        });

        jButtonQuartaOp.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButtonQuartaOp.setText("9999");
        jButtonQuartaOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuartaOpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelNumTempoRestante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabelNumEsquerdaQuestao)
                        .addGap(12, 12, 12)
                        .addComponent(jLabelBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNumDireitaQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelNumPontuacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelPontuacao, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonPrimeiraOp, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButtonSegundaOp, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButtonTerceiraOp, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButtonQuartaOp, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabelNumeroEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelOperacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelNumeroDireita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabelTempoRestante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelTempoRestante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNumTempoRestante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQuestao)
                    .addComponent(jLabelPontuacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumEsquerdaQuestao)
                    .addComponent(jLabelBarra)
                    .addComponent(jLabelNumDireitaQuestao)
                    .addComponent(jLabelNumPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabelNumeroDireita, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(jLabelOperacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNumeroEsquerda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonPrimeiraOp, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonSegundaOp, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonTerceiraOp, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonQuartaOp, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPrimeiraOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiraOpActionPerformed
    	setRespostaDada(jButtonPrimeiraOp.getText());
    	controle.verificarResposta(this.getResposta());
    	controle.proximaRodada();
    }//GEN-LAST:event_jButtonPrimeiraOpActionPerformed

	private void jButtonSegundaOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSegundaOpActionPerformed
		setRespostaDada(jButtonSegundaOp.getText());
		controle.verificarResposta(this.getResposta());
		controle.proximaRodada();
    }//GEN-LAST:event_jButtonSegundaOpActionPerformed

    private void jButtonTerceiraOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTerceiraOpActionPerformed
    	setRespostaDada(jButtonTerceiraOp.getText());
    	controle.verificarResposta(this.getResposta());
    	controle.proximaRodada();
    }//GEN-LAST:event_jButtonTerceiraOpActionPerformed

    private void jButtonQuartaOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuartaOpActionPerformed
    	setRespostaDada(jButtonQuartaOp.getText());
    	controle.verificarResposta(this.getResposta());
    	controle.proximaRodada();
    }//GEN-LAST:event_jButtonQuartaOpActionPerformed

    private void setRespostaDada(String resposta) {
		this.respostaDada = resposta;		
	}
    
    public void atualizarTempoDaTela(String tempo) {
    	jLabelTempoRestante.setText(tempo);
    }
  
    public String getResposta() {
    	return respostaDada;
    }
    
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPrimeiraOp;
    private javax.swing.JButton jButtonSegundaOp;
    private javax.swing.JButton jButtonTerceiraOp;
    private javax.swing.JButton jButtonQuartaOp;    
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBarra;
    private javax.swing.JLabel jLabelNumDireitaQuestao;
    private javax.swing.JLabel jLabelNumEsquerdaQuestao;
    private javax.swing.JLabel jLabelNumPontuacao;
    private javax.swing.JLabel jLabelNumTempoRestante;
    private javax.swing.JLabel jLabelNumeroDireita;
    private javax.swing.JLabel jLabelNumeroEsquerda;
    private javax.swing.JLabel jLabelOperacao;
    private javax.swing.JLabel jLabelPontuacao;
    private javax.swing.JLabel jLabelQuestao;
    private javax.swing.JLabel jLabelTempoRestante;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
