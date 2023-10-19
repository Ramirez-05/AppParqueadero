package Main;
import com.google.gson.Gson;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public final class Parqueadero extends javax.swing.JPanel {
    
    public MainVendedor main;
    private final Gson gson;
    
    DefaultTableModel modelo;
    
    public Parqueadero(MainVendedor main) {
        this.main = main;
        gson = new Gson();
        initComponents();
        initAlternComponets();
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
        etq_nombre = new javax.swing.JLabel();
        etq_nit = new javax.swing.JLabel();
        etq_telefono = new javax.swing.JLabel();
        etq_direccion = new javax.swing.JLabel();
        etq_vendedor = new javax.swing.JLabel();

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

        etq_nombre.setText("NO DISPONIBLE");

        etq_nit.setText("NO DISPONIBLE");

        etq_telefono.setText("NO DISPONIBLE");

        etq_direccion.setText("NO DISPONIBLE");

        etq_vendedor.setText("NO DISPONIBLE");

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
                        .addComponent(etq_nit)
                        .addGap(65, 65, 65)
                        .addComponent(jLabelNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etq_nombre))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etq_direccion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etq_telefono))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelVendedores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etq_vendedor)))
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
                    .addComponent(etq_nombre)
                    .addComponent(etq_nit)
                    .addComponent(etq_telefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDireccion)
                    .addComponent(jLabelVendedores)
                    .addComponent(etq_direccion)
                    .addComponent(etq_vendedor))
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
       
    }
     
    
    //Botón para buscar vehículo parqueadero
    private void btnBuscarVehiculoParqueaderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVehiculoParqueaderoActionPerformed
        System.out.println("SE APRETO EL BOTON DE BUSCAR VEHÍCULO");
    }//GEN-LAST:event_btnBuscarVehiculoParqueaderoActionPerformed

    private void inputBuscarUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBuscarUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBuscarUpdateActionPerformed
    
    public void mostrarDatosParqueadero(String nit, String nombre, String direccion, String telefono, String vendedor){        
        etq_nit.setText(nit);
        etq_nombre.setText(nombre);
        etq_direccion.setText( direccion);
        etq_telefono.setText(telefono);
        etq_vendedor.setText(vendedor);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarVehiculoParqueadero;
    private javax.swing.JLabel etq_direccion;
    private javax.swing.JLabel etq_nit;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_telefono;
    private javax.swing.JLabel etq_vendedor;
    private javax.swing.JTextField inputBuscarUpdate;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelNit;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelVendedores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nitParqueadero2;
    private javax.swing.JTable tabVehiculosActuales;
    // End of variables declaration//GEN-END:variables
}
