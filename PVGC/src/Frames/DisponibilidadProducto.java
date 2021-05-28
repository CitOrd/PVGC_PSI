/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Control.ControlProducto;
import Dominio.Producto;
import java.awt.RenderingHints.Key;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Citlali Orduño
 */
public class DisponibilidadProducto extends FrmBase{
    
    DefaultListModel modeloListaProductos;
    ControlProducto controlProducto;
    List<Producto> productos;
    Producto producto;
    
    /**
     * Creates new form DisponibilidadProducto
     */
    public DisponibilidadProducto() {
        initComponents();
        adaptarPantalla();
        modeloListaProductos = new DefaultListModel();
        controlProducto = new ControlProducto();
        producto= new Producto(); 
        try{
           cargarOrdenes();
        }catch(SQLException se){
              Logger.getLogger(Categoriasv2.class.getName()).log(Level.SEVERE, null, se);
        }
     
        
    }

   
     private void cargarOrdenes() throws SQLException {
        productos = this.controlProducto.consultarProducto();
        if (productos != null && productos.size() > 0) {
            modeloListaProductos = new DefaultListModel();
            for (Producto producto : productos) {
                modeloListaProductos.addElement(producto.getNombre());
            }
            ListProductos.setModel(modeloListaProductos);
        }
    }
     
   public Producto buscarProducto(){
       String nombre = ListProductos.getSelectedValue();
       Producto prod = controlProducto.consultarProductoPorNombre(nombre).get(0);
       
       txtProducto.setText(nombre);
       return prod;
   } 
   
   public void establecerDisponibilidad(Producto pro){
       if(radioBtnDisponible.isSelected()){
           
           pro.setDisponibilidad(true);
       }if(radioBtnNoDisponible.isSelected()){
           
           pro.setDisponibilidad(false);
       }
       
       controlProducto.actualizarProducto(pro);
   }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Disponibilidad = new javax.swing.ButtonGroup();
        TituloMenuTomarPedido = new javax.swing.JLabel();
        pnlCantidad1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListProductos = new javax.swing.JList<>();
        txtBusProducto = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnMenuPrincipal1 = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        radioBtnDisponible = new javax.swing.JRadioButton();
        radioBtnNoDisponible = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloMenuTomarPedido.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 62)); // NOI18N
        TituloMenuTomarPedido.setForeground(new java.awt.Color(206, 215, 231));
        TituloMenuTomarPedido.setText("Disponibilidad de producto");
        getContentPane().add(TituloMenuTomarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 860, -1));

        pnlCantidad1.setBackground(new java.awt.Color(206, 215, 231, 200));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingrese el nombre del producto, por favor:");

        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        ListProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListProductos);

        txtBusProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusProductoActionPerformed(evt);
            }
        });
        txtBusProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusProductoKeyTyped(evt);
            }
        });

        txtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductoKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Producto seleccionado: ");

        btnMenuPrincipal1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMenuPrincipal1.setText("regresar");
        btnMenuPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipal1ActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        Disponibilidad.add(radioBtnDisponible);
        radioBtnDisponible.setText("Producto disponible");

        Disponibilidad.add(radioBtnNoDisponible);
        radioBtnNoDisponible.setText("Producto no disponible");

        javax.swing.GroupLayout pnlCantidad1Layout = new javax.swing.GroupLayout(pnlCantidad1);
        pnlCantidad1.setLayout(pnlCantidad1Layout);
        pnlCantidad1Layout.setHorizontalGroup(
            pnlCantidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCantidad1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBusProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlCantidad1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(pnlCantidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCantidad1Layout.createSequentialGroup()
                        .addComponent(btnMenuPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(pnlCantidad1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                        .addGroup(pnlCantidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCantidad1Layout.createSequentialGroup()
                                .addGroup(pnlCantidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlCantidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                    .addGroup(pnlCantidad1Layout.createSequentialGroup()
                                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(61, 61, 61)
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(83, 83, 83))
                            .addGroup(pnlCantidad1Layout.createSequentialGroup()
                                .addComponent(radioBtnDisponible)
                                .addGap(18, 18, 18)
                                .addComponent(radioBtnNoDisponible)
                                .addContainerGap())))))
        );
        pnlCantidad1Layout.setVerticalGroup(
            pnlCantidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCantidad1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(pnlCantidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBusProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlCantidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCantidad1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addGroup(pnlCantidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioBtnDisponible)
                            .addComponent(radioBtnNoDisponible))
                        .addGap(124, 124, 124)
                        .addGroup(pnlCantidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAceptar)
                            .addComponent(btnCancelar)))
                    .addGroup(pnlCantidad1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnMenuPrincipal1)
                .addGap(25, 25, 25))
        );

        getContentPane().add(pnlCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 1000, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondoGeneral.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, 940));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        this.establecerDisponibilidad(producto);
         JOptionPane.showMessageDialog(this, "¡Se ha indicado correctamente la disponibilidad del producto!");
       
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void ListProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListProductosMouseClicked
      producto = this.buscarProducto();
    }//GEN-LAST:event_ListProductosMouseClicked

    private void txtBusProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusProductoActionPerformed

    }//GEN-LAST:event_txtBusProductoActionPerformed

    private void txtBusProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusProductoKeyTyped
      
        txtBusProducto.addKeyListener(new KeyAdapter(){
        
           @Override
           public void keyReleased(KeyEvent ke){
                txtBusProducto.setText(txtBusProducto.getText().replaceAll("\\p{javaSpaceChar}{2,}", " "));
                
                if(!txtBusProducto.getText().equals("")){
                   List<Producto> prods = controlProducto.consultarProductoPorNombre(txtBusProducto.getText()); 
                   
                   if (prods != null && productos.size() > 0) {
                        modeloListaProductos = new DefaultListModel();

                        for (Producto producto : prods) {
                            modeloListaProductos.addElement(producto.getNombre());
                        }
                        ListProductos.setModel(modeloListaProductos);

                    }
                }else {

                    try {
                        cargarOrdenes();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                }
           }
    });

    }//GEN-LAST:event_txtBusProductoKeyTyped

    private void txtProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoKeyTyped

    private void btnMenuPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipal1ActionPerformed
        MenuAdministrarProductos jFrm = new MenuAdministrarProductos();
        jFrm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuPrincipal1ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
      
          int dialogo = JOptionPane.showConfirmDialog(this, "¿Desea cancelar?",
                    "Confirmación", JOptionPane.YES_NO_OPTION);
          
          if(dialogo == JOptionPane.YES_OPTION){
              Disponibilidad.clearSelection();
          }else{
              JOptionPane.showMessageDialog(this, "Continue, por favor.");
          }
    }//GEN-LAST:event_btnCancelarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Disponibilidad;
    private javax.swing.JList<String> ListProductos;
    private javax.swing.JLabel TituloMenuTomarPedido;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnMenuPrincipal1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlCantidad1;
    private javax.swing.JRadioButton radioBtnDisponible;
    private javax.swing.JRadioButton radioBtnNoDisponible;
    private javax.swing.JTextField txtBusProducto;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
