
package Vista;

/**
 *
 * @author santiagoz
 */
import Modelo.MetodosUsuario;
import java.awt.Image;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class Registro extends javax.swing.JFrame {
    private ImageIcon imagen;
    private Icon icono;
    Connection con  = null;
    Statement stmt = null;
    
    public Registro() {
        initComponents();
        this.setTitle("Registro ");
        this.pintarImagen(this.bg, "src/bg1.jpg");
        this.pintarImagen(this.bg2, "src/bg2.jpg");
    }

    MetodosUsuario metodos = new MetodosUsuario();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        documentLabel = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        sexLabel = new javax.swing.JLabel();
        cmb_sex = new javax.swing.JComboBox<>();
        phoneLabel = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        interfazIniciar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bg2 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(750, 660));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLabel.setFont(new java.awt.Font("URW Gothic L", 0, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(137, 129, 129));
        nameLabel.setText("Nombre");
        jPanel1.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 130, 40));

        txt_name.setFont(new java.awt.Font("URW Gothic L", 0, 14)); // NOI18N
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        txt_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nameKeyTyped(evt);
            }
        });
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 168, 40));

        documentLabel.setFont(new java.awt.Font("URW Gothic L", 0, 14)); // NOI18N
        documentLabel.setForeground(new java.awt.Color(137, 129, 129));
        documentLabel.setText("Documento");
        jPanel1.add(documentLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 130, 40));

        txt_id.setFont(new java.awt.Font("URW Gothic L", 0, 14)); // NOI18N
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        txt_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idKeyTyped(evt);
            }
        });
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 168, 40));

        sexLabel.setFont(new java.awt.Font("URW Gothic L", 0, 14)); // NOI18N
        sexLabel.setForeground(new java.awt.Color(137, 129, 129));
        sexLabel.setText("Sexo");
        jPanel1.add(sexLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 130, 40));

        cmb_sex.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sex.setFont(new java.awt.Font("URW Gothic L", 0, 14)); // NOI18N
        cmb_sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Masculino", "Femenino" }));
        cmb_sex.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_sexItemStateChanged(evt);
            }
        });
        cmb_sex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sexActionPerformed(evt);
            }
        });
        jPanel1.add(cmb_sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 270, 160, 40));

        phoneLabel.setFont(new java.awt.Font("URW Gothic L", 0, 14)); // NOI18N
        phoneLabel.setForeground(new java.awt.Color(137, 129, 129));
        phoneLabel.setText("Celular");
        jPanel1.add(phoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 100, 40));

        txt_phone.setFont(new java.awt.Font("URW Gothic L", 0, 14)); // NOI18N
        txt_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phoneActionPerformed(evt);
            }
        });
        txt_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_phoneKeyTyped(evt);
            }
        });
        jPanel1.add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 168, 40));

        passLabel.setFont(new java.awt.Font("URW Gothic L", 0, 14)); // NOI18N
        passLabel.setForeground(new java.awt.Color(137, 129, 129));
        passLabel.setText("Password");
        jPanel1.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 100, 40));

        txt_password.setFont(new java.awt.Font("URW Gothic L", 0, 14)); // NOI18N
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_passwordKeyTyped(evt);
            }
        });
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 168, 40));

        emailLabel.setFont(new java.awt.Font("URW Gothic L", 0, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(137, 129, 129));
        emailLabel.setText("Email");
        jPanel1.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 130, 40));

        txt_email.setFont(new java.awt.Font("URW Gothic L", 0, 14)); // NOI18N
        txt_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_emailKeyTyped(evt);
            }
        });
        jPanel1.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 168, 40));

        btnGuardar.setBackground(new java.awt.Color(1, 69, 6));
        btnGuardar.setFont(new java.awt.Font("URW Gothic L", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Registrarse");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 360, 40));

        interfazIniciar.setFont(new java.awt.Font("URW Gothic L", 0, 14)); // NOI18N
        interfazIniciar.setText("¿Ya tienes cuenta? iniciar sesión");
        interfazIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        interfazIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                interfazIniciarMouseClicked(evt);
            }
        });
        jPanel1.add(interfazIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        jLabel1.setBackground(new java.awt.Color(1, 69, 6));
        jLabel1.setFont(new java.awt.Font("URW Gothic L", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 69, 6));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de registro");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 160, 540, 30));
        jPanel1.add(bg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 550, 390));
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nameKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c > 'z') && (c<'A' || c > 'Z') && (c < ' ' || c > ' ')) evt.consume();
        nameLabel.setVisible(false);
    }//GEN-LAST:event_txt_nameKeyTyped

    private void txt_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c > '9') evt.consume();
        phoneLabel.setVisible(false);
    }//GEN-LAST:event_txt_phoneKeyTyped

    private void txt_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c > '9') evt.consume();
        documentLabel.setVisible(false);
    }//GEN-LAST:event_txt_idKeyTyped

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void interfazIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_interfazIniciarMouseClicked
        // TODO add your handling code here:
        Login interfazIniciar= new Login();
        interfazIniciar.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_interfazIniciarMouseClicked

    private void txt_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phoneActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void txt_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyTyped
        // TODO add your handling code here:
        emailLabel.setVisible(false);
    }//GEN-LAST:event_txt_emailKeyTyped

    private void txt_passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyTyped
        // TODO add your handling code here:
        passLabel.setVisible(false);
    }//GEN-LAST:event_txt_passwordKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombre,documento,sexo,email,telefono,contraseña;

        nombre = txt_name.getText();
        documento = txt_id.getText();
        sexo = cmb_sex.getSelectedItem().toString();
        email = txt_email.getText();
        telefono = txt_phone.getText();
        contraseña = txt_password.getText();

        if (txt_name.getText().equals("") || (txt_id.getText().equals("")) || (cmb_sex.getSelectedItem().toString().equals(" ")) || (txt_email.getText().equals(""))
            || (txt_phone.getText().equals("")) || (txt_password.getText().equals(""))) {

            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txt_name.requestFocus();
        }
        else {
            int i = metodos.guardar(nombre, sexo, documento, telefono, email, contraseña);
            if (i>0){
                javax.swing.JOptionPane.showMessageDialog(this,"Registro exitoso! \n Ya puedes iniciar sesion","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                
            }else{
                javax.swing.JOptionPane.showMessageDialog(this,"No se pudo guardar! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
            this.txt_name.setText("");
            this.txt_id.setText("");
            this.txt_phone.setText("");
            this.cmb_sex.setSelectedIndex(0);
            this.txt_email.setText("");
            this.txt_password.setText("");
            this.nameLabel.setVisible(true);
            this.sexLabel.setVisible(true);
            this.documentLabel.setVisible(true);
            this.phoneLabel.setVisible(true);
            this.emailLabel.setVisible(true);
            this.passLabel.setVisible(true);
            
        }
        

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmb_sexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_sexActionPerformed

    private void cmb_sexItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_sexItemStateChanged
        sexLabel.setVisible(false);
    }//GEN-LAST:event_cmb_sexItemStateChanged

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }
    private void pintarImagen(JLabel lbl, String ruta){
        this.imagen  = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
        lbl.setIcon(this.icono);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bg2;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmb_sex;
    private javax.swing.JLabel documentLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel interfazIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel sexLabel;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_phone;
    // End of variables declaration//GEN-END:variables
}
