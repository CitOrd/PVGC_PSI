/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Control.ControlDetalleOrden;
import Control.ControlOrden;
import Dominio.DetalleOrden;
import Dominio.Orden;
import Dominio.Producto;
import Enums.Estado;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Citlali Orduño
 */
public class DetalladoOrden extends FrmBase {

    ControlOrden ctrlOrden;
    ControlDetalleOrden ctrlDetalleOrden;
    DetalleOrden detOrden;
    List<DetalleOrden> detOrdenes;
    List<Producto> pedido;
    Font f;
    Orden orden;
    boolean lectura = false;

    //En este constructor debe de recibir la orden para poder plasmar los productos
    public DetalladoOrden() {
        initComponents();
        adaptarPantalla();
        this.detOrdenes = new ArrayList<>();
        f = new Font("Arial", Font.ITALIC, 18);

    }

    public DetalladoOrden(List<Producto> pedido, List<DetalleOrden> detalles, Orden orden) {
        initComponents();
        this.orden = orden;
        this.txtNumMesa.setText(orden.getNumMesa() + "");
        this.detOrdenes = detalles;
        this.pedido = pedido;
        this.ctrlDetalleOrden = new ControlDetalleOrden();
        this.ctrlOrden = new ControlOrden();
        adaptarPantalla();
        f = new Font("Arial", Font.ITALIC, 18);
        mostrarProductos(detOrdenes);

    }

    public DetalladoOrden(List<Producto> pedido, List<DetalleOrden> detalles) {
        initComponents();
        this.detOrdenes = detalles;
        this.pedido = pedido;
        this.ctrlDetalleOrden = new ControlDetalleOrden();
        this.ctrlOrden = new ControlOrden();
        adaptarPantalla();
        f = new Font("Arial", Font.ITALIC, 18);

        mostrarProductos(detOrdenes);
    }

    public DetalladoOrden(Orden orden) {
        initComponents();
        this.orden = orden;
        detOrdenes = orden.getDetalleOrdenes();
        btnRegistrarOrden.setEnabled(false);
        lectura = true;
        lblNumOrden.setText("Num. Orden: " + orden.getId());
        txtNumMesa.setText("" + orden.getNumMesa());
        txtNumMesa.setEditable(false);

        adaptarPantalla();

        mostrarProductos(detOrdenes);
    }

    public void mostrarIndicadores() {

        Long numOrden = detOrden.getOrden().getId();
        lblNumOrden.setText("Num. Orden: " + numOrden);
    }

    public void mostrarProductos(List<DetalleOrden> detalles) {
        detalles = detOrdenes;
        double total = 0;
        double tot = 0;
        DefaultTableModel modelo = (DefaultTableModel) this.tblDetalles.getModel();
        for (DetalleOrden detOrdene : detOrdenes) {
            String nombre = detOrdene.getProducto().getNombre();
            int cantidad = detOrdene.getCantidad();
            double precio = detOrdene.getTotal();
            total = precio;

            Object[] fila = new Object[4];
            fila[0] = nombre;
            fila[1] = cantidad;
            fila[2] = detOrdene.getProducto().getPrecio();
            fila[3] = total;
           
            modelo.addRow(fila);

            tot += total;
        }

        txtTotal.setText("" + tot);
        txtTotal.setEditable(false);

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
        txtNumMesa = new javax.swing.JTextField();
        lblNumOrden = new javax.swing.JLabel();
        btnRegistrarOrden = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        brnPrincipal = new javax.swing.JButton();
        scrllDetalleOrdenes = new javax.swing.JScrollPane();
        tblDetalles = new javax.swing.JTable();
        pnlCantidad2 = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));

        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloMenuTomarPedido.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 60)); // NOI18N
        TituloMenuTomarPedido.setForeground(new java.awt.Color(206, 215, 231));
        TituloMenuTomarPedido.setText("Detallado de orden");
        pnlFondo.add(TituloMenuTomarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        pnlCantidad1.setBackground(new java.awt.Color(206, 215, 231, 200));

        lblNumMesa.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblNumMesa.setForeground(new java.awt.Color(51, 51, 51));
        lblNumMesa.setText("Num. Mesa: ");

        txtNumMesa.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        lblNumOrden.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblNumOrden.setForeground(new java.awt.Color(51, 51, 51));
        lblNumOrden.setText("Num. Orden");

        javax.swing.GroupLayout pnlCantidad1Layout = new javax.swing.GroupLayout(pnlCantidad1);
        pnlCantidad1.setLayout(pnlCantidad1Layout);
        pnlCantidad1Layout.setHorizontalGroup(
            pnlCantidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCantidad1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblNumMesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addComponent(lblNumOrden)
                .addGap(88, 88, 88))
        );
        pnlCantidad1Layout.setVerticalGroup(
            pnlCantidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCantidad1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlCantidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumMesa)
                    .addComponent(txtNumMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumOrden))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pnlFondo.add(pnlCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 870, 100));

        btnRegistrarOrden.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRegistrarOrden.setText("Registrar orden");
        btnRegistrarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarOrdenActionPerformed(evt);
            }
        });
        pnlFondo.add(btnRegistrarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 670, -1, -1));

        btnRegresar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 670, -1, -1));

        brnPrincipal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        brnPrincipal.setText("Menu principal");
        brnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnPrincipalActionPerformed(evt);
            }
        });
        pnlFondo.add(brnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 770, -1, -1));

        tblDetalles.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tblDetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Precio unitario", "Total"
            }
        ));
        scrllDetalleOrdenes.setViewportView(tblDetalles);

        pnlFondo.add(scrllDetalleOrdenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 870, 340));

        pnlCantidad2.setBackground(new java.awt.Color(206, 215, 231, 200));

        lblTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(51, 51, 51));
        lblTotal.setText("Total:");

        txtTotal.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        javax.swing.GroupLayout pnlCantidad2Layout = new javax.swing.GroupLayout(pnlCantidad2);
        pnlCantidad2.setLayout(pnlCantidad2Layout);
        pnlCantidad2Layout.setHorizontalGroup(
            pnlCantidad2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCantidad2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(lblTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        pnlCantidad2Layout.setVerticalGroup(
            pnlCantidad2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCantidad2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlCantidad2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnlFondo.add(pnlCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 660, 200, 60));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondoMenuAdministarVenta.png"))); // NOI18N
        pnlFondo.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 950));

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
        MenuAdministrarVentas jFrm = new MenuAdministrarVentas();
        this.setVisible(false);
        jFrm.setVisible(true);
    }//GEN-LAST:event_brnPrincipalActionPerformed

    private void btnRegistrarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarOrdenActionPerformed
        if (orden == null) {
            String numM = txtNumMesa.getText();
            if (!txtNumMesa.getText().equals("")) {
                int numMesa = Integer.parseInt(numM);
                
                try{
                  Orden orden = new Orden(numMesa, Estado.ESPERA, detOrdenes);

                for (DetalleOrden detOrdene : detOrdenes) {
                    detOrdene.setOrden(orden);
                }

                orden.setDetalleOrdenes(detOrdenes);

                ctrlOrden.agregarOrden(orden);

                JOptionPane.showMessageDialog(this, "Registro de orden exitoso",
                        "Exito", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                new MenuAdministrarVentas().setVisible(true);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this, "No se pudo registrar la orden",
                        "Error", JOptionPane.INFORMATION_MESSAGE);
                }
              
            } else {
                JOptionPane.showMessageDialog(this, "Registro de orden no exitoso. Ingrese el número de mesa",
                        "Fallo", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            String numM = txtNumMesa.getText();
            if (!txtNumMesa.getText().equals("")) {
                int numMesa = Integer.parseInt(numM);

                for (DetalleOrden detOrdene : detOrdenes) {
                    detOrdene.setOrden(orden);
                }

                orden.setDetalleOrdenes(detOrdenes);

                ctrlOrden.actualizarOrden(orden);
                JOptionPane.showMessageDialog(this, "Actualización de orden exitoso",
                        "Exito", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                new MenuAdministrarVentas().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Actualización de orden no exitoso. Ingrese el número de mesa",
                        "Fallo", JOptionPane.INFORMATION_MESSAGE);
            }

        }

    }//GEN-LAST:event_btnRegistrarOrdenActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        if (!lectura) {
            this.dispose();
            new Categoriasv2(pedido, detOrdenes).setVisible(true);
        } else if (lectura) {
            new EliminarOrden().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnRegresarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloMenuTomarPedido;
    private javax.swing.JButton brnPrincipal;
    private javax.swing.JButton btnRegistrarOrden;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNumMesa;
    private javax.swing.JLabel lblNumOrden;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlCantidad1;
    private javax.swing.JPanel pnlCantidad2;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JScrollPane scrllDetalleOrdenes;
    private javax.swing.JTable tblDetalles;
    private javax.swing.JTextField txtNumMesa;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
