/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cliente;
import Model.Conteudo;
import Model.Netflix;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus Nunes
 */
public class TelaDoUsuario extends javax.swing.JFrame {

    private Netflix netflixBancoDeDadosAtual;
    private JFrame telaanterior;
    private TelaConfiguracaoUsuario telaDeConfiguracaoDoUsuario;
    private Cliente cliente;

    /**
     * Creates new form teste
     */
    public TelaDoUsuario() {
        initComponents();
        iniciandoPaineis();
    }

    public TelaDoUsuario(Netflix netflixBancoDeDadosAtual, JFrame telaanterior, Cliente cliente) {
        this.netflixBancoDeDadosAtual = netflixBancoDeDadosAtual;
        this.telaanterior = telaanterior;
        this.cliente = cliente;
        this.telaDeConfiguracaoDoUsuario = new TelaConfiguracaoUsuario(this.netflixBancoDeDadosAtual, this);
        initComponents();
        iniciandoPaineis();
        this.AtualizaCadastradosRecentemente();
        this.resetandoBotaoDeResultadoDaPesquisa();
        this.categoriaAdicionar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void iniciandoPaineis() {
        this.painelDeMelhoresAvaliados = new javax.swing.JPanel();
        this.painelDeRecentementeAvaliados = new javax.swing.JPanel();
        this.painelDeNovos = new javax.swing.JPanel();
        this.painelDePesquisarNomes = new javax.swing.JPanel();

        this.painelDeNovos.setLayout(new FlowLayout());
        this.painelDePesquisarNomes.setLayout(new FlowLayout());
        this.ScroolNomePessoa.setViewportView(this.painelDePesquisarNomes);
        this.painelCategoriaScroll.setViewportView(this.painelDeNovos);

        this.painelDeMelhoresAvaliados.setLayout(new FlowLayout());
        this.scrollPaneMelhoresAvaliados.setViewportView(this.painelDeMelhoresAvaliados);
        this.painelDeRecentementeAvaliados.setLayout(new FlowLayout());
        this.scrollPaneAdicionadosRecentemente.setViewportView(this.painelDeRecentementeAvaliados);
    }

    private void resetandoBotaoDeResultadoDaPesquisa() {
        ActionListener[] actionListener = this.botaoResultadoPesquisa.getActionListeners();
        if (actionListener.length != 0) {
            this.botaoResultadoPesquisa.removeActionListener(actionListener[0]);
        }
        this.botaoResultadoPesquisa.setIcon(null);
        this.botaoResultadoPesquisa.setVisible(false);
    }

    public void categoriaAdicionar() {

        String[] categorias = this.netflixBancoDeDadosAtual.getCategorias();

        this.jComboCategoria.addItem("<Selecionar item>");
        for (int i = 0; i < categorias.length; i++) {
            this.jComboCategoria.addItem(categorias[i]);
        }
    }

    private void AtualizaCadastradosRecentemente() {
        ArrayList<Conteudo> adicionadosRecentemente = this.netflixBancoDeDadosAtual.avaliadosRecentemente();
        for (int i = 0; i < adicionadosRecentemente.size(); i++) {
            Conteudo conteudoAtual = adicionadosRecentemente.get(i);
            JButton botao = new JButton();
            botao.setPreferredSize(new Dimension(150, 115));
            botao.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botaoDeConteudoActionPerformed(evt, conteudoAtual);
                }
            });
            botao.setIcon(conteudoAtual.getIcone());
            botao.setIcon(this.redimensionar(botao, 150, 115));
            this.painelDeRecentementeAvaliados.add(botao);
        }
        this.painelDeRecentementeAvaliados.revalidate();
        this.painelDeRecentementeAvaliados.repaint();
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        scrollPaneAdicionadosRecentemente = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        scrollPaneMelhoresAvaliados = new javax.swing.JScrollPane();
        jLabel4 = new javax.swing.JLabel();
        textFieldPesquisa = new javax.swing.JTextField();
        botaoPesquisar = new javax.swing.JButton();
        botaoResultadoPesquisa = new javax.swing.JButton();
        painelCategoriaScroll = new javax.swing.JScrollPane();
        jComboCategoria = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        botaoDeConfiguracao = new javax.swing.JButton();
        sairDaTela = new javax.swing.JButton();
        geraAvaliados = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtNomePessoa = new javax.swing.JTextField();
        ScroolNomePessoa = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();
        jRadioAtor = new javax.swing.JRadioButton();
        jRadioDiretor = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(485, 32767));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("Avaliados Recentemente");

        scrollPaneAdicionadosRecentemente.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPaneAdicionadosRecentemente.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("Melhores Avaliados");

        scrollPaneMelhoresAvaliados.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPaneMelhoresAvaliados.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("Pesquisar Nome Do Filme");

        botaoPesquisar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        painelCategoriaScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        painelCategoriaScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jComboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneAdicionadosRecentemente)
                    .addComponent(painelCategoriaScroll, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollPaneMelhoresAvaliados, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textFieldPesquisa)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addComponent(botaoPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoResultadoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoPesquisar))
                    .addComponent(botaoResultadoPesquisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPaneAdicionadosRecentemente, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(scrollPaneMelhoresAvaliados, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jComboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelCategoriaScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logooficial-1.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        botaoDeConfiguracao.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        botaoDeConfiguracao.setText("Configuracao");
        botaoDeConfiguracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeConfiguracaoActionPerformed(evt);
            }
        });

        sairDaTela.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        sairDaTela.setText("Sair");
        sairDaTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairDaTelaActionPerformed(evt);
            }
        });

        geraAvaliados.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        geraAvaliados.setText("Passar nota minima");
        geraAvaliados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geraAvaliadosActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setText("Pesquisar Nome da Pessoa");

        ScroolNomePessoa.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        ScroolNomePessoa.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jRadioAtor.setText("Ator");
        jRadioAtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioAtorActionPerformed(evt);
            }
        });

        jRadioDiretor.setText("Diretor");
        jRadioDiretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioDiretorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(geraAvaliados)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sairDaTela, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148)
                                .addComponent(botaoDeConfiguracao, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(161, 161, 161))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(ScroolNomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(197, 197, 197))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioAtor)
                                        .addGap(116, 116, 116)
                                        .addComponent(jRadioDiretor)
                                        .addGap(29, 29, 29))
                                    .addComponent(txtNomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(111, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(botaoDeConfiguracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(geraAvaliados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sairDaTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioAtor)
                            .addComponent(jRadioDiretor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ScroolNomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geraAvaliadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geraAvaliadosActionPerformed
        try {
            String valorMinimoString = JOptionPane.showInputDialog("Informe o valor minimo de avaliacao a ser demonstrado:");
            Integer valorMinimo = Integer.parseInt(valorMinimoString);
            this.painelDeMelhoresAvaliados.removeAll();
            LinkedList<Conteudo> melhoresAvaliados = this.netflixBancoDeDadosAtual.melhoresAvaliados(valorMinimo);
            for (int i = 0; i < melhoresAvaliados.size(); i++) {
                Conteudo conteudoAtual = melhoresAvaliados.get(i);
                JButton botao = new JButton();
                botao.setPreferredSize(new Dimension(150, 115));
                botao.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botaoDeConteudoActionPerformed(evt, conteudoAtual);
                    }
                });
                botao.setIcon(conteudoAtual.getIcone());
                botao.setIcon(this.redimensionar(botao, 150, 115));
                this.painelDeMelhoresAvaliados.add(botao);
            }
            this.painelDeMelhoresAvaliados.revalidate();
            this.painelDeMelhoresAvaliados.repaint();
            this.pack();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Informe um valor numerico");
        }
        if (jComboCategoria.getSelectedItem().equals("Acao")) {

        }
    }//GEN-LAST:event_geraAvaliadosActionPerformed

    private void botaoDeConfiguracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeConfiguracaoActionPerformed
        this.setVisible(false);
        this.telaDeConfiguracaoDoUsuario.setVisible(true);    }//GEN-LAST:event_botaoDeConfiguracaoActionPerformed

    private void sairDaTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairDaTelaActionPerformed
        this.setVisible(false);
        this.telaanterior.setVisible(true);
    }//GEN-LAST:event_sairDaTelaActionPerformed

    private void botaoDeConteudoActionPerformed(java.awt.event.ActionEvent evt, Conteudo conteudo) {
        new telaDosConteudos(conteudo, this, this.cliente).setVisible(true);
    }

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        this.resetandoBotaoDeResultadoDaPesquisa();
        String nomeDoConteudo = this.textFieldPesquisa.getText();
        if (!"".equals(nomeDoConteudo)) {
            Conteudo conteudoPesquisado = this.netflixBancoDeDadosAtual.buscarConteudo(nomeDoConteudo);
            if (conteudoPesquisado != null) {
                this.botaoResultadoPesquisa.setIcon(conteudoPesquisado.getIcone());
                this.botaoResultadoPesquisa.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botaoDeConteudoActionPerformed(evt, conteudoPesquisado);
                    }
                });
                this.botaoResultadoPesquisa.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Nao existe filme com o nome informado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Informe o nome do conteúdo para ser pesquisado!");
        }
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void jComboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCategoriaActionPerformed
        if (jComboCategoria != null) {
            this.painelDeNovos.removeAll();
            String categoria = null;
            if (jComboCategoria.getSelectedItem().equals("Acao")) {
                categoria = "Acao";
            } else if (jComboCategoria.getSelectedItem().equals("Aventura")) {
                categoria = "Aventura";
            } else if (jComboCategoria.getSelectedItem().equals("Suspense")) {
                categoria = "Suspense";
            } else if (jComboCategoria.getSelectedItem().equals("Terror")) {
                categoria = "Terror";
            } else if (jComboCategoria.getSelectedItem().equals("Infantil")) {
                categoria = "Infantil";
            } else if (jComboCategoria.getSelectedItem().equals("Comedia")) {
                categoria = "Comedia";
            }
            if (categoria != null) {

                ArrayList<Conteudo> Categoria = this.netflixBancoDeDadosAtual.retornoCategoria(categoria);

                for (int i = 0; i < Categoria.size(); i++) {
                    Conteudo atual = Categoria.get(i);
                    JButton botao = new JButton();
                    botao.setPreferredSize(new Dimension(150, 115));
                    botao.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            botaoDeConteudoActionPerformed(evt, atual);
                        }
                    });
                    botao.setIcon(atual.getIcone());
                    botao.setIcon(this.redimensionar(botao, 150, 115));
                    this.painelDeNovos.add(botao);
                }
                this.painelDeNovos.revalidate();
                this.painelDeNovos.repaint();
                this.pack();
            }
        }
    }//GEN-LAST:event_jComboCategoriaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jRadioAtor.isSelected()){
        this.painelDePesquisarNomes.removeAll();
        ArrayList<Conteudo> Ator = this.netflixBancoDeDadosAtual.retornoAtores(txtNomePessoa.getText());
        if (!Ator.isEmpty()) {
            for (int i = 0; i < Ator.size(); i++) {
                //Vai retornar o filme ou a serie que o ator trabalha
                Conteudo atual = Ator.get(i);
                JButton botao = new JButton();
                botao.setPreferredSize(new Dimension(150, 115));
                botao.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botaoDeConteudoActionPerformed(evt, atual);
                    }
                });
                botao.setIcon(atual.getIcone());
                botao.setIcon(this.redimensionar(botao, 150, 115));
                this.painelDePesquisarNomes.add(botao);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ator não existe");
        }
        }else{
            
        this.painelDePesquisarNomes.removeAll();
        ArrayList<Conteudo> Diretor = this.netflixBancoDeDadosAtual.retornoDiretor(txtNomePessoa.getText());
        if (!Diretor.isEmpty()) {
            for (int i = 0; i < Diretor.size(); i++) {
                //Vai retornar o filme ou a serie que o ator trabalha
                Conteudo atual = Diretor.get(i);
                JButton botao = new JButton();
                botao.setPreferredSize(new Dimension(150, 115));
                botao.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botaoDeConteudoActionPerformed(evt, atual);
                    }
                });
                botao.setIcon(atual.getIcone());
                botao.setIcon(this.redimensionar(botao, 150, 115));
                this.painelDePesquisarNomes.add(botao);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Diretor não existe");
        }
           
        }
        this.painelDePesquisarNomes.revalidate();
        this.painelDePesquisarNomes.repaint();
        this.pack(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioAtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioAtorActionPerformed
       if(jRadioAtor.isSelected()){
           jRadioDiretor.setEnabled(false);
       }else{
           jRadioDiretor.setEnabled(true);
       }
    }//GEN-LAST:event_jRadioAtorActionPerformed

    private void jRadioDiretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioDiretorActionPerformed
        if(jRadioDiretor.isSelected()){
           jRadioAtor.setEnabled(false);
       }else{
           jRadioAtor.setEnabled(true);
       }
    }//GEN-LAST:event_jRadioDiretorActionPerformed

    private ImageIcon redimensionar(JButton botao, int xLargura, int yAltura) {
        ImageIcon img = new ImageIcon(botao.getIcon().toString());
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
            java.util.logging.Logger.getLogger(TelaDoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDoUsuario().setVisible(true);
            }
        });
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Netflix getNetflixBancoDeDadosAtual() {
        return netflixBancoDeDadosAtual;
    }

    private javax.swing.JPanel painelDeRecentementeAvaliados;
    private javax.swing.JPanel painelDeMelhoresAvaliados;
    private javax.swing.JPanel painelDeNovos;
    private javax.swing.JPanel painelDePesquisarNomes;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScroolNomePessoa;
    private javax.swing.JButton botaoDeConfiguracao;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoResultadoPesquisa;
    private javax.swing.JButton geraAvaliados;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioAtor;
    private javax.swing.JRadioButton jRadioDiretor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane painelCategoriaScroll;
    private javax.swing.JButton sairDaTela;
    private javax.swing.JScrollPane scrollPaneAdicionadosRecentemente;
    private javax.swing.JScrollPane scrollPaneMelhoresAvaliados;
    private javax.swing.JTextField textFieldPesquisa;
    private javax.swing.JTextField txtNomePessoa;
    // End of variables declaration//GEN-END:variables
}
