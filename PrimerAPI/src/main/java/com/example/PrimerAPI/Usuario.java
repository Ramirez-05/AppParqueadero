package com.example.PrimerAPI;

public class Usuario {

    String id;
    String id_usuario;
    String email;
    String contrasenia;
    String tipo;
    String estado;

    public Usuario(String id, String id_usuario, String email, String contrasenia, String tipo, String estado) {
        this.id = id;
        this.id_usuario = id_usuario;
        this.email = email;
        this.contrasenia = contrasenia;
        this.tipo = tipo;
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   
}
