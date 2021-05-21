/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

/**
 *
 * @author Citlali Orduño
 */
public class MenuPrincipal extends FrmBase {

    /**
     * Creates new form MenuAdministrarProductos
     */
    public MenuPrincipal() {
        initComponents();
        adaptarPantalla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TituloMenuTomarPedido = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlregistrarProd = new javax.swing.JPanel();
        btnTomasr = new javax.swing.JLabel();
        btnAdministrarVentas = new javax.swing.JButton();
        pnlModificarProd = new javax.swing.JPanel();
        btnAdministrarProductos = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        pnlConsultarProd = new javax.swing.JPanel();
        btnReportes = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloMenuTomarPedido.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 94)); // NOI18N
        TituloMenuTomarPedido.setForeground(new java.awt.Color(206, 215, 231));
        TituloMenuTomarPedido.setText("Menú Principal");
        getContentPane().add(TituloMenuTomarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 780, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icono Opción Comidas.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 150, 150));

        pnlregistrarProd.setBackground(new java.awt.Color(206, 215, 231, 200));

        btnTomasr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconoOpciónTomarOrden.png"))); // NOI18N

        btnAdministrarVentas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAdministrarVentas.setText("Administrar ventas");
        btnAdministrarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministrarVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlregistrarProdLayout = new javax.swing.GroupLayout(pnlregistrarProd);
        pnlregistrarProd.setLayout(pnlregistrarProdLayout);
        pnlregistrarProdLayout.setHorizontalGroup(
            pnlregistrarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlregistrarProdLayout.createSequentialGroup()
                .addGroup(pnlregistrarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlregistrarProdLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnAdministrarVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlregistrarProdLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnTomasr)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        pnlregistrarProdLayout.setVerticalGroup(
            pnlregistrarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlregistrarProdLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(btnTomasr, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdministrarVentas)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        getContentPane().add(pnlregistrarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        pnlModificarProd.setBackground(new java.awt.Color(206, 215, 231, 200));

        btnAdministrarProductos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAdministrarProductos.setText("Administrar productos");
        btnAdministrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministrarProductosActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icono Baguette.png"))); // NOI18N

        javax.swing.GroupLayout pnlModificarProdLayout = new javax.swing.GroupLayout(pnlModificarProd);
        pnlModificarProd.setLayout(pnlModificarProdLayout);
        pnlModificarProdLayout.setHorizontalGroup(
            pnlModificarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModificarProdLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(pnlModificarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlModificarProdLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlModificarProdLayout.createSequentialGroup()
                        .addComponent(btnAdministrarProductos)
                        .addGap(32, 32, 32))))
        );
        pnlModificarProdLayout.setVerticalGroup(
            pnlModificarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlModificarProdLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(48, 48, 48)
                .addComponent(btnAdministrarProductos)
                .addGap(113, 113, 113))
        );

        getContentPane().add(pnlModificarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, -1, -1));

        pnlConsultarProd.setBackground(new java.awt.Color(206, 215, 231, 200));

        btnReportes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnReportes.setText("Reportes");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconoOpciónConsultarOrden.png"))); // NOI18N

        javax.swing.GroupLayout pnlConsultarProdLayout = new javax.swing.GroupLayout(pnlConsultarProd);
        pnlConsultarProd.setLayout(pnlConsultarProdLayout);
        pnlConsultarProdLayout.setHorizontalGroup(
            pnlConsultarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarProdLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(pnlConsultarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsultarProdLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsultarProdLayout.createSequentialGroup()
                        .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        pnlConsultarProdLayout.setVerticalGroup(
            pnlConsultarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsultarProdLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReportes)
                .addGap(109, 109, 109))
        );

        getContentPane().add(pnlConsultarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondoGeneral.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 902));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdministrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministrarProductosActionPerformed
        new MenuAdministrarProductos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAdministrarProductosActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnAdministrarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministrarVentasActionPerformed
        new MenuAdministrarVentas().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAdministrarVentasActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloMenuTomarPedido;
    private javax.swing.JButton btnAdministrarProductos;
    private javax.swing.JButton btnAdministrarVentas;
    private javax.swing.JButton btnReportes;
    private javax.swing.JLabel btnTomasr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel pnlConsultarProd;
    private javax.swing.JPanel pnlModificarProd;
    private javax.swing.JPanel pnlregistrarProd;
    // End of variables declaration//GEN-END:variables
}
