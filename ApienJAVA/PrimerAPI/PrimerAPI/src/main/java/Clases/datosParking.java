
package Clases;


public class datosParking {
    
    String id; 
    String tipo_vehiculo; 
    String placa; 
    String responsable; 
    String Tarifa; 
    String create_entrada;

    public datosParking(String id, String tipo_vehiculo, String placa, String responsable, String Tarifa, String create_entrada) {
        this.id = id;
        this.tipo_vehiculo = tipo_vehiculo;
        this.placa = placa;
        this.responsable = responsable;
        this.Tarifa = Tarifa;
        this.create_entrada = create_entrada;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getTarifa() {
        return Tarifa;
    }

    public void setTarifa(String Tarifa) {
        this.Tarifa = Tarifa;
    }

    public String getCreate_entrada() {
        return create_entrada;
    }

    public void setCreate_entrada(String create_entrada) {
        this.create_entrada = create_entrada;
    }
    
    
    
    
}
