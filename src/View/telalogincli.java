/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Arlaxad
 */
public class telalogincli extends javax.swing.JInternalFrame {

    /**
     * Creates new form telalogincli
     */
    public telalogincli() {
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
        txtclilogin = new javax.swing.JTextField();
        txtclisenha = new javax.swing.JPasswordField();
        btclientrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNumConta = new javax.swing.JTextField();
        btCancelar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Login Cliente");

        jLabel1.setText("Usuario");

        jLabel2.setText("Senha");

        btclientrar.setText("Entrar");
        btclientrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btclientrarActionPerformed(evt);
            }
        });

        jLabel3.setText("Numero da Conta");

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btclientrar))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtclilogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addComponent(txtclisenha, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumConta, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtclilogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtclisenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtNumConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btclientrar)
                    .addComponent(btCancelar))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btclientrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btclientrarActionPerformed
        String Nome = txtclilogin.getText();
        String Senha = txtclisenha.getText();
        String Conta = txtNumConta.getText();
        String arrayDados[] = new String[4];
        String valores = "";

        File ArquivoCli = new File("\\Users\\Arlaxad\\Documents\\NetBeansProjects\\banco\\src\\Cliente\\" + Conta + ".txt");
        boolean existe = ArquivoCli.exists();

        if (existe == true) {
            FileReader fr;
            try {
                fr = new FileReader(ArquivoCli);
                BufferedReader br = new BufferedReader(fr);
                while (br.ready()) {
                    valores = br.readLine();
                }
                arrayDados = valores.split(",");
                br.close();
                fr.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(telalogincli.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(telalogincli.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (existe == true) {
                if (arrayDados[0].equals(Nome) && arrayDados[1].equals(Senha)) {
                    txtNumConta.setText("");
                    txtclilogin.setText("");
                    txtclisenha.setText("");
                    new telaCliente(arrayDados[2]).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Senha Incorreta, Usuario ou conta não correspondem!");
                    txtNumConta.setText("");
                    txtclisenha.setText("");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Funcionario não cadastrado!");
                txtNumConta.setText("");
                txtclilogin.setText("");
                txtclisenha.setText("");
            }
        }
    }//GEN-LAST:event_btclientrarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btclientrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNumConta;
    private javax.swing.JTextField txtclilogin;
    private javax.swing.JPasswordField txtclisenha;
    // End of variables declaration//GEN-END:variables
}
