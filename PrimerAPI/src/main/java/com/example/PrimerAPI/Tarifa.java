package com.example.PrimerAPI;


public class Tarifa {
    private String id;
    private String tipo_vehiculo;
    private String Tarifa;

    public Tarifa(String id, String tipo_vehiculo, String Tarifa) {
        this.id = id;
        this.tipo_vehiculo = tipo_vehiculo;
        this.Tarifa = Tarifa;
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

    public String getTarifa() {
        return Tarifa;
    }

    public void setTarifa(String Tarifa) {
        this.Tarifa = Tarifa;
    }

    
  
}
