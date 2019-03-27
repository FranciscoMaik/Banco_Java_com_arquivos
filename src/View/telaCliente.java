/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Arlaxad
 */
public class telaCliente extends javax.swing.JFrame {

    String conta;
  
    /**
     * Creates new form telaCliente
     */
    public telaCliente() {
        initComponents();
    }
    
    public telaCliente(String Conta){
        this.conta = Conta;
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
        DesktopCli = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemSaldo = new javax.swing.JMenuItem();
        itemDeposito = new javax.swing.JMenuItem();
        itemTransferencia = new javax.swing.JMenuItem();
        itemPagamento = new javax.swing.JMenuItem();
        itemFechar = new javax.swing.JMenuItem();
        itemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela do Cliente");

        javax.swing.GroupLayout DesktopCliLayout = new javax.swing.GroupLayout(DesktopCli);
        DesktopCli.setLayout(DesktopCliLayout);
        DesktopCliLayout.setHorizontalGroup(
            DesktopCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 663, Short.MAX_VALUE)
        );
        DesktopCliLayout.setVerticalGroup(
            DesktopCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 681, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DesktopCli)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DesktopCli)
                .addContainerGap())
        );

        jMenu1.setText("Opções do Cliente");

        itemSaldo.setText("Saldo");
        itemSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSaldoActionPerformed(evt);
            }
        });
        jMenu1.add(itemSaldo);

        itemDeposito.setText("Deposito");
        itemDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDepositoActionPerformed(evt);
            }
        });
        jMenu1.add(itemDeposito);

        itemTransferencia.setText("Transferencia");
        itemTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTransferenciaActionPerformed(evt);
            }
        });
        jMenu1.add(itemTransferencia);

        itemPagamento.setText("Pagamento ");
        itemPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPagamentoActionPerformed(evt);
            }
        });
        jMenu1.add(itemPagamento);

        itemFechar.setText("Fechar Conta");
        itemFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFecharActionPerformed(evt);
            }
        });
        jMenu1.add(itemFechar);

        itemSair.setText("Sair");
        itemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSairActionPerformed(evt);
            }
        });
        jMenu1.add(itemSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSaldoActionPerformed
        telaSaldoCliente tsc = new telaSaldoCliente(conta);
        DesktopCli.add(tsc);
        tsc.setVisible(true);
    }//GEN-LAST:event_itemSaldoActionPerformed

    private void itemDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDepositoActionPerformed
        telaDeposito td = new telaDeposito(conta);
        DesktopCli.add(td);
        td.setVisible(true);
    }//GEN-LAST:event_itemDepositoActionPerformed

    private void itemPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPagamentoActionPerformed
        telaPagamento tp = new telaPagamento(conta);
        DesktopCli.add(tp);
        tp.setVisible(true);
    }//GEN-LAST:event_itemPagamentoActionPerformed

    private void itemFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFecharActionPerformed
        telaExcluir te = new telaExcluir(conta);
        DesktopCli.add(te);
        te.setVisible(true);
    }//GEN-LAST:event_itemFecharActionPerformed

    private void itemTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTransferenciaActionPerformed
        telaTransferencia tt = new telaTransferencia(conta);
        DesktopCli.add(tt);
        tt.setVisible(true);
    }//GEN-LAST:event_itemTransferenciaActionPerformed

    private void itemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_itemSairActionPerformed

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
            java.util.logging.Logger.getLogger(telaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopCli;
    private javax.swing.JMenuItem itemDeposito;
    private javax.swing.JMenuItem itemFechar;
    private javax.swing.JMenuItem itemPagamento;
    private javax.swing.JMenuItem itemSair;
    private javax.swing.JMenuItem itemSaldo;
    private javax.swing.JMenuItem itemTransferencia;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
