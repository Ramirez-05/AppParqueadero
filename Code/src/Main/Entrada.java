package Main;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public final class Entrada extends javax.swing.JPanel {
    
    public MainVendedor main;
    private final Gson gson;
    
    DefaultTableModel modelo;
    
    
    
    public Entrada(MainVendedor main) {
        this.main = main;
        gson = new Gson();
        initComponents();
        initAlternComponets();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nitParqueadero2 = new javax.swing.JLabel();
        btnModificarTarifa = new javax.swing.JButton();
        inputPlaca = new javax.swing.JTextField();
        inputVehiculo = new javax.swing.JTextField();
        inputVehiculo1 = new javax.swing.JTextField();
        jLabelPlaca = new javax.swing.JLabel();
        jLabelVehiculo = new javax.swing.JLabel();
        jLabelTitular = new javax.swing.JLabel();

        nitParqueadero2.setText("NO DISPONIBLE");

        setBackground(new java.awt.Color(255, 255, 255));

        btnModificarTarifa.setBackground(new java.awt.Color(73, 59, 114));
        btnModificarTarifa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModificarTarifa.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarTarifa.setText("INGRESAR");
        btnModificarTarifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarTarifaActionPerformed(evt);
            }
        });

        inputPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPlacaActionPerformed(evt);
            }
        });

        inputVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputVehiculoActionPerformed(evt);
            }
        });

        inputVehiculo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputVehiculo1ActionPerformed(evt);
            }
        });

        jLabelPlaca.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPlaca.setText("TITULAR:");

        jLabelVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelVehiculo.setText("PLACA:");

        jLabelTitular.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTitular.setText("VEHÍCULO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelVehiculo)
                            .addComponent(jLabelPlaca)
                            .addComponent(jLabelTitular))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputVehiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnModificarTarifa)
                        .addGap(70, 70, 70)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelVehiculo)
                        .addGap(32, 32, 32)
                        .addComponent(jLabelTitular)
                        .addGap(32, 32, 32)
                        .addComponent(jLabelPlaca))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(inputVehiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(inputVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnModificarTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //Inicializando tabla de vehiculos actuales
    public void initAlternComponets(){
       
    }
    
    
    
    //Botón para editar parqueadero
    private void btnModificarTarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarTarifaActionPerformed

    
        System.out.println("SE APRETO EL BOTON MODIFICAR TARIFA");
    }//GEN-LAST:event_btnModificarTarifaActionPerformed

    private void inputPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPlacaActionPerformed

    private void inputVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputVehiculoActionPerformed

    private void inputVehiculo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputVehiculo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputVehiculo1ActionPerformed

    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificarTarifa;
    private javax.swing.JTextField inputPlaca;
    private javax.swing.JTextField inputVehiculo;
    private javax.swing.JTextField inputVehiculo1;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JLabel jLabelTitular;
    private javax.swing.JLabel jLabelVehiculo;
    private javax.swing.JLabel nitParqueadero2;
    // End of variables declaration//GEN-END:variables
}
