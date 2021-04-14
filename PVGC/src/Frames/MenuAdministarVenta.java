/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.border.Border;

/**
 *
 * @author amacias
 */
public class MenuAdministarVenta extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdministarVenta
     */
    public MenuAdministarVenta() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.resize();
    }

    private void resize() {
        try {
            BufferedImage img = ImageIO.read(new File("src/Img/fondoMenuAdministarVenta.png"));
            Image img1 = img.getScaledInstance(BackgroundFrame.getWidth(), BackgroundFrame.getHeight(), Image.SCALE_SMOOTH);
            BackgroundFrame.setIcon(new ImageIcon(img1));
        } catch (IOException ex) {
            Logger.getLogger(MenuAdministarVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPConsultarOrden = new javax.swing.JPanel();
        BtnConsultarOrden = new javax.swing.JButton();
        BnrConsultarOrden = new javax.swing.JLabel();
        IconoConsultarOrden = new javax.swing.JLabel();
        JPModificarOrden = new javax.swing.JPanel();
        BtnModificarOrden = new javax.swing.JButton();
        BnrModificarOrden = new javax.swing.JLabel();
        IconoModificarOrden = new javax.swing.JLabel();
        JPEliminarOrden = new javax.swing.JPanel();
        BtnEliminarOrden = new javax.swing.JButton();
        BnrEliminarOrden = new javax.swing.JLabel();
        IconoEliminarOrden = new javax.swing.JLabel();
        JPTomarOrden = new javax.swing.JPanel();
        BtnTomarOrden = new javax.swing.JButton();
        BnrTomarOrden = new javax.swing.JLabel();
        IconoTomarOrden = new javax.swing.JLabel();
        BtnRegresar = new javax.swing.JButton();
        TituloMenuAdministarVenta = new javax.swing.JLabel();
        IcTitulo = new javax.swing.JLabel();
        BackgroundFrame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MenuAdministarVenta");
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setName("MenuAdministarVenta"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPConsultarOrden.setBackground(new java.awt.Color(206, 215, 231, 95));

        BtnConsultarOrden.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 36)); // NOI18N
        BtnConsultarOrden.setText("Consultar Orden");
        BtnConsultarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarOrdenActionPerformed(evt);
            }
        });

        BnrConsultarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Banner Consultar Orden.png"))); // NOI18N

        IconoConsultarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icono Opción Consultar Orden.png"))); // NOI18N

        javax.swing.GroupLayout JPConsultarOrdenLayout = new javax.swing.GroupLayout(JPConsultarOrden);
        JPConsultarOrden.setLayout(JPConsultarOrdenLayout);
        JPConsultarOrdenLayout.setHorizontalGroup(
            JPConsultarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPConsultarOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BnrConsultarOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPConsultarOrdenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IconoConsultarOrden)
                .addGap(80, 80, 80))
            .addGroup(JPConsultarOrdenLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(BtnConsultarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPConsultarOrdenLayout.setVerticalGroup(
            JPConsultarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPConsultarOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BnrConsultarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(IconoConsultarOrden)
                .addGap(40, 40, 40)
                .addComponent(BtnConsultarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        getContentPane().add(JPConsultarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 360, -1, -1));

        JPModificarOrden.setBackground(new java.awt.Color(206, 215, 231, 95));

        BtnModificarOrden.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 36)); // NOI18N
        BtnModificarOrden.setText("Modificar Orden");
        BtnModificarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarOrdenActionPerformed(evt);
            }
        });

        BnrModificarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Banner Modificar Orden.png"))); // NOI18N

        IconoModificarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icono Opción Modificar Orden.png"))); // NOI18N

        javax.swing.GroupLayout JPModificarOrdenLayout = new javax.swing.GroupLayout(JPModificarOrden);
        JPModificarOrden.setLayout(JPModificarOrdenLayout);
        JPModificarOrdenLayout.setHorizontalGroup(
            JPModificarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPModificarOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BnrModificarOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPModificarOrdenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IconoModificarOrden)
                .addGap(80, 80, 80))
            .addGroup(JPModificarOrdenLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(BtnModificarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPModificarOrdenLayout.setVerticalGroup(
            JPModificarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPModificarOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BnrModificarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(IconoModificarOrden)
                .addGap(40, 40, 40)
                .addComponent(BtnModificarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        getContentPane().add(JPModificarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 360, -1, -1));

        JPEliminarOrden.setBackground(new java.awt.Color(206, 215, 231, 95));

        BtnEliminarOrden.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 36)); // NOI18N
        BtnEliminarOrden.setText("Eliminar Orden");
        BtnEliminarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarOrdenActionPerformed(evt);
            }
        });

        BnrEliminarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BannerOpcionEliminarOrden.png"))); // NOI18N

        IconoEliminarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconoOpciónEliminarOrden.png"))); // NOI18N

        javax.swing.GroupLayout JPEliminarOrdenLayout = new javax.swing.GroupLayout(JPEliminarOrden);
        JPEliminarOrden.setLayout(JPEliminarOrdenLayout);
        JPEliminarOrdenLayout.setHorizontalGroup(
            JPEliminarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPEliminarOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BnrEliminarOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPEliminarOrdenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IconoEliminarOrden)
                .addGap(80, 80, 80))
            .addGroup(JPEliminarOrdenLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(BtnEliminarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPEliminarOrdenLayout.setVerticalGroup(
            JPEliminarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPEliminarOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BnrEliminarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(IconoEliminarOrden)
                .addGap(40, 40, 40)
                .addComponent(BtnEliminarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        getContentPane().add(JPEliminarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, -1, -1));

        JPTomarOrden.setBackground(new java.awt.Color(206, 215, 231, 95));

        BtnTomarOrden.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 36)); // NOI18N
        BtnTomarOrden.setText("Tomar Orden");
        BtnTomarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTomarOrdenActionPerformed(evt);
            }
        });

        BnrTomarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BannerTomarPedido.png"))); // NOI18N

        IconoTomarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icono Opción Tomar Orden.png"))); // NOI18N

        javax.swing.GroupLayout JPTomarOrdenLayout = new javax.swing.GroupLayout(JPTomarOrden);
        JPTomarOrden.setLayout(JPTomarOrdenLayout);
        JPTomarOrdenLayout.setHorizontalGroup(
            JPTomarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPTomarOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BnrTomarOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPTomarOrdenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IconoTomarOrden)
                .addGap(80, 80, 80))
            .addGroup(JPTomarOrdenLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(BtnTomarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPTomarOrdenLayout.setVerticalGroup(
            JPTomarOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPTomarOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BnrTomarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(IconoTomarOrden)
                .addGap(40, 40, 40)
                .addComponent(BtnTomarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        getContentPane().add(JPTomarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));

        BtnRegresar.setBackground(new java.awt.Color(222, 143, 62, 100));
        BtnRegresar.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 24)); // NOI18N
        BtnRegresar.setText("REGRESAR");
        getContentPane().add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 990, -1, -1));

        TituloMenuAdministarVenta.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 94)); // NOI18N
        TituloMenuAdministarVenta.setForeground(new java.awt.Color(206, 215, 231));
        TituloMenuAdministarVenta.setText("Menú Administar Venta");
        getContentPane().add(TituloMenuAdministarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 890, 80));

        IcTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icono Titulo Menu Administrar Venta.png"))); // NOI18N
        getContentPane().add(IcTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 150, 140));

        BackgroundFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondoMenuAdministarVenta.png"))); // NOI18N
        getContentPane().add(BackgroundFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnConsultarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarOrdenActionPerformed
        ConsultarOrden jFrm = new ConsultarOrden();
        this.setVisible(false);
        jFrm.setVisible(true);
    }//GEN-LAST:event_BtnConsultarOrdenActionPerformed

    private void BtnModificarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarOrdenActionPerformed
        ModificarOrden jFrm = new ModificarOrden();
        this.setVisible(false);
        jFrm.setVisible(true);
    }//GEN-LAST:event_BtnModificarOrdenActionPerformed
    
    private void BtnEliminarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarOrdenActionPerformed
        EliminarOrden jFrm = new EliminarOrden();
        this.setVisible(false);
        jFrm.setVisible(true);
    }//GEN-LAST:event_BtnEliminarOrdenActionPerformed

    private void BtnTomarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTomarOrdenActionPerformed
        Categorias jFrm = new Categorias();
        this.setVisible(false);
        jFrm.setVisible(true);
    }//GEN-LAST:event_BtnTomarOrdenActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdministarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdministarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdministarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdministarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdministarVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundFrame;
    private javax.swing.JLabel BnrConsultarOrden;
    private javax.swing.JLabel BnrEliminarOrden;
    private javax.swing.JLabel BnrModificarOrden;
    private javax.swing.JLabel BnrTomarOrden;
    private javax.swing.JButton BtnConsultarOrden;
    private javax.swing.JButton BtnEliminarOrden;
    private javax.swing.JButton BtnModificarOrden;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JButton BtnTomarOrden;
    private javax.swing.JLabel IcTitulo;
    private javax.swing.JLabel IconoConsultarOrden;
    private javax.swing.JLabel IconoEliminarOrden;
    private javax.swing.JLabel IconoModificarOrden;
    private javax.swing.JLabel IconoTomarOrden;
    private javax.swing.JPanel JPConsultarOrden;
    private javax.swing.JPanel JPEliminarOrden;
    private javax.swing.JPanel JPModificarOrden;
    private javax.swing.JPanel JPTomarOrden;
    private javax.swing.JLabel TituloMenuAdministarVenta;
    // End of variables declaration//GEN-END:variables
}
