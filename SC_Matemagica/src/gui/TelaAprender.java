/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import controle.Controle;

public class TelaAprender extends javax.swing.JFrame {

	private int numeroImagem = 0;
	private String imagemExplSendoVista = "";
	private String imagemExeSendoVista = "";
	
	private ArrayList<String> imagensSendoVistasExpl;
	private ArrayList<String> imagensSendoVistasExe;
	
	private static final long serialVersionUID = 1L;
	Controle controle;

	public TelaAprender(Controle ctr) {
		this.controle = ctr;
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
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
		jButtonExplProximo = new javax.swing.JButton();
		jButtonExplAnterior = new javax.swing.JButton();
		jButtonExeAnterior = new javax.swing.JButton();
		jButtonExeProx = new javax.swing.JButton();
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

		jButtonExplProximo.setText("Próx.");
		jButtonExplProximo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonExplProximoActionPerformed(evt);
			}
		});

		jButtonExplAnterior.setText("Ant.");
		jButtonExplAnterior.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonExplAnteriorActionPerformed(evt);
			}
		});

		jButtonExeAnterior.setText("Ant.");
		jButtonExeAnterior.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonExeAnteriorActionPerformed(evt);
			}
		});

		jButtonExeProx.setText("Próx.");
		jButtonExeProx.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonExeProxActionPerformed(evt);
			}
		});

		jLabelPicExemplo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/imgEx"))); // NOI18N
		jLabelPicExplicacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/imgEx"))); // NOI18N

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabelAprendaAqui, javax.swing.GroupLayout.PREFERRED_SIZE, 414,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabelOperacaoDesejada, javax.swing.GroupLayout.PREFERRED_SIZE,
												515, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addGap(12, 12, 12)
										.addComponent(jButtonAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(41, 41, 41)
										.addComponent(jButtonSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jButtonMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 165,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(37, 37, 37)
										.addComponent(jButtonDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(28, 28, 28))
						.addGroup(layout.createSequentialGroup().addComponent(jSeparator1).addContainerGap())))
				.addGroup(layout.createSequentialGroup().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(142, 142, 142).addComponent(jLabelExplicacao)
								.addGap(146, 146, 146))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
												.createSequentialGroup()
												.addComponent(jButtonExplAnterior,
														javax.swing.GroupLayout.PREFERRED_SIZE, 70,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButtonExplProximo,
														javax.swing.GroupLayout.PREFERRED_SIZE, 70,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(238, 238, 238))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
												layout.createSequentialGroup()
														.addComponent(jLabelPicExplicacao,
																javax.swing.GroupLayout.PREFERRED_SIZE, 365,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)))))
						.addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(
										javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jLabelExemplos).addGap(147, 147, 147))
								.addGroup(layout.createSequentialGroup().addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
										.addGroup(layout.createSequentialGroup().addGap(14, 14, 14).addComponent(
												jLabelPicExemplo, javax.swing.GroupLayout.PREFERRED_SIZE, 365,
												javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(jButtonExeAnterior,
														javax.swing.GroupLayout.PREFERRED_SIZE, 70,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButtonExeProx, javax.swing.GroupLayout.PREFERRED_SIZE,
														70, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(15, Short.MAX_VALUE)))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addComponent(jLabelAprendaAqui, javax.swing.GroupLayout.PREFERRED_SIZE, 78,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jLabelOperacaoDesejada, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
						.addComponent(jButtonAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButtonSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButtonDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButtonMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jSeparator2)
						.addGroup(layout.createSequentialGroup()
								.addComponent(jLabelExplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabelPicExplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 330,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jButtonExplProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jButtonExplAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(layout.createSequentialGroup()
								.addComponent(jLabelExemplos, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(4, 4, 4)
								.addComponent(jLabelPicExemplo, javax.swing.GroupLayout.PREFERRED_SIZE, 330,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jButtonExeAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jButtonExeProx, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
												javax.swing.GroupLayout.PREFERRED_SIZE))))
				.addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButtonAdicaoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonAdicaoActionPerformed
		String imagem_path = "/imgs/adicao";
		String imagem_path_exemplo = "/imgs/adicao1";

		preencherArrays("adicao");		
		setNumeroImagem(0);

		jLabelPicExemplo.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagem_path_exemplo)));
		jLabelPicExplicacao.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagem_path))); // NOI18N

	}// GEN-LAST:event_jButtonAdicaoActionPerformed

	private void jButtonSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonSubtracaoActionPerformed
		String imagem_path = "/imgs/leru";
		String imagem_path_exemplo = "/imgs/leru";

		preencherArrays("subtracao");		
		setNumeroImagem(0);

		jLabelPicExemplo.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagem_path_exemplo)));
		jLabelPicExplicacao.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagem_path))); // NOI18N
	}// GEN-LAST:event_jButtonSubtracaoActionPerformed

	private void jButtonMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonMultiplicacaoActionPerformed
		setNumeroImagem(0);
	}// GEN-LAST:event_jButtonMultiplicacaoActionPerformed

	private void jButtonDivisaoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonDivisaoActionPerformed
		setNumeroImagem(0);
	}// GEN-LAST:event_jButtonDivisaoActionPerformed

	private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonSairActionPerformed
		new TelaPrincipalAreaAluno(controle).setVisible(true);
		this.dispose();
	}// GEN-LAST:event_jButtonSairActionPerformed

	private void jButtonExplAnteriorActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonExplAnteriorActionPerformed
		if (numeroImagem == 0) {
			setNumeroImagem(imagensSendoVistasExpl.size() - 1);
		} else {
			imagemAnterior();
		}

		System.out.println("Imagem: " + numeroImagem);
		String pathImagem = imagensSendoVistasExpl.get(getNumeroImagem());
		System.out.println(pathImagem);
		jLabelPicExplicacao.setIcon(new javax.swing.ImageIcon(getClass().getResource(pathImagem)));

	}// GEN-LAST:event_jButtonExplAnteriorActionPerformed

	private void jButtonExplProximoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonExplProximoActionPerformed
		if (numeroImagem == imagensSendoVistasExpl.size() - 1) {
			setNumeroImagem(0);
		} else {
			proximaImagem();
		}

		System.out.println("Imagem: " + numeroImagem);
		String pathImagem = imagensSendoVistasExpl.get(getNumeroImagem());
		System.out.println(pathImagem);

		jLabelPicExplicacao.setIcon(new javax.swing.ImageIcon(getClass().getResource(pathImagem)));
	}// GEN-LAST:event_jButtonExplProximoActionPerformed

	private void jButtonExeAnteriorActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonExeAnteriorActionPerformed

	}// GEN-LAST:event_jButtonExeAnteriorActionPerformed

	private void jButtonExeProxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonExeProxActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jButtonExeProxActionPerformed

	// jTextAreaExplicacao.setText("Kek\n\nYolo\n\nLeru\n\nNice\n\nGG\n\nIZI\n\nMAH
	// BOY\n\nblob\n\nYay\n\nZZ");

	private void setNumeroImagem(int num) {
		this.numeroImagem = num;
	}

	private void proximaImagem() {
		this.numeroImagem++;
	}

	private void imagemAnterior() {
		this.numeroImagem--;
	}

	public int getNumeroImagem() {
		return numeroImagem;
	}

	public String getImagemExplSendoVista() {
		return imagemExplSendoVista;
	}

	public String getImagemExeSendoVista() {
		return imagemExeSendoVista;
	}

	private void preencherArrays(String tipoImagem) {
		
		String source_path = "/imgs/";
		
		imagensSendoVistasExpl = new ArrayList<>();
		imagensSendoVistasExe = new ArrayList<>();
		
		if (tipoImagem.equals("adicao")) {
			
			imagensSendoVistasExe.add(source_path + "adicaoExe");
			imagensSendoVistasExpl.add(source_path + "adicao");
			imagensSendoVistasExpl.add(source_path + "adicao1");
			
		}
		else if (tipoImagem.equals("subtracao")) {}
		else if (tipoImagem.equals("multiplicacao")) {}
		else if (tipoImagem.equals("divisao")) {}
		else {}
		
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButtonAdicao;
	private javax.swing.JButton jButtonDivisao;
	private javax.swing.JButton jButtonExeAnterior;
	private javax.swing.JButton jButtonExeProx;
	private javax.swing.JButton jButtonExplAnterior;
	private javax.swing.JButton jButtonExplProximo;
	private javax.swing.JButton jButtonMultiplicacao;
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
