package Main;
import com.google.gson.Gson;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public final class Historial extends javax.swing.JPanel {
    
    public MainVendedor main;
    private final Gson gson;
    
    DefaultTableModel modelo;
    
    
    
    public Historial(MainVendedor main) {
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
        tabHistorial = new javax.swing.JTable();
        inputBuscarHistorial = new javax.swing.JTextField();
        btnBuscarHistorial = new javax.swing.JButton();
        jLabelDireccion = new javax.swing.JLabel();
        direccionParqueadero = new javax.swing.JLabel();

        nitParqueadero2.setText("NO DISPONIBLE");

        setBackground(new java.awt.Color(255, 255, 255));

        tabHistorial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tabHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "TIKECT", "VEHÍCULO", "PLACA", "TITULAR", "TARIFA", "FECHA", "INGRESO", "SALIDA", "TIEMPO/H", "IMPRIMIR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabHistorial);

        inputBuscarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBuscarHistorialActionPerformed(evt);
            }
        });

        btnBuscarHistorial.setBackground(new java.awt.Color(73, 59, 114));
        btnBuscarHistorial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarHistorial.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarHistorial.setText("BUSCAR");
        btnBuscarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarHistorialActionPerformed(evt);
            }
        });

        jLabelDireccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelDireccion.setText("FECHA:");

        direccionParqueadero.setText("NO DISPONIBLE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(direccionParqueadero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputBuscarHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarHistorial)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputBuscarHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccionParqueadero)
                    .addComponent(jLabelDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    //Inicializando tabla de vehiculos actuales
    public void initAlternComponets(){
       modelo = (DefaultTableModel) tabHistorial.getModel();
       
       //Deshabilita la modificación de columnas en la interfaz
       tabHistorial.getTableHeader().setReorderingAllowed(false);
       
       // Configurar la JTable para ajustar automáticamente el ancho de las columnas
        tabHistorial.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        tabHistorial.setPreferredScrollableViewportSize(tabHistorial.getPreferredSize());
       
    }
    
    
    
    //Botón para buscar vehículo parqueadero
    private void btnBuscarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarHistorialActionPerformed

    
        System.out.println("SE APRETO EL BOTON DE BUSCAR VEHÍCULO");
    }//GEN-LAST:event_btnBuscarHistorialActionPerformed

    private void inputBuscarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBuscarHistorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBuscarHistorialActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarHistorial;
    private javax.swing.JLabel direccionParqueadero;
    private javax.swing.JTextField inputBuscarHistorial;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nitParqueadero2;
    private javax.swing.JTable tabHistorial;
    // End of variables declaration//GEN-END:variables
}
