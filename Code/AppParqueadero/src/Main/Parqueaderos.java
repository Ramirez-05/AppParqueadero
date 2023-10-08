package Main;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import javax.swing.table.DefaultTableModel;


public class Parqueaderos extends javax.swing.JPanel {
    
    public Main main;
    private Gson gson;
    ConsumoApi consumo;
    DefaultTableModel modelo;        
    
    public Parqueaderos(Main main) {
        this.main = main;
        gson = new Gson();
        consumo = new ConsumoApi();   
        initComponents();
        initAlternComponents();
        mostrarParqueaderos();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        bntCreateParking = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaParqueadero = new javax.swing.JTable();
        inputBuscarUpdate = new javax.swing.JTextField();
        btnBuscarUdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        btnBuscar.setBackground(new java.awt.Color(73, 59, 114));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        bntCreateParking.setBackground(new java.awt.Color(73, 59, 114));
        bntCreateParking.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntCreateParking.setForeground(new java.awt.Color(255, 255, 255));
        bntCreateParking.setText("CREAR PARQUEADERO");
        bntCreateParking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCreateParkingActionPerformed(evt);
            }
        });

        tablaParqueadero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tablaParqueadero.setForeground(new java.awt.Color(0, 0, 0));
        tablaParqueadero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIT", "NOMBRE", "DIRECCION", "TELEFONO"
            }
        ));
        jScrollPane1.setViewportView(tablaParqueadero);

        btnBuscarUdate.setBackground(new java.awt.Color(73, 59, 114));
        btnBuscarUdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarUdate.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarUdate.setText(" EDITAR PARQUEADERO");
        btnBuscarUdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputBuscarUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarUdate, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bntCreateParking, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(bntCreateParking)
                    .addComponent(inputBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputBuscarUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarUdate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bntCreateParkingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCreateParkingActionPerformed
        // ACA VA EL CODIGO PARA MOSTRAR LA VENTANA PARA REGISTAR UN PARQUEADERO
        
        System.out.println("SE APRETO EL BOTON DE CREAR PARQUEADERO");
        
        // HACEMOS LA INSTANCIA DE LA VENTANA QUE QUEREMOS CREAR Y LA MOSTRAMOS
        CreateParking mostrarFrame = new CreateParking(this);
        mostrarFrame.setVisible(true);
        
        // Obtener el JFrame padre que contiene el JPanel actual
        this.main.setVisible(false);
    }//GEN-LAST:event_bntCreateParkingActionPerformed

    private void initAlternComponents(){
       modelo = (DefaultTableModel) tablaParqueadero.getModel();
    }
    
    
    
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
         // ACA VA El codigo para MOSTRA LA EMPRESA QUE SE ESTA BUSCANDO 
    
        System.out.println("SE APRETO EL BOTON DE BUSCAR PARQUEADERO");

        //Capturamos lo que hay en el input de buscar
        String nit = inputBuscar.getText();

        if(nit != null && !nit.isEmpty()){

            System.out.println("Esta es nit: " + nit);

            //ACA DEBE HARCERSE LA CONSULTA PARA BUSCAR LA EMPRESA POR NIT Y MOSTRARLO EN LA TABLA
        } else {
            //HACEMOS APARECER UNA ALERTA
            InputBuscarUpdateParking mostrarFrame = new InputBuscarUpdateParking();
            mostrarFrame.setVisible(true);

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscarUdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUdateActionPerformed
        // ACA VA EL CODIGO PARA CAMBIAR A LA VENTA DE EDITAR 
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
    }//GEN-LAST:event_btnBuscarUdateActionPerformed

    
    private void mostrarParqueaderos(){
        // SE ESTA MOSTRANDO LA FUNCION DE MOSTRAR PARQUEADEROS        
        System.out.println("Se mostro la lista de parqueaderos");                    
        String obtenerParkings = consumo.consumoGET("http://localhost/APIenPHP/API-parqueadero/Obtener.php");
                
        if( obtenerParkings != null ){
            JsonObject jsonTemp  = gson.fromJson(obtenerParkings, JsonObject.class);
            
            JsonArray parking = jsonTemp.getAsJsonArray("registros");
            
            modelo.setRowCount(0);
            System.out.println("");
            System.out.println("LISTA DE PARQUEADEROS: ");
            
            for(int i = 0; i < parking.size(); i++ ){
                JsonObject viewParking = parking.get(i).getAsJsonObject();
                String nit = viewParking.get("nit").getAsString();
                String nombre = viewParking.get("nombre").getAsString();
                String direccion = viewParking.get("direccion").getAsString();
                String telefono = viewParking.get("telefono").getAsString();
                System.out.println("nit " + nit);
                
                Object[] fila = new Object[]{nit,nombre,direccion,telefono};
                
                modelo.addRow(fila);
            } 
        }  
    }    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCreateParking;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarUdate;
    private javax.swing.JTextField inputBuscar;
    private javax.swing.JTextField inputBuscarUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaParqueadero;
    // End of variables declaration//GEN-END:variables
}
