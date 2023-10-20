package Main;
import com.google.gson.Gson;

public class JFrameImprimir extends javax.swing.JFrame {

    private ConsumoApi consumo;
    private Gson gson;
    public MainVendedor main;
    //Historial historial;
    public String id_ticket;
    public String vehiculo;
    public String placa;
    public String titular;
    public String tarifa;
    public String ingreso;
    public String salida;
    public String total;

    
    public JFrameImprimir(Historial historial, String id_ticket, String vehiculo, String placa, String titular, String tarifa, String ingreso, String salida, String total){
        initComponents();
        initComponentsAltern();
        consumo = new ConsumoApi();
        gson = new Gson();
        
        
        j_id.setText(id_ticket);
        j_vehiculo.setText(vehiculo);
        j_placa.setText(placa);
        j_nombre.setText(titular);      
        j_tarifa.setText(tarifa);       
        j_ingreso.setText(ingreso);     
        j_salida.setText(salida);       
        j_total.setText(total);
        
        this.revalidate();
        this.repaint();
    }

    JFrameImprimir(String id, String tipoVehiculo, String placa, String responsable, String tarifa, String createEntrada, String salida, String tiempo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    
    private void initComponentsAltern(){
        setLocationRelativeTo(null);
        setResizable(false);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_imprimir = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        lb_nit = new javax.swing.JLabel();
        lb_nombre = new javax.swing.JLabel();
        lb_vehiculo = new javax.swing.JLabel();
        lb_ticket = new javax.swing.JLabel();
        lb_placa = new javax.swing.JLabel();
        lb_tarifa = new javax.swing.JLabel();
        lb_ingreso = new javax.swing.JLabel();
        lb_salida = new javax.swing.JLabel();
        lb_total = new javax.swing.JLabel();
        j_nit = new javax.swing.JLabel();
        j_id = new javax.swing.JLabel();
        j_nombre = new javax.swing.JLabel();
        j_placa = new javax.swing.JLabel();
        j_vehiculo = new javax.swing.JLabel();
        j_tarifa = new javax.swing.JLabel();
        j_ingreso = new javax.swing.JLabel();
        j_total = new javax.swing.JLabel();
        j_salida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAceptar.setBackground(new java.awt.Color(73, 59, 114));
        btnAceptar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titulo.setText("PARQUEADERO");

        lb_nit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_nit.setText("NIT:");

        lb_nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_nombre.setText("NOMBRE:");

        lb_vehiculo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_vehiculo.setText("VEHÍCULO:");

        lb_ticket.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_ticket.setText("ID TICKET:");

        lb_placa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_placa.setText("PLACA:");

        lb_tarifa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_tarifa.setText("TARIFA:");

        lb_ingreso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_ingreso.setText("FECHA INGRESO:");

        lb_salida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_salida.setText("FECHA SALIDA:");

        lb_total.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_total.setText("TOTAL:");

        j_nit.setText("j_nit");

        j_id.setText("j_id");

        j_nombre.setText("j_nombre");

        j_placa.setText("j_placa");

        j_vehiculo.setText("j_vehiculo");

        j_tarifa.setText("j_tarifa");

        j_ingreso.setText("j_ingreso");

        j_total.setText("j_total");

        j_salida.setText("j_salida");

        javax.swing.GroupLayout panel_imprimirLayout = new javax.swing.GroupLayout(panel_imprimir);
        panel_imprimir.setLayout(panel_imprimirLayout);
        panel_imprimirLayout.setHorizontalGroup(
            panel_imprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_imprimirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(97, 97, 97))
            .addGroup(panel_imprimirLayout.createSequentialGroup()
                .addGroup(panel_imprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_imprimirLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panel_imprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_imprimirLayout.createSequentialGroup()
                                .addComponent(lb_nit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_imprimirLayout.createSequentialGroup()
                                .addComponent(lb_ingreso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j_ingreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panel_imprimirLayout.createSequentialGroup()
                                .addComponent(lb_salida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j_salida, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_imprimirLayout.createSequentialGroup()
                                .addComponent(lb_total)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j_total, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_imprimirLayout.createSequentialGroup()
                                .addGroup(panel_imprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_placa)
                                    .addComponent(lb_tarifa))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j_tarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_imprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_imprimirLayout.createSequentialGroup()
                                    .addComponent(lb_nombre)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(j_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_imprimirLayout.createSequentialGroup()
                                    .addGroup(panel_imprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lb_vehiculo)
                                        .addComponent(lb_ticket))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel_imprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(j_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(j_vehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))))))
                    .addGroup(panel_imprimirLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(j_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_imprimirLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnAceptar)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        panel_imprimirLayout.setVerticalGroup(
            panel_imprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_imprimirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(32, 32, 32)
                .addGroup(panel_imprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nit)
                    .addComponent(j_nit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_imprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nombre)
                    .addComponent(j_nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_imprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_ticket)
                    .addComponent(j_id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_imprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_vehiculo)
                    .addComponent(j_vehiculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_imprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_placa)
                    .addComponent(j_placa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_imprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_tarifa)
                    .addComponent(j_tarifa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_imprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_ingreso)
                    .addComponent(j_ingreso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_imprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_salida)
                    .addComponent(j_salida))
                .addGap(18, 18, 18)
                .addGroup(panel_imprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_total)
                    .addComponent(j_total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_imprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        this.main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed


  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel j_id;
    private javax.swing.JLabel j_ingreso;
    private javax.swing.JLabel j_nit;
    private javax.swing.JLabel j_nombre;
    private javax.swing.JLabel j_placa;
    private javax.swing.JLabel j_salida;
    private javax.swing.JLabel j_tarifa;
    private javax.swing.JLabel j_total;
    private javax.swing.JLabel j_vehiculo;
    private javax.swing.JLabel lb_ingreso;
    private javax.swing.JLabel lb_nit;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_placa;
    private javax.swing.JLabel lb_salida;
    private javax.swing.JLabel lb_tarifa;
    private javax.swing.JLabel lb_ticket;
    private javax.swing.JLabel lb_total;
    private javax.swing.JLabel lb_vehiculo;
    private javax.swing.JPanel panel_imprimir;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}


