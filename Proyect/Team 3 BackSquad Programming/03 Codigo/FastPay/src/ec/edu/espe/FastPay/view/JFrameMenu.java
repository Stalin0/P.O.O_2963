/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.FastPay.view;

import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class JFrameMenu extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMenu
     */
    public JFrameMenu() {

        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/ec/edu/espe/imagenes/logo.png")).getImage());
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProducts = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtProducts = new javax.swing.JLabel();
        labBack = new javax.swing.JLabel();
        txtProducts1 = new javax.swing.JLabel();
        txtProducts2 = new javax.swing.JLabel();
        txtProducts3 = new javax.swing.JLabel();
        txtProducts4 = new javax.swing.JLabel();
        txtProducts5 = new javax.swing.JLabel();
        txtProducts6 = new javax.swing.JLabel();
        txtProducts7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/imagenes/dining-room.png"))); // NOI18N
        btnProducts.setToolTipText("Pulse aquí para revisar los productos de la tienda");
        btnProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductsActionPerformed(evt);
            }
        });
        getContentPane().add(btnProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 145, 96));

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/imagenes/exit.png"))); // NOI18N
        btnExit.setToolTipText("Pulse aquí para salir del sistema");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 410, 70, 50));

        txtProducts.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtProducts.setForeground(new java.awt.Color(240, 240, 240));
        txtProducts.setText("1. Productos");
        txtProducts.setToolTipText("Índice que indica los productos");
        getContentPane().add(txtProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 170, -1));

        labBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/imagenes/FondoTienda.jpg"))); // NOI18N
        labBack.setText("jLabel1");
        getContentPane().add(labBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, 0, 1210, 490));

        txtProducts1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtProducts1.setForeground(new java.awt.Color(240, 240, 240));
        txtProducts1.setText("1. Productos");
        txtProducts1.setToolTipText("Índice que indica los productos");
        getContentPane().add(txtProducts1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 170, -1));

        txtProducts2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtProducts2.setForeground(new java.awt.Color(240, 240, 240));
        txtProducts2.setText("1. Productos");
        txtProducts2.setToolTipText("Índice que indica los productos");
        getContentPane().add(txtProducts2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 170, -1));

        txtProducts3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtProducts3.setForeground(new java.awt.Color(240, 240, 240));
        txtProducts3.setText("1. Productos");
        txtProducts3.setToolTipText("Índice que indica los productos");
        getContentPane().add(txtProducts3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 170, -1));

        txtProducts4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtProducts4.setForeground(new java.awt.Color(240, 240, 240));
        txtProducts4.setText("1. Productos");
        txtProducts4.setToolTipText("Índice que indica los productos");
        getContentPane().add(txtProducts4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 170, -1));

        txtProducts5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtProducts5.setForeground(new java.awt.Color(240, 240, 240));
        txtProducts5.setText("1. Productos");
        txtProducts5.setToolTipText("Índice que indica los productos");
        getContentPane().add(txtProducts5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 170, -1));

        txtProducts6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtProducts6.setForeground(new java.awt.Color(240, 240, 240));
        txtProducts6.setText("1. Productos");
        txtProducts6.setToolTipText("Índice que indica los productos");
        getContentPane().add(txtProducts6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 170, -1));

        txtProducts7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtProducts7.setForeground(new java.awt.Color(240, 240, 240));
        txtProducts7.setText("1. Productos");
        txtProducts7.setToolTipText("Índice que indica los productos");
        getContentPane().add(txtProducts7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 170, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductsActionPerformed
        Products product = new Products();
        product.setVisible(true);
    }//GEN-LAST:event_btnProductsActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnProducts;
    private javax.swing.JLabel labBack;
    private javax.swing.JLabel txtProducts;
    private javax.swing.JLabel txtProducts1;
    private javax.swing.JLabel txtProducts2;
    private javax.swing.JLabel txtProducts3;
    private javax.swing.JLabel txtProducts4;
    private javax.swing.JLabel txtProducts5;
    private javax.swing.JLabel txtProducts6;
    private javax.swing.JLabel txtProducts7;
    // End of variables declaration//GEN-END:variables
}
