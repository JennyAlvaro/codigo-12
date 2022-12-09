
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
public class AgregarCita extends javax.swing.JFrame {

    /**
     * Creates new form AgregarCita
     */
    public AgregarCita() {
       initComponents();
        TextPrompt hini=new TextPrompt("HH:MM:SS",jTextFieldHora);
        TextPrompt hfin=new TextPrompt("YYYY-MM-DD",jTextFieldFECHA);
        
        
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

        jButton1ATRAS = new javax.swing.JButton();
        jButtonCalendario = new javax.swing.JButton();
        jButtonExitM = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaBuscarpaciente = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextBuscar = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        cantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldHora = new javax.swing.JTextField();
        Fecha = new javax.swing.JLabel();
        jTextFieldFECHA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldIDPACIENTE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldHistoriaDEUDA = new javax.swing.JTextField();
        jTextFieldHistorialABO = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldIDCita = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        GconP = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablecita = new javax.swing.JTable();
        jLabel1Fondo = new javax.swing.JLabel();

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

        jButtonCalendario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonCalendario.setForeground(new java.awt.Color(51, 51, 255));
        jButtonCalendario.setText("CALENDARIO");
        jButtonCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalendarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 140, 30));

        jButtonExitM.setText("EXIT");
        jButtonExitM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitMActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExitM, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 100, 50));

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

        jLabel3.setText("Buscar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 40, -1));

        jTextBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jTextBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 390, 30));

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 80, 30));

        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });
        getContentPane().add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 70, 30));

        jLabel1.setText("Hora");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, -1, 20));
        getContentPane().add(jTextFieldHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 220, -1));

        Fecha.setText("Fecha");
        getContentPane().add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, -1, 20));
        getContentPane().add(jTextFieldFECHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 220, -1));

        jLabel4.setText("ID Paciente");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, -1, 20));
        getContentPane().add(jTextFieldIDPACIENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 220, -1));

        jLabel5.setText("Historial de deuda");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, -1, 20));
        getContentPane().add(jTextFieldHistoriaDEUDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 220, -1));
        getContentPane().add(jTextFieldHistorialABO, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 220, -1));

        jLabel6.setText("Historial de abono");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, -1, 20));

        jLabel7.setText("ID Cita");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, -1, 20));
        getContentPane().add(jTextFieldIDCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 220, -1));

        GconP.setText("Guardar cita");
        GconP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GconPActionPerformed(evt);
            }
        });
        jPanel1.add(GconP);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 370, 210));

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
        jScrollPane2.setViewportView(jTablecita);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 530, 120));

        jLabel1Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesA/Agregar_Cita.PNG"))); // NOI18N
        getContentPane().add(jLabel1Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ATRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ATRASActionPerformed
        Agregar me= new Agregar();
        me.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ATRASActionPerformed

    private void jButtonCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalendarioActionPerformed
     // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCalendarioActionPerformed

    private void jButtonExitMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitMActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitMActionPerformed

    private void TablaBuscarpacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaBuscarpacienteMouseClicked
        int fila=this.TablaBuscarpaciente.getSelectedRow();

        this.jTextFieldIDPACIENTE.setText(this.TablaBuscarpaciente.getValueAt(fila, 0).toString());


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

    private void GconPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GconPActionPerformed

        try{

            if (jTextFieldFECHA.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Campo Fecha vacio");
            }
            ///////////////////////
            else if (jTextFieldHora.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Campo Hora vacio");
            }
            ////
            else if (jTextFieldIDPACIENTE.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Campo Apellido Paterno vacio");
            }
            
            ////////////////
            else{
                PreparedStatement ps=cn.prepareStatement("INSERT INTO mydb.citas (fecha_cita, hora) VALUES (?,?)");
                ps.setString(1, jTextFieldFECHA.getText());
                ps.setString(2, jTextFieldHora.getText());
                ps.executeUpdate();
                
                int fila=this.TablaBuscarpaciente.getSelectedRow();
                this.jTextFieldIDPACIENTE.setText(this.TablaBuscarpaciente.getValueAt(fila, 0).toString());
                
                PreparedStatement pss=cn.prepareStatement("INSERT INTO mydb.historial_citas (Citas_idCitas,Paciente_id_Paciente, Historia_bono, Historial_deuda) VALUES (?,?,?,?)");
                pss.setString(1, jTextFieldIDCita.getText());
                pss.setString(2, jTextFieldIDPACIENTE.getText());
                pss.setString(3, jTextFieldHistorialABO.getText());
                pss.setString(4, jTextFieldHistoriaDEUDA.getText());
                pss.executeUpdate();
            
            
                mostartablacita("");
                limpiar();
                JOptionPane.showMessageDialog(null, "Cita Guardado");
                
            }

        }catch (Exception e){
            System.err.print(e);
            JOptionPane.showMessageDialog(null, "Error al guardar Cita");

        }
      
    }//GEN-LAST:event_GconPActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fecha;
    private javax.swing.JButton GconP;
    private javax.swing.JTable TablaBuscarpaciente;
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton jButton1ATRAS;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCalendario;
    private javax.swing.JButton jButtonExitM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1Fondo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
