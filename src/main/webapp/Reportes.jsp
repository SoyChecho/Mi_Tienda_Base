<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <script type="text/javascript" src="js/jquery-3.6.0.min.js"></script>
    <script type="text/javascript" src="js/Reportes.js"></script>
    <title>Reportes-Tienda Generica</title>
    <link rel="stylesheet" href="estilo_reporte1.css">
</head>
<body>
    <h1>Tienda Generica</h1>
    <nav>
      <ul>
        <li><a href="Usuario.jsp" >Usuario</a></li>
        <li><a href="Cliente.jsp" >Clientes</a></li>
        <li><a href="Proveedor.jsp" >Proveedores</a></li>
        <li><a href="Producto.jsp" >Productos</a></li>
        <li><a href="Venta.jsp" >Ventas</a></li>
        <li><a href="Reportes.jsp" >Reportes</a></li>
      </ul>
    </nav>
    <section class="form-register">
    <h4>Listados de Reportes</h4>
    <button id="botons" class="usuario">Listado de Usuarios</button>
    <button id="botons2" class="cliente">Listado de Clientes</button>
    <button id="botons3" class="vencliente">Ventas por Cliente</button>
    </section>
    <!-- Tabla donde van a ir los datos -->
    <table class="tabla"></table>

</body>
</html>