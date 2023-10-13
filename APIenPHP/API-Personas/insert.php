<?php 
    header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
    header("Access-Control-Allow-Methods: GET, POST");
    header("Access-Control-Allow-Headers: Content-Type");
    
    include '../Conexion.php';

    if (!empty($_POST['nombre']) and !empty($_POST['apellidos']) and !empty($_POST['cedula']) and !empty($_POST['celular']) ) {

        $nombre = $_POST['nombre'];
        $apellidos = $_POST['apellidos'];
        $cedula = $_POST['cedula'];
        $celular = $_POST['celular'];

        try {
            $consulta = $base_de_datos->prepare("INSERT INTO persona (nombre, apellidos, cedula, celular) VALUES(:nom, :ape, :ced, :cel) ");
            
            $consulta->bindParam(':nom', $nombre);
            $consulta->bindParam(':ape', $apellidos);
            $consulta->bindParam(':ced', $cedula);
            $consulta->bindParam(':cel', $celular);
            
            $proceso = $consulta->execute();

            if( $proceso ){
                $respuesta = [
                                'status' => true,
                                'mesagge' => "OK##PERSONA##INSERT"
                              ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                                'status' => false,
                                'mesagge' => "ERROR##PERSONA##INSERT"
                              ];
                echo json_encode($respuesta);
            }
        } catch (Exception $e) {
            $respuesta = [
                            'status' => false,
                            'mesagge' => "ERROR##SQL",
                            'exception' => $e
                          ];
            echo json_encode($respuesta);
        }
    }else{
        $respuesta = [
                        'status' => false,
                        'mesagge' => "ERROR##DATOS##POST"
                      ];
        echo json_encode($respuesta);
    }
?>
