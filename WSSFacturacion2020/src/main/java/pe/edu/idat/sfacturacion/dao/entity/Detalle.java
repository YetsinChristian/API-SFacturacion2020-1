package pe.edu.idat.sfacturacion.dao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="detalle")
public class Detalle implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "precio")
	private Double precio;
	@Column(name = "cantidad")
	private int cantidad;
	@JoinColumn(name = "articulo", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Articulo articulo;
	@JoinColumn(name = "factura" , referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Factura factura;
	public Detalle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Detalle(int id, Double precio, int cantidad, Articulo articulo, Factura factura) {
		super();
		this.id = id;
		this.precio = precio;
		this.cantidad = cantidad;
		this.articulo = articulo;
		this.factura = factura;
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
	public Articulo getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	
	
}
