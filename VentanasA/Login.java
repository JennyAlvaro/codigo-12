
package VentanasA;

import conector.conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alcic
 */
public class Login extends javax.swing.JFrame {
String user="";
String pass="";
    
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        TextPrompt usuario=new TextPrompt("Ingresa usuario",jTextFieldUser);
        TextPrompt password=new TextPrompt("Ingresa contraseña",jPasswordField1);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonDeSalir = new javax.swing.JButton();
        JLabelInicioS = new javax.swing.JLabel();
        JLabelUsuario = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        JLabelContraseña = new javax.swing.JLabel();
        jButtonOk = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonCrearUs = new javax.swing.JButton();
        JLabelDiente = new javax.swing.JLabel();
        JlaberlEncabezado = new javax.swing.JLabel();
        JLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonDeSalir.setBackground(new java.awt.Color(255, 255, 255));
        BotonDeSalir.setText("Exit");
        BotonDeSalir.setBorderPainted(false);
        BotonDeSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDeSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDeSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 90, 40));

        JLabelInicioS.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JLabelInicioS.setText("Inicio de sesión ");
        getContentPane().add(JLabelInicioS, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        JLabelUsuario.setBackground(new java.awt.Color(0, 0, 0));
        JLabelUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JLabelUsuario.setText("Usuario");
        getContentPane().add(JLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));
        getContentPane().add(jTextFieldUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 180, -1));

        JLabelContraseña.setBackground(new java.awt.Color(0, 0, 0));
        JLabelContraseña.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JLabelContraseña.setText("Contraseña");
        getContentPane().add(JLabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

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
        getContentPane().add(jButtonOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, -1, -1));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 280, 180, -1));

        jButtonCrearUs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonCrearUs.setForeground(new java.awt.Color(51, 204, 255));
        jButtonCrearUs.setText("CREAR USUARIO");
        jButtonCrearUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearUsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCrearUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        JLabelDiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesA/Diente.PNG"))); // NOI18N
        JLabelDiente.setMinimumSize(new java.awt.Dimension(50, 50));
        getContentPane().add(JLabelDiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 330, 130));

        JlaberlEncabezado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesA/EncabezadoA.PNG"))); // NOI18N
        getContentPane().add(JlaberlEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, -40, 750, 200));

        JLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesA/fondo2.0.PNG"))); // NOI18N
        getContentPane().add(JLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonDeSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDeSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BotonDeSalirActionPerformed

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
user=jTextFieldUser.getText();
pass=jPasswordField1.getText();

if(!user.equals("") || !pass.equals("")){
    try {
         PreparedStatement ps=cn.prepareStatement("SELECT * FROM mydb.usuario WHERE Nombre='"+user+"'AND Contraseña='"+pass+"'");
         ResultSet rs=ps.executeQuery();
         if(rs.next()){
         new Menu().setVisible(true);
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

    private void jButtonCrearUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearUsActionPerformed
Login1 me= new Login1();
                me.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jButtonCrearUsActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonDeSalir;
    private javax.swing.JLabel JLabelContraseña;
    private javax.swing.JLabel JLabelDiente;
    private javax.swing.JLabel JLabelFondo;
    private javax.swing.JLabel JLabelInicioS;
    private javax.swing.JLabel JLabelUsuario;
    private javax.swing.JLabel JlaberlEncabezado;
    private javax.swing.JButton jButtonCrearUs;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
conector con=new conector ();
Connection cn=con.conexion();
}
