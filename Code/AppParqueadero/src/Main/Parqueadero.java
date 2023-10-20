package Main;
import Clases.ButtonEditor;
import Clases.ButtonRenderer;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public final class Parqueadero extends javax.swing.JPanel {
    
    public MainVendedor main;
    private final Gson gson;
    private ConsumoApi consumo;
    DefaultTableModel modelo;
    String nit;
    String nombre;
    String direccion;
    String telefono;
    String user;
    
    public Parqueadero(MainVendedor main,String nit, String nombre, String direccion, String telefono, String user ) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.user = user;
        this.main = main;
        gson = new Gson();
        consumo = new ConsumoApi();
        initComponents();
        initAlternComponets();        
        mostrarDatosParqueadero();
        listaVehiculos();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nitParqueadero2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabVehiculosActuales = new javax.swing.JTable();
        inputBuscarUpdate = new javax.swing.JTextField();
        btnBuscarVehiculoParqueadero = new javax.swing.JButton();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelVendedores = new javax.swing.JLabel();
        etq_nombre = new javax.swing.JLabel();
        etq_telefono = new javax.swing.JLabel();
        etq_direccion = new javax.swing.JLabel();
        etq_vendedor = new javax.swing.JLabel();
        etq_nit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        nitParqueadero2.setText("NO DISPONIBLE");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

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

        jLabelDireccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelDireccion.setForeground(new java.awt.Color(15, 11, 25));
        jLabelDireccion.setText("DIRECCIÓN:");

        jLabelNombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelNombre.setText("NOMBRE:");

        jLabelTelefono.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTelefono.setText("TELÉFONO:");

        jLabelVendedores.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelVendedores.setText("VENDEDORES:");

        etq_nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etq_nombre.setText("NO DISPONIBLE");

        etq_telefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etq_telefono.setText("NO DISPONIBLE");

        etq_direccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etq_direccion.setText("NO DISPONIBLE");

        etq_vendedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etq_vendedor.setText("NO DISPONIBLE");

        etq_nit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        etq_nit.setText("NO DISPONIBLE");

        jLabel1.setBackground(new java.awt.Color(15, 11, 25));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 11, 25));
        jLabel1.setText("NIT:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(inputBuscarUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarVehiculoParqueadero))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDireccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(etq_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTelefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etq_telefono))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etq_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabelNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etq_nombre)
                                .addGap(47, 47, 47)
                                .addComponent(jLabelVendedores)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etq_vendedor)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelNombre)
                    .addComponent(etq_nombre)
                    .addComponent(jLabelVendedores)
                    .addComponent(etq_vendedor))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTelefono)
                        .addComponent(etq_telefono))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelDireccion)
                        .addComponent(etq_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputBuscarUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarVehiculoParqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
     
    
    //Botón para buscar vehículo parqueadero
    private void btnBuscarVehiculoParqueaderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVehiculoParqueaderoActionPerformed
        System.out.println("SE APRETO EL BOTON DE BUSCAR VEHÍCULO");
    }//GEN-LAST:event_btnBuscarVehiculoParqueaderoActionPerformed

    private void inputBuscarUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBuscarUpdateActionPerformed
        
    }//GEN-LAST:event_inputBuscarUpdateActionPerformed
    
    public void mostrarDatosParqueadero(){                     
        try {
            System.out.println("nit a panel: " + nit);
            System.out.println("nombre panel : " + nombre);
            System.out.println("direccion panel : " + direccion);
            System.out.println("telefono panel : " + telefono);
            System.out.println("user panel : " + user);            
            etq_nit.setText(nit);
            etq_nombre.setText(nombre);
            etq_direccion.setText(direccion);
            etq_telefono.setText(telefono);
            etq_vendedor.setText(user);
        } catch (Exception e) {
            System.out.println("NO HAY ASIGNACION");
        }
    }
    
    private void listaVehiculos(){
        String obtenerVehiculos = consumo.consumoGET("http://localhost/APIenPHP/API-voce/obtenerParqueadero.php");
        
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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarVehiculoParqueadero;
    public javax.swing.JLabel etq_direccion;
    public javax.swing.JLabel etq_nit;
    private javax.swing.JLabel etq_nombre;
    public javax.swing.JLabel etq_telefono;
    public javax.swing.JLabel etq_vendedor;
    private javax.swing.JTextField inputBuscarUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelVendedores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel nitParqueadero2;
    private javax.swing.JTable tabVehiculosActuales;
    // End of variables declaration//GEN-END:variables
}
