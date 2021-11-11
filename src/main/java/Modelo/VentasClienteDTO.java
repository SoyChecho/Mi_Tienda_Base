package Modelo;

public class VentasClienteDTO {
	
	private int Cedula;
	private String Cliente;
	private double totalVenta;
	
	
	public VentasClienteDTO(int cedula, String cliente, double totalVenta) {
		//super();
		Cedula = cedula;
		Cliente = cliente;
		this.totalVenta = totalVenta;
	}


	public int getCedula() {
		return Cedula;
	}


	public void setCedula(int cedula) {
		Cedula = cedula;
	}


	public String getCliente() {
		return Cliente;
	}


	public void setCliente(String cliente) {
		Cliente = cliente;
	}


	public double getTotalVenta() {
		return totalVenta;
	}


	public void setTotalVenta(double totalVenta) {
		this.totalVenta = totalVenta;
	}
	
	
	

}
