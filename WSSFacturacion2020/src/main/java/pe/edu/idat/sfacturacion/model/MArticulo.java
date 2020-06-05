package pe.edu.idat.sfacturacion.model;

import pe.edu.idat.sfacturacion.dao.entity.Articulo;

public class MArticulo {
	private int id;
	private String descripcion;
	private Double precio;
	private int stock;
	private int vista;
	private int idmarca;
	private int idcategoria;
	public MArticulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MArticulo(Articulo articulo) {
		super();
		this.id = articulo.getId();
		this.descripcion = articulo.getDescripcion();
		this.precio = articulo.getPrecio();
		this.stock = articulo.getStock();
		this.vista = articulo.getVista();
		this.idmarca = articulo.getMarca().getId();
		this.idcategoria = articulo.getCategoria().getId();
	}
	public MArticulo(int id, String descripcion, Double precio, int stock, int vista, int idmarca,
			int idcategoria) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
		this.vista = vista;
		this.idmarca = idmarca;
		this.idcategoria = idcategoria;
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
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getVista() {
		return vista;
	}
	public void setVista(int vista) {
		this.vista = vista;
	}
	public int getIdmarca() {
		return idmarca;
	}
	public void setIdmarca(int idmarca) {
		this.idmarca = idmarca;
	}
	public int getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}
}
