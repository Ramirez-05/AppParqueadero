package Main;

public class Parqueaderos extends javax.swing.JPanel {

   
    public Parqueaderos() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        bntCreateParking = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

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
        CreateParking mostrarFrame = new CreateParking();
        mostrarFrame.setVisible(true);
        
        // Obtener el JFrame padre que contiene el JPanel actual
        javax.swing.JFrame frame = (javax.swing.JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);

        // Cerrar el JFrame padre
        frame.dispose();

    }//GEN-LAST:event_bntCreateParkingActionPerformed

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
        
        
    }//GEN-LAST:event_btnBuscarUdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCreateParking;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarUdate;
    private javax.swing.JTextField inputBuscar;
    private javax.swing.JTextField inputBuscarUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
