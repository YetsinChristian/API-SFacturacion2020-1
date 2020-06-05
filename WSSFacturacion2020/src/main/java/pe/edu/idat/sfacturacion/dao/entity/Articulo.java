package pe.edu.idat.sfacturacion.dao.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="articulo")
public class Articulo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="precio")
	private Double precio;
	@Column(name="stock")
	private int stock;
	@Column(name="vista")
	private int vista;
	@JoinColumn(name ="marca" , referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Marca marca;
	@JoinColumn(name ="categoria" , referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Categoria categoria;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "articulo")
	private List<Detalle> listaDetalle;
	
	public Articulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Articulo(int id, String descripcion, Double precio, int stock, int vista, Marca marca, Categoria categoria) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
		this.vista = vista;
		this.marca = marca;
		this.categoria = categoria;		
	}
	public Articulo(int id, String descripcion, Double precio, int stock, int vista, Marca marca, Categoria categoria,
			List<Detalle> listaDetalle) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
		this.vista = vista;
		this.marca = marca;
		this.categoria = categoria;
		this.listaDetalle = listaDetalle;
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
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public List<Detalle> getListaDetalle() {
		return listaDetalle;
	}
	public void setListaDetalle(List<Detalle> listaDetalle) {
		this.listaDetalle = listaDetalle;
	}
		
}
