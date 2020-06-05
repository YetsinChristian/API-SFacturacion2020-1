package pe.edu.idat.sfacturacion.model;

import pe.edu.idat.sfacturacion.dao.entity.Categoria;

public class MCategoria {
	private int id;
	private String descripcion;
	private int vista;
	public MCategoria() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MCategoria(Categoria categoria) {
		super();
		this.id = categoria.getId();
		this.descripcion = categoria.getDescripcion();
		this.vista = categoria.getVista();
	}
	
	public MCategoria(int id, String descripcion, int vista) {
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
