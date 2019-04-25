
import java.awt.Font;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
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
public class retiradaCaixa11 extends javax.swing.JInternalFrame {

    int contador = 100;
    String texto = null;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    int contador2 = 0;
    double valorTotalDespesas = 0;
    int subTotal=0;
    

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

    public retiradaCaixa11() {
        initComponents();
        camposBloqueados();
        habilitarBotoes(true, false, false, false, false, true);
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        //JOptionPane.showMessageDialog(this, formatador.format( data ));
        tbDataRetirada.setText(formatador.format(data));
        tbDataSelecao.setText(formatador.format(data));
        abaConsulta.setVisible(false);

    }

    void habilitarBotoes(boolean novo, boolean salvar, boolean editar, boolean atualizar, boolean excluir, boolean sair) {

        btNovo.setEnabled(novo);
        btSalvar.setEnabled(salvar);
        btCancelar.setEnabled(sair);

    }

    void camposBloqueados() {
//        tbIsbn.setEnabled(false);
//        tbTitulo.setEnabled(false);
//        tbAutor.setEnabled(false);
//        tbEditora.setEnabled(false);
//        tbAno.setEnabled(false);
//        tbTipo.setEnabled(false);
//        tbEstante.setEnabled(false);
//        tbDescricao.setEnabled(false);
//        tbQuantidade.setEnabled(false);
//        tbValor.setEnabled(false);

        habilitarBotoes(true, false, false, false, false, true);
    }

    void camposDesbloqueados() {
//        tbIsbn.setEnabled(true);
//        tbTitulo.setEnabled(true);
//        tbAutor.setEnabled(true);
//        tbEditora.setEnabled(true);
//        tbAno.setEnabled(true);
//        tbTipo.setEnabled(true);
//        tbEstante.setEnabled(true);
//        tbDescricao.setEnabled(true);
//        tbQuantidade.setEnabled(true);
//        tbValor.setEnabled(true);
    }

    void camposDefalut() {

//        tbAno.setText("0");
//        tbQuantidade.setText("0");
//        tbValor.setText("0");
        habilitarBotoes(true, false, false, false, false, true);
    }

    void contadorCaracteres() {
//        String texto = tbDescricao.getText();
//        int tamanhoDoTexto = 400 - texto.length();
//        lbContador.setText(String.valueOf(tamanhoDoTexto));
    }

    void limparCampos() {
//        tbIsbn.setText(null);
//        tbTitulo.setText(null);
//        tbAutor.setText(null);
//        tbEditora.setText(null);
//        tbAno.setText(null);
//        tbTipo.setText(null);
//        tbEstante.setText(null);
//        tbDescricao.setText(null);
//        tbQuantidade.setText(null);
//        tbValor.setText(null);

        ((DefaultTableModel) Tabela2.getModel()).setNumRows(0);
        Tabela2.updateUI();
        habilitarBotoes(true, false, false, false, false, true);
    }

    private void carregarFormulario(Produto pro) {
//        tbIsbn.setText(pro.getIsbn());
//        tbTitulo.setText(pro.getTitulo());
//        tbAutor.setText(pro.getAutor());
//        tbEditora.setText(pro.getEditora());
//        tbAno.setText(String.valueOf(pro.getAno()));
//        tbTipo.setText(pro.getTipo());
//        tbEstante.setText(pro.getEstante());
//        tbValor.setText(String.valueOf(pro.getValor()));
//        tbQuantidade.setText(String.valueOf(pro.getQuant()));
//        tbDescricao.setText(pro.getDescricao());
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        PainelRetirada = new javax.swing.JScrollPane();
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
        jButton1 = new javax.swing.JButton();
        despesas = new javax.swing.JScrollPane();
        menu = new javax.swing.JPanel();
        btNovo1 = new javax.swing.JButton();
        btSalvar1 = new javax.swing.JButton();
        btCancelar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tbValorDespesas = new javax.swing.JTextField();
        cbDespesas = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        tbOutrosDespesas = new javax.swing.JTextField();
        tbAdicionarDespesas = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelaDespesas = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        totalDespesas = new javax.swing.JLabel();
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

        cbPeriodoRetirada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um periodo", "Manha(antes do carro forte)", "Tarde(sobra para o proximo dia)" }));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
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

        jLabel9.setText("Caixa");

        jLabel10.setText("Funcionario");

        jLabel11.setText("Periodo");

        tb1.setEditable(false);

        tb2.setEditable(false);

        tb3.setEditable(false);

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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tbDataRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(lbTotalCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(lbTotalCaixa))
                .addGap(25, 25, 25)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(41, 41, 41)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        retiradaLayout.setVerticalGroup(
            retiradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(retiradaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(retiradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo)
                    .addComponent(btSalvar)
                    .addComponent(btCancelar)
                    .addComponent(jButton1))
                .addGap(15, 15, 15)
                .addGroup(retiradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        PainelRetirada.setViewportView(retirada);

        abaConsulta.addTab("Cadastro", PainelRetirada);

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

        jLabel5.setText("Despesas diarias");

        cbDespesas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Item", "Aluguel", "Grafica", "Luz", "Agua", "Outros" }));
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

        jButton3.setText("Salvar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tbAdicionarDespesas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addComponent(jLabel5)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbValorDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tbOutrosDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbValorDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbOutrosDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbAdicionarDespesas)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabelaDespesas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(TabelaDespesas);

        jLabel7.setText("Total Despesas");

        jLabel8.setText("R$: ");

        totalDespesas.setText("0");

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btNovo1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar1))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(menuLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo1)
                    .addComponent(btSalvar1)
                    .addComponent(btCancelar1))
                .addGap(51, 51, 51)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(totalDespesas)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        despesas.setViewportView(menu);

        abaConsulta.addTab("Despesas", despesas);

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
                        .addGap(176, 176, 176)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(586, 586, 586))
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
                .addContainerGap(166, Short.MAX_VALUE))
        );

        abaConsulta.addTab("Consulta", consulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(265, 265, 265)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(265, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(abaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(159, 159, 159)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(160, 160, 160)))
        );

        abaConsulta.getAccessibleContext().setAccessibleName("Despesas");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tabela2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela2MouseClicked
        BDprodutos bd;
        Produto pro;
        String iCodigo;
        iCodigo = (String) Tabela2.getModel().getValueAt(Tabela2.getSelectedRow(), 0);
        bd = new BDprodutos();
        pro = new Produto();
        try {
            pro = bd.procurarProdutos(iCodigo);

            carregarFormulario(pro);
            camposBloqueados();
            contadorCaracteres();
            habilitarBotoes(false, false, true, false, false, true);
        } catch (SQLException ex) {

        }
        //jTabbedPane1.setSelectedIndex(1);
        abaConsulta.setSelectedIndex(1);
    }//GEN-LAST:event_Tabela2MouseClicked

    private void Consultar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consultar2ActionPerformed
        BDprodutos bd;
        List<Produto> listaProduto;
        Produto pr1;
        bd = new BDprodutos();
        listaProduto = bd.consultarProduto(tfConsulta2.getText());
        DefaultTableModel model = (DefaultTableModel) Tabela2.getModel();
        model.setNumRows(0);
        for (Produto listaProduto1 : listaProduto) {
            pr1 = listaProduto1;

            model.addRow(new Object[]{
                pr1.getIsbn(),
                pr1.getTitulo(),
                pr1.getAutor(),
                pr1.getEditora(),
                pr1.getAno(),
                pr1.getTipo(),
                pr1.getEstante(),
                pr1.getQuant(),
                pr1.getValor(),
                pr1.getDescricao()
            }
            );
        }
    }//GEN-LAST:event_Consultar2ActionPerformed

    private void tfConsulta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfConsulta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfConsulta2ActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        camposDesbloqueados();
        limparCampos();
        abaConsulta.setSelectedIndex(1);
        //tbIsbn.requestFocusInWindow();
        contadorCaracteres();
        habilitarBotoes(false, true, false, false, false, true);
// TODO add your handling code here:
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed


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
        DefaultTableModel model = (DefaultTableModel) TabelaDespesas.getModel();
        model.setNumRows(contador2);
        if (!(tbValorDespesas.getText().equals(""))) {
            if (cbDespesas.getSelectedItem().equals("Selecione um Item")) {

                JOptionPane.showMessageDialog(menu, "Favor selecionar um item!!");

            } else {
                if (cbDespesas.getSelectedItem().equals("Outros")) {
                    //JOptionPane.showMessageDialog(menu, "oi");
                    model.addRow(new Object[]{
                        tbOutrosDespesas.getText(),
                        tbValorDespesas.getText()
                    }
                    );
                } else {

                    model.addRow(new Object[]{
                        cbDespesas.getItemAt(cbDespesas.getSelectedIndex()),
                        tbValorDespesas.getText()
                    }
                    );
                }
                contador2++;
                valorTotalDespesas = valorTotalDespesas + Double.valueOf(tbValorDespesas.getText());
                totalDespesas.setText(String.valueOf(valorTotalDespesas));
                cbDespesas.setSelectedItem("Selecione um Item");
                tbValorDespesas.setText("");
                tbOutrosDespesas.setText("Outros");
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
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanel3.setVisible(true);
        abaConsulta.setVisible(false);
        cbCaixaRetirada.setSelectedItem("Selecione um caixa");
        cbFuncionariaRetirada.setSelectedItem("Selecione um(a) Funcionario(a)");
        cbPeriodoRetirada.setSelectedItem("Selecione um periodo");

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


    }//GEN-LAST:event_jButton1ActionPerformed

    private void p100NovaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p100NovaFocusLost
int p100n = Integer.valueOf(p100Nova.getText());

subTotal = subTotal + p100n*100;
//p100Nova.setEnabled(false);
lbSubtotal.setText(String.valueOf(subTotal));

        // TODO add your handling code here:
    }//GEN-LAST:event_p100NovaFocusLost

    private void p100UsadaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p100UsadaFocusLost
int p100u = Integer.valueOf(p100Usada.getText());

subTotal = subTotal + p100u*100;
lbSubtotal.setText(String.valueOf(subTotal));

        // TODO add your handling code here:
    }//GEN-LAST:event_p100UsadaFocusLost

    private void p100NovaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p100NovaFocusGained
       int p100n = Integer.valueOf(p100Nova.getText());

subTotal = subTotal - p100n*100;
//p100Nova.setEnabled(false);
lbSubtotal.setText(String.valueOf(subTotal));
// TODO add your handling code here:
    }//GEN-LAST:event_p100NovaFocusGained

    private void p100UsadaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p100UsadaFocusGained
int p100u = Integer.valueOf(p100Usada.getText());

subTotal = subTotal - p100u*100;
lbSubtotal.setText(String.valueOf(subTotal));        // TODO add your handling code here:
    }//GEN-LAST:event_p100UsadaFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consultar2;
    private javax.swing.JScrollPane PainelRetirada;
    private javax.swing.JTable Tabela2;
    private javax.swing.JTable TabelaDespesas;
    private javax.swing.JTabbedPane abaConsulta;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btCancelar1;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btNovo1;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btSalvar1;
    public javax.swing.JComboBox<String> cbCaixaRetirada;
    private javax.swing.JComboBox<String> cbDespesas;
    private javax.swing.JComboBox<String> cbFuncionariaRetirada;
    private javax.swing.JComboBox<String> cbPeriodoRetirada;
    private javax.swing.JPanel consulta;
    private javax.swing.JScrollPane despesas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbSubtotal;
    private javax.swing.JLabel lbTotalCaixa;
    private javax.swing.JPanel menu;
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
    private javax.swing.JTextField tb1;
    private javax.swing.JTextField tb2;
    private javax.swing.JTextField tb3;
    private javax.swing.JButton tbAdicionarDespesas;
    private javax.swing.JTextField tbDataRetirada;
    private javax.swing.JTextField tbDataSelecao;
    private javax.swing.JTextField tbOutrosDespesas;
    private javax.swing.JTextField tbValorDespesas;
    private javax.swing.JTextField tfConsulta2;
    private javax.swing.JLabel totalDespesas;
    // End of variables declaration//GEN-END:variables
}