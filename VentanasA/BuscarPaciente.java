
package VentanasA;
import conector.conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class BuscarPaciente extends javax.swing.JFrame {

 
    public BuscarPaciente() {
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
    modelo.addColumn("Tratamiento");
    
    
    TablaBuscarpaciente.setModel(modelo);
    
    String sql="SELECT * FROM mydb.paciente where CONCAT (id_Paciente,' ',Nombre_paciente,' ',Apellido1_paciente,' ',Apellido2_paciente,' ',Telefono,' ',localidad,' ',tratamiento) LIKE'%"+valor+"%'";
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
        TablaBuscarpaciente.setModel(modelo);
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
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaBuscarpaciente = new javax.swing.JTable();
        jTextBuscar = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        cantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldIDPACIENTE = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Localidad = new javax.swing.JLabel();
        jTextFieldIdTratamiento = new javax.swing.JTextField();
        jTextFieldIdLocalidad = new javax.swing.JTextField();
        jTextFieldIdTELEFONO = new javax.swing.JTextField();
        jTextFieldAppMa = new javax.swing.JTextField();
        jTextFieldAppPA = new javax.swing.JTextField();
        Localidad1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonActualizar = new javax.swing.JButton();
        jLabelFondoBP = new javax.swing.JLabel();

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
        getContentPane().add(jButton1ATRAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 100, 40));

        jLabel3.setText("Buscar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 50, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 550, 220));

        jTextBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jTextBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 430, 30));

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 80, 30));

        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });
        getContentPane().add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 90, 30));

        jLabel1.setText("ID Paciente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, 20));
        getContentPane().add(jTextFieldIDPACIENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 240, -1));
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 240, -1));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, -1, 20));

        jLabel6.setText("Apellido Paterno");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, -1, -1));

        jLabel5.setText("Apellido Materno");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, -1, -1));

        jLabel7.setText("Telefono");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, -1, -1));

        Localidad.setText("Tratamiento");
        getContentPane().add(Localidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, -1, -1));

        jTextFieldIdTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdTratamientoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, 240, -1));

        jTextFieldIdLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdLocalidadActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 240, -1));

        jTextFieldIdTELEFONO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdTELEFONOActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdTELEFONO, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 240, -1));
        getContentPane().add(jTextFieldAppMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 240, -1));
        getContentPane().add(jTextFieldAppPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 240, -1));

        Localidad1.setText("Localidad");
        getContentPane().add(Localidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, -1, -1));

        jLabel4.setText("Dentista ");
        jPanel1.add(jLabel4);

        jLabel8.setText("                                ");
        jPanel1.add(jLabel8);

        jButtonActualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonActualizar.setForeground(new java.awt.Color(51, 51, 255));
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonActualizar);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 350, 330));

        jLabelFondoBP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesA/Buscar_Paciente.PNG"))); // NOI18N
        getContentPane().add(jLabelFondoBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitMActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jButtonExitMActionPerformed

    private void jButton1ATRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ATRASActionPerformed
        Buscar me= new Buscar();
        me.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ATRASActionPerformed

    private void TablaBuscarpacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaBuscarpacienteMouseClicked
        int fila=this.TablaBuscarpaciente.getSelectedRow();
        
    this.jTextFieldIDPACIENTE.setText(this.TablaBuscarpaciente.getValueAt(fila, 0).toString());
    this.jTextFieldNombre.setText(this.TablaBuscarpaciente.getValueAt(fila, 1).toString());
    this.jTextFieldAppPA.setText(this.TablaBuscarpaciente.getValueAt(fila, 2).toString());
    this.jTextFieldAppMa.setText(this.TablaBuscarpaciente.getValueAt(fila, 3).toString());
    this.jTextFieldIdTELEFONO.setText(this.TablaBuscarpaciente.getValueAt(fila, 4).toString());
    this.jTextFieldIdLocalidad.setText(this.TablaBuscarpaciente.getValueAt(fila, 5).toString());
    this.jTextFieldIdTratamiento.setText(this.TablaBuscarpaciente.getValueAt(fila, 6).toString());
   

    }//GEN-LAST:event_TablaBuscarpacienteMouseClicked

    private void jTextBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mostrartabla(jTextBuscar.getText());
        for(int i=0; i<=TablaBuscarpaciente.getRowCount();i++)
        {
            cantidad.setText(" "+i);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed

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
            else{
                PreparedStatement ps=cn.prepareStatement("UPDATE mydb.paciente SET Nombre_paciente ='"+jTextFieldNombre.getText()+"' , Apellido1_paciente = '"+jTextFieldAppPA.getText()+"' , Apellido2_paciente ='"+jTextFieldAppMa.getText()+"', Telefono ='"+jTextFieldIdTELEFONO.getText()+"', localidad ='"+jTextFieldIdLocalidad.getText()+"',tratamiento ='"+jTextFieldIdTratamiento.getText()+"' WHERE id_Paciente ='"+jTextFieldIDPACIENTE.getText()+"' ");

                int respuesta=ps.executeUpdate();
                
                if(respuesta>0){
                    JOptionPane.showMessageDialog(null, "Paciente Actualizado");
                    limpiar();
                    mostrartabla("");
                }
                else{
                JOptionPane.showMessageDialog(null, "Selecciona fila");
                }

                
            }

        } catch (SQLException e){
            System.err.print(e);
            JOptionPane.showMessageDialog(null, "Error al actualizar Paciente");

        }
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jTextFieldIdLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdLocalidadActionPerformed

    private void jTextFieldIdTELEFONOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdTELEFONOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdTELEFONOActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarPaciente().setVisible(true);
            }
        });
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Localidad;
    private javax.swing.JLabel Localidad1;
    private javax.swing.JTable TablaBuscarpaciente;
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton jButton1ATRAS;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonExitM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelFondoBP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextBuscar;
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
