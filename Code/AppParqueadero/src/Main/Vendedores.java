package Main;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import javax.swing.table.DefaultTableModel;

public class Vendedores extends javax.swing.JPanel {
    private Gson gson;
    ConsumoApi consumo;
    DefaultTableModel modelo;
    
    public Vendedores() {
        gson = new Gson();
        consumo = new ConsumoApi();   
        initComponents();
        initAlternComponents();
        listaVendedores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVendedores = new javax.swing.JTable();
        inputBuscarUpdate = new javax.swing.JTextField();
        btnBuscarUpdateSeller = new javax.swing.JButton();
        inputBuscar = new javax.swing.JTextField();
        btnBuscarSeller = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(73, 59, 114));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CREAR VENDEDOR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tablaVendedores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tablaVendedores.setForeground(new java.awt.Color(255, 255, 255));
        tablaVendedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIT", "NOMBRE", "DIRECCION", "TELEFONO", "ESTADO", "VENDEDORES"
            }
        ));
        jScrollPane1.setViewportView(tablaVendedores);

        btnBuscarUpdateSeller.setBackground(new java.awt.Color(73, 59, 114));
        btnBuscarUpdateSeller.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarUpdateSeller.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarUpdateSeller.setText(" EDITAR VENDEDOR");
        btnBuscarUpdateSeller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUpdateSellerActionPerformed(evt);
            }
        });

        btnBuscarSeller.setBackground(new java.awt.Color(73, 59, 114));
        btnBuscarSeller.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarSeller.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarSeller.setText("BUSCAR");
        btnBuscarSeller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarSellerActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(73, 59, 114));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("VENDEDORES SIN ASIGNACION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inputBuscarUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarUpdateSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarSeller)
                    .addComponent(jButton2)
                    .addComponent(inputBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputBuscarUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarUpdateSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void initAlternComponents(){
       modelo = (DefaultTableModel) tablaVendedores.getModel();
    }
    private void btnBuscarSellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarSellerActionPerformed
         // ACA VA El codigo para MOSTRA EL USUARIO QUE SE ESTA BUSCANDO     
        System.out.println("SE APRETO EL BOTON DE BUSCAR PARQUEADERO");
        //Capturamos lo que hay en el input de buscar
        String documento = inputBuscar.getText();

        if(documento != null && !documento.isEmpty()){
            
            System.out.println("Esta es la cedula: " + documento);
            //ACA DEBE HARCERSE LA CONSULTA PARA BUSCAR EL USUARIO POR DOCUMENTO Y MOSTRARLO EN LA TABLA          
        } else {
            
            //HACEMOS APARECER UNA ALERTA
            InputBuscarUpdateParking mostrarFrame = new InputBuscarUpdateParking();
            mostrarFrame.setVisible(true);
        }
    }//GEN-LAST:event_btnBuscarSellerActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         // ACA VA EL CODIGO PARA MOSTRAR LA VENTANA PARA REGISTAR UN PARQUEADERO
        
        System.out.println("SE APRETO EL BOTON DE CREAR VENDEDOR");
        
        // HACEMOS LA INSTANCIA DE LA VENTANA QUE QUEREMOS CREAR Y LA MOSTRAMOS
        CreateSeller mostrarFrame = new CreateSeller();
        mostrarFrame.setVisible(true);
        
        // Obtener el JFrame padre que contiene el JPanel actual
        javax.swing.JFrame frame = (javax.swing.JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);

        // Cerrar el JFrame padre
        frame.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBuscarUpdateSellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUpdateSellerActionPerformed
        // ACA VA EK CODIGO PARA CAMBIAR A LA VENTA DE EDITAR     
        System.out.println("SE APRETO EL BOTON DE EDITAR PARQUEADERO");

        //Capturamos lo que hay en el input de buscar
        String nit = inputBuscarUpdate.getText();

        if(nit != null && !nit.isEmpty()){

            System.out.println("Esta es  nit: " + nit);
            //HACEMOS EL CAMBIO DE VENTANA PARA MOSTRAR EL FORM DONDE EDITAMOS EL PARQUEADERO 
            UpdateParking mostrarFrame = new UpdateParking(nit);
            mostrarFrame.setVisible(true);
        } else {

            //HACEMOS APARECER UNA ALERTA
            AlertInputVacioParking mostrarFrame = new AlertInputVacioParking();
            mostrarFrame.setVisible(true);
        }
    }//GEN-LAST:event_btnBuscarUpdateSellerActionPerformed
    
    private void listaVendedores(){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarSeller;
    private javax.swing.JButton btnBuscarUpdateSeller;
    private javax.swing.JTextField inputBuscar;
    private javax.swing.JTextField inputBuscarUpdate;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaVendedores;
    // End of variables declaration//GEN-END:variables
}
