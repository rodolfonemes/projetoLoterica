

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;



public class menu extends javax.swing.JFrame {
    

//    static void caixa(String itemAt) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    Toolkit tk = Toolkit.getDefaultToolkit();
       Dimension d = tk.getScreenSize();
      
     
    public menu() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
       setExtendedState(JFrame.MAXIMIZED_BOTH);
       
       
       
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btLogin = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        desktop = new javax.swing.JDesktopPane();
        btTela = new javax.swing.JButton();
        btCadUsuario = new javax.swing.JButton();
        btRme = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loterica");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btLogin.setText("Login");
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        desktop.setMaximumSize(new java.awt.Dimension(1440, 900));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 809, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );

        btTela.setText("Lancamento Caixas");
        btTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTelaActionPerformed(evt);
            }
        });

        btCadUsuario.setText("Gerenciar Usuario");
        btCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadUsuarioActionPerformed(evt);
            }
        });

        btRme.setText("RME CEF");
        btRme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRmeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btTela, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btRme, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(btCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTela, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRme, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
login lo = new login();
desktop.add(lo);
lo.setVisible(true);
try {
lo.setMaximum(true);
lo.setSelected(true);
} catch (Exception e2) {
e2.printStackTrace();
}
btTela.setEnabled(false);
btCadUsuario.setEnabled(false);
btLogin.setEnabled(false);
btRme.setEnabled(false);


        // TODO add your handling code here:
    }//GEN-LAST:event_btLoginActionPerformed

    private void btTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTelaActionPerformed

retiradaCaixa te = new retiradaCaixa();
desktop.add(te);
te.setVisible(true);


try {

te.setSize(d.width-12, d.height-130);
te.setMaximum(true);
te.setSelected(true);
} catch (Exception e2) {
e2.printStackTrace();
}


    }//GEN-LAST:event_btTelaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void btCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadUsuarioActionPerformed
cadastroUsuario cadUsuario = new cadastroUsuario();
desktop.add(cadUsuario);
cadUsuario.setVisible(true);
try {

cadUsuario.setSize(d.width-12, d.height-130);
cadUsuario.setMaximum(true);
cadUsuario.setSelected(true);
} catch (Exception e2) {
e2.printStackTrace();
}
// TODO add your handling code here:
    }//GEN-LAST:event_btCadUsuarioActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
login lo = new login();
desktop.add(lo);
lo.setVisible(true);
try {
lo.setMaximum(true);
lo.setSelected(true);
} catch (Exception e2) {
e2.printStackTrace();
}
btLogin.setEnabled(false);
btTela.setEnabled(false);
btCadUsuario.setEnabled(false);
btRme.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void btRmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRmeActionPerformed
Rme2 rme = new Rme2();
desktop.add(rme, BorderLayout.NORTH);
rme.setVisible(true);


try {

rme.setSize(d.width-12, d.height-130);
rme.setMaximum(true);
rme.setSelected(true);
} catch (Exception e2) {
e2.printStackTrace();
}
    }//GEN-LAST:event_btRmeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btCadUsuario;
    public static javax.swing.JButton btLogin;
    public static javax.swing.JButton btRme;
    public static javax.swing.JButton btTela;
    public static javax.swing.JDesktopPane desktop;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
