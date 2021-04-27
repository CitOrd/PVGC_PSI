/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import AccesoDatos.OrdenDAO;
import Control.ControlOrden;
import Dominio.Orden;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Gildardo Ortega Proaño
 */
public class EliminarOrden extends javax.swing.JFrame {

    ControlOrden controlOrden = new ControlOrden();

    public Orden orden;
    String[] botones = {"ACEPTAR", "CANCELAR"};
    TableRowSorter trs;

    /**
     * Creates new form EliminarOrden
     */
    public EliminarOrden() {
        initComponents();
        this.setLocationRelativeTo(null);

        controlOrden = new ControlOrden();
        try {
            this.cargarOrdenes();
        } catch (SQLException ex) {
            // Logger.getLogger(ConsultarOrden.class.getName()).log(Level.SEVERE, null, ex);

        }
        //mostrarDatos();
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
        jButton2 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtOrdenEliminar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrdenes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4960, 1117, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, 99, -1));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 88, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresa el numero de la  orden que deseas terminar:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        txtOrdenEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrdenEliminarActionPerformed(evt);
            }
        });
        txtOrdenEliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOrdenEliminarKeyTyped(evt);
            }
        });
        getContentPane().add(txtOrdenEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 85, -1));

        tblOrdenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Numero Orden", "Estado", "Numero Mesa"
            }
        ));
        jScrollPane2.setViewportView(tblOrdenes);
        if (tblOrdenes.getColumnModel().getColumnCount() > 0) {
            tblOrdenes.getColumnModel().getColumn(0).setHeaderValue("Numero Orden");
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 851, 230));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("________________________________________________________________________________");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Eliminar Orden");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 330, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondoMenuAdministarVenta.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -90, 1490, 1270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        MenuAdministarVenta jFrm = new MenuAdministarVenta();
        jFrm.setVisible(true);
        //Ok
    }//GEN-LAST:event_jButton2ActionPerformed

    DefaultTableModel modelo;

    public void cargarOrdenes() throws SQLException {
        List<Orden> ordenes = this.controlOrden.consultarOrdenes();
        if (ordenes != null) {
            modelo = (DefaultTableModel) tblOrdenes.getModel();
            modelo.setRowCount(0);
            for (Orden orden : ordenes) {
                modelo.addRow(orden.toArray());

            }

        }

    }


    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        JOptionPane.showMessageDialog(this, "Terminar Orden " + txtOrdenEliminar.getText());
        int i = JOptionPane.showOptionDialog(this, "Seguro que deseas terminar?", "Confirmacion", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
        // String ValorID=txtEliminar.getText();

        if (i == 0) {
            try {
                if (Long.parseLong(txtOrdenEliminar.getText()) > 0) {

                    controlOrden.modificarEstadoOrden((int) Long.parseLong(txtOrdenEliminar.getText()));
                    JOptionPane.showMessageDialog(this, "Orden Concluida !!!");
                    this.cargarOrdenes();
                }
            } catch (Exception e) {

                JOptionPane.showMessageDialog(this, "No se pudo terminar la orden ");

            }

        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtOrdenEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrdenEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrdenEliminarActionPerformed

    private void txtOrdenEliminarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrdenEliminarKeyTyped
        // TODO add your handling code here:

        txtOrdenEliminar.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter(txtOrdenEliminar.getText(), 0));
            }

        });
        trs = new TableRowSorter(modelo);
        tblOrdenes.setRowSorter(trs);


    }//GEN-LAST:event_txtOrdenEliminarKeyTyped

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
            java.util.logging.Logger.getLogger(EliminarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarOrden().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblOrdenes;
    private javax.swing.JTextField txtOrdenEliminar;
    // End of variables declaration//GEN-END:variables
}
