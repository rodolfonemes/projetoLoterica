
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rnsilva
 */
public class retiradaCaixa extends javax.swing.JInternalFrame {

    int contador = 100;
    String texto = null;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    int contador2 = 0;
    float valorTotalDespesas = 0;
    double subTotal = 0;

 
  
    public class DocumentoLimitado extends PlainDocument {

        private int tamanhoMax = 10;

        public DocumentoLimitado(int tamanhoMax) {
            this.tamanhoMax = tamanhoMax;
        }

        public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {

            if (str == null) {
                return;
            }

            String stringAntiga = getText(0, getLength());
            int tamanhoNovo = stringAntiga.length() + str.length();

            if (tamanhoNovo <= tamanhoMax) {
                super.insertString(offset, str, attr);
            } else {
                super.insertString(offset, "", attr);
            }
        }
    }

    public retiradaCaixa() {
        initComponents();
        //camposBloqueados();
        //habilitarBotoes(true, false, false, false, false, true);
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        //JOptionPane.showMessageDialog(this, formatador.format( data ));
        tbDataRetirada.setText(formatador.format(data));
        tbDataSelecao.setText(formatador.format(data));
        abaConsulta.setVisible(false);
      jLabel1.setVisible(false);
      jLabel2.setVisible(false);
      lbSubtotal.setVisible(false);
      

    }

//    void habilitarBotoes(boolean novo, boolean salvar, boolean editar, boolean atualizar, boolean excluir, boolean sair) {
//
//        btNovo.setEnabled(novo);
//        btSalvar.setEnabled(salvar);
//        btCancelar.setEnabled(sair);

    //}

//    void camposBloqueados() {
////        tbIsbn.setEnabled(false);
////        tbTitulo.setEnabled(false);
////        tbAutor.setEnabled(false);
////        tbEditora.setEnabled(false);
////        tbAno.setEnabled(false);
////        tbTipo.setEnabled(false);
////        tbEstante.setEnabled(false);
////        tbDescricao.setEnabled(false);
////        tbQuantidade.setEnabled(false);
////        tbValor.setEnabled(false);
//
//        habilitarBotoes(true, false, false, false, false, true);
//    }

//    void camposDesbloqueados() {
////        tbIsbn.setEnabled(true);
////        tbTitulo.setEnabled(true);
////        tbAutor.setEnabled(true);
////        tbEditora.setEnabled(true);
////        tbAno.setEnabled(true);
////        tbTipo.setEnabled(true);
////        tbEstante.setEnabled(true);
////        tbDescricao.setEnabled(true);
////        tbQuantidade.setEnabled(true);
////        tbValor.setEnabled(true);
//    }
//
//    void camposDefalut() {
//
////        tbAno.setText("0");
////        tbQuantidade.setText("0");
////        tbValor.setText("0");
//        habilitarBotoes(true, false, false, false, false, true);
//    }
//
//    void contadorCaracteres() {
////        String texto = tbDescricao.getText();
////        int tamanhoDoTexto = 400 - texto.length();
////        lbContador.setText(String.valueOf(tamanhoDoTexto));
//    }
//
//    void limparCampos() {
////        tbIsbn.setText(null);
////        tbTitulo.setText(null);
////        tbAutor.setText(null);
////        tbEditora.setText(null);
////        tbAno.setText(null);
////        tbTipo.setText(null);
////        tbEstante.setText(null);
////        tbDescricao.setText(null);
////        tbQuantidade.setText(null);
////        tbValor.setText(null);
//
//        ((DefaultTableModel) Tabela2.getModel()).setNumRows(0);
//        Tabela2.updateUI();
//        habilitarBotoes(true, false, false, false, false, true);
//    }
//
//    private void carregarFormulario(Produto pro) {
////        tbIsbn.setText(pro.getIsbn());
////        tbTitulo.setText(pro.getTitulo());
////        tbAutor.setText(pro.getAutor());
////        tbEditora.setText(pro.getEditora());
////        tbAno.setText(String.valueOf(pro.getAno()));
////        tbTipo.setText(pro.getTipo());
////        tbEstante.setText(pro.getEstante());
////        tbValor.setText(String.valueOf(pro.getValor()));
////        tbQuantidade.setText(String.valueOf(pro.getQuant()));
////        tbDescricao.setText(pro.getDescricao());
//    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        cbCaixaRetirada = new javax.swing.JComboBox<>();
        cbFuncionariaRetirada = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tbDataSelecao = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cbPeriodoRetirada = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        abaConsulta = new javax.swing.JTabbedPane();
        carroForte = new javax.swing.JScrollPane();
        retirada = new javax.swing.JPanel();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        p100 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        p100Nova = new javax.swing.JTextField();
        p100Usada = new javax.swing.JTextField();
        p50 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        p50nova = new javax.swing.JTextField();
        p50usada = new javax.swing.JTextField();
        p20 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        p20nova = new javax.swing.JTextField();
        p20usada = new javax.swing.JTextField();
        p10 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        p10nova = new javax.swing.JTextField();
        p10usada = new javax.swing.JTextField();
        p05 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        p05nova = new javax.swing.JTextField();
        p05usada = new javax.swing.JTextField();
        p02 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        p02nova = new javax.swing.JTextField();
        p02usada = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbSubtotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbTotalCaixa = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tbDataRetirada = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tb1 = new javax.swing.JTextField();
        tb2 = new javax.swing.JTextField();
        tb3 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        tbTotalEnvelope = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        despesas = new javax.swing.JScrollPane();
        menu = new javax.swing.JPanel();
        btNovo1 = new javax.swing.JButton();
        btSalvar1 = new javax.swing.JButton();
        btCancelar1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tbValorDespesas = new javax.swing.JTextField();
        cbDespesas = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        tbOutrosDespesas = new javax.swing.JTextField();
        tbAdicionarDespesas = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        totalDespesas = new javax.swing.JLabel();
        cbNaoDespesa = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaDespesas = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        fechamento = new javax.swing.JScrollPane();
        menu1 = new javax.swing.JPanel();
        btNovo2 = new javax.swing.JButton();
        btSalvar2 = new javax.swing.JButton();
        btCancelar2 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        tbJogosFechamento = new javax.swing.JTextField();
        tbPremiosPagosFechamento = new javax.swing.JTextField();
        tbEstornoFechamento = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        tbTotalDebitosCaixaFechamento = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        tbSobraEmCaixaFechamento = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        tbTotalCaixaFechamento = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        consulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela2 = new javax.swing.JTable();
        Consultar2 = new javax.swing.JButton();
        tfConsulta2 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Retirada Caixa");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbCaixaRetirada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um caixa", "Caixa 1", "Caixa 2", "Caixa 3", "Caixa 4" }));

        cbFuncionariaRetirada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um(a) Funcionario(a)", "Fernanda", "Sonia", "Katia", "Arlene" }));

        jLabel12.setText("Caixa");

        jLabel13.setText("Funcionaria");

        tbDataSelecao.setEditable(false);

        jLabel14.setText("Periodo");

        cbPeriodoRetirada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um periodo", "Manha(antes do carro forte)", "Tarde(sobra para o proximo dia)", "Sábado" }));

        jButton4.setText("Acessar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbPeriodoRetirada, 0, 231, Short.MAX_VALUE)
                            .addComponent(cbCaixaRetirada, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbFuncionariaRetirada, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(tbDataSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tbDataSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbCaixaRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbFuncionariaRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbPeriodoRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        p100.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel19.setText("R$ 100");

        jLabel20.setText("NOVA");

        jLabel21.setText("VELHA");

        p100Nova.setToolTipText("");
        p100Nova.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p100NovaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p100NovaFocusLost(evt);
            }
        });
        p100Nova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p100NovaActionPerformed(evt);
            }
        });

        p100Usada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p100UsadaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p100UsadaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout p100Layout = new javax.swing.GroupLayout(p100);
        p100.setLayout(p100Layout);
        p100Layout.setHorizontalGroup(
            p100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p100Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(p100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(p100Nova, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(p100Usada, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        p100Layout.setVerticalGroup(
            p100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p100Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p100Nova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p100Usada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        p50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel31.setText("R$ 50");

        jLabel32.setText("NOVA");

        jLabel33.setText("VELHA");

        p50nova.setToolTipText("");
        p50nova.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p50novaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p50novaFocusLost(evt);
            }
        });

        p50usada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p50usadaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p50usadaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout p50Layout = new javax.swing.GroupLayout(p50);
        p50.setLayout(p50Layout);
        p50Layout.setHorizontalGroup(
            p50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p50Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(p50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(p50nova, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(p50usada, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        p50Layout.setVerticalGroup(
            p50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p50Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p50nova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p50usada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        p20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel34.setText("R$ 20");

        jLabel35.setText("NOVA");

        jLabel36.setText("VELHA");

        p20nova.setToolTipText("");
        p20nova.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p20novaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p20novaFocusLost(evt);
            }
        });

        p20usada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p20usadaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p20usadaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout p20Layout = new javax.swing.GroupLayout(p20);
        p20.setLayout(p20Layout);
        p20Layout.setHorizontalGroup(
            p20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p20Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(p20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(p20nova, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(p20usada, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        p20Layout.setVerticalGroup(
            p20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p20nova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p20usada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        p10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel37.setText("R$ 10");

        jLabel38.setText("NOVA");

        jLabel39.setText("VELHA");

        p10nova.setToolTipText("");
        p10nova.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p10novaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p10novaFocusLost(evt);
            }
        });

        p10usada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p10usadaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p10usadaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout p10Layout = new javax.swing.GroupLayout(p10);
        p10.setLayout(p10Layout);
        p10Layout.setHorizontalGroup(
            p10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p10Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(p10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(p10nova, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(p10usada, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p10Layout.setVerticalGroup(
            p10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p10Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p10nova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p10usada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        p05.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel40.setText("R$ 05");

        jLabel41.setText("NOVA");

        jLabel42.setText("VELHA");

        p05nova.setToolTipText("");
        p05nova.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p05novaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p05novaFocusLost(evt);
            }
        });

        p05usada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p05usadaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p05usadaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout p05Layout = new javax.swing.GroupLayout(p05);
        p05.setLayout(p05Layout);
        p05Layout.setHorizontalGroup(
            p05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p05Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(p05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(p05nova, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(p05usada, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p05Layout.setVerticalGroup(
            p05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p05Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p05nova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p05usada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        p02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel43.setText("R$ 02");

        jLabel44.setText("NOVA");

        jLabel45.setText("VELHA");

        p02nova.setToolTipText("");
        p02nova.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p02novaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p02novaFocusLost(evt);
            }
        });

        p02usada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p02usadaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p02usadaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout p02Layout = new javax.swing.GroupLayout(p02);
        p02.setLayout(p02Layout);
        p02Layout.setHorizontalGroup(
            p02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p02Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(p02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44)
                    .addComponent(p02nova, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(p02usada, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p02Layout.setVerticalGroup(
            p02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p02Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p02nova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p02usada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(p10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p100, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p05, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(p50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(p05, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Subtotal: ");

        lbSubtotal.setText("0");

        jLabel3.setText("Total Caixa dia: ");

        lbTotalCaixa.setText("0");

        jLabel2.setText("R$");

        jLabel4.setText("R$");

        tbDataRetirada.setEditable(false);
        tbDataRetirada.setToolTipText("");
        tbDataRetirada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbDataRetiradaActionPerformed(evt);
            }
        });

        jLabel9.setText("Caixa");

        jLabel10.setText("Funcionario");

        jLabel11.setText("Periodo");

        tb1.setEditable(false);

        tb2.setEditable(false);

        tb3.setEditable(false);

        jLabel26.setText("Total Envelope:");

        jLabel28.setText("R$");

        tbTotalEnvelope.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tbTotalEnvelopeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tbTotalEnvelopeFocusLost(evt);
            }
        });

        jLabel29.setText("Numero do envelope:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(tb2)
                            .addComponent(tb3)
                            .addComponent(tb1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                        .addGap(10, 49, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tbDataRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel4))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTotalCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                    .addComponent(lbSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel28))
                                    .addComponent(jLabel29))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1)
                                    .addComponent(tbTotalEnvelope, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tbDataRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(lbSubtotal))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tbTotalEnvelope, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(lbTotalCaixa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout retiradaLayout = new javax.swing.GroupLayout(retirada);
        retirada.setLayout(retiradaLayout);
        retiradaLayout.setHorizontalGroup(
            retiradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(retiradaLayout.createSequentialGroup()
                .addGroup(retiradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(retiradaLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(retiradaLayout.createSequentialGroup()
                        .addContainerGap(133, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        retiradaLayout.setVerticalGroup(
            retiradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(retiradaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(retiradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo)
                    .addComponent(btSalvar)
                    .addComponent(btCancelar)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(retiradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        carroForte.setViewportView(retirada);

        abaConsulta.addTab("Carro Forte", carroForte);

        btNovo1.setText("Novo");
        btNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovo1ActionPerformed(evt);
            }
        });

        btSalvar1.setText("Salvar");
        btSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvar1ActionPerformed(evt);
            }
        });

        btCancelar1.setText("Cancelar");
        btCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelar1ActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Despesas diarias");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbDespesas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Item", "Aluguel", "Grafica", "Luz", "Agua", "Cheque", "Outros" }));
        cbDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDespesasActionPerformed(evt);
            }
        });

        jLabel6.setText("R$");

        tbOutrosDespesas.setText("outros");
        tbOutrosDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbOutrosDespesasActionPerformed(evt);
            }
        });
        tbOutrosDespesas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tbOutrosDespesasPropertyChange(evt);
            }
        });

        tbAdicionarDespesas.setText("Adicionar");
        tbAdicionarDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbAdicionarDespesasActionPerformed(evt);
            }
        });

        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Total Despesas");

        jLabel8.setText("R$: ");

        totalDespesas.setText("0");

        cbNaoDespesa.setText("Não Despesa");
        cbNaoDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNaoDespesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tbOutrosDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbNaoDespesa))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cbDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addGap(6, 6, 6)
                                .addComponent(tbValorDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(tbAdicionarDespesas)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbValorDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbOutrosDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNaoDespesa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbAdicionarDespesas)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(totalDespesas))
                .addContainerGap())
        );

        tabelaDespesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item", "Valor"
            }
        ));
        jScrollPane3.setViewportView(tabelaDespesas);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(102, 102, 102))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap(336, Short.MAX_VALUE)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addComponent(btNovo1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(320, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo1)
                    .addComponent(btSalvar1)
                    .addComponent(btCancelar1)
                    .addComponent(jButton3))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        despesas.setViewportView(menu);

        abaConsulta.addTab("Despesas", despesas);

        btNovo2.setText("Novo");
        btNovo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovo2ActionPerformed(evt);
            }
        });

        btSalvar2.setText("Salvar");
        btSalvar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvar2ActionPerformed(evt);
            }
        });

        btCancelar2.setText("Cancelar");
        btCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelar2ActionPerformed(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel49.setText("Total Jogos");

        jLabel50.setText("Prêmios Pagos");

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setText("Caderno");

        jLabel52.setText("Estornos");

        tbJogosFechamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tbJogosFechamentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tbJogosFechamentoFocusLost(evt);
            }
        });

        tbPremiosPagosFechamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tbPremiosPagosFechamentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tbPremiosPagosFechamentoFocusLost(evt);
            }
        });

        tbEstornoFechamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tbEstornoFechamentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tbEstornoFechamentoFocusLost(evt);
            }
        });

        jLabel53.setText("R$");

        jLabel54.setText("R$");

        jLabel55.setText("R$");

        jLabel56.setText("Total Débitos ");

        tbTotalDebitosCaixaFechamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTotalDebitosCaixaFechamentoActionPerformed(evt);
            }
        });

        jLabel57.setText("R$");

        jLabel58.setText("Total em Caixa ");

        jLabel59.setText("R$");

        tbSobraEmCaixaFechamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSobraEmCaixaFechamentoActionPerformed(evt);
            }
        });

        jLabel60.setText("R$");

        jLabel61.setText("Sobra em caixa");

        tbTotalCaixaFechamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTotalCaixaFechamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addComponent(jLabel50)
                            .addComponent(jLabel52)
                            .addComponent(jLabel56)
                            .addComponent(jLabel58)
                            .addComponent(jLabel61))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel55)
                                .addGap(18, 18, 18)
                                .addComponent(tbEstornoFechamento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel53)
                                        .addComponent(jLabel54))
                                    .addComponent(jLabel60))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tbSobraEmCaixaFechamento, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(tbPremiosPagosFechamento)
                                    .addComponent(tbJogosFechamento)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel57)
                                    .addComponent(jLabel59))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbTotalDebitosCaixaFechamento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbTotalCaixaFechamento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel51)))
                .addGap(20, 20, 20))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel51)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53)
                    .addComponent(tbJogosFechamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(tbPremiosPagosFechamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55)
                    .addComponent(tbEstornoFechamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57)
                    .addComponent(tbTotalDebitosCaixaFechamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59)
                    .addComponent(tbTotalCaixaFechamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60)
                    .addComponent(tbSobraEmCaixaFechamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jButton6.setText("Sair");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel62.setText("Situação do caixa");

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ok.png"))); // NOI18N
        jLabel16.setText("ok");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ok.png"))); // NOI18N
        jLabel15.setText("não ok");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menu1Layout = new javax.swing.GroupLayout(menu1);
        menu1.setLayout(menu1Layout);
        menu1Layout.setHorizontalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addContainerGap(349, Short.MAX_VALUE)
                .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu1Layout.createSequentialGroup()
                        .addComponent(btNovo2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menu1Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        menu1Layout.setVerticalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo2)
                    .addComponent(btSalvar2)
                    .addComponent(btCancelar2)
                    .addComponent(jButton6))
                .addGap(25, 25, 25)
                .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(249, Short.MAX_VALUE))
        );

        fechamento.setViewportView(menu1);

        abaConsulta.addTab("Fechamento Caixa Diario", fechamento);

        Tabela2.setAutoCreateRowSorter(true);
        Tabela2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ISBN", "TITULO", "AUTOR", "EDITORA", "ANO DA EDIÇÃO", "TIPO", "ESTANTE", "QUANTIDADE", "VALOR", "DESCRIÇÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela2);

        Consultar2.setText("Procurar");
        Consultar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consultar2ActionPerformed(evt);
            }
        });

        tfConsulta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfConsulta2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout consultaLayout = new javax.swing.GroupLayout(consulta);
        consulta.setLayout(consultaLayout);
        consultaLayout.setHorizontalGroup(
            consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultaLayout.createSequentialGroup()
                .addGroup(consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(consultaLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(tfConsulta2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(Consultar2))
                    .addGroup(consultaLayout.createSequentialGroup()
                        .addContainerGap(209, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(371, Short.MAX_VALUE))
        );
        consultaLayout.setVerticalGroup(
            consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfConsulta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Consultar2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );

        abaConsulta.addTab("Consulta", consulta);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(abaConsulta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abaConsulta)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        abaConsulta.getAccessibleContext().setAccessibleName("Despesas");

        jScrollPane2.setViewportView(jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tabela2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela2MouseClicked
//        BDprodutos bd;
//        Produto pro;
//        String iCodigo;
//        iCodigo = (String) Tabela2.getModel().getValueAt(Tabela2.getSelectedRow(), 0);
//        bd = new BDprodutos();
//        pro = new Produto();
//        try {
//            pro = bd.procurarProdutos(iCodigo);
//
//            carregarFormulario(pro);
//            camposBloqueados();
//            contadorCaracteres();
//            habilitarBotoes(false, false, true, false, false, true);
//        } catch (SQLException ex) {
//
//        }
//        //jTabbedPane1.setSelectedIndex(1);
//        abaConsulta.setSelectedIndex(1);
    }//GEN-LAST:event_Tabela2MouseClicked

    private void Consultar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consultar2ActionPerformed
//        BDprodutos bd;
//        List<Produto> listaProduto;
//        Produto pr1;
//        bd = new BDprodutos();
//        listaProduto = bd.consultarProduto(tfConsulta2.getText());
//        DefaultTableModel model = (DefaultTableModel) Tabela2.getModel();
//        model.setNumRows(0);
//        for (Produto listaProduto1 : listaProduto) {
//            pr1 = listaProduto1;
//
//            model.addRow(new Object[]{
//                pr1.getIsbn(),
//                pr1.getTitulo(),
//                pr1.getAutor(),
//                pr1.getEditora(),
//                pr1.getAno(),
//                pr1.getTipo(),
//                pr1.getEstante(),
//                pr1.getQuant(),
//                pr1.getValor(),
//                pr1.getDescricao()
//            }
//            );
//        }
    }//GEN-LAST:event_Consultar2ActionPerformed

    private void tfConsulta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfConsulta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfConsulta2ActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
//        camposDesbloqueados();
//        limparCampos();
//        abaConsulta.setSelectedIndex(1);
//        //tbIsbn.requestFocusInWindow();
//        contadorCaracteres();
//        habilitarBotoes(false, true, false, false, false, true);
// TODO add your handling code here:
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        
        if(tbTotalEnvelope.getText().equals("")){
       JOptionPane.showMessageDialog(null, "Informar o total do envelope" );
            
            
        }else{
        if(Double.valueOf(tbTotalEnvelope.getText()) == subTotal){
            JOptionPane.showMessageDialog(null, "dados salvos" + "\n" + "valor salvo foi de: " + subTotal );
            
               
        } else {
             JOptionPane.showMessageDialog(null, "Valor informado no Total envelope esta diferente das notas digitadas" );
}
        }
            
//        Produto pr;
//        if (!(tbIsbn.getText().equals("")) & !(tbAno.getText().equals(""))
//                & !(tbValor.getText().equals("")) & !(tbQuantidade.getText().equals(""))) {
//            try {
//                BDprodutos bd = new BDprodutos();
//                pr = bd.procurarProdutos(tbIsbn.getText());
//                if (pr != null) {
//                    JOptionPane.showMessageDialog(null, "codigo ja cadastrado");
//                } else {
//                    
//                    pr = new Produto();
//                    //if(pr.getIsbn()!= null){
//                    pr.setIsbn(tbIsbn.getText());
//                    pr.setTitulo(tbTitulo.getText());
//                    pr.setAutor(tbAutor.getText());
//                    pr.setEditora(tbEditora.getText());
//                    pr.setAno(Integer.parseInt(tbAno.getText()));
//                    pr.setTipo(tbTipo.getText());
//                    pr.setEstante(tbEstante.getText());
//                    pr.setDescricao(tbDescricao.getText());
//                    pr.setValor(Double.parseDouble(tbValor.getText()));
//                    pr.setQuant(Integer.parseInt(tbQuantidade.getText()));
//                    
//                    BDprodutos bdpr = new BDprodutos();
//                    try {
//                        bdpr.adicionarProduto(pr);
//                        limparCampos();
//                        camposBloqueados();
//                        JOptionPane.showMessageDialog(null, "Registro gravado com sucesso");
//                        habilitarBotoes(true, false, false, false, false, true);
//                    } catch (SQLException ex) {
//                        JOptionPane.showMessageDialog(null, "Erro ao gravar");
//                    }
//                    
//                }
//            } catch (SQLException ex) {
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "OS CAMPOS COM * SÃO OBRIGATORIOS ");
//        }
// TODO add your handling code here:
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed

//        if (tbIsbn.getText().equals("")) {
//            habilitarBotoes(true, false, false, false, false, true);
//            camposBloqueados();
//            contadorCaracteres();
//        } else {
//            camposBloqueados();
//            contadorCaracteres();
//            habilitarBotoes(true, false, true, false, false, true);
//        }
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btNovo1ActionPerformed

    private void btSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSalvar1ActionPerformed

    private void btCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCancelar1ActionPerformed

    private void tbAdicionarDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbAdicionarDespesasActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabelaDespesas.getModel();
        model.setNumRows(contador2);
        
                if (!(tbValorDespesas.getText().equals(""))) {
            if (cbDespesas.getSelectedItem().equals("Selecione um Item")) {

                JOptionPane.showMessageDialog(menu, "Favor selecionar um item!!");

            } else {
                
                String s = tbValorDespesas.getText();
                try {
                    Double.parseDouble(s);
                    
                    if (cbDespesas.getSelectedItem().equals("Outros")) {
                    String juncao = "outros " + " - " + tbOutrosDespesas.getText(); 
                        
                        model.addRow(new Object[]{
                            //tbOutrosDespesas.getText(),
                            juncao,
                            tbValorDespesas.getText()
                        
                    }
                    );
                }else {
                        
                         
                    if (cbDespesas.getSelectedItem().equals("Cheque")) {
                    String juncao = "Cheque " + " - " + tbOutrosDespesas.getText(); 
                        
                        model.addRow(new Object[]{
                            //tbOutrosDespesas.getText(),
                            juncao,
                            tbValorDespesas.getText()
                        
                    }
                    );
                }else{

                    model.addRow(new Object[]{
                        cbDespesas.getItemAt(cbDespesas.getSelectedIndex()),
                        tbValorDespesas.getText()
                    }
                    );
                }
                    }
                contador2++;
               
                valorTotalDespesas = valorTotalDespesas + Float.valueOf(tbValorDespesas.getText());
                totalDespesas.setText(String.valueOf(valorTotalDespesas));
                cbDespesas.setSelectedItem("Selecione um Item");
                tbValorDespesas.setText("");
                tbOutrosDespesas.setText("Outros");
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Colocar \".\" como sepador decimal");
                }
                                
            }
        } else {
            JOptionPane.showMessageDialog(menu, "Digite um valor ");
        }
    }//GEN-LAST:event_tbAdicionarDespesasActionPerformed

    private void cbDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDespesasActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_cbDespesasActionPerformed

    private void tbOutrosDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbOutrosDespesasActionPerformed

//        if(cbDespesas.getSelectedItem().equals("Outros")){
//        JOptionPane.showMessageDialog(menu, "oi");
//           tbOutrosDespesas.setEnabled(true);
//       }
        // TODO add your handling code here:
    }//GEN-LAST:event_tbOutrosDespesasActionPerformed

    private void tbOutrosDespesasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tbOutrosDespesasPropertyChange

// TODO add your handling code here:
    }//GEN-LAST:event_tbOutrosDespesasPropertyChange

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

//        if (!(cbCaixaRetirada.getSelectedItem().equals("Selecione um caixa"))
//                & !(cbFuncionariaRetirada.getSelectedItem().equals("Selecione um(a) Funcionario(a)"))
//                & !(cbPeriodoRetirada.getSelectedItem().equals("Selecione um periodo"))) {
//            tb1.setText(cbCaixaRetirada.getItemAt(cbCaixaRetirada.getSelectedIndex()));
//            tb2.setText(cbFuncionariaRetirada.getItemAt(cbFuncionariaRetirada.getSelectedIndex()));
//            tb3.setText(cbPeriodoRetirada.getItemAt(cbPeriodoRetirada.getSelectedIndex()));
//
//            jPanel3.setVisible(false);
//            abaConsulta.setVisible(true);
//
//        } else {
//            JOptionPane.showMessageDialog(this,
//                    "Favor selecionar: "
//                    + "\n" + "Um caixa"
//                    + "\n" + "Um(a) Funcionario(a)"
//                    + "\n" + "Um Periodo");
//        }
        tb1.setText(cbCaixaRetirada.getItemAt(cbCaixaRetirada.getSelectedIndex()));
        tb2.setText(cbFuncionariaRetirada.getItemAt(cbFuncionariaRetirada.getSelectedIndex()));
        tb3.setText(cbPeriodoRetirada.getItemAt(cbPeriodoRetirada.getSelectedIndex()));

        jPanel3.setVisible(false);
        abaConsulta.setVisible(true);
        //btSalvar.setEnabled(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanel3.setVisible(true);
        abaConsulta.setVisible(false);
        cbCaixaRetirada.setSelectedItem("Selecione um caixa");
        cbFuncionariaRetirada.setSelectedItem("Selecione um(a) Funcionario(a)");
        cbPeriodoRetirada.setSelectedItem("Selecione um periodo");

        tbValorDespesas.setText("");
        p100Nova.setText("");
        p100Usada.setText("");
        p50nova.setText("");
        p50usada.setText("");
        p10nova.setText("");
        p10usada.setText("");
        p20nova.setText("");
        p20usada.setText("");
        p10nova.setText("");
        p10usada.setText("");
        p05nova.setText("");
        p05usada.setText("");
        p02nova.setText("");
        p02usada.setText("");

        cbDespesas.setSelectedItem("Selecione um Item");
        DefaultTableModel model = (DefaultTableModel) tabelaDespesas.getModel();
        model.getDataVector().removeAllElements();
        contador2 = 0;
        tbEstornoFechamento.setText("");
        tbJogosFechamento.setText("");
        tbPremiosPagosFechamento.setText("");
        tbTotalDebitosCaixaFechamento.setText("");
        


    }//GEN-LAST:event_jButton1ActionPerformed

    private void p100NovaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p100NovaFocusLost
        int p100n = Integer.valueOf(p100Nova.getText());

        subTotal = subTotal + p100n * 100;
//p100Nova.setEnabled(false);
        lbSubtotal.setText(String.valueOf(subTotal));
        

        // TODO add your handling code here:
    }//GEN-LAST:event_p100NovaFocusLost

    private void p100UsadaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p100UsadaFocusLost
        int p100u = Integer.valueOf(p100Usada.getText());

        subTotal = subTotal + p100u * 100;
        lbSubtotal.setText(String.valueOf(subTotal));

        // TODO add your handling code here:
    }//GEN-LAST:event_p100UsadaFocusLost

    private void p100NovaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p100NovaFocusGained
        int p100n = Integer.valueOf(p100Nova.getText());

        subTotal = subTotal - p100n * 100;
//p100Nova.setEnabled(false);
        lbSubtotal.setText(String.valueOf(subTotal));
// TODO add your handling code here:
    }//GEN-LAST:event_p100NovaFocusGained

    private void p100UsadaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p100UsadaFocusGained
        int p100u = Integer.valueOf(p100Usada.getText());

        subTotal = subTotal - p100u * 100;
        lbSubtotal.setText(String.valueOf(subTotal));        // TODO add your handling code here:
    }//GEN-LAST:event_p100UsadaFocusGained

    private void p50novaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p50novaFocusLost
        int p50n = Integer.valueOf(p50nova.getText());

        subTotal = subTotal + p50n * 50;
        lbSubtotal.setText(String.valueOf(subTotal));         // TODO add your handling code here:
    }//GEN-LAST:event_p50novaFocusLost

    private void p50novaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p50novaFocusGained
        int p50n = Integer.valueOf(p50nova.getText());

        subTotal = subTotal - p50n * 50;
        lbSubtotal.setText(String.valueOf(subTotal));         // TODO add your handling code here:
    }//GEN-LAST:event_p50novaFocusGained

    private void p50usadaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p50usadaFocusLost
        int p50u = Integer.valueOf(p50usada.getText());

        subTotal = subTotal + p50u * 50;
        lbSubtotal.setText(String.valueOf(subTotal));
    }//GEN-LAST:event_p50usadaFocusLost

    private void p50usadaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p50usadaFocusGained
        int p50u = Integer.valueOf(p50usada.getText());

        subTotal = subTotal - p50u * 50;
        lbSubtotal.setText(String.valueOf(subTotal));
    }//GEN-LAST:event_p50usadaFocusGained

    private void p20novaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p20novaFocusLost
        int p20n = Integer.valueOf(p20nova.getText());

        subTotal = subTotal + p20n * 20;
        lbSubtotal.setText(String.valueOf(subTotal));
    }//GEN-LAST:event_p20novaFocusLost

    private void p20novaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p20novaFocusGained
        int p20n = Integer.valueOf(p20nova.getText());

        subTotal = subTotal - p20n * 20;
        lbSubtotal.setText(String.valueOf(subTotal));
//        double teste = Double.valueOf(tbTotalEnvelope.getText());
        
    }//GEN-LAST:event_p20novaFocusGained

    private void p20usadaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p20usadaFocusLost
        int p20u = Integer.valueOf(p20usada.getText());

        subTotal = subTotal + p20u * 20;
        lbSubtotal.setText(String.valueOf(subTotal));
    }//GEN-LAST:event_p20usadaFocusLost

    private void p20usadaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p20usadaFocusGained
        int p20n = Integer.valueOf(p20usada.getText());

        subTotal = subTotal - p20n * 20;
        lbSubtotal.setText(String.valueOf(subTotal));
    }//GEN-LAST:event_p20usadaFocusGained

    private void p10novaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p10novaFocusLost
        int p10n = Integer.valueOf(p10nova.getText());

        subTotal = subTotal + p10n * 10;
        lbSubtotal.setText(String.valueOf(subTotal));
    }//GEN-LAST:event_p10novaFocusLost

    private void p10novaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p10novaFocusGained
        int p10n = Integer.valueOf(p10nova.getText());

        subTotal = subTotal - p10n * 10;
        lbSubtotal.setText(String.valueOf(subTotal));
    }//GEN-LAST:event_p10novaFocusGained

    private void p10usadaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p10usadaFocusLost
        int p10u = Integer.valueOf(p10usada.getText());

        subTotal = subTotal + p10u * 10;
        lbSubtotal.setText(String.valueOf(subTotal));
    }//GEN-LAST:event_p10usadaFocusLost

    private void p10usadaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p10usadaFocusGained
        int p10u = Integer.valueOf(p10usada.getText());

        subTotal = subTotal - p10u * 10;
        lbSubtotal.setText(String.valueOf(subTotal));
    }//GEN-LAST:event_p10usadaFocusGained

    private void p05novaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p05novaFocusLost
        int p05n = Integer.valueOf(p05nova.getText());

        subTotal = subTotal + p05n * 5;
        lbSubtotal.setText(String.valueOf(subTotal));
    }//GEN-LAST:event_p05novaFocusLost

    private void p05novaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p05novaFocusGained
        int p05n = Integer.valueOf(p05nova.getText());

        subTotal = subTotal - p05n * 5;
        lbSubtotal.setText(String.valueOf(subTotal));
    }//GEN-LAST:event_p05novaFocusGained

    private void p05usadaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p05usadaFocusLost
        int p05u = Integer.valueOf(p05usada.getText());

        subTotal = subTotal + p05u * 5;
        lbSubtotal.setText(String.valueOf(subTotal));
    }//GEN-LAST:event_p05usadaFocusLost

    private void p05usadaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p05usadaFocusGained
        int p05u = Integer.valueOf(p05usada.getText());

        subTotal = subTotal - p05u * 5;
        lbSubtotal.setText(String.valueOf(subTotal));
    }//GEN-LAST:event_p05usadaFocusGained

    private void p02novaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p02novaFocusLost
        int p02n = Integer.valueOf(p02nova.getText());

        subTotal = subTotal + p02n * 2;
        lbSubtotal.setText(String.valueOf(subTotal));
    }//GEN-LAST:event_p02novaFocusLost

    private void p02novaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p02novaFocusGained
        int p02n = Integer.valueOf(p02nova.getText());

        subTotal = subTotal - p02n * 2;
        lbSubtotal.setText(String.valueOf(subTotal));
    }//GEN-LAST:event_p02novaFocusGained

    private void p02usadaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p02usadaFocusLost
        int p02u = Integer.valueOf(p02usada.getText());

        subTotal = subTotal + p02u * 2;
        lbSubtotal.setText(String.valueOf(subTotal));
    }//GEN-LAST:event_p02usadaFocusLost

    private void p02usadaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p02usadaFocusGained
        int p02u = Integer.valueOf(p02usada.getText());

        subTotal = subTotal - p02u * 2;
        lbSubtotal.setText(String.valueOf(subTotal));
    }//GEN-LAST:event_p02usadaFocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        
        DefaultTableModel dtm = (DefaultTableModel) tabelaDespesas.getModel();
        if (tabelaDespesas.getSelectedRow() >= 0) {

            

            totalDespesas.setText(String.valueOf(valorTotalDespesas));
            dtm.removeRow(tabelaDespesas.getSelectedRow());
            tabelaDespesas.setModel(dtm);
            contador2--;
            dtm.setNumRows(contador2);
            valorTotalDespesas = 0;
            totalDespesas.setText(String.valueOf(valorTotalDespesas));

            for (int i = 0; i <= (dtm.getRowCount() - 1); i++) {

                String teste = (String) dtm.getValueAt(i, 1);
              System.out.println(teste);
                valorTotalDespesas = valorTotalDespesas + Float.parseFloat((String) dtm.getValueAt(i, 1));
               totalDespesas.setText(String.valueOf(valorTotalDespesas));
               //JOptionPane.showMessageDialog(null, totalDespesas.getText());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Favor selecionar uma linha");
        }

// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jPanel3.setVisible(true);
        abaConsulta.setVisible(false);
        cbCaixaRetirada.setSelectedItem("Selecione um caixa");
        cbFuncionariaRetirada.setSelectedItem("Selecione um(a) Funcionario(a)");
        cbPeriodoRetirada.setSelectedItem("Selecione um periodo");

        tbValorDespesas.setText("");
        p100Nova.setText("");
        p100Usada.setText("");
        p50nova.setText("");
        p50usada.setText("");
        p10nova.setText("");
        p10usada.setText("");
        p20nova.setText("");
        p20usada.setText("");
        p10nova.setText("");
        p10usada.setText("");
        p05nova.setText("");
        p05usada.setText("");
        p02nova.setText("");
        p02usada.setText("");

        cbDespesas.setSelectedItem("Selecione um Item");
        DefaultTableModel model = (DefaultTableModel) tabelaDespesas.getModel();
        model.getDataVector().removeAllElements();
        contador2 = 0;
        tbEstornoFechamento.setText("");
        tbJogosFechamento.setText("");
        tbPremiosPagosFechamento.setText("");
        tbTotalDebitosCaixaFechamento.setText("");
        


    }//GEN-LAST:event_jButton3ActionPerformed

    private void p100NovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p100NovaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p100NovaActionPerformed

    private void tbTotalEnvelopeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbTotalEnvelopeFocusGained

    }//GEN-LAST:event_tbTotalEnvelopeFocusGained

    private void tbTotalEnvelopeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbTotalEnvelopeFocusLost

                // TODO add your handling code here:
    }//GEN-LAST:event_tbTotalEnvelopeFocusLost

    private void tbDataRetiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbDataRetiradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbDataRetiradaActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btNovo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btNovo2ActionPerformed

    private void btSalvar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSalvar2ActionPerformed

    private void btCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCancelar2ActionPerformed

    private void tbJogosFechamentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbJogosFechamentoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tbJogosFechamentoFocusGained

    private void tbJogosFechamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbJogosFechamentoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tbJogosFechamentoFocusLost

    private void tbPremiosPagosFechamentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbPremiosPagosFechamentoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tbPremiosPagosFechamentoFocusGained

    private void tbPremiosPagosFechamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbPremiosPagosFechamentoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tbPremiosPagosFechamentoFocusLost

    private void tbEstornoFechamentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbEstornoFechamentoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tbEstornoFechamentoFocusGained

    private void tbEstornoFechamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbEstornoFechamentoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tbEstornoFechamentoFocusLost

    private void tbTotalDebitosCaixaFechamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTotalDebitosCaixaFechamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbTotalDebitosCaixaFechamentoActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tbTotalCaixaFechamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTotalCaixaFechamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbTotalCaixaFechamentoActionPerformed

    private void tbSobraEmCaixaFechamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSobraEmCaixaFechamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbSobraEmCaixaFechamentoActionPerformed

    private void cbNaoDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNaoDespesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNaoDespesaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consultar2;
    private javax.swing.JTable Tabela2;
    private javax.swing.JTabbedPane abaConsulta;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btCancelar1;
    private javax.swing.JButton btCancelar2;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btNovo1;
    private javax.swing.JButton btNovo2;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btSalvar1;
    private javax.swing.JButton btSalvar2;
    private javax.swing.JScrollPane carroForte;
    public javax.swing.JComboBox<String> cbCaixaRetirada;
    private javax.swing.JComboBox<String> cbDespesas;
    private javax.swing.JComboBox<String> cbFuncionariaRetirada;
    private javax.swing.JCheckBox cbNaoDespesa;
    private javax.swing.JComboBox<String> cbPeriodoRetirada;
    private javax.swing.JPanel consulta;
    private javax.swing.JScrollPane despesas;
    private javax.swing.JScrollPane fechamento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbSubtotal;
    private javax.swing.JLabel lbTotalCaixa;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menu1;
    private javax.swing.JPanel p02;
    private javax.swing.JTextField p02nova;
    private javax.swing.JTextField p02usada;
    private javax.swing.JPanel p05;
    private javax.swing.JTextField p05nova;
    private javax.swing.JTextField p05usada;
    private javax.swing.JPanel p10;
    private javax.swing.JPanel p100;
    private javax.swing.JTextField p100Nova;
    private javax.swing.JTextField p100Usada;
    private javax.swing.JTextField p10nova;
    private javax.swing.JTextField p10usada;
    private javax.swing.JPanel p20;
    private javax.swing.JTextField p20nova;
    private javax.swing.JTextField p20usada;
    private javax.swing.JPanel p50;
    private javax.swing.JTextField p50nova;
    private javax.swing.JTextField p50usada;
    private javax.swing.JPanel retirada;
    private javax.swing.JTable tabelaDespesas;
    private javax.swing.JTextField tb1;
    private javax.swing.JTextField tb2;
    private javax.swing.JTextField tb3;
    private javax.swing.JButton tbAdicionarDespesas;
    private javax.swing.JTextField tbDataRetirada;
    private javax.swing.JTextField tbDataSelecao;
    private javax.swing.JTextField tbEstornoFechamento;
    private javax.swing.JTextField tbJogosFechamento;
    private javax.swing.JTextField tbOutrosDespesas;
    private javax.swing.JTextField tbPremiosPagosFechamento;
    private javax.swing.JTextField tbSobraEmCaixaFechamento;
    private javax.swing.JTextField tbTotalCaixaFechamento;
    private javax.swing.JTextField tbTotalDebitosCaixaFechamento;
    private javax.swing.JTextField tbTotalEnvelope;
    private javax.swing.JTextField tbValorDespesas;
    private javax.swing.JTextField tfConsulta2;
    private javax.swing.JLabel totalDespesas;
    // End of variables declaration//GEN-END:variables
}
