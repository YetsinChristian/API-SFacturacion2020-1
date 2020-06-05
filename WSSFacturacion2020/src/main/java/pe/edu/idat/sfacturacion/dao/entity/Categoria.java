package pe.edu.idat.sfacturacion.dao.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="categoria")
public class Categoria implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="vista")
	private int vista;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "categoria")
	private List<Articulo> listaArticulo;
	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Categoria(int id, String descripcion, int vista) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.vista = vista;
		
	}
	public Categoria(int id, String descripcion, int vista, List<Articulo> listaArticulo) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.vista = vista;
		this.listaArticulo = listaArticulo;
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
	public List<Articulo> getListaArticulo() {
		return listaArticulo;
	}
	public void setListaArticulo(List<Articulo> listaArticulo) {
		this.listaArticulo = listaArticulo;
	}
	
	
}
