package Clases;

public class Registro {
    String placa;
    String responsable;

    public Registro(String placa, String responsable) {
        this.placa = placa;
        this.responsable = responsable;
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
    
    
}
