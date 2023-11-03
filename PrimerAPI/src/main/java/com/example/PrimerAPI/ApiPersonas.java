package com.example.PrimerAPI;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import Clases.Persona;
import Clases.ToolsApi;
import PackagesDB.Personas;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class ApiPersonas {


    private final Personas personasDB = new Personas();

    @GetMapping("/listarPersonas")
    public ResponseEntity<Object> obtenerPersonas() {
        return ResponseEntity.ok(personasDB.listaPersonas());
    }

    @PostMapping("/insertarPersona")
    public ResponseEntity<Object> insertarPersona(@RequestBody Persona persona) {
        boolean insercionExitosa = personasDB.insertarPersona(persona);
        if (insercionExitosa) {
            return ResponseEntity.ok(ToolsApi.createMaps(true, "Persona insertada con éxito"));
        } else {
            return ResponseEntity.badRequest().body(ToolsApi.createMaps(false, "Error al insertar persona"));
        }
    }

    @PutMapping("/actualizarPersona")
    public ResponseEntity<Object> actualizarPersona(@RequestBody Persona persona) {
        boolean actualizacionExitosa = personasDB.actualizarPersona(persona);
        if (actualizacionExitosa) {
            return ResponseEntity.ok(ToolsApi.createMaps(true, "Persona actualizada con éxito"));
        } else {
            return ResponseEntity.badRequest().body(ToolsApi.createMaps(false, "Error al actualizar persona"));
        }
    }

    @DeleteMapping("/eliminarPersona")
    public ResponseEntity<Object> eliminarPersona(@RequestParam("cedula") String cedula) {
        boolean eliminacionExitosa = personasDB.eliminarPersona(cedula);
        if (eliminacionExitosa) {
            return ResponseEntity.ok(ToolsApi.createMaps(true, "Persona eliminada con éxito"));
        } else {
            return ResponseEntity.badRequest().body(ToolsApi.createMaps(false, "Error al eliminar persona"));
        }
    }
    
}
