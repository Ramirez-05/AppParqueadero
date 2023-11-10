package com.example.PrimerAPI;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.http.ResponseEntity;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.JsonParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PrimerApiApplication {
    
    DataBase conexion = new DataBase();
    
    public static void main(String[] args) {
        SpringApplication.run(PrimerApiApplication.class, args);
    }

    @GetMapping("/")
    public String inicio(){
        return "Hola mundo";
    }
    
    @GetMapping("/listaTarifa")
    public List<Tarifa> obtener(){
        List<Tarifa> listado = conexion.obtener(conexion.manipularDB);
        return listado;
    }
    
    @GetMapping("/obtenerValor")
    public ResponseEntity<String> obtenerValor(@RequestParam String tipo_vehiculo) {
        String valor;

        try {
            valor = conexion.obtenerValor(conexion.manipularDB, tipo_vehiculo);
        } catch (SQLException ex) {
            System.out.println("Error en SELECT: " + ex.getMessage());
            return ResponseEntity.status(500).body("Error en la base de datos");
        }
        System.out.println(valor);
        return ResponseEntity.ok("{\"valor\": \"" + valor + "\"}");
    }

    @GetMapping("/actualizarTarifa")
    public ResponseEntity<List<Object>> actualizarTarifa(@RequestParam String tipoVehiculo, @RequestParam String nuevaTarifa) {
        boolean actualizacionExitosa = conexion.updateTarifa(conexion.manipularDB,tipoVehiculo, nuevaTarifa);

        List<Object> resultado = new ArrayList<>();
        resultado.add(actualizacionExitosa);
        resultado.add(actualizacionExitosa ? "La tarifa se actualizó correctamente." : "Error al actualizar la tarifa.");

        return ResponseEntity.ok(resultado);
    }

    @GetMapping("/iniciarSesion")
    public Usuario inicioSesion(@RequestParam String correo, @RequestParam String contrasena) throws SQLException{
        return conexion.iniciarSesion(conexion.manipularDB, correo, contrasena);
    }
    
    @GetMapping("/consultarPlaca")
    public Respuesta consultarPlaca(@RequestParam String placa) {
        try {
            String resultadoConsulta = conexion.consultarPlaca(conexion.manipularDB,placa);
            Gson gson = new Gson();
            Respuesta respu = gson.fromJson(resultadoConsulta, Respuesta.class);
            return respu;
        } catch (SQLException e) {
            JsonObject json = new JsonObject();
            json.addProperty("status", Boolean.FALSE);
            json.addProperty("message", "La placa no existe");
            
            Gson gson = new Gson();
            Respuesta respu = gson.fromJson(json, Respuesta.class);
            return respu;
        }
    }


}
