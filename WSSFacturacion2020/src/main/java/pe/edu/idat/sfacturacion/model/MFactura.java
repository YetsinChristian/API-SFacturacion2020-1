package pe.edu.idat.sfacturacion.model;


import pe.edu.idat.sfacturacion.entity.Factura;


public class MFactura {
	private int id;
	private int numero;
	private String fecha;
	private int tipo;
	private int estado;
	private Double subTotal;
	private Double igv;
	private Double total;
	private int tipoPago;
	private int vista;
	private int idcliente;
	private int idusuario;
	public MFactura() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MFactura(Factura factura) {
		super();
		this.id = factura.getId();
		this.numero = factura.getNumero();
		this.fecha = factura.getFecha();
		this.tipo = factura.getTipo();
		this.estado = factura.getEstado();
		this.subTotal = factura.getSubTotal();
		this.igv = factura.getIgv();
		this.total = factura.getTotal();
		this.tipoPago = factura.getTipo();
		this.vista = factura.getVista();
		this.idcliente = factura.getCliente().getId();
		this.idusuario = factura.getUsuario().getId();
	}
	
	public MFactura(int id, int numero, String fecha, int tipo, int estado, Double subTotal, Double igv, Double total,
			int tipoPago, int vista, int idcliente, int idusuario) {
		super();
		this.id = id;
		this.numero = numero;
		this.fecha = fecha;
		this.tipo = tipo;
		this.estado = estado;
		this.subTotal = subTotal;
		this.igv = igv;
		this.total = total;
		this.tipoPago = tipoPago;
		this.vista = vista;
		this.idcliente = idcliente;
		this.idusuario = idusuario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public Double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}
	public Double getIgv() {
		return igv;
	}
	public void setIgv(Double igv) {
		this.igv = igv;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public int getTipoPago() {
		return tipoPago;
	}
	public void setTipoPago(int tipoPago) {
		this.tipoPago = tipoPago;
	}
	public int getVista() {
		return vista;
	}
	public void setVista(int vista) {
		this.vista = vista;
	}
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	
	
	
}
