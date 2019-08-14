
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
public class fechamantoLotericaDia extends javax.swing.JInternalFrame {

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

    public fechamantoLotericaDia() {
        initComponents();
        //camposBloqueados();
        //habilitarBotoes(true, false, false, false, false, true);
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        //JOptionPane.showMessageDialog(this, formatador.format( data ));
        tbDataRetirada.setText(formatador.format(data));
        abaConsulta.setVisible(true);
        
      
      

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

        abaConsulta = new javax.swing.JTabbedPane();
        fechamento = new javax.swing.JScrollPane();
        menu1 = new javax.swing.JPanel();
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
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        tbTotalFechamentoCaixa = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbLoja = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        tbJogosFechamento1 = new javax.swing.JTextField();
        tbPremiosPagosFechamento1 = new javax.swing.JTextField();
        tbEstornoFechamento1 = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        tbTotalDebitosCaixaFechamento1 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        tbSobraEmCaixaFechamento1 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        tbTotalCaixaFechamento1 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        tbTotalFechamentoCaixa1 = new javax.swing.JTextField();
        observacao = new javax.swing.JScrollPane();
        retirada = new javax.swing.JPanel();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tbDataRetirada = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        tbTotalEnvelope = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        tbNumeroEnvelope = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tbDescricao = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        consulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela2 = new javax.swing.JTable();
        Consultar2 = new javax.swing.JButton();
        tfConsulta2 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("FECHAMENTO LOJA");

        fechamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fechamentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fechamentoFocusLost(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel49.setText("TOTAL DE SAIDAS");

        jLabel50.setText("TOTAL DE DESPESAS E CHEQUES");

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setText("FECHAMENTO LOJA");

        jLabel52.setText("TOTAL CAIXA");

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

        jLabel56.setText("CARRO FORTE");

        tbTotalDebitosCaixaFechamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTotalDebitosCaixaFechamentoActionPerformed(evt);
            }
        });

        jLabel57.setText("R$");

        jLabel58.setText("DORMIU NO DIA ANTERIOR ");

        jLabel59.setText("R$");

        tbSobraEmCaixaFechamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSobraEmCaixaFechamentoActionPerformed(evt);
            }
        });

        jLabel60.setText("R$");

        jLabel61.setText("DORMIU NO DIA");

        tbTotalCaixaFechamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTotalCaixaFechamentoActionPerformed(evt);
            }
        });

        jLabel62.setText("FECHAMENTO LOJA");

        jLabel63.setText("R$");

        tbTotalFechamentoCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTotalFechamentoCaixaActionPerformed(evt);
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
                            .addGroup(jPanel9Layout.createSequentialGroup()
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
                                            .addComponent(jLabel60)
                                            .addComponent(jLabel63))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tbSobraEmCaixaFechamento)
                                            .addComponent(tbPremiosPagosFechamento)
                                            .addComponent(tbJogosFechamento)
                                            .addComponent(tbTotalFechamentoCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel57)
                                            .addComponent(jLabel59))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tbTotalDebitosCaixaFechamento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tbTotalCaixaFechamento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel62)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel51)))
                .addContainerGap(21, Short.MAX_VALUE))
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
                .addGap(17, 17, 17)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63)
                    .addComponent(tbTotalFechamentoCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton6.setText("Sair");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbLoja.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbLoja.setText("0.0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbLoja)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lbLoja)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel64.setText("DSM");

        jLabel65.setText("FEDERAL");

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel66.setText("OBSERVACÕES");

        jLabel67.setText("COMISSÃO FEDERAL");

        tbJogosFechamento1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tbJogosFechamento1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tbJogosFechamento1FocusLost(evt);
            }
        });

        tbPremiosPagosFechamento1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tbPremiosPagosFechamento1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tbPremiosPagosFechamento1FocusLost(evt);
            }
        });

        tbEstornoFechamento1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tbEstornoFechamento1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tbEstornoFechamento1FocusLost(evt);
            }
        });

        jLabel68.setText("R$");

        jLabel69.setText("R$");

        jLabel70.setText("R$");

        jLabel71.setText("COMISSÃO BOLÃO");

        tbTotalDebitosCaixaFechamento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTotalDebitosCaixaFechamento1ActionPerformed(evt);
            }
        });

        jLabel72.setText("R$");

        jLabel73.setText("FIADO ");

        jLabel74.setText("R$");

        tbSobraEmCaixaFechamento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSobraEmCaixaFechamento1ActionPerformed(evt);
            }
        });

        jLabel75.setText("R$");

        jLabel76.setText("DIVERSOS");

        tbTotalCaixaFechamento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTotalCaixaFechamento1ActionPerformed(evt);
            }
        });

        jLabel77.setText("TOTAL");

        jLabel78.setText("R$");

        tbTotalFechamentoCaixa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTotalFechamentoCaixa1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel64)
                                    .addComponent(jLabel65)
                                    .addComponent(jLabel67)
                                    .addComponent(jLabel71)
                                    .addComponent(jLabel73)
                                    .addComponent(jLabel76))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel70)
                                        .addGap(18, 18, 18)
                                        .addComponent(tbEstornoFechamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel68)
                                                .addComponent(jLabel69))
                                            .addComponent(jLabel75)
                                            .addComponent(jLabel78))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tbSobraEmCaixaFechamento1)
                                            .addComponent(tbPremiosPagosFechamento1)
                                            .addComponent(tbJogosFechamento1)
                                            .addComponent(tbTotalFechamentoCaixa1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel72)
                                            .addComponent(jLabel74))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tbTotalDebitosCaixaFechamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tbTotalCaixaFechamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel77)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel66)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel66)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68)
                    .addComponent(tbJogosFechamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(tbPremiosPagosFechamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70)
                    .addComponent(tbEstornoFechamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72)
                    .addComponent(tbTotalDebitosCaixaFechamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74)
                    .addComponent(tbTotalCaixaFechamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75)
                    .addComponent(tbSobraEmCaixaFechamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel78)
                    .addComponent(tbTotalFechamentoCaixa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout menu1Layout = new javax.swing.GroupLayout(menu1);
        menu1.setLayout(menu1Layout);
        menu1Layout.setHorizontalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menu1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        menu1Layout.setVerticalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(menu1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addGroup(menu1Layout.createSequentialGroup()
                        .addContainerGap(39, Short.MAX_VALUE)
                        .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        fechamento.setViewportView(menu1);

        abaConsulta.addTab("FECHAMENTO GERAL", fechamento);

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

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbDataRetirada.setEditable(false);
        tbDataRetirada.setToolTipText("");
        tbDataRetirada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbDataRetiradaActionPerformed(evt);
            }
        });

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

        tbNumeroEnvelope.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbNumeroEnvelopeActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DSM", "FEDERAL", "COMISSÃO FEDERAL", "COMISSÃO BOLÃO", "FIADO", "DIVERSOS" }));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Observaçoes");

        jLabel1.setText("DESCRIÇÃO");

        tbDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbDescricaoActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel28)))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbNumeroEnvelope)
                                    .addComponent(tbTotalEnvelope, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(tbDataRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbDescricao)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(tbDataRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addGap(25, 25, 25)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tbDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(tbNumeroEnvelope, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tbTotalEnvelope, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(43, 43, 43))
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
                .addContainerGap(279, Short.MAX_VALUE)
                .addGroup(retiradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(retiradaLayout.createSequentialGroup()
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(369, Short.MAX_VALUE))
        );
        retiradaLayout.setVerticalGroup(
            retiradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(retiradaLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(retiradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo)
                    .addComponent(btSalvar)
                    .addComponent(btCancelar)
                    .addComponent(jButton1))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        observacao.setViewportView(retirada);

        abaConsulta.addTab("OBSERVAÇÃO", observacao);

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
                .addContainerGap(259, Short.MAX_VALUE)
                .addGroup(consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaLayout.createSequentialGroup()
                        .addComponent(tfConsulta2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(Consultar2)
                        .addGap(90, 90, 90))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(294, Short.MAX_VALUE))
        );
        consultaLayout.setVerticalGroup(
            consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfConsulta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Consultar2))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        abaConsulta.addTab("Consulta", consulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(abaConsulta)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abaConsulta)
        );

        abaConsulta.getAccessibleContext().setAccessibleName("Despesas");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfConsulta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfConsulta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfConsulta2ActionPerformed

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

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tbTotalCaixaFechamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTotalCaixaFechamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbTotalCaixaFechamentoActionPerformed

    private void tbSobraEmCaixaFechamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSobraEmCaixaFechamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbSobraEmCaixaFechamentoActionPerformed

    private void tbTotalDebitosCaixaFechamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTotalDebitosCaixaFechamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbTotalDebitosCaixaFechamentoActionPerformed

    private void tbEstornoFechamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbEstornoFechamentoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tbEstornoFechamentoFocusLost

    private void tbEstornoFechamentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbEstornoFechamentoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tbEstornoFechamentoFocusGained

    private void tbPremiosPagosFechamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbPremiosPagosFechamentoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tbPremiosPagosFechamentoFocusLost

    private void tbPremiosPagosFechamentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbPremiosPagosFechamentoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tbPremiosPagosFechamentoFocusGained

    private void tbJogosFechamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbJogosFechamentoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tbJogosFechamentoFocusLost

    private void tbJogosFechamentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbJogosFechamentoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tbJogosFechamentoFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbNumeroEnvelopeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbNumeroEnvelopeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbNumeroEnvelopeActionPerformed

    private void tbTotalEnvelopeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbTotalEnvelopeFocusLost

        // TODO add your handling code here:
    }//GEN-LAST:event_tbTotalEnvelopeFocusLost

    private void tbTotalEnvelopeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbTotalEnvelopeFocusGained

    }//GEN-LAST:event_tbTotalEnvelopeFocusGained

    private void tbDataRetiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbDataRetiradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbDataRetiradaActionPerformed

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

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
JOptionPane.showMessageDialog(null, "O envelope " + tbNumeroEnvelope.getText() + " possui R$ " + 
        tbTotalEnvelope.getText() + " referente a " + jComboBox1.getItemAt(jComboBox1.getSelectedIndex()) +" - "+ tbDescricao.getText());
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        //        camposDesbloqueados();
        //        limparCampos();
        //        abaConsulta.setSelectedIndex(1);
        //        //tbIsbn.requestFocusInWindow();
        //        contadorCaracteres();
        //        habilitarBotoes(false, true, false, false, false, true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btNovoActionPerformed

    private void tbDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbDescricaoActionPerformed

    private void tbTotalFechamentoCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTotalFechamentoCaixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbTotalFechamentoCaixaActionPerformed

    private void fechamentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechamentoFocusGained
lbLoja.setText(tbTotalFechamentoCaixa.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_fechamentoFocusGained

    private void fechamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechamentoFocusLost
lbLoja.setText(tbTotalFechamentoCaixa.getText());         // TODO add your handling code here:
    }//GEN-LAST:event_fechamentoFocusLost

    private void tbJogosFechamento1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbJogosFechamento1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tbJogosFechamento1FocusGained

    private void tbJogosFechamento1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbJogosFechamento1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tbJogosFechamento1FocusLost

    private void tbPremiosPagosFechamento1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbPremiosPagosFechamento1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tbPremiosPagosFechamento1FocusGained

    private void tbPremiosPagosFechamento1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbPremiosPagosFechamento1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tbPremiosPagosFechamento1FocusLost

    private void tbEstornoFechamento1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbEstornoFechamento1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tbEstornoFechamento1FocusGained

    private void tbEstornoFechamento1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbEstornoFechamento1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tbEstornoFechamento1FocusLost

    private void tbTotalDebitosCaixaFechamento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTotalDebitosCaixaFechamento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbTotalDebitosCaixaFechamento1ActionPerformed

    private void tbSobraEmCaixaFechamento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSobraEmCaixaFechamento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbSobraEmCaixaFechamento1ActionPerformed

    private void tbTotalCaixaFechamento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTotalCaixaFechamento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbTotalCaixaFechamento1ActionPerformed

    private void tbTotalFechamentoCaixa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTotalFechamentoCaixa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbTotalFechamentoCaixa1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consultar2;
    private javax.swing.JTable Tabela2;
    private javax.swing.JTabbedPane abaConsulta;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JPanel consulta;
    private javax.swing.JScrollPane fechamento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel49;
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
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLoja;
    private javax.swing.JPanel menu1;
    private javax.swing.JScrollPane observacao;
    private javax.swing.JPanel retirada;
    private javax.swing.JTextField tbDataRetirada;
    private javax.swing.JTextField tbDescricao;
    private javax.swing.JTextField tbEstornoFechamento;
    private javax.swing.JTextField tbEstornoFechamento1;
    private javax.swing.JTextField tbJogosFechamento;
    private javax.swing.JTextField tbJogosFechamento1;
    private javax.swing.JTextField tbNumeroEnvelope;
    private javax.swing.JTextField tbPremiosPagosFechamento;
    private javax.swing.JTextField tbPremiosPagosFechamento1;
    private javax.swing.JTextField tbSobraEmCaixaFechamento;
    private javax.swing.JTextField tbSobraEmCaixaFechamento1;
    private javax.swing.JTextField tbTotalCaixaFechamento;
    private javax.swing.JTextField tbTotalCaixaFechamento1;
    private javax.swing.JTextField tbTotalDebitosCaixaFechamento;
    private javax.swing.JTextField tbTotalDebitosCaixaFechamento1;
    private javax.swing.JTextField tbTotalEnvelope;
    private javax.swing.JTextField tbTotalFechamentoCaixa;
    private javax.swing.JTextField tbTotalFechamentoCaixa1;
    private javax.swing.JTextField tfConsulta2;
    // End of variables declaration//GEN-END:variables
}
