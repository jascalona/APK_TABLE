package grupoxven.com.apk;

/**
 *
 * @author JEscalona
 */
public class Interface_II extends javax.swing.JFrame {

    /**
     * Creates new form Interface_I
     */
    public Interface_II() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Pantalla = new javax.swing.JPanel();
        btn_edit = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        btn_log_out = new javax.swing.JButton();
        btn_drop = new javax.swing.JButton();
        btn_agg = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_reset = new javax.swing.JButton();
        btn_cog = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        Footer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\JEscalona\\Documents\\NetBeansProjects\\APK\\src\\main\\java\\images\\table.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 610));

        Pantalla.setBackground(new java.awt.Color(51, 51, 51));

        btn_edit.setBackground(new java.awt.Color(0, 0, 51));
        btn_edit.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(204, 204, 204));
        btn_edit.setIcon(new javax.swing.ImageIcon("C:\\Users\\JEscalona\\Documents\\NetBeansProjects\\APK\\src\\main\\java\\images\\edit.png")); // NOI18N
        btn_edit.setBorder(null);
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        btn_log_out.setBackground(new java.awt.Color(0, 0, 51));
        btn_log_out.setIcon(new javax.swing.ImageIcon("C:\\Users\\JEscalona\\Documents\\NetBeansProjects\\APK\\src\\main\\java\\images\\log-out.png")); // NOI18N
        btn_log_out.setBorder(null);
        btn_log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_log_outActionPerformed(evt);
            }
        });

        btn_drop.setBackground(new java.awt.Color(0, 0, 51));
        btn_drop.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_drop.setForeground(new java.awt.Color(204, 204, 204));
        btn_drop.setIcon(new javax.swing.ImageIcon("C:\\Users\\JEscalona\\Documents\\NetBeansProjects\\APK\\src\\main\\java\\images\\trash.png")); // NOI18N
        btn_drop.setBorder(null);
        btn_drop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dropActionPerformed(evt);
            }
        });

        btn_agg.setBackground(new java.awt.Color(0, 0, 51));
        btn_agg.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_agg.setForeground(new java.awt.Color(204, 204, 204));
        btn_agg.setIcon(new javax.swing.ImageIcon("C:\\Users\\JEscalona\\Documents\\NetBeansProjects\\APK\\src\\main\\java\\images\\Agguser.png")); // NOI18N
        btn_agg.setBorder(null);
        btn_agg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aggActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        btn_reset.setBackground(new java.awt.Color(0, 0, 51));
        btn_reset.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_reset.setForeground(new java.awt.Color(204, 204, 204));
        btn_reset.setIcon(new javax.swing.ImageIcon("C:\\Users\\JEscalona\\Documents\\NetBeansProjects\\APK\\src\\main\\java\\images\\reset.png")); // NOI18N
        btn_reset.setBorder(null);
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_cog.setBackground(new java.awt.Color(0, 0, 51));
        btn_cog.setIcon(new javax.swing.ImageIcon("C:\\Users\\JEscalona\\Documents\\NetBeansProjects\\APK\\src\\main\\java\\images\\cog.png")); // NOI18N
        btn_cog.setBorder(null);
        btn_cog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cogActionPerformed(evt);
            }
        });

        Title.setBackground(new java.awt.Color(204, 204, 204));
        Title.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(204, 204, 204));
        Title.setText("Administrator Views");

        Footer.setBackground(new java.awt.Color(204, 204, 204));
        Footer.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        Footer.setForeground(new java.awt.Color(204, 204, 204));
        Footer.setText("PhoneBook © Todos los derechos reservados. XDV | Designed by JE  ");

        javax.swing.GroupLayout PantallaLayout = new javax.swing.GroupLayout(Pantalla);
        Pantalla.setLayout(PantallaLayout);
        PantallaLayout.setHorizontalGroup(
            PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PantallaLayout.createSequentialGroup()
                        .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PantallaLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))
                    .addGroup(PantallaLayout.createSequentialGroup()
                        .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_log_out, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cog, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PantallaLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PantallaLayout.createSequentialGroup()
                                .addComponent(btn_agg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_drop, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33))))
            .addGroup(PantallaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Footer)
                .addGap(23, 23, 23))
        );
        PantallaLayout.setVerticalGroup(
            PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PantallaLayout.createSequentialGroup()
                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_drop, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_agg, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PantallaLayout.createSequentialGroup()
                        .addComponent(btn_log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cog, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Footer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanel1.add(Pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 370, 480));

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

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // btn_ingresar
        
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_log_outActionPerformed
        // btn_volver
        Login Lg =new Login();
        Lg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_log_outActionPerformed

    private void btn_dropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dropActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dropActionPerformed

    private void btn_aggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aggActionPerformed
        // btn_agg
        Uloap Up =new Uloap();
        Up.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_aggActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_cogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cogActionPerformed
        // btn_setting_su
        Interface_III InterIII =new Interface_III();
        InterIII.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_cogActionPerformed

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
            java.util.logging.Logger.getLogger(Interface_II.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_II.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_II.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_II.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_II().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Footer;
    private javax.swing.JPanel Pantalla;
    private javax.swing.JLabel Title;
    private javax.swing.JButton btn_agg;
    private javax.swing.JButton btn_cog;
    private javax.swing.JButton btn_drop;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_log_out;
    private javax.swing.JButton btn_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
