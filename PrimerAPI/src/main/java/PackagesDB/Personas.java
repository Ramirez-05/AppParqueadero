
package PackagesDB;

import java.sql.ResultSet;
import java.sql.SQLException;
import Clases.Persona;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Personas extends DataBase {

    public Personas() {
        super();
    }

    public List<Persona> listaPersonas() {
        List<Persona> lista = new ArrayList<>();

        try {
            String consulta = "SELECT * FROM persona";
            PreparedStatement preparedStatement = conexion.prepareStatement(consulta);
            ResultSet listado = preparedStatement.executeQuery();

            while (listado.next()) {
                lista.add(new Persona(
                        listado.getString("cedula"),
                        listado.getString("nombres"),
                        listado.getString("apellidos"),
                        listado.getString("telefono"),
                        listado.getString("email")
                ));
            }
        } catch (SQLException ex) {
            System.out.println("Error en SELECT: " + ex.getMessage());
        }
        return lista;
    }

    public boolean insertarPersona(Persona persona) {
        try {
            String consulta = "INSERT INTO persona (cedula, nombres, apellidos, telefono, email) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conexion.prepareStatement(consulta);
            preparedStatement.setString(1, persona.getCedula());
            preparedStatement.setString(2, persona.getNombres());
            preparedStatement.setString(3, persona.getApellidos());
            preparedStatement.setString(4, persona.getTelefono());
            preparedStatement.setString(5, persona.getEmail());

            int resultado = preparedStatement.executeUpdate();
            return resultado > 0;
        } catch (SQLException ex) {
            System.out.println("Error al insertar persona: " + ex.getMessage());
            return false;
        }
    }

    public boolean actualizarPersona(Persona persona) {
        try {
            String consulta = "UPDATE persona SET nombres = ?, apellidos = ?, telefono = ?, email = ? WHERE cedula = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(consulta);
            preparedStatement.setString(1, persona.getNombres());
            preparedStatement.setString(2, persona.getApellidos());
            preparedStatement.setString(3, persona.getTelefono());
            preparedStatement.setString(4, persona.getEmail());
            preparedStatement.setString(5, persona.getCedula());

            int resultado = preparedStatement.executeUpdate();
            return resultado > 0;
        } catch (SQLException ex) {
            System.out.println("Error al actualizar persona: " + ex.getMessage());
            return false;
        }
    }

    public boolean eliminarPersona(String cedula) {
        try {
            String consulta = "DELETE FROM persona WHERE cedula = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(consulta);
            preparedStatement.setString(1, cedula);

            int resultado = preparedStatement.executeUpdate();
            return resultado > 0;
        } catch (SQLException ex) {
            System.out.println("Error al eliminar persona: " + ex.getMessage());
            return false;
        }
    }
}


