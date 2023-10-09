<?php
header("Access-Control-Allow-Origin: *");
header("Access-Control-Allow-Methods: GET, POST");
header("Access-Control-Allow-Headers: Content-Type");

include '../Conexion.php';

if (!empty($_POST['nit']) && !empty($_POST['nombre']) && !empty($_POST['direccion']) && !empty($_POST['telefono'])) {

    $nit = $_POST['nit'];
    $nombre = $_POST['nombre'];
    $direccion = $_POST['direccion'];
    $telefono = $_POST['telefono'];

    try {
        $query_nit = $base_de_datos->prepare("SELECT id FROM parqueadero WHERE nit = :nit");
        $query_nit->bindParam(':nit', $nit); // Corregido el nombre de la variable
        $query_nit->execute(); // Cambiado $captureNit por $query_nit

        $result = $query_nit->fetch(PDO::FETCH_ASSOC);

        if ($result) {

            $consulta = $base_de_datos->prepare("UPDATE parqueadero SET nombre=:nom, direccion=:dir, telefono=:tel WHERE id = :eje ");

            $consulta->bindParam(':nom', $nombre);
            $consulta->bindParam(':dir', $direccion);
            $consulta->bindParam(':tel', $telefono);
            $consulta->bindParam(':eje', $result['id']); // Usar el ID obtenido de la consulta

            $proceso = $consulta->execute();

            if ($proceso) {
                $respuesta = [
                    'status' => true,
                    'message' => "OK##PARQUEADERO##UPDATE"
                ];
                echo json_encode($respuesta);
            } else {
                $respuesta = [
                    'status' => false,
                    'message' => "ERROR##PARQUEADERO##UPDATE"
                ];
                echo json_encode($respuesta);
            }
        } else {
            $respuesta = [
                'status' => false,
                'message' => "ERROR##IDNOTEXIST##POST"
            ];
            echo json_encode($respuesta);
        }
    } catch (Exception $e) {
        $respuesta = [
            'status' => false,
            'message' => "ERROR##SQL",
            'exception' => $e->getMessage()
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
?>