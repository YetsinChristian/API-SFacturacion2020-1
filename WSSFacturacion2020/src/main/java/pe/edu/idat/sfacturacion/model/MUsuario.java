package pe.edu.idat.sfacturacion.model;

import pe.edu.idat.sfacturacion.dao.entity.Usuario;

public class MUsuario {
	private int id;
	private String apellidos;
	private String nombres;
	private String dni;
	private String correo;
	private String telefono;
	private int rol;
	private String login;
	private String clave;
	private int vista;
	public MUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MUsuario(Usuario usuario) {
		super();
		this.id = usuario.getId();
		this.apellidos =usuario.getApellidos();
		this.nombres = usuario.getNombres();
		this.dni = usuario.getDni();
		this.correo = usuario.getCorreo();
		this.telefono = usuario.getTelefono();
		this.rol = usuario.getRol();
		this.login = usuario.getLogin();
		this.clave = usuario.getClave();
		this.vista = usuario.getVista();
	}
	
	
	public MUsuario(int id, String apellidos, String nombres, String dni, String correo, String telefono, int rol,
			String login, String clave, int vista) {
		super();
		this.id = id;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.dni = dni;
		this.correo = correo;
		this.telefono = telefono;
		this.rol = rol;
		this.login = login;
		this.clave = clave;
		this.vista = vista;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
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
	
	
}
