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

import conector.conector;
import java.sql.Connection;

/**
 *
 * @author alcic
 */
public class EliminarCita extends javax.swing.JFrame {

    /**
     * Creates new form EliminarCita
     */
    public EliminarCita() {
        initComponents();
        TextPrompt hini=new TextPrompt("HH:MM:SS",jTextFieldHora);
        TextPrompt hfin=new TextPrompt("YYYY-MM-DD",jTextFieldFECHA);
        
        jTextFieldIDCita.setEnabled(false);
        this.setLocationRelativeTo(null);
        mostrartabla("");
        mostartablacita("");
        limpiar();
        
        
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
    
    
    TablaBuscarpaciente.setModel(modelo);
    
    String sql="SELECT * FROM mydb.paciente where CONCAT (id_Paciente,' ',Nombre_paciente,' ',Apellido1_paciente,' ',Apellido2_paciente,' ',Telefono,' ',localidad) LIKE'%"+valor+"%'";
    String datos[]=new String[6];
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

       
        modelo.addRow(datos);
        }
        TablaBuscarpaciente.setModel(modelo);
    }catch (SQLException e){
        System.err.print(e);
        JOptionPane.showMessageDialog(null, "Error al cargar cursos... Conectate al adminitrador");
    }
    }
    ////////////////////////////////////////////////////////cita
    void mostartablacita(String valor){
    DefaultTableModel modeloo=new DefaultTableModel();
    
    modeloo.addColumn("Id Cita");
    modeloo.addColumn("Nombre Paciente");
    modeloo.addColumn("Fecha");
    modeloo.addColumn("Hora");
    modeloo.addColumn("Abonos");
    modeloo.addColumn("Deuda");
    
    
    jTablecita.setModel(modeloo);
    
    String sql=" SELECT citas.idCitas,paciente.Nombre_paciente,citas.fecha_cita,citas.hora,historial_citas.Historia_bono,historial_citas.Historial_deuda FROM citas,paciente,historial_citas where citas.idCitas= historial_citas.Citas_idCitas and historial_citas.Paciente_id_Paciente= paciente.id_Paciente";
    String datoss[]=new String[6];
    Statement st;
    
    try{
        st=cn.createStatement();
        ResultSet rs=st.executeQuery(sql);
        
        while (rs.next()){
        datoss[0]=rs.getString(1);
        datoss[1]=rs.getString(2);
        datoss[2]=rs.getString(3);
        datoss[3]=rs.getString(4);
        datoss[4]=rs.getString(5);
        datoss[5]=rs.getString(6);
      
       
        modeloo.addRow(datoss);
        }
        jTablecita.setModel(modeloo);
    }catch (SQLException e){
        System.err.print(e);
        JOptionPane.showMessageDialog(null, "Error al cargar cursos... Conectate al adminitrador");
    }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonExitM = new javax.swing.JButton();
        jButton1ATRAS = new javax.swing.JButton();
        jTextBuscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaBuscarpaciente = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jTextFieldIDPACIENTE = new javax.swing.JTextField();
        jTextFieldIDCita = new javax.swing.JTextField();
        jTextFieldFECHA = new javax.swing.JTextField();
        jTextFieldHora = new javax.swing.JTextField();
        jTextFieldHistorialABO = new javax.swing.JTextField();
        jTextFieldHistoriaDEUDA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablecita = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        GconP = new javax.swing.JButton();
        jLabelFondoEC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonExitM.setText("EXIT");
        jButtonExitM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitMActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExitM, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 100, 50));

        jButton1ATRAS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1ATRAS.setForeground(new java.awt.Color(51, 51, 255));
        jButton1ATRAS.setText("ATRAS");
        jButton1ATRAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ATRASActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1ATRAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 80, 40));

        jTextBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jTextBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 390, 30));

        jLabel3.setText("Buscar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 40, -1));

        TablaBuscarpaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido Materno", "Apellido Paterno", "Edad", "h", "Title 7", "Title 8", "Title 9"
            }
        ));
        TablaBuscarpaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaBuscarpacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaBuscarpaciente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 530, 100));

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 80, 30));
        getContentPane().add(jTextFieldIDPACIENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 220, -1));
        getContentPane().add(jTextFieldIDCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 220, -1));
        getContentPane().add(jTextFieldFECHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 220, -1));
        getContentPane().add(jTextFieldHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 220, -1));
        getContentPane().add(jTextFieldHistorialABO, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 220, -1));
        getContentPane().add(jTextFieldHistoriaDEUDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 220, -1));

        jLabel5.setText("Historial de deuda");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, -1, 20));

        jLabel6.setText("Historial de abono");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, -1, 20));

        jLabel1.setText("Hora");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, -1, 20));

        Fecha.setText("Fecha");
        getContentPane().add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, -1, 20));

        jLabel7.setText("ID Cita");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, -1, 20));

        jLabel4.setText("ID Paciente");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, -1, 20));

        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });
        getContentPane().add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 70, 30));

        jTablecita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTablecita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablecitaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablecita);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 530, 120));

        GconP.setText("ELiminar");
        GconP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GconPActionPerformed(evt);
            }
        });
        jPanel1.add(GconP);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 370, 220));

        jLabelFondoEC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesA/Eliminar_cita.PNG"))); // NOI18N
        getContentPane().add(jLabelFondoEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ATRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ATRASActionPerformed
        EliminarD me= new EliminarD ();
        me.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ATRASActionPerformed

    private void jButtonExitMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitMActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonExitMActionPerformed

    private void jTextBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscarActionPerformed

    private void TablaBuscarpacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaBuscarpacienteMouseClicked
        int fila=this.TablaBuscarpaciente.getSelectedRow();

        this.jTextFieldIDPACIENTE.setText(this.TablaBuscarpaciente.getValueAt(fila, 0).toString());

    }//GEN-LAST:event_TablaBuscarpacienteMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mostrartabla(jTextBuscar.getText());
        for(int i=0; i<=TablaBuscarpaciente.getRowCount();i++)
        {
            cantidad.setText(" "+i);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void GconPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GconPActionPerformed
    try{
                PreparedStatement ps=cn.prepareStatement("DELETE FROM mydb.historial_citas WHERE Citas_idCitas = '"+jTextFieldIDCita.getText()+"' and Paciente_id_Paciente='"+ jTextFieldIDPACIENTE.getText()+"' ");
                int respuesta=ps.executeUpdate();        
                
                if(respuesta>0){
                    JOptionPane.showMessageDialog(null, "Cita Eliminada");
                    
                    limpiar();
                    mostartablacita("");
                }
                else{
                JOptionPane.showMessageDialog(null, "Selecciona fila");
                }

        } catch (SQLException e){
            System.err.print(e);
            JOptionPane.showMessageDialog(null, "Error al Eliminar Paciente");

        }
        
    }//GEN-LAST:event_GconPActionPerformed

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed

    private void jTablecitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablecitaMouseClicked
        int fila=this.jTablecita.getSelectedRow();

        this.jTextFieldIDCita.setText(this.jTablecita.getValueAt(fila, 0).toString());
        this.jTextFieldIDPACIENTE.setText(this.jTablecita.getValueAt(fila, 1).toString());
        this.jTextFieldFECHA.setText(this.jTablecita.getValueAt(fila, 2).toString());
        this.jTextFieldHora.setText(this.jTablecita.getValueAt(fila, 3).toString());
        this.jTextFieldHistorialABO.setText(this.jTablecita.getValueAt(fila, 4).toString());
        this.jTextFieldHistoriaDEUDA.setText(this.jTablecita.getValueAt(fila, 5).toString());
    }//GEN-LAST:event_jTablecitaMouseClicked

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
            java.util.logging.Logger.getLogger(EliminarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EliminarCita().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fecha;
    private javax.swing.JButton GconP;
    private javax.swing.JTable TablaBuscarpaciente;
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton jButton1ATRAS;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonExitM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelFondoEC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablecita;
    private javax.swing.JTextField jTextBuscar;
    private javax.swing.JTextField jTextFieldFECHA;
    private javax.swing.JTextField jTextFieldHistoriaDEUDA;
    private javax.swing.JTextField jTextFieldHistorialABO;
    private javax.swing.JTextField jTextFieldHora;
    private javax.swing.JTextField jTextFieldIDCita;
    private javax.swing.JTextField jTextFieldIDPACIENTE;
    // End of variables declaration//GEN-END:variables
conector con=new conector ();
Connection cn=con.conexion();
}
