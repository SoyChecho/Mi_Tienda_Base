$(document).ready(function () {

	function listaUsuario() {
    //conexcion con servelet apartir de ajax
    $.ajax({
      type: "post",
      url: "Reportes", //nombre del servelet
      dataType: "json",
      data: { opcion: "Usuario" }, //enviar parametros al sevelet con la data que envio//variable opcion valor Libros
      success: function (result) {
        console.log(result);

        //llamar la tabla del jsp
        var tabla = document.querySelector(".tabla"); //queryselector nos permite traer la clase tabla del jsp
        tabla.innerHTML = ""; //vacio para que me limpie la tabla al recargar
        //tr es el encabezado de la tabla
        tabla.innerHTML += `<tr> 
				<th>Cedula</th>
				<th>Usuario</th>
				<th>Nombre</th>
				<th>Contraseña</th>
				<th>Correo</th>
				</tr>`;
        //llenar datos de la tabla - Se invoca la variable en el orden que esta en ls JSON O DTO e igual de escritos
        for (let fila of result) {
          tabla.innerHTML += `<tr>
					<td>${fila.Cedula}</td>
					<td>${fila.Usuario}</td>
					<td>${fila.Nombre}</td>
					<td>${fila.Contrasena}</td>
					<td>${fila.Correo}</td>
					</tr>`;
        }
      },
    });
  }

  function listaCliente() {
    //conexcion con servelet apartir de ajax
    $.ajax({
      type: "post",
      url: "Reportes", //nombre del servelet
      dataType: "json",
      data: { opcion: "Cliente" }, //enviar parametros al sevelet con la data que envio//variable opcion valor Libros
      success: function (result) {
        console.log(result);

        //llamar la tabla del jsp
        var tabla = document.querySelector(".tabla"); //queryselector nos permite traer la clase tabla del jsp
        tabla.innerHTML = ""; //vacio para que me limpie la tabla al recargar
        //tr es el encabezado de la tabla
        tabla.innerHTML += `<tr> 
				<th>Cedula</th>
				<th>Telefono</th>
				<th>Nombre</th>
				<th>Correo</th>
				<th>Direccion</th>
				</tr>`;
        //llenar datos de la tabla - Se invoca la variable en el orden que esta en ls JSON O DTO e igual de escritos
        for (let fila of result) {
          tabla.innerHTML += `<tr>
					<td>${fila.Cedula}</td>
					<td>${fila.Telefono}</td>
					<td>${fila.Nombre}</td>
					<td>${fila.Correo}</td>
					<td>${fila.Direccion}</td>
					</tr>`;
        }
      },
    });
  }


  function listaVencliente() {
    //conexcion con servelet apartir de ajax
    $.ajax({
      type: "post",
      url: "Reportes", //nombre del servelet
      dataType: "json",
      data: { opcion: "VenCliente" }, //enviar parametros al sevelet con la data que envio//variable opcion valor Libros
      success: function (result) {
        console.log(result);

        //llamar la tabla del jsp
        var tabla = document.querySelector(".tabla"); //queryselector nos permite traer la clase tabla del jsp
        tabla.innerHTML = ""; //vacio para que me limpie la tabla al recargar
        //tr es el encabezado de la tabla
        tabla.innerHTML += `<tr> 
				<th>Cedula</th>
				<th>Nombre</th>
				<th>Valor Total Venta</th>
				</tr>`;
        //llenar datos de la tabla - Se invoca la variable en el orden que esta en ls JSON O DTO e igual de escritos
        for (let fila of result) {
          tabla.innerHTML += `<tr>
					<td>${fila.Cedula}</td>
					<td>${fila.Cliente}</td>
					<td>${fila.totalVenta}</td>
					</tr>`;
        }
      },
    });
  }
  //botton LIBROS en jsp//al hacer clck alla, llama la funcion lista libros de aca el jacascript
  $(".usuario").on("click", function () {
    listaUsuario();
  });
  $(".cliente").on("click", function () {
    listaCliente();
  });
  $(".vencliente").on("click", function () {
    listaVencliente();
  });
});