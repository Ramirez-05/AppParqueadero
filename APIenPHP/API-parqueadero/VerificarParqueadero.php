<?php 
	header("Access-Control-Allow-Origin: * ");
	header("Access-Control-Allow-Methods: GET, POST");
	header("Access-Control-Allow-Headers: Content-Type");
    include '../Conexion.php';

    if (!empty($_POST['nit'])) {
        $nit = $_POST['nit'];

        try {
            $consulta = $base_de_datos->prepare("SELECT * FROM parqueadero WHERE nit = :nit");
            $consulta->bindParam(':nit', $nit);
            $consulta->execute();

            if ($consulta->rowCount() > 0) {
                $registros = $consulta->fetchAll(PDO::FETCH_ASSOC); // Obtener los registros como un arreglo asociativo
                $respuesta = [
                    'status' => true,
                    'registros' => $registros // Agregar los registros a la respuesta
                ];
                echo json_encode($respuesta);
            } else {
                $respuesta = [
                    'status' => false,
                    'message' => "No se encontraron resultados para el valor de 'nit' proporcionado."
                ];
                echo json_encode($respuesta);
            }
        } catch (Exception $e) {
            $respuesta = [
                'status' => false,
                'message' => "Error en la consulta SQL: " . $e->getMessage()
            ];
            echo json_encode($respuesta);
        }
    } else {
        $respuesta = [
            'status' => false,
            'message' => "El campo 'nit' en la solicitud POST está vacío."
        ];
        echo json_encode($respuesta);
    }
?>
