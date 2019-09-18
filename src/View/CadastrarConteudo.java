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
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author EriikD
 */
public class CadastrarConteudo extends javax.swing.JFrame {

    private Netflix netflixBancoDeDados;
    private JFrame telaDoAdministrador;
    private DefaultListModel listModel;
    
    /**
     * Creates new form CadastrarConteudo
     */
    public CadastrarConteudo() {
        this.netflixBancoDeDados = netflixBancoDeDados;
        //this.telaDoAdministrador = telaAnterior;
        this.listModel = new DefaultListModel();
        initComponents();
        this.preencheImagem();
    }

    public CadastrarConteudo(JFrame telaAnterior, Netflix netflixBancoDeDados) {
        this.netflixBancoDeDados = netflixBancoDeDados;
        this.telaDoAdministrador = telaAnterior;
        this.listModel = new DefaultListModel();
        initComponents();
    }

    public void resetarCampos() {
        this.nomeConteudo.setText("");
        this.descricaoConteudo.setText("");
        this.diretorConteudo.setText("");
        this.atorConteudo.setText("");
        this.duracaoConteudo.setText("");
        this.temporadasConteudo.setText("");
        this.listModel.clear();
        this.duracaoConteudo.setEnabled(false);
        this.temporadasConteudo.setEnabled(false);
    }
    
    public void preencheImagem(){
        ImageIcon icon = new ImageIcon("..\\Netflix\\src\\images\\no_image.png");
        this.labelImagem.setIcon(icon);
        this.labelImagem.setIcon(this.redimensionar(this.labelImagem, this.labelImagem.getWidth(), this.labelImagem.getHeight()));
    }
    
    public void preencheCategorias() {
        String[] categorias = this.netflixBancoDeDados.getCategorias();
        this.jComboBoxCategorias.removeAllItems();
        for (int i = 0; i < categorias.length; i++) {
            this.jComboBoxCategorias.addItem(categorias[i]);
        }
    }

    public void preencheSubCategorias() {
        String[] subCategorias = this.netflixBancoDeDados.getSubcategorias();
        this.jComboBoxSubCategoria.removeAllItems();
        for (int i = 0; i < subCategorias.length; i++) {
            this.jComboBoxSubCategoria.addItem(subCategorias[i]);
        }
    }

    private String[] parserJListToArrayList() {
        String[] vetorDeAtores = new String[this.listModel.size()];
        for (int i = 0; i < this.listModel.size(); i++) {
            vetorDeAtores[i] = (String) this.listModel.get(i);
        }
        return vetorDeAtores;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCheckBoxFilme = new javax.swing.JCheckBox();
        jCheckBoxSerie = new javax.swing.JCheckBox();
        nomeConteudo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        descricaoConteudo = new javax.swing.JTextField();
        diretorConteudo = new javax.swing.JTextField();
        cadastrarConteudo = new javax.swing.JButton();
        atorConteudo = new javax.swing.JTextField();
        botaoAdicionarAtorAtriz = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaDeAtoresAtrizes = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        duracaoConteudo = new javax.swing.JTextField();
        temporadasConteudo = new javax.swing.JTextField();
        voltarParaTelaADMBotao = new javax.swing.JButton();
        jComboBoxCategorias = new javax.swing.JComboBox<>();
        jComboBoxSubCategoria = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        buscarImagem = new javax.swing.JButton();
        labelImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        jLabel1.setText("Cadastrar Conteúdo");

        jCheckBoxFilme.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jCheckBoxFilme.setText("Filme");
        jCheckBoxFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFilmeActionPerformed(evt);
            }
        });

        jCheckBoxSerie.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jCheckBoxSerie.setText("Série");
        jCheckBoxSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSerieActionPerformed(evt);
            }
        });

        nomeConteudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeConteudoActionPerformed(evt);
            }
        });
        nomeConteudo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomeConteudoKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("NOME:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("CATEGORIA:");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("SUBCATEGORIA:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setText("DESCRIÇÃO:");

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setText("DIRETOR(A):");

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setText("ATORES:");

        cadastrarConteudo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        cadastrarConteudo.setText("Cadastrar");
        cadastrarConteudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarConteudoActionPerformed(evt);
            }
        });

        botaoAdicionarAtorAtriz.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        botaoAdicionarAtorAtriz.setText("Adicionar Ator/Atriz");
        botaoAdicionarAtorAtriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarAtorAtrizActionPerformed(evt);
            }
        });

        listaDeAtoresAtrizes.setModel(listModel);
        jScrollPane1.setViewportView(listaDeAtoresAtrizes);

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel9.setText("DURAÇÃO:");

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel10.setText("TEMPORADAS:");

        voltarParaTelaADMBotao.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        voltarParaTelaADMBotao.setText("Voltar");
        voltarParaTelaADMBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarParaTelaADMBotaoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setText("IMAGEM:");

        buscarImagem.setText("Buscar Imagem");
        buscarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarImagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(labelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jCheckBoxFilme)
                                        .addComponent(jLabel9))
                                    .addComponent(jLabel10))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(descricaoConteudo)
                                            .addComponent(diretorConteudo)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(temporadasConteudo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                                                    .addComponent(duracaoConteudo, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jCheckBoxSerie, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(atorConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(botaoAdicionarAtorAtriz, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxSubCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cadastrarConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(voltarParaTelaADMBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(36, 36, 36)
                                .addComponent(nomeConteudo)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buscarImagem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxSubCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(descricaoConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(diretorConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(atorConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAdicionarAtorAtriz))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(temporadasConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxSerie)
                            .addComponent(jCheckBoxFilme))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(duracaoConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buscarImagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voltarParaTelaADMBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarParaTelaADMBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarParaTelaADMBotaoActionPerformed
        this.setVisible(false);
        this.telaDoAdministrador.setVisible(true);
    }//GEN-LAST:event_voltarParaTelaADMBotaoActionPerformed

    private void cadastrarConteudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarConteudoActionPerformed
        String nomeConteudoAtual = this.nomeConteudo.getText();
        String categoriaAtual = (String) this.jComboBoxCategorias.getSelectedItem();
        String subCategoriaAtual = (String) this.jComboBoxSubCategoria.getSelectedItem();
        String descricaoAtual = this.descricaoConteudo.getText();
        String diretorAtual = this.diretorConteudo.getText();
        String[] atoresAtual = this.parserJListToArrayList();

        if ((!nomeConteudoAtual.equals("")) && (this.jCheckBoxFilme.isSelected() || this.jCheckBoxSerie.isSelected())) {
            if (this.jCheckBoxFilme.isSelected()) {
                try {
                    int duracao = Integer.parseInt(this.duracaoConteudo.getText());
                    Filme novoConteudo = new Filme(nomeConteudoAtual, categoriaAtual, subCategoriaAtual, descricaoAtual, diretorAtual, atoresAtual,this.labelImagem.getIcon(), duracao);
                    if (netflixBancoDeDados.cadastrarFilme(novoConteudo)) {
                        JOptionPane.showMessageDialog(null, "Filme cadastrado com sucesso");
                        this.resetarCampos();
                    } else {
                        JOptionPane.showMessageDialog(null, "Filme com nome informado ja existe no sistema");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Informe um valor numerico na duracao do filme");
                }
            } else {
                try {
                    int temporadas = Integer.parseInt(this.temporadasConteudo.getText());
                    Serie novoConteudo = new Serie(nomeConteudoAtual, categoriaAtual, subCategoriaAtual, descricaoAtual, diretorAtual, atoresAtual,this.labelImagem.getIcon(), temporadas);
                    if (netflixBancoDeDados.cadastrarSerie(novoConteudo)) {
                        JOptionPane.showMessageDialog(null, "Serie cadastrada com sucesso");
                        this.resetarCampos();
                    } else {
                        JOptionPane.showMessageDialog(null, "Serie com nome informado ja existe no sistema");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Informe um valor numerico na quantidade deTemporadas da Serie");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Informações essenciais nao foram inseridas");
        }

    }//GEN-LAST:event_cadastrarConteudoActionPerformed

    private void jCheckBoxSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSerieActionPerformed
        if (this.jCheckBoxSerie.isSelected()) {
            this.jCheckBoxFilme.setEnabled(false);
            this.temporadasConteudo.setEnabled(true);
            this.duracaoConteudo.setEnabled(false);
        } else {
            this.jCheckBoxFilme.setEnabled(true);
            this.duracaoConteudo.setEnabled(false);
            this.temporadasConteudo.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBoxSerieActionPerformed

    private void jCheckBoxFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFilmeActionPerformed
        if (this.jCheckBoxFilme.isSelected()) {
            this.duracaoConteudo.setEnabled(true);
            this.jCheckBoxSerie.setEnabled(false);
            this.temporadasConteudo.setEnabled(false);
        } else {
            this.jCheckBoxSerie.setEnabled(true);
            this.duracaoConteudo.setEnabled(false);
            this.temporadasConteudo.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBoxFilmeActionPerformed

    private void nomeConteudoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeConteudoKeyTyped
        String caracteres = "/-+,'!@#$%¨&()_+{}][´`^~,<.>:;/?|*=0123456789";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_nomeConteudoKeyTyped

    private void botaoAdicionarAtorAtrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarAtorAtrizActionPerformed
        String novoMembro = this.atorConteudo.getText();
        DefaultListModel listModel = (DefaultListModel) this.listaDeAtoresAtrizes.getModel();
        listModel.addElement(novoMembro);
    }//GEN-LAST:event_botaoAdicionarAtorAtrizActionPerformed

    private void nomeConteudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeConteudoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeConteudoActionPerformed

    private void buscarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarImagemActionPerformed
        int escolha = chooserArquivo.showOpenDialog(getParent());
        File arquivo = chooserArquivo.getSelectedFile();
        if (arquivo != null) {
            String caminho = arquivo.getAbsolutePath();
            ImageIcon icon = new ImageIcon(caminho);
            this.labelImagem.setIcon(icon);
            this.labelImagem.setIcon(this.redimensionar(this.labelImagem, this.labelImagem.getWidth(), this.labelImagem.getHeight()));
        }
    }//GEN-LAST:event_buscarImagemActionPerformed
    
    private  ImageIcon redimensionar(JLabel jLabel, int xLargura, int yAltura) {
        ImageIcon img = new ImageIcon(jLabel.getIcon().toString());
        img.setImage(img.getImage().getScaledInstance(xLargura, yAltura, 100));
        return img;
    }

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
            java.util.logging.Logger.getLogger(CadastrarConteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarConteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarConteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarConteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarConteudo().setVisible(true);
            }
        });
    }

    private JFileChooser chooserArquivo = new JFileChooser();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField atorConteudo;
    private javax.swing.JButton botaoAdicionarAtorAtriz;
    private javax.swing.JButton buscarImagem;
    private javax.swing.JButton cadastrarConteudo;
    private javax.swing.JTextField descricaoConteudo;
    private javax.swing.JTextField diretorConteudo;
    private javax.swing.JTextField duracaoConteudo;
    private javax.swing.JCheckBox jCheckBoxFilme;
    private javax.swing.JCheckBox jCheckBoxSerie;
    private javax.swing.JComboBox<String> jComboBoxCategorias;
    private javax.swing.JComboBox<String> jComboBoxSubCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelImagem;
    private javax.swing.JList<String> listaDeAtoresAtrizes;
    private javax.swing.JTextField nomeConteudo;
    private javax.swing.JTextField temporadasConteudo;
    private javax.swing.JButton voltarParaTelaADMBotao;
    // End of variables declaration//GEN-END:variables
}
