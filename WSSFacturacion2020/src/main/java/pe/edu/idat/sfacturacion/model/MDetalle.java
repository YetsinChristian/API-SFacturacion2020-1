package pe.edu.idat.sfacturacion.model;

import pe.edu.idat.sfacturacion.entity.Detalle;

public class MDetalle {
	private int id;
	private Double precio;
	private int cantidad;
	private int idarticulo;
	private int idfactura;
	public MDetalle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MDetalle(Detalle detalle) {
		super();
		this.id = detalle.getId();
		this.precio = detalle.getPrecio();
		this.cantidad = detalle.getCantidad();
		this.idarticulo = detalle.getArticulo().getId();
		this.idfactura = detalle.getFactura().getId();
	}
	public MDetalle(int id, Double precio, int cantidad, int idarticulo, int idfactura) {
		super();
		this.id = id;
		this.precio = precio;
		this.cantidad = cantidad;
		this.idarticulo = idarticulo;
		this.idfactura = idfactura;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getIdarticulo() {
		return idarticulo;
	}

	public void setIdarticulo(int idarticulo) {
		this.idarticulo = idarticulo;
	}

	public int getIdfactura() {
		return idfactura;
	}

	public void setIdfactura(int idfactura) {
		this.idfactura = idfactura;
	}
}
