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
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alcic
 */
public class AgregarPaciente extends javax.swing.JFrame {

    /**
     * Creates new form AgregarPaciente
     */
    public AgregarPaciente() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrartabla("");
        limpiar();
        
        jTextFieldIDPACIENTE.setEnabled(false);
    }
    void limpiar(){
        
    }
    void mostrartabla(String valor){
    DefaultTableModel modelo=new DefaultTableModel();
    
    modelo.addColumn("Id Paciente");
    modelo.addColumn("Nombre ");
    modelo.addColumn("Apellido Paterno");
    modelo.addColumn("Apellido Materno");
    modelo.addColumn("Telefono");
    modelo.addColumn("Localidad");
     modelo.addColumn("Tratamiento");
    
    
    jTableA.setModel(modelo);
    
    String sql="SELECT * FROM mydb.paciente";
    String datos[]=new String[7];
    Statement st;
    
    try{
        st=cn.createStatement();
        ResultSet rs=st.executeQuery(sql);
        
        while (rs.next()){
        datos[0]=rs.getString(1);
        datos[1]=rs.getString(2);
        datos[2]=rs.getString(3);
        datos[3]=rs.getString(4);
        datos[4]=rs.getString(5);
        datos[5]=rs.getString(6);
        datos[6]=rs.getString(7);

       
        modelo.addRow(datos);
        }
        jTableA.setModel(modelo);
    }catch (SQLException e){
        System.err.print(e);
        JOptionPane.showMessageDialog(null, "Error al cargar cursos... Conectate al adminitrador");
    }
    
    
    
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1ATRAS = new javax.swing.JButton();
        jButtonExitM = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableA = new javax.swing.JTable();
        jTextFieldIDPACIENTE = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldAppPA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldAppMa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldIdTELEFONO = new javax.swing.JTextField();
        jTextFieldIdLocalidad = new javax.swing.JTextField();
        Localidad = new javax.swing.JLabel();
        jTextFieldIdTratamiento = new javax.swing.JTextField();
        Tratamiento = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonGuardarDENTIS = new javax.swing.JButton();
        jLabelFondoAP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jTableA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido Materno", "Apellido Paterno", "Edad", "Telefono", "Tratamiento"
            }
        ));
        jScrollPane1.setViewportView(jTableA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 710, 210));
        getContentPane().add(jTextFieldIDPACIENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 240, -1));

        jLabel1.setText("ID Paciente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, 20));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, 20));
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 240, -1));
        getContentPane().add(jTextFieldAppPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 240, -1));

        jLabel6.setText("Apellido Paterno");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));
        getContentPane().add(jTextFieldAppMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 280, -1));

        jLabel4.setText("Apellido Materno");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        jLabel5.setText("Telefono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));

        jTextFieldIdTELEFONO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdTELEFONOActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdTELEFONO, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 280, -1));

        jTextFieldIdLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdLocalidadActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 280, -1));

        Localidad.setText("Localidad");
        getContentPane().add(Localidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, -1));

        jTextFieldIdTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdTratamientoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 280, -1));

        Tratamiento.setText("Tratamiento");
        getContentPane().add(Tratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));

        jLabel3.setText("Dentista ");
        jPanel1.add(jLabel3);

        jLabel8.setText("                                ");
        jPanel1.add(jLabel8);

        jButtonGuardarDENTIS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonGuardarDENTIS.setForeground(new java.awt.Color(51, 51, 255));
        jButtonGuardarDENTIS.setText("Guardar");
        jButtonGuardarDENTIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarDENTISActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardarDENTIS);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 810, 160));

        jLabelFondoAP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesA/Agregar_Paciente.PNG"))); // NOI18N
        getContentPane().add(jLabelFondoAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ATRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ATRASActionPerformed
        Agregar me= new Agregar();
        me.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ATRASActionPerformed

    private void jButtonExitMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitMActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitMActionPerformed

    private void jButtonGuardarDENTISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarDENTISActionPerformed

        try{

            if (jTextFieldNombre.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Campo Nombre vacio");
            }
            ///////////////////////
            else if (jTextFieldAppPA.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Campo Apellido Paterno vacio");
            }
            //////////////
            else if (jTextFieldAppMa.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Campo Apellido Materno vacio");
            }
            //////////////

            else if (jTextFieldIdTELEFONO.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Campo Dentista vacio");
            }
            ////////////////
         
            ///////////
            else{
                PreparedStatement ps=cn.prepareStatement("INSERT INTO mydb.paciente (Nombre_paciente, Apellido1_paciente,Apellido2_paciente, Telefono, localidad,tratamiento) VALUES (?,?,?,?,?,?)");
                ps.setString(1, jTextFieldNombre.getText());
                ps.setString(2, jTextFieldAppPA.getText());
                ps.setString(3, jTextFieldAppMa.getText());
                ps.setString(4, jTextFieldIdTELEFONO.getText());
                ps.setString(5, jTextFieldIdLocalidad.getText());
                ps.setString(6, jTextFieldIdTratamiento.getText());

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Paciente Guardado");
                mostrartabla("");
                limpiar();
            }

        }catch (Exception e){
            System.err.print(e);
            JOptionPane.showMessageDialog(null, "Error al guardar Paciente");

        }

    }//GEN-LAST:event_jButtonGuardarDENTISActionPerformed

    private void jTextFieldIdTELEFONOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdTELEFONOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdTELEFONOActionPerformed

    private void jTextFieldIdLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdLocalidadActionPerformed

    private void jTextFieldIdTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdTratamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdTratamientoActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Localidad;
    private javax.swing.JLabel Tratamiento;
    private javax.swing.JButton jButton1ATRAS;
    private javax.swing.JButton jButtonExitM;
    private javax.swing.JButton jButtonGuardarDENTIS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelFondoAP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableA;
    private javax.swing.JTextField jTextFieldAppMa;
    private javax.swing.JTextField jTextFieldAppPA;
    private javax.swing.JTextField jTextFieldIDPACIENTE;
    private javax.swing.JTextField jTextFieldIdLocalidad;
    private javax.swing.JTextField jTextFieldIdTELEFONO;
    private javax.swing.JTextField jTextFieldIdTratamiento;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
conector con=new conector ();
Connection cn=con.conexion();
}
