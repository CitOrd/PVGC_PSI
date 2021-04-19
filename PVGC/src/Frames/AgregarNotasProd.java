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
        lblnotas.setText(nombre);
       

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
        java.awt.GridBagConstraints gridBagConstraints;

        pnlFondo = new javax.swing.JPanel();
        lblNombreProducto = new javax.swing.JLabel();
        pnlCantidad = new javax.swing.JPanel();
        btnMas = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        btnMenos = new javax.swing.JButton();
        lblCantidad = new javax.swing.JLabel();
        pnlnotas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNota = new javax.swing.JTextArea();
        lblProducto = new javax.swing.JLabel();
        btnRegistrarOrden = new javax.swing.JButton();
        btnGuardarNota = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblnotas1 = new javax.swing.JLabel();
        btnMenuPrincipal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlDescNotas = new javax.swing.JPanel();
        lblnotas = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1200, 900));

        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreProducto.setFont(new java.awt.Font("Dialog", 1, 72)); // NOI18N
        lblNombreProducto.setText("Café Americano");
        pnlFondo.add(lblNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        pnlCantidad.setBackground(new java.awt.Color(204, 204, 204));
        pnlCantidad.setForeground(new java.awt.Color(204, 204, 204));

        btnMas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnMas.setText("+");
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });

        txtCantidad.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        btnMenos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnMenos.setText("-");
        btnMenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenosMouseClicked(evt);
            }
        });

        lblCantidad.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(51, 51, 51));
        lblCantidad.setText("Cantidad");

        javax.swing.GroupLayout pnlCantidadLayout = new javax.swing.GroupLayout(pnlCantidad);
        pnlCantidad.setLayout(pnlCantidadLayout);
        pnlCantidadLayout.setHorizontalGroup(
            pnlCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCantidadLayout.createSequentialGroup()
                .addGroup(pnlCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCantidadLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnMas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCantidadLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(lblCantidad)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        pnlCantidadLayout.setVerticalGroup(
            pnlCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCantidadLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblCantidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenos)
                    .addComponent(btnMas))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        pnlFondo.add(pnlCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 370, 280));

        pnlnotas.setBackground(new java.awt.Color(204, 204, 204));
        pnlnotas.setForeground(new java.awt.Color(204, 204, 204));

        txtNota.setColumns(20);
        txtNota.setRows(5);
        jScrollPane2.setViewportView(txtNota);

        lblProducto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblProducto.setForeground(new java.awt.Color(51, 51, 51));
        lblProducto.setText("Producto ");

        btnRegistrarOrden.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegistrarOrden.setText("Terminar Orden");

        btnGuardarNota.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGuardarNota.setText("Guardar nota");
        btnGuardarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarNotaActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegresar.setText("Regresar");

        lblnotas1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblnotas1.setForeground(new java.awt.Color(51, 51, 51));
        lblnotas1.setText("Agregar nota");

        javax.swing.GroupLayout pnlnotasLayout = new javax.swing.GroupLayout(pnlnotas);
        pnlnotas.setLayout(pnlnotasLayout);
        pnlnotasLayout.setHorizontalGroup(
            pnlnotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlnotasLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(pnlnotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProducto)
                    .addGroup(pnlnotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlnotasLayout.createSequentialGroup()
                            .addComponent(btnGuardarNota)
                            .addGap(27, 27, 27)
                            .addComponent(btnRegistrarOrden)
                            .addGap(29, 29, 29)
                            .addComponent(btnRegresar))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
            .addGroup(pnlnotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlnotasLayout.createSequentialGroup()
                    .addGap(132, 132, 132)
                    .addComponent(lblnotas1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(147, Short.MAX_VALUE)))
        );
        pnlnotasLayout.setVerticalGroup(
            pnlnotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlnotasLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(lblProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(pnlnotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarOrden)
                    .addComponent(btnGuardarNota)
                    .addComponent(btnRegresar))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(pnlnotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlnotasLayout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(lblnotas1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(264, Short.MAX_VALUE)))
        );

        pnlFondo.add(pnlnotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, 340));

        btnMenuPrincipal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnMenuPrincipal.setText("Menu principal");
        pnlFondo.add(btnMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 780, -1, -1));

        pnlDescNotas.setBackground(new java.awt.Color(204, 204, 204));
        pnlDescNotas.setForeground(new java.awt.Color(204, 204, 204));
        pnlDescNotas.setLayout(new javax.swing.BoxLayout(pnlDescNotas, javax.swing.BoxLayout.Y_AXIS));

        lblnotas.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblnotas.setForeground(new java.awt.Color(51, 51, 51));
        lblnotas.setText("Nota");
        pnlDescNotas.add(lblnotas);

        jScrollPane1.setViewportView(pnlDescNotas);

        pnlFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 270, 530, 340));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondoMenuAdministarVenta.png"))); // NOI18N
        pnlFondo.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1000));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 977, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JLabel lblnotas;
    private javax.swing.JLabel lblnotas1;
    private javax.swing.JPanel pnlCantidad;
    private javax.swing.JPanel pnlDescNotas;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlnotas;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextArea txtNota;
    // End of variables declaration//GEN-END:variables

}
