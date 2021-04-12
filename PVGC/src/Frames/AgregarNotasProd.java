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

import java.awt.Label;

import java.util.ArrayList;

import javax.swing.JTextField;


/**
 * Pantalla para poder agregar un producto a la orden.
 *
 * @author Citlali Orduño
 */
public class AgregarNotasProd extends javax.swing.JFrame {

    public ControlOrden ctrlOrden;
    public Orden orden;
    public ControlProducto ctrlProd;
    public Producto prod;
    public int cant = 1;
    String numCantidad = "";
    public JTextField txtNotas = new JTextField();
    public Label lblProd = new Label();
    public ArrayList<String> notas; 
    public ArrayList<Label> labels = null;
    public ArrayList<JTextField> textsNotas = null; 
    
    /**
     * Creates new form AgregarNotasProd
     */
    public AgregarNotasProd() {
        this.ctrlOrden = new ControlOrden();
        this.ctrlProd = new ControlProducto();
        this.notas= new ArrayList<String>();
        this.prod = prod;
        this.orden = orden;
        initComponents();
        this.txtCantidad.setText("" + cant);
        lblProd.setSize(2, 6);
        txtNotas.setSize(2,6);
        pnlNotas.add(lblProd);
        pnlNotas.add(txtNotas);

        //  mostrarProducto(prod);
    }

    public void mostrarProducto(Producto producto) {
        String nombre = producto.getNombre();
        lblProducto.setText(nombre);
       

    }
    
    public void agregarComponentes(){
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDscr = new javax.swing.JPanel();
        txtCantidad = new javax.swing.JTextField();
        btnMenos = new javax.swing.JButton();
        btnMas = new javax.swing.JButton();
        btnAgregarProdOrden = new javax.swing.JButton();
        scrllNotas = new javax.swing.JScrollPane();
        pnlNotas = new javax.swing.JPanel();
        btnMenuProd = new javax.swing.JButton();
        btnMnuPrincipal = new javax.swing.JButton();
        lblProducto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1200, 900));

        pnlDscr.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)), "Cantidad", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 36))); // NOI18N

        txtCantidad.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        btnMenos.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnMenos.setText("-");
        btnMenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenosMouseClicked(evt);
            }
        });

        btnMas.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnMas.setText("+");
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDscrLayout = new javax.swing.GroupLayout(pnlDscr);
        pnlDscr.setLayout(pnlDscrLayout);
        pnlDscrLayout.setHorizontalGroup(
            pnlDscrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDscrLayout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnMas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        pnlDscrLayout.setVerticalGroup(
            pnlDscrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDscrLayout.createSequentialGroup()
                .addGroup(pnlDscrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDscrLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(pnlDscrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlDscrLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        btnAgregarProdOrden.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnAgregarProdOrden.setText("Agregar a orden");

        scrllNotas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)), "Notas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 36), new java.awt.Color(255, 255, 255))); // NOI18N

        pnlNotas.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pnlNotas.setLayout(new javax.swing.BoxLayout(pnlNotas, javax.swing.BoxLayout.Y_AXIS));
        scrllNotas.setViewportView(pnlNotas);

        btnMenuProd.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnMenuProd.setText("Regresar");
        btnMenuProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuProdActionPerformed(evt);
            }
        });

        btnMnuPrincipal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnMnuPrincipal.setText("Menu Principal");

        lblProducto.setFont(new java.awt.Font("Dialog", 1, 60)); // NOI18N
        lblProducto.setText("Producto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(lblProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarProdOrden)
                .addGap(133, 133, 133)
                .addComponent(btnMenuProd, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(btnMnuPrincipal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(pnlDscr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(scrllNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lblProducto)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(pnlDscr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(scrllNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(249, 249, 249)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMnuPrincipal)
                        .addGap(349, 349, 349))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMenuProd)
                            .addComponent(btnAgregarProdOrden))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        cant++;
        txtCantidad.setText("" + cant);
         for (int i = 0; i < cant; i++) {
            lblProd.setText("Producto " + cant);
            pnlNotas.add(lblProd);
            pnlNotas.add(txtNotas);
            labels.add(lblProd);
            textsNotas.add(txtNotas);
            pnlNotas.updateUI();
        }

    }//GEN-LAST:event_btnMasActionPerformed

    private void btnMenuProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuProdActionPerformed
        
    }//GEN-LAST:event_btnMenuProdActionPerformed

    private void btnMenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosMouseClicked
        cant--;
        txtCantidad.setText("" + cant);
        /* For que recorre los otros for para buscar cada componente 
        txtField o label y eliminarlo*/
        for (int i = 1; i < cant; i++) {
            /*For que recorre la lista de los labels*/
            for (int j = 0; j < labels.size(); j++) {
               Label lblAux= labels.get(j);
               if(lblAux.equals(lblProd)){
                   pnlNotas.remove(lblAux);
                   System.out.println("Si entró por acá");
               }else{
                   System.out.println("su perra madre no funciono");
               }
            }
            /*For que recorre la lista de los textField*/
            for (int j = 0; j < textsNotas.size(); j++) {
                JTextField txtNAux= textsNotas.get(j);
                if(txtNAux.equals(txtNotas)){
                    pnlNotas.remove(txtNAux);
                    System.out.println("Si entró por esta madre también");        
                }
            }
            
            pnlNotas.updateUI();
        }
    }//GEN-LAST:event_btnMenosMouseClicked

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
    private javax.swing.JLabel lblProducto;
    private javax.swing.JPanel pnlDscr;
    private javax.swing.JPanel pnlNotas;
    private javax.swing.JScrollPane scrllNotas;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables

}
