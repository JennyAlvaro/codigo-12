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
public class EliminarPaciente extends javax.swing.JFrame {

    /**
     * Creates new form EliminarPaciente
     */
    public EliminarPaciente() {
      
        initComponents();
        this.setLocationRelativeTo(null);
        mostrartabla("");
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
    
    
    TablaEliminarPaciente.setModel(modelo);
    
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
        TablaEliminarPaciente.setModel(modelo);
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
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEliminarPaciente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldIDPACIENTE = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Localidad = new javax.swing.JLabel();
        jTextFieldIdLocalidad = new javax.swing.JTextField();
        jTextFieldIdTELEFONO = new javax.swing.JTextField();
        jTextFieldAppMa = new javax.swing.JTextField();
        jTextFieldAppPA = new javax.swing.JTextField();
        cantidad = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonEliminar = new javax.swing.JButton();
        jLabelFondoEP = new javax.swing.JLabel();

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
        getContentPane().add(jButton1ATRAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 80, 40));

        jTextBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jTextBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 430, 30));

        jLabel3.setText("Buscar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 50, -1));

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 80, 30));

        TablaEliminarPaciente.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaEliminarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaEliminarPacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaEliminarPaciente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 500, 160));

        jLabel1.setText("ID Paciente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, -1, 20));
        getContentPane().add(jTextFieldIDPACIENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, 240, -1));
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 240, -1));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, -1, 20));

        jLabel6.setText("Apellido Paterno");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, -1, -1));

        jLabel5.setText("Apellido Materno");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, -1, -1));

        jLabel7.setText("Telefono");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, -1, -1));

        Localidad.setText("Localidad");
        getContentPane().add(Localidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, -1, -1));

        jTextFieldIdLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdLocalidadActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 240, -1));

        jTextFieldIdTELEFONO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdTELEFONOActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdTELEFONO, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 240, -1));
        getContentPane().add(jTextFieldAppMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 240, -1));
        getContentPane().add(jTextFieldAppPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 240, -1));

        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });
        getContentPane().add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 90, 30));

        jLabel4.setText("Dentista ");
        jPanel1.add(jLabel4);

        jLabel8.setText("                                ");
        jPanel1.add(jLabel8);

        jButtonEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(51, 51, 255));
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEliminar);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 360, 290));

        jLabelFondoEP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesA/Eliminar_paciente.PNG"))); // NOI18N
        getContentPane().add(jLabelFondoEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitMActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonExitMActionPerformed

    private void jButton1ATRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ATRASActionPerformed
        EliminarD me= new EliminarD();
        me.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ATRASActionPerformed

    private void jTextBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mostrartabla(jTextBuscar.getText());
        for(int i=0; i<=TablaEliminarPaciente.getRowCount();i++)
        {
            cantidad.setText(" "+i);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TablaEliminarPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaEliminarPacienteMouseClicked
        int fila=this.TablaEliminarPaciente.getSelectedRow();

        this.jTextFieldIDPACIENTE.setText(this.TablaEliminarPaciente.getValueAt(fila, 0).toString());
        this.jTextFieldNombre.setText(this.TablaEliminarPaciente.getValueAt(fila, 1).toString());
        this.jTextFieldAppPA.setText(this.TablaEliminarPaciente.getValueAt(fila, 2).toString());
        this.jTextFieldAppMa.setText(this.TablaEliminarPaciente.getValueAt(fila, 3).toString());
        this.jTextFieldIdTELEFONO.setText(this.TablaEliminarPaciente.getValueAt(fila, 4).toString());
        this.jTextFieldIdLocalidad.setText(this.TablaEliminarPaciente.getValueAt(fila, 5).toString());

    }//GEN-LAST:event_TablaEliminarPacienteMouseClicked

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed

        try{
                PreparedStatement ps=cn.prepareStatement("DELETE FROM mydb.paciente WHERE id_Paciente='"+jTextFieldIDPACIENTE.getText()+"' ");
                int respuesta=ps.executeUpdate();
                
                if(respuesta>0){
                    JOptionPane.showMessageDialog(null, "Paciente Eliminado");
                    limpiar();
                    mostrartabla("");
                }
                else{
                JOptionPane.showMessageDialog(null, "Selecciona fila");
                }

        } catch (SQLException e){
            System.err.print(e);
            JOptionPane.showMessageDialog(null, "Error al Eliminar Paciente");

        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTextFieldIdLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdLocalidadActionPerformed

    private void jTextFieldIdTELEFONOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdTELEFONOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdTELEFONOActionPerformed

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed

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
            java.util.logging.Logger.getLogger(EliminarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Localidad;
    private javax.swing.JTable TablaEliminarPaciente;
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton jButton1ATRAS;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonExitM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelFondoEP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextBuscar;
    private javax.swing.JTextField jTextFieldAppMa;
    private javax.swing.JTextField jTextFieldAppPA;
    private javax.swing.JTextField jTextFieldIDPACIENTE;
    private javax.swing.JTextField jTextFieldIdLocalidad;
    private javax.swing.JTextField jTextFieldIdTELEFONO;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
conector con=new conector ();
Connection cn=con.conexion();
}
