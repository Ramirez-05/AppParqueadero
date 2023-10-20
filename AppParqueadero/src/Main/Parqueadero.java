package Main;
import Main.Clases.ButtonEditor;
import Main.Clases.ButtonRenderer;
import com.google.gson.Gson;
import javax.swing.JTable;
import Main.ConsumoApi;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;


public final class Parqueadero extends javax.swing.JPanel {
    
    public MainVendedor main;
    private ConsumoApi consumo;
    private final Gson gson;
    DefaultTableModel modelo;
    
    
    
    public Parqueadero(MainVendedor This) {
        consumo = new ConsumoApi();
        gson = new Gson();
        initComponents();
        initAlternComponets();
        listaVehiculos();

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nitParqueadero2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabVehiculosActuales = new javax.swing.JTable();
        inputBuscarUpdate = new javax.swing.JTextField();
        btnBuscarVehiculoParqueadero = new javax.swing.JButton();
        jLabelNit = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelVendedores = new javax.swing.JLabel();
        nombreParqueadero = new javax.swing.JLabel();
        nitParqueadero1 = new javax.swing.JLabel();
        telefonoParqueadero = new javax.swing.JLabel();
        direccionParqueadero = new javax.swing.JLabel();
        vendedoresParqueadero = new javax.swing.JLabel();

        nitParqueadero2.setText("NO DISPONIBLE");

        setBackground(new java.awt.Color(255, 255, 255));

        tabVehiculosActuales.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tabVehiculosActuales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "TIKECT", "VEHÍCULO", "PLACA", "TITULAR", "TARIFA", "INGRESO", "TIEMPO/H", "SALIDA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabVehiculosActuales);

        inputBuscarUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBuscarUpdateActionPerformed(evt);
            }
        });

        btnBuscarVehiculoParqueadero.setBackground(new java.awt.Color(73, 59, 114));
        btnBuscarVehiculoParqueadero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarVehiculoParqueadero.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarVehiculoParqueadero.setText("BUSCAR VEHÍCULO");
        btnBuscarVehiculoParqueadero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVehiculoParqueaderoActionPerformed(evt);
            }
        });

        jLabelNit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelNit.setText("NIT:");

        jLabelDireccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelDireccion.setText("DIRECCIÓN:");

        jLabelNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelNombre.setText("NOMBRE:");

        jLabelTelefono.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTelefono.setText("TELÉFONO:");

        jLabelVendedores.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelVendedores.setText("VENDEDORES:");

        nombreParqueadero.setText("NO DISPONIBLE");

        nitParqueadero1.setText("NO DISPONIBLE");

        telefonoParqueadero.setText("NO DISPONIBLE");

        direccionParqueadero.setText("NO DISPONIBLE");

        vendedoresParqueadero.setText("NO DISPONIBLE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nitParqueadero1)
                        .addGap(65, 65, 65)
                        .addComponent(jLabelNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreParqueadero))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(direccionParqueadero)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefonoParqueadero))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelVendedores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vendedoresParqueadero)))
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inputBuscarUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarVehiculoParqueadero)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNit)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabelTelefono)
                    .addComponent(nombreParqueadero)
                    .addComponent(nitParqueadero1)
                    .addComponent(telefonoParqueadero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDireccion)
                    .addComponent(jLabelVendedores)
                    .addComponent(direccionParqueadero)
                    .addComponent(vendedoresParqueadero))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputBuscarUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarVehiculoParqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //Inicializando tabla de vehiculos actuales
    public void initAlternComponets(){
       modelo = (DefaultTableModel) tabVehiculosActuales.getModel();
       
       //Deshabilita la modificación de columnas en la interfaz
       tabVehiculosActuales.getTableHeader().setReorderingAllowed(false);
       
       // Configurar la JTable para ajustar automáticamente el ancho de las columnas
        tabVehiculosActuales.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        tabVehiculosActuales.setPreferredScrollableViewportSize(tabVehiculosActuales.getPreferredSize());
        
        this.tabVehiculosActuales.getColumn("SALIDA").setCellRenderer(new ButtonRenderer());
        this.tabVehiculosActuales.getColumn("SALIDA").setCellEditor(new ButtonEditor(new JCheckBox()));
       
    }
    //FUNCIÓN CALCULAR TIEMPO    
    private String calcularTiempo(String ingreso) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        try {
            Date fechaIngreso = format.parse(ingreso);
            Date fechaActual = new Date();
            long diferencia = fechaActual.getTime() - fechaIngreso.getTime();
            long horas = diferencia / (60 * 60 * 1000);
            long minutos = (diferencia % (60 * 60 * 1000)) / (60 * 1000);
            return horas + "h " + minutos + "m";
        } catch (Exception e) {
            System.err.println("Error al calcular tiempo: " + e.getMessage());
            return "";
        }
    }
    
    private void listaVehiculos(){
        ConsumoApi consumo = new ConsumoApi();
        String obtenerVehiculos = consumo.consumoGET("http://localhost/APIenPHP/obtenerParqueadero.php");
        
        if (obtenerVehiculos != null){
            JsonObject jsonTemp = gson.fromJson(obtenerVehiculos, JsonObject.class);
            JsonArray parqueadero = jsonTemp.getAsJsonArray("registros");
            modelo.setRowCount(0);
            
            for (int i=0 ; i < parqueadero.size(); i++){
                JsonObject verParqueadero = parqueadero.get(i).getAsJsonObject();
                String id = verParqueadero.get("id").getAsString();
                String tipo_vehiculo = verParqueadero.get("tipo_vehiculo").getAsString();
                String placa = verParqueadero.get("placa").getAsString();
                String responsable = verParqueadero.get("responsable").getAsString();
                String Tarifa = verParqueadero.get("Tarifa").getAsString();
                String create_entrada = verParqueadero.get("create_entrada").getAsString();
                
                String tiempo = calcularTiempo(create_entrada);
                
                final int posicion = i;
                
                JButton btnSalida = new JButton("Salida");
                btnSalida.setBackground(new Color(207, 191, 255));
                btnSalida.setForeground(new Color(0,0,0));
                
                Object[] fila = new Object[]{id, tipo_vehiculo, placa, responsable, Tarifa, create_entrada, tiempo, btnSalida};
                modelo.addRow(fila);
                
            }
        }
    }
    
    
    //Botón para buscar vehículo parqueadero
    private void btnBuscarVehiculoParqueaderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVehiculoParqueaderoActionPerformed

    
        System.out.println("SE APRETO EL BOTON DE BUSCAR VEHÍCULO");
    }//GEN-LAST:event_btnBuscarVehiculoParqueaderoActionPerformed

    private void inputBuscarUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBuscarUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBuscarUpdateActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarVehiculoParqueadero;
    private javax.swing.JLabel direccionParqueadero;
    private javax.swing.JTextField inputBuscarUpdate;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelNit;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelVendedores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nitParqueadero1;
    private javax.swing.JLabel nitParqueadero2;
    private javax.swing.JLabel nombreParqueadero;
    private javax.swing.JTable tabVehiculosActuales;
    private javax.swing.JLabel telefonoParqueadero;
    private javax.swing.JLabel vendedoresParqueadero;
    // End of variables declaration//GEN-END:variables
}
