package cliente_crud;
import java.sql.*;
import java.sql.Statement;
import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class frmPanelClientes extends javax.swing.JFrame {
    
    conexionMysql con = new conexionMysql();
    Connection cn = con.conectar();
    public frmPanelClientes() {
        initComponents();
        mostrarDatos();
        btnRegistrar.setEnabled(true);
        btnActuali.setEnabled(false);
        btnBorrar.setEnabled(false);
    }
    private void mostrarDatos(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id");
        modelo.addColumn("Nombre y apellido");
        modelo.addColumn("Direccion");
        modelo.addColumn("Gmail");
        modelo.addColumn("Telefono");
        modelo.addColumn("Estado Civil");
        JTdatos.setModel(modelo);
        String consultasql = "select*from clientes";
        String data[] = new String[6];
        
        Statement st; //crear una variable de tipo Statement, viene del driver de connection
        
        try{
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(consultasql);
            while(rs.next()){
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                data[3] = rs.getString(4);
                data[4] = rs.getString(5);
                data[5] = rs.getString(6);
                modelo.addRow(data);
            }
        }catch(SQLException e){
            System.out.println("Error al mostrar Datos " + e);
        }
        
    }
    private void cleanEntradas() {
        JTFid.setText("");
        JTFnombre.setText("");
        JTFdireccion.setText("");
        JTFgmail.setText("");
        JTFtelefono.setText("");
        JCestadoC.setSelectedIndex(0);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JTFid = new javax.swing.JTextField();
        JTFgmail = new javax.swing.JTextField();
        JTFnombre = new javax.swing.JTextField();
        JTFtelefono = new javax.swing.JTextField();
        JTFdireccion = new javax.swing.JTextField();
        JCestadoC = new javax.swing.JComboBox<>();
        btnActuali = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTdatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel de control");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CRUD CLIENTES");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        JTFid.setBorder(javax.swing.BorderFactory.createTitledBorder("id"));
        JTFid.setEnabled(false);
        JTFid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFidActionPerformed(evt);
            }
        });

        JTFgmail.setBorder(javax.swing.BorderFactory.createTitledBorder("Gmail"));
        JTFgmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFgmailActionPerformed(evt);
            }
        });

        JTFnombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre y apellido"));
        JTFnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFnombreActionPerformed(evt);
            }
        });

        JTFtelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefono"));
        JTFtelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFtelefonoActionPerformed(evt);
            }
        });

        JTFdireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Direccion"));
        JTFdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFdireccionActionPerformed(evt);
            }
        });

        JCestadoC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Soltero", "Casado", "Divorciado" }));
        JCestadoC.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado Civil"));

        btnActuali.setText("Actualizar");
        btnActuali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualiActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Eliminar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFgmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(JTFid, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFnombre))
                    .addComponent(JTFdireccion)
                    .addComponent(JTFtelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(JCestadoC, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActuali, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFid, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(JTFdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JTFgmail, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JTFtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JCestadoC, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActuali)
                    .addComponent(btnRegistrar)
                    .addComponent(btnBorrar))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Listado de clientes");

        JTdatos.setModel(new javax.swing.table.DefaultTableModel(
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
        JTdatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTdatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTdatos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(521, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(483, 483, 483))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTFidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFidActionPerformed

    private void JTFgmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFgmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFgmailActionPerformed

    private void JTFnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFnombreActionPerformed

    private void JTFtelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFtelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFtelefonoActionPerformed

    private void JTFdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFdireccionActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
       try{
           PreparedStatement ps = cn.prepareStatement("INSERT INTO clientes (nombre_apellido,direccion,gmail,telefono,estado_civil) VALUES (?,?,?,?,?)");
           ps.setString(1, JTFnombre.getText());
           ps.setString(2, JTFdireccion.getText());
           ps.setString(3, JTFgmail.getText());
           ps.setString(4, JTFtelefono.getText());
           ps.setString(5, JCestadoC.getSelectedItem().toString());
           ps.executeUpdate();
           JOptionPane.showMessageDialog(rootPane, "DATOS GUARDADOS CORRECTAMENTE");
           mostrarDatos();
           cleanEntradas();
       }catch(SQLException e){
           System.out.println("ERRO AL REGISTRAR CLIENTE " + e);
       } 
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void JTdatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTdatosMouseClicked
        btnRegistrar.setEnabled(false);
        btnActuali.setEnabled(true);
        btnBorrar.setEnabled(true);
        int fila = this.JTdatos.getSelectedRow();
        this.JTFid.setText(this.JTdatos.getValueAt(fila, 0).toString());
        this.JTFnombre.setText(this.JTdatos.getValueAt(fila, 1).toString());
        this.JTFdireccion.setText(this.JTdatos.getValueAt(fila, 2).toString());
        this.JTFgmail.setText(this.JTdatos.getValueAt(fila, 3).toString());
        this.JTFtelefono.setText(this.JTdatos.getValueAt(fila, 4).toString());
        this.JCestadoC.setSelectedItem(this.JTdatos.getValueAt(fila, 5).toString());
    }//GEN-LAST:event_JTdatosMouseClicked

    private void btnActualiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualiActionPerformed
        try{
            PreparedStatement ps =cn.prepareStatement("Update clientes set nombre_apellido='" + JTFnombre.getText() + "',direccion='"+ JTFdireccion.getText() + 
                    "',gmail='"+JTFgmail.getText() + "',telefono='" + JTFtelefono.getText()+"',estado_civil='" + JCestadoC.getSelectedItem() + "' where id='" + JTFid.getText()+"'");
            int indice = ps.executeUpdate();
            
            if(indice>0){
                JOptionPane.showMessageDialog(rootPane, "DATOS ACTUALIZADOS CORRECTAMENTE");
                mostrarDatos();
                cleanEntradas();
            }else{
                JOptionPane.showMessageDialog(null, "No selecciono una fila");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR DATOS " + e);
        }
    }//GEN-LAST:event_btnActualiActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        btnRegistrar.setEnabled(true);
        btnActuali.setEnabled(false);
        btnBorrar.setEnabled(false);
        cleanEntradas();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        btnRegistrar.setEnabled(true);
        btnActuali.setEnabled(false);
        btnBorrar.setEnabled(false);
        cleanEntradas();
    }//GEN-LAST:event_jPanel2MouseClicked

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        btnRegistrar.setEnabled(false);
        btnActuali.setEnabled(true);
        btnBorrar.setEnabled(true);
        if(JOptionPane.showConfirmDialog(null, "ESTA SEGURO DE ELIMINAR CLIENTE", "SALIR", JOptionPane.YES_NO_CANCEL_OPTION)==0);
        try{
            PreparedStatement ps = cn.prepareStatement("DELETE FROM clientes where id='"+JTFid.getText()+"'");
            int indice = ps.executeUpdate();
            if(indice > 0) {
            mostrarDatos();
            cleanEntradas();
            }else{
                System.out.println("No ha seleccionado fila");
            }
        } catch(SQLException e){
            System.out.println("ERROR AL ELIMINAR DATOS " + e);
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(frmPanelClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPanelClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPanelClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPanelClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPanelClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCestadoC;
    private javax.swing.JTextField JTFdireccion;
    private javax.swing.JTextField JTFgmail;
    private javax.swing.JTextField JTFid;
    private javax.swing.JTextField JTFnombre;
    private javax.swing.JTextField JTFtelefono;
    private javax.swing.JTable JTdatos;
    private javax.swing.JButton btnActuali;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
}
