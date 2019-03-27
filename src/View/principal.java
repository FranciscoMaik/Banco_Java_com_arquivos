package View;

/**
 *
 * @author Arlaxad
 */
public class principal extends javax.swing.JFrame {
    public principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopPanePrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        brger = new javax.swing.JMenu();
        itemloginger = new javax.swing.JMenuItem();
        brfun = new javax.swing.JMenu();
        itemloginfun = new javax.swing.JMenuItem();
        btcli = new javax.swing.JMenu();
        itemclilogin = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banco POO II");
        setResizable(false);

        javax.swing.GroupLayout DesktopPanePrincipalLayout = new javax.swing.GroupLayout(DesktopPanePrincipal);
        DesktopPanePrincipal.setLayout(DesktopPanePrincipalLayout);
        DesktopPanePrincipalLayout.setHorizontalGroup(
            DesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 663, Short.MAX_VALUE)
        );
        DesktopPanePrincipalLayout.setVerticalGroup(
            DesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
        );

        brger.setText("Gerente");

        itemloginger.setText("Login Gerente");
        itemloginger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemlogingerActionPerformed(evt);
            }
        });
        brger.add(itemloginger);

        jMenuBar1.add(brger);

        brfun.setText("Funcionario");

        itemloginfun.setText("Login Funcionario");
        itemloginfun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemloginfunActionPerformed(evt);
            }
        });
        brfun.add(itemloginfun);

        jMenuBar1.add(brfun);

        btcli.setText("Cliente");

        itemclilogin.setText("Login Cliente");
        itemclilogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemcliloginActionPerformed(evt);
            }
        });
        btcli.add(itemclilogin);

        jMenuBar1.add(btcli);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DesktopPanePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DesktopPanePrincipal)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemloginfunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemloginfunActionPerformed
        telaloginfun tlf = new telaloginfun();
        DesktopPanePrincipal.add(tlf);
        tlf.setVisible(true);
    }//GEN-LAST:event_itemloginfunActionPerformed

    private void itemlogingerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemlogingerActionPerformed
        telaloginger tlg = new telaloginger();
        DesktopPanePrincipal.add(tlg);
        tlg.setVisible(true);
    }//GEN-LAST:event_itemlogingerActionPerformed

    private void itemcliloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemcliloginActionPerformed
        telalogincli tlc = new telalogincli();
        DesktopPanePrincipal.add(tlc);
        tlc.setVisible(true);
    }//GEN-LAST:event_itemcliloginActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPanePrincipal;
    private javax.swing.JMenu brfun;
    private javax.swing.JMenu brger;
    private javax.swing.JMenu btcli;
    private javax.swing.JMenuItem itemclilogin;
    private javax.swing.JMenuItem itemloginfun;
    private javax.swing.JMenuItem itemloginger;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
