package PackagesDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class insertRegistro extends DataBase{
    public boolean insertRegistro(String placa, String responsable){
     boolean respuesta = false;

    try {
        String consulta = "INSERT INTO parqueadero (placa, responsable) VALUES ('"+placa+"','"+responsable+"')";
        int resultado = this.manipularDB.executeUpdate(consulta);
        if (resultado==1) {
                respuesta = true;
        }
    } catch (SQLException ex) {
            System.out.println("Error al insertar p: "+ex.getMessage());
    }
        
    return respuesta;
}
    
}


