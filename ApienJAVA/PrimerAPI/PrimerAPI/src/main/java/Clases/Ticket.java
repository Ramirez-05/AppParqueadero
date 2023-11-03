
package Clases;

public class Ticket {
    String placa;
    String asignacion;
    String tarifa;

    public Ticket(String placa, String asignacion, String tarifa) {
        this.placa = placa;
        this.asignacion = asignacion;
        this.tarifa = tarifa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(String asignacion) {
        this.asignacion = asignacion;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }
    
    
}
