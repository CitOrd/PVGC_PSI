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
import java.awt.Color;
import java.awt.Font;

import java.awt.Label;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import javax.swing.JTextField;


/**
 * Pantalla para poder agregar un producto a la orden.
 *
 * @author Citlali Orduño
 */
public class AgregarNotasProd extends FrmBase {

    public ControlOrden ctrlOrden;
    public Orden orden;
    public ControlProducto ctrlProd;
    public Producto prod;
    public int cant = 1;
    String numCantidad = "";
    public ArrayList<String> notas; 
    public Label lblDescripcion;
    public Font f;
    
   
    /**
     * Creates new form AgregarNotasProd
     */
    public AgregarNotasProd() {
        adaptarPantalla();
        this.ctrlOrden = new ControlOrden();
        this.ctrlProd = new ControlProducto();
        this.notas= new ArrayList<String>();
        this.prod = prod;
        this.orden = orden;
        this.lblDescripcion= new Label();
        this.f= new Font("Arial", Font.BOLD, 14);
        
        initComponents();
        lblDescripcion.setForeground(Color.DARK_GRAY);
        lblDescripcion.setFont(f);
        lblDescripcion.setSize(100, 50);
        lblDescripcion.setText("por favor agregate alv");
        this.txtCantidad.setText("" + cant);
        lblProducto.setText("Producto "+cant);
       

        //  mostrarProducto(prod);
    }

    public void mostrarProducto(Producto producto) {
        String nombre = producto.getNombre();
        lblNombreProducto.setText(nombre);
       

    }
    
    public void agregarNotas() {
        String nota = txtNota.getText();
        notas.add(nota);
        txtNota.setText("");

    }
    
     public void quitarNota() {
        disminuirCantidad();
        notas.get(notas.size() - 1);
    }
    
    public String intAString(int cantidad) {
        cantidad = cant;
        numCantidad = String.valueOf(cantidad);
        return numCantidad;
    }
    
     public void disminuirCantidad() {
        cant--;
        String cantidad = intAString(cant);
        txtCantidad.setText("" + cant);
        lblProducto.setText("Producto " + cantidad);
        txtNota.setText("Producto " + cantidad);

    }
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        lblNombreProducto = new javax.swing.JLabel();
        btnMenuPrincipal = new javax.swing.JButton();
        pnlCantidad = new javax.swing.JPanel();
        lblCantidad = new javax.swing.JLabel();
        btnMenos = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        btnMas = new javax.swing.JButton();
        pnlAgregarNota = new javax.swing.JPanel();
        lblnotas1 = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNota = new javax.swing.JTextArea();
        btnGuardarNota = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        pnlNotas = new javax.swing.JPanel();
        lblnotas2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlNotasProducto = new javax.swing.JPanel();
        btnEliminarNota = new javax.swing.JButton();
        btnRegistrarOrden = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1200, 900));

        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreProducto.setFont(new java.awt.Font("Dialog", 1, 72)); // NOI18N
        lblNombreProducto.setText("Café Americano");
        pnlFondo.add(lblNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        btnMenuPrincipal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnMenuPrincipal.setText("Menu principal");
        pnlFondo.add(btnMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 900, -1, -1));

        pnlCantidad.setBackground(new java.awt.Color(206, 215, 231, 200));

        lblCantidad.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(51, 51, 51));
        lblCantidad.setText("Cantidad");

        btnMenos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnMenos.setText("-");
        btnMenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenosMouseClicked(evt);
            }
        });

        txtCantidad.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        btnMas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnMas.setText("+");
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCantidadLayout = new javax.swing.GroupLayout(pnlCantidad);
        pnlCantidad.setLayout(pnlCantidadLayout);
        pnlCantidadLayout.setHorizontalGroup(
            pnlCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCantidadLayout.createSequentialGroup()
                .addGroup(pnlCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCantidadLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCantidadLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(lblCantidad)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        pnlCantidadLayout.setVerticalGroup(
            pnlCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCantidadLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblCantidad)
                .addGap(37, 37, 37)
                .addGroup(pnlCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenos)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMas))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pnlFondo.add(pnlCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 360, 310));

        pnlAgregarNota.setBackground(new java.awt.Color(206, 215, 231, 200));

        lblnotas1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblnotas1.setForeground(new java.awt.Color(51, 51, 51));
        lblnotas1.setText("Agregar nota");

        lblProducto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblProducto.setForeground(new java.awt.Color(51, 51, 51));
        lblProducto.setText("Producto ");

        txtNota.setColumns(20);
        txtNota.setRows(5);
        jScrollPane2.setViewportView(txtNota);

        btnGuardarNota.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGuardarNota.setText("Guardar nota");
        btnGuardarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarNotaActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegresar.setText("Regresar");

        javax.swing.GroupLayout pnlAgregarNotaLayout = new javax.swing.GroupLayout(pnlAgregarNota);
        pnlAgregarNota.setLayout(pnlAgregarNotaLayout);
        pnlAgregarNotaLayout.setHorizontalGroup(
            pnlAgregarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgregarNotaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblnotas1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgregarNotaLayout.createSequentialGroup()
                .addGroup(pnlAgregarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlAgregarNotaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAgregarNotaLayout.createSequentialGroup()
                        .addContainerGap(34, Short.MAX_VALUE)
                        .addGroup(pnlAgregarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlAgregarNotaLayout.createSequentialGroup()
                                .addComponent(btnGuardarNota)
                                .addGap(18, 18, 18)
                                .addComponent(btnRegresar))
                            .addGroup(pnlAgregarNotaLayout.createSequentialGroup()
                                .addComponent(lblProducto)
                                .addGap(332, 332, 332)))))
                .addGap(30, 30, 30))
        );
        pnlAgregarNotaLayout.setVerticalGroup(
            pnlAgregarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgregarNotaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblnotas1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlAgregarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarNota)
                    .addComponent(btnRegresar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pnlFondo.add(pnlAgregarNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 480, 310));

        pnlNotas.setBackground(new java.awt.Color(206, 215, 231, 200));

        lblnotas2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblnotas2.setForeground(new java.awt.Color(51, 51, 51));
        lblnotas2.setText("Notas del producto");

        javax.swing.GroupLayout pnlNotasProductoLayout = new javax.swing.GroupLayout(pnlNotasProducto);
        pnlNotasProducto.setLayout(pnlNotasProductoLayout);
        pnlNotasProductoLayout.setHorizontalGroup(
            pnlNotasProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        pnlNotasProductoLayout.setVerticalGroup(
            pnlNotasProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pnlNotasProducto);

        btnEliminarNota.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminarNota.setText("Eliminar nota");

        btnRegistrarOrden.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegistrarOrden.setText("Terminar Orden");

        javax.swing.GroupLayout pnlNotasLayout = new javax.swing.GroupLayout(pnlNotas);
        pnlNotas.setLayout(pnlNotasLayout);
        pnlNotasLayout.setHorizontalGroup(
            pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotasLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrarOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarNota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNotasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblnotas2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
        );
        pnlNotasLayout.setVerticalGroup(
            pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotasLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblnotas2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNotasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNotasLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnRegistrarOrden)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarNota)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pnlFondo.add(pnlNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 880, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondoMenuAdministarVenta.png"))); // NOI18N
        pnlFondo.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 1000));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 977, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        cant++;
        String cantidad = intAString(cant);
        txtCantidad.setText(cantidad);
    }//GEN-LAST:event_btnMasActionPerformed

    private void btnMenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosMouseClicked
        this.disminuirCantidad();
        this.quitarNota();
        
    }//GEN-LAST:event_btnMenosMouseClicked

    private void btnGuardarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarNotaActionPerformed
        this.agregarNotas();

        if (cant == notas.size()) {
            int dialogo = JOptionPane.showConfirmDialog(this, "¿Desea finalizar su orden?",
                "Confirmación", JOptionPane.YES_NO_OPTION);
            if(dialogo == JOptionPane.YES_OPTION ){
                Categorias frmCategoria= new Categorias();
                this.setVisible(false);
                frmCategoria.setVisible(true);
            }else{
                System.out.println("jaja no sé que ponerle aquí");
            }
        }else{
            int cantAux= cant;

            lblProducto.setText("Producto " + cantAux);
            txtNota.setText("Producto " + cant);
            agregarNotas();
        }
    }//GEN-LAST:event_btnGuardarNotaActionPerformed

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
    private javax.swing.JButton btnEliminarNota;
    private javax.swing.JButton btnGuardarNota;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnRegistrarOrden;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNombreProducto;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblnotas1;
    private javax.swing.JLabel lblnotas2;
    private javax.swing.JPanel pnlAgregarNota;
    private javax.swing.JPanel pnlCantidad;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlNotas;
    private javax.swing.JPanel pnlNotasProducto;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextArea txtNota;
    // End of variables declaration//GEN-END:variables

}
