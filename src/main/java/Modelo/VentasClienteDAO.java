package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class VentasClienteDAO {
	
	
	Conexion cnn = new Conexion();
	Connection con = cnn.Conecta();
	PreparedStatement ps = null;
	ResultSet res = null;
	
	 //METODO PARA CONSULTAR TODOS LOS LIBROS Y EN SERVELET LO DEL JSON
	 public ArrayList<VentasClienteDTO> cargarVentasCliente(){
		 VentasClienteDTO us = null;
		 ArrayList<VentasClienteDTO> lista=new ArrayList<>();//para que cada libro se sume a la lista
		 //consulta en base dedatos
		 try {
			 String sql="select c.cedula_cliente,c.nombre_cliente,sum(v.total_venta) from clientes as c inner join ventas as v on c.cedula_cliente = v.cedula_cliente group by cedula_cliente";
			 ps = con.prepareStatement(sql);
			 res = ps.executeQuery();
			 while(res.next()){//recorrer el resultado de la consulta
				 //cada vez que el l.next me lea cada linea de la consulta, me crea un libro, y me lo agrega al arrylist
				 us = new VentasClienteDTO(res.getInt(1),res.getString(2),res.getInt(3));
				 lista.add(us);
			 }
		 }catch(SQLException ex) {
			 JOptionPane.showMessageDialog(null,"Error al cargar las Ventas por Cliente"+ex);
		 }
		 return lista;
	 }
}
