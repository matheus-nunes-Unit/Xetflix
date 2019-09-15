/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Filme;
import javax.swing.JFrame;
import Model.Netflix;
import Model.Serie;
import javax.swing.JOptionPane;

/**
 *
 * @author EriikD
 */
public class ExcluirConteudo extends javax.swing.JFrame {

    private Netflix netflixBancoDeDados;
    private JFrame telaAdministrador;

    /**
     * Creates new form ExcluirConteudo
     */
    public ExcluirConteudo() {
        initComponents();
    }

    public ExcluirConteudo(Netflix netflixBancoDeDados, JFrame telaAdministrador) {
        this.netflixBancoDeDados = netflixBancoDeDados;
        this.telaAdministrador = telaAdministrador;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeDoConteudo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        voltarTelaADMBotao = new javax.swing.JButton();
        checkFilme = new javax.swing.JCheckBox();
        checkSerie = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("EXCLUIR CONTEÚDO");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("NOME CONTEÚDO:");

        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        voltarTelaADMBotao.setText("Voltar");
        voltarTelaADMBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaADMBotaoActionPerformed(evt);
            }
        });

        checkFilme.setText("Filme");
        checkFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkFilmeActionPerformed(evt);
            }
        });

        checkSerie.setText("Serie");
        checkSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSerieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(checkFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(checkSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nomeDoConteudo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltarTelaADMBotao)
                .addGap(189, 189, 189))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(nomeDoConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkFilme)
                    .addComponent(checkSerie))
                .addGap(18, 18, 18)
                .addComponent(voltarTelaADMBotao)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarTelaADMBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaADMBotaoActionPerformed
        this.setVisible(false);
        this.telaAdministrador.setVisible(true);
    }//GEN-LAST:event_voltarTelaADMBotaoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nomeDoConteudoExcluir = this.nomeDoConteudo.getText();
        if (this.checkFilme.isSelected()) {
            Filme filmeRemover = this.netflixBancoDeDados.buscarFilme(nomeDoConteudoExcluir);
            if (filmeRemover != null) {
                this.netflixBancoDeDados.getFilmes().remove(filmeRemover);
                JOptionPane.showMessageDialog(null, "Filme removido com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Nao existe filme com o nome informado");
            }
        } else {
            Serie serieRemover = this.netflixBancoDeDados.buscarSerie(nomeDoConteudoExcluir);
            if (serieRemover != null) {
                this.netflixBancoDeDados.getSeries().remove(serieRemover);
                JOptionPane.showMessageDialog(null, "Serie removida com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Nao existe serie com o nome informado");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void checkFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkFilmeActionPerformed
        if (this.checkFilme.isSelected()) {
            this.checkSerie.setEnabled(false);
        } else {
            this.checkSerie.setEnabled(true);
        }
    }//GEN-LAST:event_checkFilmeActionPerformed

    private void checkSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSerieActionPerformed
        if (this.checkSerie.isSelected()) {
            this.checkFilme.setEnabled(false);
        } else {
            this.checkFilme.setEnabled(true);
        }
    }//GEN-LAST:event_checkSerieActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ExcluirConteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcluirConteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcluirConteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcluirConteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcluirConteudo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkFilme;
    private javax.swing.JCheckBox checkSerie;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeDoConteudo;
    private javax.swing.JButton voltarTelaADMBotao;
    // End of variables declaration//GEN-END:variables
}
