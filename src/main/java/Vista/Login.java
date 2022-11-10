package Vista;

import Modelo.MetodosUsuario;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author santiagoz
 *
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public String emailUsuario;
    private ImageIcon imagen;
    private Icon icono;

    public Login() {
        initComponents();
        this.pintarImagen(this.bg, "src/bg1.jpg");
        this.pintarImagen(this.bg2, "src/bg2.jpg");
        this.pintarImagen(this.perfil, "src/perfil.png");
        this.pintarImagen(this.emailIcon, "src/email.png");
        this.pintarImagen(this.passIcon, "src/pass.png");

        this.setLocationRelativeTo(this);
        this.setTitle("Iniciar Sesion");
    }

    MetodosUsuario metodos = new MetodosUsuario(); 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPane = new javax.swing.JPanel();
        passIcon = new javax.swing.JLabel();
        passIconbg = new javax.swing.JLabel();
        emailIcon = new javax.swing.JLabel();
        emailIconbg1 = new javax.swing.JLabel();
        passText = new javax.swing.JLabel();
        emailText = new javax.swing.JLabel();
        labelEmail = new javax.swing.JTextField();
        btnIniciarSesion = new javax.swing.JButton();
        labelPassword = new javax.swing.JPasswordField();
        label1 = new javax.swing.JLabel();
        perfil = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        bg2 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bgPane.setPreferredSize(new java.awt.Dimension(750, 660));
        bgPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bgPane.add(passIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 358, 32, 32));

        passIconbg.setBackground(new java.awt.Color(1, 69, 6));
        passIconbg.setForeground(new java.awt.Color(0, 69, 106));
        passIconbg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passIconbg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        passIconbg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        passIconbg.setOpaque(true);
        bgPane.add(passIconbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 48, 48));
        bgPane.add(emailIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 268, 32, 32));

        emailIconbg1.setBackground(new java.awt.Color(1, 69, 6));
        emailIconbg1.setForeground(new java.awt.Color(0, 69, 106));
        emailIconbg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailIconbg1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        emailIconbg1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        emailIconbg1.setOpaque(true);
        bgPane.add(emailIconbg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 48, 48));

        passText.setFont(new java.awt.Font("URW Gothic L", 0, 14)); // NOI18N
        passText.setForeground(new java.awt.Color(137, 129, 129));
        passText.setText("Password");
        bgPane.add(passText, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 80, 30));

        emailText.setFont(new java.awt.Font("URW Gothic L", 0, 14)); // NOI18N
        emailText.setForeground(new java.awt.Color(137, 129, 129));
        emailText.setText("Email ID");
        bgPane.add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 80, 30));

        labelEmail.setFont(new java.awt.Font("URW Gothic L", 0, 14)); // NOI18N
        labelEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        labelEmail.setToolTipText("");
        labelEmail.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        labelEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                labelEmailFocusLost(evt);
            }
        });
        labelEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelEmailActionPerformed(evt);
            }
        });
        labelEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                labelEmailKeyTyped(evt);
            }
        });
        bgPane.add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 260, 290, 48));

        btnIniciarSesion.setBackground(new java.awt.Color(1, 69, 6));
        btnIniciarSesion.setFont(new java.awt.Font("URW Gothic L", 1, 14)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(228, 228, 228));
        btnIniciarSesion.setText("Iniciar Sesion");
        btnIniciarSesion.setBorder(null);
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseClicked(evt);
            }
        });
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        bgPane.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 350, 48));

        labelPassword.setFont(new java.awt.Font("URW Gothic L", 0, 14)); // NOI18N
        labelPassword.setBorder(null);
        labelPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                labelPasswordKeyTyped(evt);
            }
        });
        bgPane.add(labelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 290, 48));

        label1.setFont(new java.awt.Font("URW Gothic L", 0, 14)); // NOI18N
        label1.setText("¿No tienes cuenta? Registrate");
        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label1MouseClicked(evt);
            }
        });
        bgPane.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, -1));
        bgPane.add(perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 128, 128));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        bgPane.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 350, 48));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        bgPane.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 350, 48));

        bg2.setAlignmentY(0.0F);
        bg2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(228, 228, 228), 2, true));
        bgPane.add(bg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 410, 370));
        bgPane.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        String correo, contraseña;
        correo = labelEmail.getText();
        contraseña = labelPassword.getText();
        String busquedaUsuario = metodos.buscarUsuarioRegistrado(correo, contraseña);
        
        if ((labelEmail.getText().equals("")) || (labelPassword.getText().equals(""))) {

            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            labelEmail.requestFocus();
            
            
        }else{
            if(labelEmail.getText().equals("root") && labelPassword.getText().equals("root")){
                JOptionPane.showMessageDialog(this, "Bienvenido Iniciaste como usaurio root(Administrador)");
                Home hm1 = new Home("Masculino");
                hm1.setVisible(true);
                hm1.nombrePerfil.setText("Administrador");
                this.dispose();
            }else if(busquedaUsuario.equals("Usuario encontrado")){
                String busqueda = metodos.buscarDatos(correo);
                
                
                
                String[] datos = busqueda.split("-");
                String nombrePerfil = datos[0];
                String sexoPerfil = datos[1];
                String documentoPerfil = datos[2];
                String telefonoPerfil = datos[3];
                String emailPerfil = datos[4];
                         
                
                Home hm1 = new Home(sexoPerfil);
                hm1.setVisible(true);
                hm1.nombrePerfil.setText(nombrePerfil);
                hm1.sexoPerfil.setText(sexoPerfil);
                hm1.documentoPerfil.setText("Cedula: " + documentoPerfil);
                hm1.telefonoPerfil.setText("Celular: " + telefonoPerfil);
                hm1.emailPerfil.setText(emailPerfil);
                
                this.dispose();
            }else{
                this.labelEmail.setText("");
                this.labelPassword.setText("");

                this.emailText.setVisible(true);
                this.passText.setVisible(true);
                JOptionPane.showMessageDialog(this, "Usuario no encontrado");
            }
        
        }
        
        
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseClicked

    }//GEN-LAST:event_btnIniciarSesionMouseClicked

    private void labelEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelEmailActionPerformed

    private void label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label1MouseClicked
        Registro rg1 = new Registro();
        rg1.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_label1MouseClicked

    private void labelEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_labelEmailFocusLost

    }//GEN-LAST:event_labelEmailFocusLost

    private void labelEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelEmailKeyTyped
        emailText.setVisible(false);
    }//GEN-LAST:event_labelEmailKeyTyped

    private void labelPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelPasswordKeyTyped
        passText.setVisible(false);
    }//GEN-LAST:event_labelPasswordKeyTyped

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    private void pintarImagen(JLabel lbl, String ruta) {
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
        lbl.setIcon(this.icono);
        this.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bg2;
    private javax.swing.JPanel bgPane;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel emailIcon;
    private javax.swing.JLabel emailIconbg1;
    private javax.swing.JLabel emailText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label1;
    private javax.swing.JTextField labelEmail;
    private javax.swing.JPasswordField labelPassword;
    private javax.swing.JLabel passIcon;
    private javax.swing.JLabel passIconbg;
    private javax.swing.JLabel passText;
    private javax.swing.JLabel perfil;
    // End of variables declaration//GEN-END:variables
}
