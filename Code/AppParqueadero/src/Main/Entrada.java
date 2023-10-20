package Main;
import Alerts.RegistroExitoso;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public final class Entrada extends javax.swing.JPanel {
    
    public MainVendedor main;
    private final Gson gson;
    ConsumoApi consumo;
    
    DefaultTableModel modelo;
    
    
    
    public Entrada(MainVendedor main) {
        this.main = main;
        consumo = new ConsumoApi();
        gson = new Gson();
        initComponents();
        initAlternComponets();
        select();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nitParqueadero2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        btnEntrada = new javax.swing.JButton();
        jLabelPlaca = new javax.swing.JLabel();
        jLabelVehiculo = new javax.swing.JLabel();
        jLabelTitular = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        selectVehiculo = new javax.swing.JComboBox<>();
        inputPlaca = new javax.swing.JTextField();
        inputTitular = new javax.swing.JTextField();

        nitParqueadero2.setText("NO DISPONIBLE");

        jCheckBox1.setText("jCheckBox1");

        setBackground(new java.awt.Color(255, 255, 255));

        btnEntrada.setBackground(new java.awt.Color(73, 59, 114));
        btnEntrada.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnEntrada.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrada.setText("INGRESAR");
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });

        jLabelPlaca.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelPlaca.setForeground(new java.awt.Color(15, 11, 25));
        jLabelPlaca.setText("TITULAR:");

        jLabelVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelVehiculo.setForeground(new java.awt.Color(15, 11, 25));
        jLabelVehiculo.setText("PLACA:");

        jLabelTitular.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitular.setForeground(new java.awt.Color(15, 11, 25));
        jLabelTitular.setText("VEHÍCULO:");

        jLabel1.setBackground(new java.awt.Color(73, 59, 114));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 11, 25));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR ENTRADA DE VEHICULOS");

        selectVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectVehiculoActionPerformed(evt);
            }
        });

        inputPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPlacaActionPerformed(evt);
            }
        });

        inputTitular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTitularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(btnEntrada)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelVehiculo)
                    .addComponent(jLabelPlaca)
                    .addComponent(jLabelTitular))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(selectVehiculo, 0, 215, Short.MAX_VALUE)
                    .addComponent(inputPlaca)
                    .addComponent(inputTitular))
                .addGap(182, 182, 182))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVehiculo)
                    .addComponent(inputPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(selectVehiculo)
                    .addComponent(jLabelTitular))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPlaca)
                    .addComponent(inputTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(btnEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
    }// </editor-fold>//GEN-END:initComponents

    //Inicializando tabla de vehiculos actuales
    public void initAlternComponets(){
       
    }
    
    
    
    //Botón para editar parqueadero
    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed
       
        String placa = inputPlaca.getText();
        String vehiculo = selectVehiculo.getSelectedItem().toString();
        String encargado = inputTitular.getText();
       
        if (!placa.isEmpty() &&  !selectVehiculo.getSelectedItem().equals("Seleccionar Vehiculo") && !encargado.isEmpty() ) {
            
            Map<String, String> verificar = new HashMap<>();
            verificar.put("placa", placa);
            
            String selected = consumo.consumoPOST("http://localhost/APIenPHP/API-tarifas/VerificarPlaca.php", verificar);
            
            System.out.println("RESPUESTA ASOCIACION: "+selected);
            
            JsonObject respuestaInsert = gson.fromJson(selected, JsonObject.class);

            boolean status = respuestaInsert.get("status").getAsBoolean();
            
            if(status){
                
                System.out.println("hola");
                
            }
            
            
            
            
        }
        
        
       
        

                
    }//GEN-LAST:event_btnEntradaActionPerformed

    private void selectVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectVehiculoActionPerformed
      
    }//GEN-LAST:event_selectVehiculoActionPerformed

    private void inputPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPlacaActionPerformed

    private void inputTitularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTitularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTitularActionPerformed

    private void select(){
         // Limpia el selector de parqueaderos
        selectVehiculo.removeAllItems();

        // Agrega una opción predeterminada (en blanco o mensaje informativo)
        selectVehiculo.addItem("Seleccionar Vehiculo");

        // Luego, puedes cargar los parqueaderos reales
        String selected = consumo.consumoGET("http://localhost/APIenPHP/API-tarifas/Obtener.php");

        if (selected != null) {
            JsonObject jsonTemp = gson.fromJson(selected, JsonObject.class);
            JsonArray parking = jsonTemp.getAsJsonArray("registros");

            // Agrega los parqueaderos reales a selectParking
            for (JsonElement element : parking) {
                JsonObject parkingData = element.getAsJsonObject();
                String parkingName = parkingData.get("tipo_vehiculo").getAsString();
                selectVehiculo.addItem(parkingName);
            }
        }
    }
    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrada;
    private javax.swing.JTextField inputPlaca;
    private javax.swing.JTextField inputTitular;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JLabel jLabelTitular;
    private javax.swing.JLabel jLabelVehiculo;
    private javax.swing.JLabel nitParqueadero2;
    private javax.swing.JComboBox<String> selectVehiculo;
    // End of variables declaration//GEN-END:variables
}
