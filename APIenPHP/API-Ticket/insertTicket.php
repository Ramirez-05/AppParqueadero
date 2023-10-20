<?php 
    header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
    header("Access-Control-Allow-Methods: GET, POST");
    header("Access-Control-Allow-Headers: Content-Type");
    
    include '../Conexion.php';

    if (!empty($_POST['placa']) and !empty($_POST['tipo_vehiculo']) and !empty($_POST['responsable'])) {

        $placa = $_POST['placa'];
        $tipo_vehiculo = $_POST['tipo_vehiculo'];
        $responsable = $_POST['responsable'];

        try {
            $consulta = $base_de_datos->prepare("INSERT INTO registro_vehiculos (placa, tipo_vehiculo, responsable) VALUES(:pla, :tipo, :respon)");
            
            $consulta->bindParam(':pla', $placa);
            $consulta->bindParam(':tipo', $tipo_vehiculo);
            $consulta->bindParam(':respon', $responsable);
            
            
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