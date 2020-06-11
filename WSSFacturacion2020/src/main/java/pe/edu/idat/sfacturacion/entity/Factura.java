package pe.edu.idat.sfacturacion.entity;

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
@Table(name="factura")
public class Factura implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "numero")
	private int numero;
	@Column(name = "fecha")
	private String fecha;
	@Column(name = "tipo")
	private int tipo;
	@Column(name = "estado")
	private int estado;
	@Column(name = "subtotal")
	private Double subTotal;
	@Column(name = "igv")
	private Double igv;
	@Column(name = "total")
	private Double total;
	@Column(name = "tipoPago")
	private int tipoPago;
	@Column(name = "vista")
	private int vista;
	@JoinColumn(name = "cliente" , referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Cliente cliente;
	@JoinColumn(name = "usuario" , referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Usuario usuario;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "factura")
	private List<Detalle> listaDetalle;
	public Factura() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Factura(int id, int numero, String fecha, int tipo, int estado, Double subTotal, Double igv, Double total,
			int tipoPago, int vista, Cliente cliente, Usuario usuario) {
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
		this.cliente = cliente;
		this.usuario = usuario;		
	}
	public Factura(int id, int numero, String fecha, int tipo, int estado, Double subTotal, Double igv, Double total,
			int tipoPago, int vista, Cliente cliente, Usuario usuario, List<Detalle> listaDetalle) {
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
		this.cliente = cliente;
		this.usuario = usuario;
		this.listaDetalle = listaDetalle;
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
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<Detalle> getListaDetalle() {
		return listaDetalle;
	}
	public void setListaDetalle(List<Detalle> listaDetalle) {
		this.listaDetalle = listaDetalle;
	}
	
}
