/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Control.ControlDetalleOrden;
import Control.ControlOrden;
import Dominio.DetalleOrden;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author Citlali Orduño
 */
public class DetalladoOrden extends FrmBase {

    public ControlDetalleOrden ctrlDetOrden;
    public DetalleOrden detOrden;
    public ArrayList<DetalleOrden> detOrdenes;

    public DetalladoOrden() {
        adaptarPantalla();
        this.detOrden = new DetalleOrden();
        this.detOrdenes = new ArrayList<>();
        initComponents();
        this.mostrarIndicadores();
        this.mostrarProductos();

    }

    public void mostrarIndicadores() {
        int numMesa = detOrden.getOrden().getNumMesa();
        int numOrden = detOrden.getOrden().getNumOrden();
      
    }

    public void mostrarProductos() {
        double total = 0;
        detOrdenes = ctrlDetOrden.consultarOrdenes(detOrden);

        for (DetalleOrden detOrdene : detOrdenes) {
            String nombre = detOrdene.getProducto().getNombre();
            int cantidad = detOrdene.getCantidad();
            double precio = detOrdene.getTotal();
            total = (precio * cantidad);

            String cantString = String.valueOf(cantidad);
            String totalString = String.valueOf(total);

            String cadena = "      " + nombre + "     " + cantString + "       " + totalString;

            JTextField txtDetOrden = new JTextField();
            txtDetOrden.setBounds(new Rectangle(25, 15, 250, 21));
            txtDetOrden.setText(cadena);
            txtDetOrden.setEditable(false);

           
        }
        total++;
     //   txtTotal.setText("" + total);
       // txtTotal.setEditable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        TituloMenuTomarPedido = new javax.swing.JLabel();
        pnlCantidad1 = new javax.swing.JPanel();
        lblNumMesa = new javax.swing.JLabel();
        txtNumOrden = new javax.swing.JTextField();
        lblNumOrden1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlCantidad = new javax.swing.JPanel();
        btnCobrarOrden = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        brnPrincipal = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));

        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloMenuTomarPedido.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 60)); // NOI18N
        TituloMenuTomarPedido.setForeground(new java.awt.Color(206, 215, 231));
        TituloMenuTomarPedido.setText("Detallado de orden");
        pnlFondo.add(TituloMenuTomarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        pnlCantidad1.setBackground(new java.awt.Color(206, 215, 231, 200));

        lblNumMesa.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblNumMesa.setForeground(new java.awt.Color(153, 153, 153));
        lblNumMesa.setText("Num. Mesa");

        txtNumOrden.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        lblNumOrden1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblNumOrden1.setForeground(new java.awt.Color(153, 153, 153));
        lblNumOrden1.setText("Num. Orden");

        javax.swing.GroupLayout pnlCantidad1Layout = new javax.swing.GroupLayout(pnlCantidad1);
        pnlCantidad1.setLayout(pnlCantidad1Layout);
        pnlCantidad1Layout.setHorizontalGroup(
            pnlCantidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCantidad1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblNumMesa)
                .addGap(18, 18, 18)
                .addComponent(txtNumOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addComponent(lblNumOrden1)
                .addGap(99, 99, 99))
        );
        pnlCantidad1Layout.setVerticalGroup(
            pnlCantidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCantidad1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlCantidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCantidad1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblNumMesa))
                    .addComponent(lblNumOrden1)
                    .addComponent(txtNumOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pnlFondo.add(pnlCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 880, 110));

        pnlCantidad.setBackground(new java.awt.Color(206, 215, 231, 200));

        javax.swing.GroupLayout pnlCantidadLayout = new javax.swing.GroupLayout(pnlCantidad);
        pnlCantidad.setLayout(pnlCantidadLayout);
        pnlCantidadLayout.setHorizontalGroup(
            pnlCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 864, Short.MAX_VALUE)
        );
        pnlCantidadLayout.setVerticalGroup(
            pnlCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pnlCantidad);

        pnlFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 880, 420));

        btnCobrarOrden.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCobrarOrden.setText("Cobrar Orden");
        pnlFondo.add(btnCobrarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 800, -1, -1));

        btnRegresar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRegresar.setText("Regresar");
        pnlFondo.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 800, -1, -1));

        brnPrincipal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        brnPrincipal.setText("Menu principal");
        brnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnPrincipalActionPerformed(evt);
            }
        });
        pnlFondo.add(brnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 870, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondoMenuAdministarVenta.png"))); // NOI18N
        pnlFondo.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1230, 950));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void brnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brnPrincipalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editotxtNumMesaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(DetalleOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalladoOrden().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloMenuTomarPedido;
    private javax.swing.JButton brnPrincipal;
    private javax.swing.JButton btnCobrarOrden;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNumMesa;
    private javax.swing.JLabel lblNumOrden1;
    private javax.swing.JPanel pnlCantidad;
    private javax.swing.JPanel pnlCantidad1;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JTextField txtNumOrden;
    // End of variables declaration//GEN-END:variables
}
