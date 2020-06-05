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
@Table(name="usuario")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="nombres")
	private String nombres;
	@Column(name="dni")
	private String dni;
	@Column(name="correo")
	private String correo;
	@Column(name="telefono")
	private String telefono;
	@Column(name="rol")
	private int rol;
	@Column(name="vista")
	private int vista;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
	private List<Factura> listaFactura;
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Usuario(int id, String apellidos, String nombres, String dni, String correo, String telefono, int rol,
			int vista) {
		super();
		this.id = id;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.dni = dni;
		this.correo = correo;
		this.telefono = telefono;
		this.rol = rol;
		this.vista = vista;		
	}
	public Usuario(int id, String apellidos, String nombres, String dni, String correo, String telefono, int rol,
			int vista, List<Factura> listaFactura) {
		super();
		this.id = id;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.dni = dni;
		this.correo = correo;
		this.telefono = telefono;
		this.rol = rol;
		this.vista = vista;
		this.listaFactura = listaFactura;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getRol() {
		return rol;
	}
	public void setRol(int rol) {
		this.rol = rol;
	}
	public int getVista() {
		return vista;
	}
	public void setVista(int vista) {
		this.vista = vista;
	}
	public List<Factura> getListaFactura() {
		return listaFactura;
	}
	public void setListaFactura(List<Factura> listaFactura) {
		this.listaFactura = listaFactura;
	}
	
}
