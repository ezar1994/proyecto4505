/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Esteban Arteaga
 */
public class VistaReporte extends javax.swing.JFrame {
    private JLabel fondo = new JLabel(){
        public void paint(Graphics g){
            super.paint(g);
            Image img = new ImageIcon(this.getClass().getResource("/imagenes/textura.PNG")).getImage();
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }
    };
    /**
     * Creates new form VistaReporte
     */
    public VistaReporte() {
        initComponents();
        setBounds(0,0,422,562);
        fondo.setBounds(0,0,getWidth(),getHeight());
        add(fondo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Subir Archivo de RUAF");

        jTextField3.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(520, 520));
        setPreferredSize(new java.awt.Dimension(520, 520));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_View_132615.png"))); // NOI18N
        getContentPane().add(jButton8);
        jButton8.setBounds(290, 280, 30, 20);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_View_132615.png"))); // NOI18N
        getContentPane().add(jButton7);
        jButton7.setBounds(290, 390, 30, 20);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_View.png"))); // NOI18N
        getContentPane().add(jButton5);
        jButton5.setBounds(290, 40, 30, 20);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_View_132615.png"))); // NOI18N
        getContentPane().add(jButton6);
        jButton6.setBounds(290, 340, 30, 20);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_View_132615.png"))); // NOI18N
        getContentPane().add(jButton3);
        jButton3.setBounds(290, 160, 30, 20);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_View_132615.png"))); // NOI18N
        getContentPane().add(jButton2);
        jButton2.setBounds(290, 220, 30, 20);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Subir Archivo de RUAF");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 20, 180, 17);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(80, 40, 210, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Subir Archivo de Mamografia");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 80, 230, 17);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(80, 100, 210, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Subir Archivo de Coposcopia");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 140, 210, 17);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(80, 160, 210, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Subir Archivo de Pomeroy");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 200, 200, 17);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(80, 220, 210, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Subir Archivo de Jadel");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 260, 180, 17);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(80, 280, 210, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Subir Archivo de Gestantes");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(80, 320, 210, 17);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(80, 340, 210, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Subir Archivo de Laboratorio");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(80, 370, 210, 17);

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8);
        jTextField8.setBounds(80, 390, 210, 20);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_View_132615.png"))); // NOI18N
        getContentPane().add(jButton9);
        jButton9.setBounds(290, 100, 30, 20);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_generar_off.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_generar_on.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_generar_on.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_generar_on.png"))); // NOI18N
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 440, 140, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaReporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
