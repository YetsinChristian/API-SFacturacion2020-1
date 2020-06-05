package pe.edu.idat.sfacturacion.model;

import pe.edu.idat.sfacturacion.dao.entity.Cliente;

public class MCliente {
	private int id;
	private String ruc;
	private String razonSocial;
	private String direccion;
	private String telefono;
	private String correo;
	private int vista;
	public MCliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MCliente(Cliente cliente) {
		super();
		this.id = cliente.getId();
		this.ruc = cliente.getRuc();
		this.razonSocial = cliente.getRazonSocial();
		this.direccion = cliente.getDireccion();
		this.telefono = cliente.getTelefono();
		this.correo = cliente.getCorreo();
		this.vista = cliente.getVista();
	}
	
	public MCliente(int id, String ruc, String razonSocial, String direccion, String telefono, String correo, int vista) {
		super();
		this.id = id;
		this.ruc = ruc;
		this.razonSocial = razonSocial;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
		this.vista = vista;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getVista() {
		return vista;
	}
	public void setVista(int vista) {
		this.vista = vista;
	}
	
	
}	

