package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import Modelo.ClienteDAO;
import Modelo.ClienteDTO;
import Modelo.UsuarioDAO;
import Modelo.UsuarioDTO;
import Modelo.VentasClienteDAO;
import Modelo.VentasClienteDTO;

/**
 * Servlet implementation class Reportes
 */
@WebServlet("/Reportes")
public class Reportes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reportes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Recibir la peticion del javascript
        String op = request.getParameter("opcion");
        PrintWriter salida = response.getWriter();// se recibe un arraylist que hay que convertirlo en json
        Gson datos = new Gson();

        if (op.equals("Usuario")) {// si la opcions de javascript
            UsuarioDAO usDao = new UsuarioDAO();
            ArrayList<UsuarioDTO> lista = new ArrayList<>();
            lista = usDao.cargarUsuario();// cargarLibros me retorna el array list
            salida.println(datos.toJson(lista));// enviar el json cuando la opcion sea libros

        }

        if (op.equals("Cliente")) {
            ClienteDAO cliDao = new ClienteDAO();
            ArrayList<ClienteDTO> lista = new ArrayList<>();
            lista = cliDao.cargarCliente();
            salida.println(datos.toJson(lista));
        }
        
        if (op.equals("VenCliente")) {
            VentasClienteDAO cliDao = new VentasClienteDAO();
            ArrayList<VentasClienteDTO> lista = new ArrayList<>();
            lista = cliDao.cargarVentasCliente();
            salida.println(datos.toJson(lista));
        }

    }

	}


