/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Control.ControlOrden;
import Dominio.DetalleOrden;

import Dominio.Orden;
import Dominio.Producto;
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
public class ConsultarOrden extends javax.swing.JFrame {

    ControlOrden controlOrden = new ControlOrden();

    /**
     * Creates new form ConsultarOrden
     */
    public ConsultarOrden() {
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

    DefaultTableModel modelo;
    TableRowSorter trs;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jtxtFiltro = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaOrdenes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDetalladoOrden = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 900));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 900));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("__________________________________________");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 1090, -1));

        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 310, -1, -1));

        jtxtFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFiltroActionPerformed(evt);
            }
        });
        jtxtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtFiltroKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 87, -1));

        tablaOrdenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Num Orden", "Estado", "Num Mesa"
            }
        ));
        tablaOrdenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaOrdenesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaOrdenes);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 865, 186));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consultar Orden");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 410, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Consultar por Numero de Orden:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ordenes Disponibles:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, -1));

        btnDetalladoOrden.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDetalladoOrden.setText("Ver detalle");
        btnDetalladoOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalladoOrdenActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetalladoOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondoMenuAdministarVenta.png"))); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(1200, 900));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -120, 1210, 1330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1210, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        MenuAdministrarVentas jFrm = new MenuAdministrarVentas();
        jFrm.setVisible(true);


    }//GEN-LAST:event_btnRegresarActionPerformed

    //mostrar ordenes en la tabla 
    public void cargarOrdenes() throws SQLException {
        List<Orden> ordenes = this.controlOrden.consultarOrdenes();
        if (ordenes != null) {
            modelo = (DefaultTableModel) tablaOrdenes.getModel();
            modelo.setRowCount(0);
            for (Orden orden : ordenes) {
                modelo.addRow(orden.toArray());

            }

        } else {
            JOptionPane.showConfirmDialog(this, "No hay ordenes disponibles",
                    "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }

    //Codigo filtro por numero de orden 
    private void jtxtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtFiltroKeyTyped

        jtxtFiltro.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter(jtxtFiltro.getText(), 0));
            }

        });
        trs = new TableRowSorter(modelo);
        tablaOrdenes.setRowSorter(trs);


    }//GEN-LAST:event_jtxtFiltroKeyTyped

    private void jtxtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtFiltroActionPerformed

    private void btnDetalladoOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalladoOrdenActionPerformed
        if (jtxtFiltro.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Seleccione una orden para consultarla");
            return;
        }
        
        String id = jtxtFiltro.getText();
        int idOrden = Integer.parseInt(id);

        Orden ord = controlOrden.consultarOrdenPorNumOrden(idOrden);
        if (ord != null) {
            DetalladoOrden frmDetOrden = new DetalladoOrden(ord);
            frmDetOrden.setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showConfirmDialog(this, "No se puede acceder al detalle de la orden",
                    "Warning", JOptionPane.WARNING_MESSAGE);

        }


    }//GEN-LAST:event_btnDetalladoOrdenActionPerformed

    private void tablaOrdenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaOrdenesMouseClicked
        int seleccionar = tablaOrdenes.rowAtPoint(evt.getPoint());
        jtxtFiltro.setText(String.valueOf(tablaOrdenes.getValueAt(seleccionar, 0)));
    }//GEN-LAST:event_tablaOrdenesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalladoOrden;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jtxtFiltro;
    private javax.swing.JTable tablaOrdenes;
    // End of variables declaration//GEN-END:variables
}
