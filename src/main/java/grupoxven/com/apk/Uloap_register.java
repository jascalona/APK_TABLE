package grupoxven.com.apk;

import java.sql.*;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import db.Conexion;

/**
 *
 * @author JEscalona
 */
public class Uloap_register extends javax.swing.JFrame {

    //Instancia de Conexion
    Conexion cn =new Conexion();
    
    Connection Conn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    
    
    public Uloap_register() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Pantalla = new javax.swing.JPanel();
        btn_agg = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Uname = new javax.swing.JTextField();
        Usurname = new javax.swing.JTextField();
        UGEO = new javax.swing.JTextField();
        Uphone = new javax.swing.JTextField();
        Uextension = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_volver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Footer = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pantalla.setBackground(new java.awt.Color(51, 51, 51));

        btn_agg.setBackground(new java.awt.Color(0, 0, 51));
        btn_agg.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_agg.setForeground(new java.awt.Color(204, 204, 204));
        btn_agg.setText("Add");
        btn_agg.setBorder(null);
        btn_agg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aggActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        Uname.setBackground(new java.awt.Color(153, 153, 153));
        Uname.setForeground(new java.awt.Color(51, 51, 51));
        Uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnameActionPerformed(evt);
            }
        });

        Usurname.setBackground(new java.awt.Color(153, 153, 153));
        Usurname.setForeground(new java.awt.Color(51, 51, 51));
        Usurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsurnameActionPerformed(evt);
            }
        });

        UGEO.setBackground(new java.awt.Color(153, 153, 153));
        UGEO.setForeground(new java.awt.Color(51, 51, 51));
        UGEO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UGEOActionPerformed(evt);
            }
        });

        Uphone.setBackground(new java.awt.Color(153, 153, 153));
        Uphone.setForeground(new java.awt.Color(51, 51, 51));
        Uphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UphoneActionPerformed(evt);
            }
        });

        Uextension.setBackground(new java.awt.Color(153, 153, 153));
        Uextension.setForeground(new java.awt.Color(51, 51, 51));
        Uextension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UextensionActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Ingrese su Apellido");

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Ingrese su Nombre");

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Ingrese el Telefono");

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Ingrese  Localidad");

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Ingrese Extension");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(UGEO, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addComponent(Usurname, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addComponent(Uname, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Uphone, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addComponent(Uextension, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Uname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Usurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UGEO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Uphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Uextension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        btn_volver.setBackground(new java.awt.Color(0, 0, 51));
        btn_volver.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_volver.setForeground(new java.awt.Color(204, 204, 204));
        btn_volver.setIcon(new javax.swing.ImageIcon("C:\\Users\\JEscalona\\Documents\\NetBeansProjects\\APK\\src\\main\\java\\images\\volver.png")); // NOI18N
        btn_volver.setBorder(null);
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Add New Register");

        Footer.setBackground(new java.awt.Color(204, 204, 204));
        Footer.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        Footer.setForeground(new java.awt.Color(204, 204, 204));
        Footer.setText("PhoneBook © Todos los derechos reservados. XDV | Designed by JE  ");

        javax.swing.GroupLayout PantallaLayout = new javax.swing.GroupLayout(Pantalla);
        Pantalla.setLayout(PantallaLayout);
        PantallaLayout.setHorizontalGroup(
            PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Footer)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PantallaLayout.createSequentialGroup()
                        .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
            .addGroup(PantallaLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(btn_agg, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PantallaLayout.setVerticalGroup(
            PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaLayout.createSequentialGroup()
                .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PantallaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallaLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_agg, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Footer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel1.add(Pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 370, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\JEscalona\\Documents\\NetBeansProjects\\APK\\src\\main\\java\\images\\table.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aggActionPerformed
        // btn_agregar_registro
        AgregarU();
        
    }//GEN-LAST:event_btn_aggActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        // btn_vover
        Interface_II InterII =new Interface_II();
        InterII.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_volverActionPerformed

    private void UnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UnameActionPerformed

    private void UsurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsurnameActionPerformed

    private void UGEOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UGEOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UGEOActionPerformed

    private void UphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UphoneActionPerformed

    private void UextensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UextensionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UextensionActionPerformed

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
            java.util.logging.Logger.getLogger(Uloap_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Uloap_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Uloap_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Uloap_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Uloap_register().setVisible(true);
            }
        });
    }
    
    
    //Metodo de Carga
    void AgregarU(){
        String name = Uname.getText();
        String surname = Usurname.getText();
        String GEO = UGEO.getText();
        String phone = Uphone.getText();
        String extension = Uextension.getText();
    
        try {
            if (name.equals("") || surname.equals("") || GEO.equals("") || phone.equals("") || extension.equals("") ){
                JOptionPane.showMessageDialog(null, "Asegurese de llenar todos los campos");
                //Limpiar Tabla
            } else{
                
                String sql = " INSERT INTO p_list_phone (name,surname,GEO,phone,extension) VALUES ('"+name+"', '"+surname+"', '"+GEO+"', '"+phone+"', '"+extension+"') ";
                Conn = cn.conectar();
                st = Conn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Su registro fue cargado con Exito!");
                //volver a Interface_III
                Interface_III InterIII =new Interface_III();
                InterIII.setVisible(true);
                this.setVisible(false);
            }
            
        } catch (Exception e) {
        
        }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Footer;
    private javax.swing.JPanel Pantalla;
    private javax.swing.JTextField UGEO;
    private javax.swing.JTextField Uextension;
    private javax.swing.JTextField Uname;
    private javax.swing.JTextField Uphone;
    private javax.swing.JTextField Usurname;
    private javax.swing.JButton btn_agg;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
