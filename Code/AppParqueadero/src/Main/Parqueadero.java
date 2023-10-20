package Main;
import com.google.gson.Gson;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public final class Parqueadero extends javax.swing.JPanel {
    
    public MainVendedor main;
    private final Gson gson;
    
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
        initComponents();
        initAlternComponets();        
        mostrarDatosParqueadero();
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
        jLabelNombre.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombre.setText("NOMBRE:");

        jLabelTelefono.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTelefono.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTelefono.setText("TELÉFONO:");

        jLabelVendedores.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelVendedores.setForeground(new java.awt.Color(0, 0, 0));
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDireccion)
                    .addComponent(etq_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTelefono)
                        .addComponent(etq_telefono)))
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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarVehiculoParqueadero;
    private javax.swing.JLabel etq_direccion;
    private javax.swing.JLabel etq_nit;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_telefono;
    private javax.swing.JLabel etq_vendedor;
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
