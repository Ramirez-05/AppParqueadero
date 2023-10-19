package Main;

import com.google.gson.Gson;
import Alerts.AlertDatosErroneos;
import Alerts.GeneratingAlert;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Login extends javax.swing.JFrame {

    private ConsumoApi consumo;
    private Gson gson;
    public MainVendedor main;
    public Login() {
        this.main = main;
        consumo = new ConsumoApi();
        gson = new Gson();
        initComponents();
        initComponentsAltern();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etq_img = new javax.swing.JLabel();
        etq_correo = new javax.swing.JLabel();
        campo_correo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_ingresar = new javax.swing.JButton();
        campo_contrasena = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(15, 11, 25));

        etq_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/login-icon.png"))); // NOI18N

        etq_correo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_correo.setForeground(new java.awt.Color(255, 255, 255));
        etq_correo.setText("Correo");

        campo_correo.setBackground(new java.awt.Color(255, 255, 255));
        campo_correo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        campo_correo.setForeground(new java.awt.Color(0, 0, 0));
        campo_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_correoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contraseña");

        btn_ingresar.setBackground(new java.awt.Color(123, 47, 152));
        btn_ingresar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_ingresar.setText("INGRESAR");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        campo_contrasena.setBackground(new java.awt.Color(255, 255, 255));
        campo_contrasena.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INICIAR SESION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(etq_correo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_ingresar)
                    .addComponent(campo_contrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(campo_correo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(etq_img, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_img, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_correo)
                    .addComponent(campo_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campo_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btn_ingresar)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void initComponentsAltern(){
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        
        int width = 200;
        int height = 200;

        try {
            // Cargar la imagen desde el archivo en el directorio de recursos
            BufferedImage originalImage = ImageIO.read(getClass().getResource("/Img/logo.jpeg"));

            // Redimensionar la imagen al tamaño deseado
            Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);

            // Crear un ImageIcon a partir de la imagen redimensionada
            ImageIcon imageIcon = new ImageIcon(resizedImage);

            // Asignar el ImageIcon al JLabel
            etq_img.setIcon(imageIcon);
        } catch (IOException e) {
            // Manejo de errores en caso de que la imagen no se pueda cargar
            e.printStackTrace();
        }
        
    }
    private void campo_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_correoActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        
        Parqueadero park = new Parqueadero(main);
        String correo = campo_correo.getText();
        String contrasena = campo_contrasena.getText();

        if (!correo.isEmpty() && !contrasena.isEmpty()) {
            Map<String, String> postData = new HashMap<>();
            postData.put("correo", correo);
            postData.put("contrasena", contrasena);

            String iniciarSesion = consumo.consumoPOST("http://localhost/APIenPHP/API-login/acceso.php", postData);
            System.out.println(iniciarSesion);

            if (iniciarSesion != null) {
                JsonObject jsonTemp = gson.fromJson(iniciarSesion, JsonObject.class);
                boolean success = jsonTemp.get("success").getAsBoolean();

                if (success) {
                    // Verificar si el usuario existe
                    if (jsonTemp.get("user") != null && jsonTemp.get("user").isJsonObject()) {
                        JsonObject usuario = jsonTemp.getAsJsonObject("user");

                        int idUsuario = usuario.get("id").getAsInt();
                        String url = "http://localhost/APIenPHP/API-Ticket/obtenerParqueadero.php?id_usuario=" + idUsuario;
                        String respuestaParqueaderos = consumo.consumoGET(url);

                        if (respuestaParqueaderos != null) {
                            JsonObject jsonTemp2 = gson.fromJson(respuestaParqueaderos, JsonObject.class);
                            boolean success2 = jsonTemp2.get("success").getAsBoolean();

                            if (success2) {
                                JsonArray parqueaderos = jsonTemp2.getAsJsonArray("parqueaderos");

                                for (JsonElement parqueadero : parqueaderos) {
                                    JsonObject parq = parqueadero.getAsJsonObject();
                                    String nit = parq.get("nit").getAsString();
                                    String nombre = parq.get("nombre").getAsString();
                                    String direccion = parq.get("direccion").getAsString();
                                    String telefono = parq.get("telefono").getAsString();
                                    String user = usuario.get("email").getAsString();                                    

                                    park.mostrarDatosParqueadero(nit, nombre, direccion, telefono, user);                                    
                                }
                            } else {
                                System.out.println("Error al obtener los parqueaderos.");
                            }
                        } else {
                            System.out.println("Error al consumir la API de parqueaderos.");
                        }

                        String tipoUser = usuario.get("tipo").getAsString();
                        System.out.println("Tipo: " + tipoUser);
                        String ven = "VENDEDOR";
                        String adm = "ADMIN";
                        if (tipoUser.equalsIgnoreCase(ven)) {
                            new MainVendedor().setVisible(true);
                            dispose();
                        } else if(tipoUser.equalsIgnoreCase(adm)){
                            new Main().setVisible(true);
                            dispose();
                        }
                    } else {
                        System.out.println("El usuario no existe en la base de datos.");
                        AlertDatosErroneos alert = new AlertDatosErroneos();
                        alert.setVisible(true);
                        alert.setLocationRelativeTo(null);
                        campo_correo.setText("");
                        campo_contrasena.setText("");
                    }
                } else {
                    System.out.println("Error en el inicio de sesión: " );                          
                }
            } else {
                System.out.println("Error al consumir la API.");
            }
        } else {
            GeneratingAlert alert = new GeneratingAlert("ERROR","DATOS INCOMPLETOS");
            alert.setVisible(true);
        }                                                                                                                                                                                              
    }//GEN-LAST:event_btn_ingresarActionPerformed
    
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JPasswordField campo_contrasena;
    private javax.swing.JTextField campo_correo;
    private javax.swing.JLabel etq_correo;
    private javax.swing.JLabel etq_img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
