
package VentanasA;

import conector.conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class BuscarDentista extends javax.swing.JFrame {

    public BuscarDentista() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrartabla("");
        limpiar();
        
        
    }
    void limpiar(){
     jTextFieldIdHorario.setText("");
        jTextFieldHoraInicial.setText("");
        jTextFieldHoraFinal.setText("");
        jTextFieldDias.setText("");
        jTextFieldIdDentista.setText("");
        jTextFieldNombre.setText("");
        jTextFieldAppPA.setText("");
        jTextFieldAppMa.setText("");
        jTextFieldIdhorarioDENTISTA.setText("");
        
    }
    void mostrartabla(String valor){
    DefaultTableModel modelo=new DefaultTableModel();
    
    modelo.addColumn("Id Dentista");
    modelo.addColumn("Nombre ");
    modelo.addColumn("Apellido Paterno");
    modelo.addColumn("Apellido Materno");
    modelo.addColumn("Hora Inicial");
    modelo.addColumn("Hora final");
    modelo.addColumn("Dias");
    modelo.addColumn("Id Horario");
    
    TablaBuscar.setModel(modelo);
    
    String sql="select dentista.idDentista,dentista.Nombre_dentista,dentista.Apellido1_dentista,dentista.Apellido2_dentista,horarios.hora_inicio,horarios.hora_final, horarios.dias,horarios.idHorarios FROM dentista, horarios where dentista.Horarios_idHorarios = horarios.idHorarios and CONCAT (dentista.idDentista,' ',dentista.Nombre_dentista,' ',dentista.Apellido1_dentista,' ',dentista.Apellido2_dentista,' ',horarios.idHorarios,' ',horarios.hora_inicio,' ',horarios.hora_final,' ', horarios.dias) LIKE'%"+valor+"%'";
    String datos[]=new String[8];
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
        datos[7]=rs.getString(8);
       
        modelo.addRow(datos);
        }
        TablaBuscar.setModel(modelo);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaBuscar = new javax.swing.JTable();
        jTextBuscar = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldHoraFinal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldIdhorarioDENTISTA = new javax.swing.JTextField();
        jTextFieldAppMa = new javax.swing.JTextField();
        jTextFieldAppPA = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldIdDentista = new javax.swing.JTextField();
        jLabel7IdHorario = new javax.swing.JLabel();
        jTextFieldIdHorario = new javax.swing.JTextField();
        jTextFieldHoraInicial = new javax.swing.JTextField();
        jLabelHoraInicial = new javax.swing.JLabel();
        jLabelHoraFinal = new javax.swing.JLabel();
        jTextFieldDias = new javax.swing.JTextField();
        jLabelDias = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonActualizarDEn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonActualizarHo = new javax.swing.JButton();
        cantidad = new javax.swing.JTextField();
        jLabelFondoBD = new javax.swing.JLabel();

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

        TablaBuscar.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaBuscarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaBuscar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 830, 90));

        jTextBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jTextBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 410, 30));

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, -1, -1));

        jLabel3.setText("Buscar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jTextFieldHoraFinal.setText("00:00:00");
        jTextFieldHoraFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHoraFinalActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldHoraFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 280, -1));

        jLabel1.setText("ID Dentista");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 70, 20));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 60, 20));

        jLabel6.setText("Apellido Paterno");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 100, -1));

        jLabel5.setText("Apellido Materno");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 100, -1));

        jLabel9.setText("Id Horario");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 70, -1));

        jTextFieldIdhorarioDENTISTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdhorarioDENTISTAActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdhorarioDENTISTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 260, -1));
        getContentPane().add(jTextFieldAppMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 260, -1));
        getContentPane().add(jTextFieldAppPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 260, -1));
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 260, -1));
        getContentPane().add(jTextFieldIdDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 260, -1));

        jLabel7IdHorario.setText("Id Horario");
        getContentPane().add(jLabel7IdHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 90, 20));

        jTextFieldIdHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdHorarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 280, -1));

        jTextFieldHoraInicial.setText("00:00:00");
        jTextFieldHoraInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHoraInicialActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldHoraInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 280, -1));

        jLabelHoraInicial.setText("Hora inicial");
        getContentPane().add(jLabelHoraInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 90, 20));

        jLabelHoraFinal.setText("Hora Final");
        getContentPane().add(jLabelHoraFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 90, -1));
        getContentPane().add(jTextFieldDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 280, -1));

        jLabelDias.setText("Dias");
        getContentPane().add(jLabelDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 60, -1));

        jLabel4.setText("Dentista ");
        jPanel1.add(jLabel4);

        jLabel8.setText("                                ");
        jPanel1.add(jLabel8);

        jButtonActualizarDEn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonActualizarDEn.setForeground(new java.awt.Color(51, 51, 255));
        jButtonActualizarDEn.setText("Actualizar");
        jButtonActualizarDEn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarDEnActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonActualizarDEn);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 380, 230));

        jLabel11.setText("Horarios");
        jPanel2.add(jLabel11);

        jLabel7.setText("                                ");
        jPanel2.add(jLabel7);

        jButtonActualizarHo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonActualizarHo.setForeground(new java.awt.Color(51, 51, 255));
        jButtonActualizarHo.setText("Actualizar");
        jButtonActualizarHo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarHoActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonActualizarHo);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 400, 190));

        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });
        getContentPane().add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 100, 70, 30));

        jLabelFondoBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesA/Buscar_Dentista.PNG"))); // NOI18N
        getContentPane().add(jLabelFondoBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitMActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonExitMActionPerformed

    private void jButton1ATRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ATRASActionPerformed
        Buscar me= new Buscar();
        me.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ATRASActionPerformed

    private void jTextBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscarActionPerformed

    private void jTextFieldHoraFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHoraFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHoraFinalActionPerformed

    private void jButtonActualizarHoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarHoActionPerformed

        try{
            if (jTextFieldHoraInicial.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Campo hora inicial vacio");
            }
            ///////////////////////////
            else if (jTextFieldHoraFinal.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Campo hora final vacio");
            }
            ///////////////////////////////
            else if (jTextFieldDias.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Campo dias vacio");
            }
            /////////////////////////

            else{
                PreparedStatement ps=cn.prepareStatement("UPDATE mydb.horarios SET hora_inicio='"+jTextFieldHoraInicial.getText()+"',hora_final='"+jTextFieldHoraFinal.getText()+"',dias='"+jTextFieldDias.getText()+"'WHERE idHorarios='"+jTextFieldIdHorario.getText()+"'");
                                                                            
                int respuesta=ps.executeUpdate();
                
                if(respuesta>0){
                    JOptionPane.showMessageDialog(null, "Horario Actualizado");
                    limpiar();
                    mostrartabla("");
                }
                else{
                JOptionPane.showMessageDialog(null, "Selecciona fila");
                }

                
            }

        } catch (SQLException e){
            System.err.print(e);
            JOptionPane.showMessageDialog(null, "Error al actualizar Horaio");

        }

    }//GEN-LAST:event_jButtonActualizarHoActionPerformed

    private void jButtonActualizarDEnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarDEnActionPerformed

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

            else if (jTextFieldIdhorarioDENTISTA.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Campo Dentista vacio");
            }
            ////////////////
            else{
                PreparedStatement ps=cn.prepareStatement("UPDATE mydb.dentista SET Nombre_dentista = '"+jTextFieldNombre.getText()+"', Apellido1_dentista ='"+jTextFieldAppPA.getText()+"' , Apellido2_dentista ='"+jTextFieldAppMa.getText()+"'  WHERE idDentista = '"+jTextFieldIdDentista.getText()+"' and Horarios_idHorarios ='"+jTextFieldIdhorarioDENTISTA.getText()+"' ");

                                                                            
                int respuesta=ps.executeUpdate();
                
                if(respuesta>0){
                    JOptionPane.showMessageDialog(null, "Dentista Actualizado");
                    limpiar();
                    mostrartabla("");
                }
                else{
                JOptionPane.showMessageDialog(null, "Selecciona fila");
                }

                
            }

        } catch (SQLException e){
            System.err.print(e);
            JOptionPane.showMessageDialog(null, "Error al actualizar Horaio");

        }
                

    }//GEN-LAST:event_jButtonActualizarDEnActionPerformed

    private void jTextFieldIdhorarioDENTISTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdhorarioDENTISTAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdhorarioDENTISTAActionPerformed

    private void jTextFieldIdHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdHorarioActionPerformed

    private void jTextFieldHoraInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHoraInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHoraInicialActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
mostrartabla(jTextBuscar.getText());
for(int i=0; i<=TablaBuscar.getRowCount();i++)
{
    cantidad.setText(" "+i);
}

        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TablaBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaBuscarMouseClicked
    int fila=this.TablaBuscar.getSelectedRow();
    
    this.jTextFieldIdHorario.setText(this.TablaBuscar.getValueAt(fila, 7).toString());
    this.jTextFieldHoraInicial.setText(this.TablaBuscar.getValueAt(fila, 4).toString());
    this.jTextFieldHoraFinal.setText(this.TablaBuscar.getValueAt(fila, 5).toString());
    this.jTextFieldDias.setText(this.TablaBuscar.getValueAt(fila, 6).toString());
    this.jTextFieldIdDentista.setText(this.TablaBuscar.getValueAt(fila, 0).toString());
    this.jTextFieldNombre.setText(this.TablaBuscar.getValueAt(fila, 1).toString());
    this.jTextFieldAppPA.setText(this.TablaBuscar.getValueAt(fila, 2).toString());
    this.jTextFieldAppMa.setText(this.TablaBuscar.getValueAt(fila, 3).toString());
    this.jTextFieldIdhorarioDENTISTA.setText(this.TablaBuscar.getValueAt(fila, 7).toString());
         
    }//GEN-LAST:event_TablaBuscarMouseClicked

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
            java.util.logging.Logger.getLogger(BuscarDentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarDentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarDentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarDentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarDentista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaBuscar;
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton jButton1ATRAS;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonActualizarDEn;
    private javax.swing.JButton jButtonActualizarHo;
    private javax.swing.JButton jButtonExitM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel7IdHorario;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDias;
    private javax.swing.JLabel jLabelFondoBD;
    private javax.swing.JLabel jLabelHoraFinal;
    private javax.swing.JLabel jLabelHoraInicial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextBuscar;
    private javax.swing.JTextField jTextFieldAppMa;
    private javax.swing.JTextField jTextFieldAppPA;
    private javax.swing.JTextField jTextFieldDias;
    private javax.swing.JTextField jTextFieldHoraFinal;
    private javax.swing.JTextField jTextFieldHoraInicial;
    private javax.swing.JTextField jTextFieldIdDentista;
    private javax.swing.JTextField jTextFieldIdHorario;
    private javax.swing.JTextField jTextFieldIdhorarioDENTISTA;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
conector con=new conector ();
Connection cn=con.conexion();
}
