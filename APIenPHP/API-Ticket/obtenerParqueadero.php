<?php
header("Access-Control-Allow-Origin: *");
header("Access-Control-Allow-Methods: GET");
header("Access-Control-Allow-Headers: Content-Type");

include '../Conexion.php';

if ($_SERVER['REQUEST_METHOD'] == 'GET' && isset($_GET['id_usuario'])) {
    $id_usuario = $_GET['id_usuario'];

    try {
        $consulta = $base_de_datos->prepare("SELECT parqueadero.* 
                                            FROM parqueadero 
                                            INNER JOIN asignacion 
                                            ON parqueadero.nit = asignacion.id_parqueadero
                                            WHERE asignacion.id_usuario = :id_usuario");
        $consulta->bindParam(':id_usuario', $id_usuario);
        $proceso = $consulta->execute();

        if ($proceso) {
            $parqueaderos = $consulta->fetchAll(PDO::FETCH_ASSOC);
            $respuesta = [
                'success' => true,
                'message' => "Parqueaderos obtenidos exitosamente",
                'parqueaderos' => $parqueaderos
            ];
        } else {
            $respuesta = [
                'success' => false,
                'message' => "Error en la consulta"
            ];
        }
    } catch (Exception $e) {
        $respuesta = [
            'success' => false,
            'message' => "Error en la consulta",
            'exception' => $e
        ];
    }
} else {
    $respuesta = [
        'success' => false,
        'message' => "Datos incompletos"
    ];
}

echo json_encode($respuesta);
?>
