package pe.edu.idat.sfacturacion.model;

import pe.edu.idat.sfacturacion.entity.Marca;

public class MMarca {
	private int id;
	private String descripcion;
	private int vista;
	public MMarca() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MMarca(Marca marca) {
		super();
		this.id = marca.getId();
		this.descripcion = marca.getDescripcion();
		this.vista = marca.getVista();
	}	
	
	public MMarca(int id, String descripcion, int vista) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.vista = vista;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getVista() {
		return vista;
	}
	public void setVista(int vista) {
		this.vista = vista;
	}
	
	
}
