package Main;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;

public class Login extends javax.swing.JFrame {

    private ConsumoApi consumo;
    private Gson gson;
    public Login() {
        consumo = new ConsumoApi();
        gson = new Gson();
        initComponents();
        initComponentsAltern();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etq_img = new javax.swing.JLabel();
        etq_correo = new javax.swing.JLabel();
        campo_correo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_ingresar = new javax.swing.JButton();
        campo_contrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etq_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/login-icon.png"))); // NOI18N

        etq_correo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etq_correo.setText("Correo");

        campo_correo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campo_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_correoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Contraseña");

        btn_ingresar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_correo)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_ingresar)
                    .addComponent(campo_correo, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(campo_contrasena))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(etq_img, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(etq_img, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_correo)
                    .addComponent(campo_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campo_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btn_ingresar)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void initComponentsAltern(){
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    private void campo_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_correoActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        String correo = campo_correo.getText();
        String contrasena = campo_contrasena.getText();

        Map<String, String> postData = new HashMap<>();
        postData.put("correo", correo);
        postData.put("contrasena", contrasena);

        String iniciarSesion = consumo.consumoPOST("http://localhost/APIenPHP/API-login/acceso.php", postData);
        System.out.println(iniciarSesion);
        if (iniciarSesion != null) {
            JsonObject jsonTemp = gson.fromJson(iniciarSesion, JsonObject.class);
            boolean status = jsonTemp.get("status").getAsBoolean();

            if (status) {
                JsonObject usuario = jsonTemp.getAsJsonObject("registros");
                String tipoUser = usuario.get("tipo").getAsString();  
                System.out.println("Inicio de sesión exitoso.");
                System.out.println("Tipo: " + tipoUser);
                
                if (tipoUser == "VENDEDOR") {
                    MainVendedor ventana = new MainVendedor();
                    ventana.setVisible(true);
                }
            } else {
                System.out.println("Error en el inicio de sesión: " );
            }
        } else {
            System.out.println("Error al consumir la API.");
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JPasswordField campo_contrasena;
    private javax.swing.JTextField campo_correo;
    private javax.swing.JLabel etq_correo;
    private javax.swing.JLabel etq_img;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
