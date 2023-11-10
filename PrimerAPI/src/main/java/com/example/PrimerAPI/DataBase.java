package com.example.PrimerAPI;

import com.google.gson.JsonObject;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    
    Connection conexion;
    Statement manipularDB;
    
    public DataBase(){
        String hostname = "localhost";
        String puerto = "3306";
        String user_name = "root";
        String password = "";
        String database_name = "parqueadero";
        
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+database_name;
        
        try {
            this.conexion = DriverManager.getConnection(url, user_name, password);
            this.manipularDB = this.conexion.createStatement();
            System.out.println("Conexion a DataBase Exitosa.");
        } catch (SQLException ex) {
            System.out.println("Error en conexion a base de dato: "+ex.getMessage());
        }
    }
    
    public static List<Tarifa> obtener(Statement manipularDB) {
        List<Tarifa> lista = new ArrayList<>();

        try {
            String consulta = "SELECT * FROM tarifas";
            ResultSet listado = manipularDB.executeQuery(consulta);

            while (listado.next()) {
                String id = listado.getString("id");
                String tipo_vehiculo = listado.getString("tipo_vehiculo");
                String tarifa_p = listado.getString("Tarifa");

                Tarifa tarifa = new Tarifa(id, tipo_vehiculo, tarifa_p);
                lista.add(tarifa);
            }
        } catch (SQLException ex) {
            System.out.println("Error en SELECT: " + ex.getMessage());
        }

        return lista;
    }
    
    public String obtenerValor(Statement manipularDB, String tipo_vehiculo) throws SQLException {
        String consulta = "SELECT tarifa FROM tarifas WHERE tipo_vehiculo = ?";
        String valor = null;

        PreparedStatement statement = conexion.prepareStatement(consulta);
        statement.setString(1, tipo_vehiculo); // Establecer el parámetro tipo_vehiculo

        try (ResultSet resultado = statement.executeQuery()) {
            if (resultado.next()) {
                valor = resultado.getString("tarifa"); // Obtener el valor de la columna "tarifa"
            }
        }
        return valor;
    }
    
    public boolean updateTarifa(Statement manipularDB,String tipo_vehiculo, String nuevaTarifa) {
        String consulta = "UPDATE tarifas SET Tarifa = ? WHERE tipo_vehiculo = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, nuevaTarifa);
            statement.setString(2, tipo_vehiculo);

            int filasAfectadas = statement.executeUpdate();

            return filasAfectadas > 0;

        } catch (SQLException e) {
            System.out.println("Error al hacer UPDATE");
            return false;
        }
    }
    
    public Usuario iniciarSesion(Statement manipularDB, String correo, String contrasena) throws SQLException {
        String consulta = "SELECT * FROM usuario WHERE email = ? AND contrasenia = ? ";
        PreparedStatement statement = conexion.prepareStatement(consulta);
        statement.setString(1, correo);
        statement.setString(2, contrasena);

        ResultSet respuesta = statement.executeQuery();
        if (respuesta.next()) {
            return new Usuario(
                respuesta.getString("id"),
                respuesta.getString("id_persona"),
                respuesta.getString("email"),
                respuesta.getString("contrasenia"),
                respuesta.getString("tipo"),
                respuesta.getString("estado")
            );
        } else {
            return null;
        }
    }
    
    public String consultarPlaca(Statement manipularDB, String placa) throws SQLException {
        try {
            String consulta = "SELECT ticket.*, registro_vehiculos.responsable, tarifas.tipo_vehiculo " +
                    "FROM ticket " +
                    "LEFT JOIN registro_vehiculos ON ticket.placa = registro_vehiculos.placa " +
                    "LEFT JOIN tarifas ON ticket.id_tarifa = tarifas.id " +
                    "WHERE ticket.placa = ?";

            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, placa);

            ResultSet resultado = statement.executeQuery();

            if (resultado.next()) {
                String responsable = resultado.getString("responsable");
                String tipoVehiculo = resultado.getString("tipo_vehiculo");
                JsonObject json = new JsonObject();
                json.addProperty("status", Boolean.TRUE);
                json.addProperty("message", "La placa ya existe en la tabla de tickets");
                json.addProperty("responsable", responsable);
                json.addProperty("tipo_vehiculo", tipoVehiculo);
                return json.toString();
            } else {
                JsonObject json = new JsonObject();
                json.addProperty("status", Boolean.FALSE);
                json.addProperty("message", "La placa no existe en la tabla de tickets");
                return json.toString();
            }
        } catch (SQLException e) {
            JsonObject json = new JsonObject();
            json.addProperty("status", Boolean.FALSE);
            json.addProperty("message", "Error en la consulta");
            json.addProperty("exception", e.getMessage());

            return json.toString();
        }
    }
    
}