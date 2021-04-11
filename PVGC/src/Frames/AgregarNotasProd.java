/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Frames;
import Control.ControlProducto;
import Control.ControlOrden;
import Dominio.Orden;
import Dominio.Producto;
import java.util.ArrayList;


/**
 * Pantalla para poder agregar un producto a la orden.
 * @author Citlali Orduño
 */
public class AgregarNotasProd extends javax.swing.JFrame {

    public ControlOrden ctrlOrden;
    public Orden orden;
    public ControlProducto ctrlProd;
    public Producto prod;
    
    /** Creates new form AgregarNotasProd */
    public AgregarNotasProd() {
       this.ctrlOrden = new ControlOrden();
       this.ctrlProd= new ControlProducto();
       this.prod= prod;
       this.orden= orden;
        initComponents();
        
    }

    public void mostrarDetallesProducto(Producto producto){
      ArrayList<Producto> productos = ctrlProd.consultarProducto(producto);
        
        
    }
    
    
    
    
       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDscr = new javax.swing.JPanel();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnMas = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        lblNotas = new javax.swing.JLabel();
        btnAgregarProdOrden = new javax.swing.JButton();
        scrllNotas = new javax.swing.JScrollPane();
        pnlNotas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblNotas1 = new javax.swing.JLabel();
        btnMenuProd = new javax.swing.JButton();
        btnMnuPrincipal = new javax.swing.JButton();
        lblProducto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1200, 800));

        pnlDscr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        lblCantidad.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCantidad.setText("Cantidad");

        txtCantidad.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        btnMas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnMas.setText("-");
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });

        btnMenos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnMenos.setText("+");
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDscrLayout = new javax.swing.GroupLayout(pnlDscr);
        pnlDscr.setLayout(pnlDscrLayout);
        pnlDscrLayout.setHorizontalGroup(
            pnlDscrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDscrLayout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addGroup(pnlDscrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDscrLayout.createSequentialGroup()
                        .addComponent(lblCantidad)
                        .addGap(192, 192, 192))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDscrLayout.createSequentialGroup()
                        .addComponent(btnMas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMenos)
                        .addGap(163, 163, 163))))
        );
        pnlDscrLayout.setVerticalGroup(
            pnlDscrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDscrLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblCantidad)
                .addGap(41, 41, 41)
                .addGroup(pnlDscrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMas)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblNotas.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblNotas.setText("Notas");

        btnAgregarProdOrden.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAgregarProdOrden.setText("Agregar a orden");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        lblNotas1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNotas1.setText("Producto 1");

        javax.swing.GroupLayout pnlNotasLayout = new javax.swing.GroupLayout(pnlNotas);
        pnlNotas.setLayout(pnlNotasLayout);
        pnlNotasLayout.setHorizontalGroup(
            pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlNotasLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblNotas1)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        pnlNotasLayout.setVerticalGroup(
            pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotasLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblNotas1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        scrllNotas.setViewportView(pnlNotas);

        btnMenuProd.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMenuProd.setText("Regresar");
        btnMenuProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuProdActionPerformed(evt);
            }
        });

        btnMnuPrincipal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMnuPrincipal.setText("Menu Principal");

        lblProducto.setFont(new java.awt.Font("Dialog", 1, 60)); // NOI18N
        lblProducto.setText("Producto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(194, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(463, 463, 463))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnMnuPrincipal)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(pnlDscr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)
                                .addComponent(scrllNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAgregarProdOrden)
                                .addGap(80, 80, 80)
                                .addComponent(btnMenuProd, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(231, 231, 231)))
                        .addComponent(lblProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(lblProducto)
                .addGap(18, 18, 18)
                .addComponent(lblNotas)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlDscr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrllNotas, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarProdOrden)
                    .addComponent(btnMenuProd))
                .addGap(52, 52, 52)
                .addComponent(btnMnuPrincipal)
                .addGap(169, 169, 169))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMasActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnMenuProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuProdActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarNotasProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarNotasProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarNotasProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarNotasProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarNotasProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProdOrden;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMenuProd;
    private javax.swing.JButton btnMnuPrincipal;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblNotas;
    private javax.swing.JLabel lblNotas1;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JPanel pnlDscr;
    private javax.swing.JPanel pnlNotas;
    private javax.swing.JScrollPane scrllNotas;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables

}
