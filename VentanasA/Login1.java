/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package VentanasA;

import conector.conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author alcic
 */
public class Login1 extends javax.swing.JFrame {
String user="";
String pass="";
    
    
    public Login1() {
        initComponents();
        this.setLocationRelativeTo(null);
        TextPrompt usuario=new TextPrompt("Ingresa usuario",jTextFieldUser);
        TextPrompt password=new TextPrompt("Ingresa contraseña",jPasswordField1);
    }

   
    @SuppressWarnings("unchecked")
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldUser = new javax.swing.JTextField();
        jButtonOk = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1ATRAS = new javax.swing.JButton();
        jButtonExitM = new javax.swing.JButton();
        jLabelfondoCU = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextFieldUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 200, 40));

        jButtonOk.setBackground(new java.awt.Color(255, 255, 255));
        jButtonOk.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonOk.setForeground(new java.awt.Color(51, 204, 255));
        jButtonOk.setText("OK");
        jButtonOk.setBorderPainted(false);
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 60, 40));

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 200, 40));

        jButton1ATRAS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1ATRAS.setForeground(new java.awt.Color(51, 51, 255));
        jButton1ATRAS.setText("ATRAS");
        jButton1ATRAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ATRASActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1ATRAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 100, 40));

        jButtonExitM.setText("EXIT");
        jButtonExitM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitMActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExitM, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 100, 50));

        jLabelfondoCU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesA/Crear_Usuario1.PNG"))); // NOI18N
        getContentPane().add(jLabelfondoCU, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
user=jTextFieldUser.getText();
pass=jPasswordField1.getText();

if(!user.equals("") || !pass.equals("")){
    try {
         PreparedStatement ps=cn.prepareStatement("SELECT nivel FROM mydb.usuario WHERE Nombre='"+user+"'AND Contraseña='"+pass+"'");
         ResultSet rs=ps.executeQuery();
         if(rs.next()){
         String nivel=rs.getString("nivel");
         
         if(nivel.equalsIgnoreCase("Administrador")){
         dispose();
         new CrearUsuario().setVisible(true);
         }
         
         }
         else{
          JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrecto");
          jTextFieldUser.setText("");
          jPasswordField1.setText("");
         }
         
    } catch (SQLException e){
            System.err.print(e);
            JOptionPane.showMessageDialog(null, "Error al iniciar sesion... contacte al administrador");
        }

    }
    else{
    JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
    }
    }//GEN-LAST:event_jButtonOkActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton1ATRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ATRASActionPerformed
        Login me= new Login();
        me.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ATRASActionPerformed

    private void jButtonExitMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitMActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonExitMActionPerformed

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
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1ATRAS;
    private javax.swing.JButton jButtonExitM;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JLabel jLabelfondoCU;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
conector con=new conector ();
Connection cn=con.conexion();
}
