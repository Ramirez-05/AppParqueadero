package VistaParqueadero;
import Alerts.GeneratingAlert;
import Clases.ButtonEditor;
import Clases.ButtonRenderer;
import Main.ConsumoApi;
import Main.Main;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;

public class Parqueaderos extends javax.swing.JPanel {
    
    public Main main;
    private Gson gson;
    private Font font;
    ConsumoApi consumo;
    DefaultTableModel modelo;
        
    public Parqueaderos(Main main) {
        this.main = main;
        gson = new Gson();
        font = new Font("Segoe UI", Font.BOLD, 14);
        consumo = new ConsumoApi();
        initComponents();
        initAlternComponets();
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

        setBackground(new java.awt.Color(255, 255, 255));

        btnBuscar.setBackground(new java.awt.Color(207, 191, 255));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        bntCreateParking.setBackground(new java.awt.Color(207, 191, 255));
        bntCreateParking.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntCreateParking.setForeground(new java.awt.Color(0, 0, 0));
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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NIT", "NOMBRE", "DIRECCION", "EDITAR", "ELIMINAR"
            }
        ));
        jScrollPane1.setViewportView(tablaParqueadero);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(inputBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntCreateParking, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(bntCreateParking)
                    .addComponent(inputBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bntCreateParkingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCreateParkingActionPerformed
        // ACA VA EL CODIGO PARA MOSTRAR LA VENTANA PARA REGISTAR UN PARQUEADERO
        System.out.println("SE APRETO EL BOTON DE CREAR PARQUEADERO");
        
        // HACEMOS LA INSTANCIA DE LA VENTANA QUE QUEREMOS CREAR Y LA MOSTRAMOS
        CreateParking mostrarFrame = new CreateParking(this);
        mostrarFrame.setVisible(true);
        
        // OCULTAMOS EL PANEL ACTUAL
        this.main.setVisible(false);
    }//GEN-LAST:event_bntCreateParkingActionPerformed

    public void initAlternComponets(){
        modelo = (DefaultTableModel) tablaParqueadero.getModel();
       
        this.tablaParqueadero.getColumn("EDITAR").setCellRenderer(new ButtonRenderer());
        this.tablaParqueadero.getColumn("EDITAR").setCellEditor(new ButtonEditor(new JCheckBox()));
        
        this.tablaParqueadero.getColumn("ELIMINAR").setCellRenderer(new ButtonRenderer());
        this.tablaParqueadero.getColumn("ELIMINAR").setCellEditor(new ButtonEditor(new JCheckBox()));
    }
     
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // ACA VA El codigo para MOSTRA LA EMPRESA QUE SE ESTA BUSCANDO 
        System.out.println("\n SE APRETO EL BOTON DE BUSCAR PARQUEADERO \n");
        
        //Capturamos lo que hay en el input de buscar
        String nit = inputBuscar.getText();

        if(nit != null && !nit.isEmpty()){
            
            // MAPEAMOS LOS DATOS
            Map<String, String> consultaParking = new HashMap<>();
            consultaParking.put("nit",nit);

            //ACA DEBE HARCERSE LA CONSULTA PARA BUSCAR LA EMPRESA POR NIT Y MOSTRARLO EN LA TABLA
            String consultaParqueadero = consumo.consumoPOST("http://localhost/APIenPHP/API-parqueadero/VerificarParqueadero.php", consultaParking);
            
            JsonObject jsonResponse = gson.fromJson(consultaParqueadero, JsonObject.class);

            boolean status = jsonResponse.get("status").getAsBoolean();
            
            if( status ){
                //LIMPIAMOS EL MODELO
                modelo.setRowCount(0);
                
                JsonArray parking = jsonResponse.getAsJsonArray("registros");
                
                for(int i = 0; i < parking.size(); i++ ){
                    JsonObject viewParking = parking.get(i).getAsJsonObject();
                    String nit2 = viewParking.get("nit").getAsString();
                    String nombre = viewParking.get("nombre").getAsString();
                    String direccion = viewParking.get("direccion").getAsString();       
                    JButton btnEditar = new JButton("EDITAR");
                    btnEditar.setBackground(new Color(207,191,255));
                    btnEditar.setForeground(new Color(0,0,0));
                    btnEditar.setFont(font);
                    JButton btnEliminar = new JButton("ELIMINAR");
                    btnEliminar.setBackground(new Color(255, 75, 75));
                    btnEliminar.setForeground(new Color(0,0,0));
                    btnEliminar.setFont(font);
                    
                     // Crear un botón de edición para cada fila
                    final int posicion = i;
                    btnEditar.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            accionClickBotonEditar( posicion );
                        }
                    });

                    btnEliminar.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            accionClickBotonEliminar( posicion );
                        }
                    });


                    Object[] fila = new Object[]{nit2,nombre,direccion,btnEditar, btnEliminar};

                    modelo.addRow(fila);
                }
            }else{
                GeneratingAlert alert = new GeneratingAlert("ERROR", "PARQUEADERO NO ENCONTRADO");
                alert.setVisible(true);
                inputBuscar.setText("");
                mostrarParqueaderos();
            }
        } else {
            //HACEMOS APARECER UNA ALERTA
            GeneratingAlert mostrarFrame = new GeneratingAlert("ERROR","POR FAVOR INGRESE UN DATO");
            mostrarFrame.setVisible(true);
            mostrarParqueaderos();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    public void mostrarParqueaderos(){
        // PETICION PARA OBTENER TODOS LOS PARQUEADEROS 
        String obtenerParkings = consumo.consumoGET("http://localhost/APIenPHP/API-parqueadero/Obtener.php");
        
        if( obtenerParkings != null ){
            JsonObject jsonTemp  = gson.fromJson(obtenerParkings, JsonObject.class);
            
            JsonArray parking = jsonTemp.getAsJsonArray("registros");
            
            modelo.setRowCount(0);
            
            for(int i = 0; i < parking.size(); i++ ){
                JsonObject viewParking = parking.get(i).getAsJsonObject();
                String nit = viewParking.get("nit").getAsString();
                String nombre = viewParking.get("nombre").getAsString();
                String direccion = viewParking.get("direccion").getAsString();       
                JButton btnEditar = new JButton("EDITAR");
                btnEditar.setBackground(new Color(207,191,255));
                btnEditar.setForeground(new Color(0,0,0));
                btnEditar.setFont(font);
                JButton btnEliminar = new JButton("ELIMINAR");
                btnEliminar.setBackground(new Color(255, 75, 75));
                btnEliminar.setForeground(new Color(0,0,0));
                btnEliminar.setFont(font);
            
                 // Crear un botón de edición para cada fila
                final int posicion = i;
                btnEditar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        accionClickBotonEditar( posicion );
                    }
                });
                
                btnEliminar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        accionClickBotonEliminar( posicion );
                    }
                });
                
                Object[] fila = new Object[]{nit,nombre,direccion,btnEditar, btnEliminar};
                
                modelo.addRow(fila);
                
            }
        }
    }    
    
    public void accionClickBotonEditar(int fila) {
        
        // Obtener los datos de la fila seleccionada
        String nit = (String) modelo.getValueAt(fila, 0);
        String nombre = (String) modelo.getValueAt(fila, 1);
        String direccion = (String) modelo.getValueAt(fila, 2);
        
        // Ejemplo de cómo mostrar los datos en la consola
        System.out.println("");
        System.out.println("Se hizo clic en el botón de edición en la fila " + fila);
        System.out.println("NIT: " + nit);
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("");

        //VERIFICAR QUE LA EMPRESA QUE QUEREMOS EDITAR SI EXISTA
        Map<String, String> insertData = new HashMap<>();
        insertData.put("nit",nit);
        insertData.put("nombre",nombre);
        
        String consultarParqueadero = consumo.consumoPOST("http://localhost/APIenPHP/API-parqueadero/VerificarParqueadero.php", insertData);
        
        if( consultarParqueadero != null ){
              
            //HACEMOS EL CAMBIO DE VENTANA PARA MOSTRAR EL FORM DONDE EDITAMOS EL PARQUEADERO 
            UpdateParking mostrarFrame = new UpdateParking(consultarParqueadero,this);
            mostrarFrame.setVisible(true);
            
            // OCULTAMOS EL PANEL ACTUAL
            this.main.setVisible(false);
            
        }
       
    }
    
    public void accionClickBotonEliminar(int fila){
        System.out.println("\n SE DIO CLICK EN EL BOTON DE ELIMINAR \n");
        
        String nit = (String) modelo.getValueAt(fila, 0);
        String nombre = (String) modelo.getValueAt(fila, 1);
        String direccion = (String) modelo.getValueAt(fila, 2);
        
         // Ejemplo de cómo mostrar los datos en la consola
        System.out.println("");
        System.out.println("Se hizo clic en el botón de edición en la fila " + fila);
        System.out.println("NIT: " + nit);
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("");

        //VERIFICAR QUE LA EMPRESA QUE QUEREMOS EDITAR SI EXISTA
        Map<String, String> insertData = new HashMap<>();
        insertData.put("nit",nit);
        insertData.put("nombre",nombre);
        
        String verificar = consumo.consumoPOST("http://localhost/APIenPHP/API-parqueadero/VerificarParqueadero.php", insertData);
        
         if( verificar != null ){
              
            //HACEMOS EL CAMBIO DE VENTANA PARA MOSTRAR EL FORM DONDE EDITAMOS EL PARQUEADERO 
            DeleteParking mostrarFrame = new DeleteParking(nit,nombre,this);
            mostrarFrame.setVisible(true);
            
            // OCULTAMOS EL PANEL ACTUAL
            this.main.setVisible(false);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCreateParking;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JTextField inputBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaParqueadero;
    // End of variables declaration//GEN-END:variables
}