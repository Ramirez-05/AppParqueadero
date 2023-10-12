<?php 
    header("Access-Control-Allow-Origin: *");
    header("Access-Control-Allow-Methods: GET, POST");
    header("Access-Control-Allow-Headers: Content-Type");
    
    include '../Conexion.php';

    if (!empty($_POST['tarifa']) && !empty($_POST['tipo_vehiculo'])) {

        $tarifa = $_POST['tarifa'];
        $tipo_vehiculo = $_POST['tipo_vehiculo'];

        try {
            $consulta = $base_de_datos->prepare("UPDATE tarifas SET tarifa=:tar WHERE tipo_vehiculo = :tip ");

            $consulta->bindParam(':tar', $tarifa);
            $consulta->bindParam(':tip', $tipo_vehiculo);
            
            $proceso = $consulta->execute();

            if( $proceso ){
                $respuesta = [
                                'status' => true,
                                'message' => "OK##TARIFA##UPDATE"
                              ];
                echo json_encode($respuesta);
            } else {
                $respuesta = [
                                'status' => false,
                                'message' => "ERROR##TARIFA##UPDATE"
                              ];
                echo json_encode($respuesta);
            }
        } catch (Exception $e) {
            $respuesta = [
                            'status' => false,
                            'message' => "ERROR##SQL",
                            'exception' => $e
                          ];
            echo json_encode($respuesta);
        }
    } else {
        $respuesta = [
                        'status' => false,
                        'message' => "ERROR##DATOS##POST"
                      ];
        echo json_encode($respuesta);
    }
} else {
    // Si no se recibió el valor de "nit" en la solicitud POST, devolver una respuesta JSON de error
    $respuesta = [
        'status' => false,
        'message' => "ERROR##DATOS##POST"
    ];
    echo json_encode($respuesta);
}
?>
