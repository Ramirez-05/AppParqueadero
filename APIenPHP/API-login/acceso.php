<?php 
    header("Access-Control-Allow-Origin: *");
    header("Access-Control-Allow-Methods: GET, POST");
    header("Access-Control-Allow-Headers: Content-Type");
    
    include '../Conexion.php';

    if ($_SERVER['REQUEST_METHOD'] == 'POST' && isset($_POST['correo']) && isset($_POST['contrasena'])) {
        $correo = $_POST['correo'];
        $contrasena = $_POST['contrasena'];

        try {
            $consulta = $base_de_datos->prepare("SELECT * FROM usuario WHERE email = :cor AND contrasenia = :con ");
            $consulta->bindParam(':cor', $correo);
            $consulta->bindParam(':con', $contrasena);
            $proceso = $consulta->execute();

            if ($proceso) {
                $usuario = $consulta->fetch(PDO::FETCH_ASSOC);
                $respuesta = [
                    'status' => true,
                    'message' => "OK##CLIENT##INSERT",
                    'registros' => $usuario
                ];
            } else {
                $respuesta = [
                    'status' => false,
                    'message' => "ERROR##CLIENT##INSERT"
                ];
            }
        } catch (Exception $e) {
            $respuesta = [
                'status' => false,
                'message' => "ERROR##SQL",
                'exception' => $e
            ];
        }
    } else {
        $respuesta = [
            'status' => false,
            'message' => "ERROR##DATOS##POST"
        ];
    }
    echo json_encode($respuesta);
?>
