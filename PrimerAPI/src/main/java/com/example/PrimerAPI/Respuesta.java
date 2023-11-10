package com.example.PrimerAPI;

public class Respuesta {
    
    boolean status;
    String message;
    String responsable;
    String tipo_vehiculo;


    public Respuesta(boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    public Respuesta(boolean status, String message, String responsable, String tipo_vehiculo) {
        this.status = status;
        this.message = message;
        this.responsable = responsable;
        this.tipo_vehiculo = tipo_vehiculo;
    }
   
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    
    
    
}
