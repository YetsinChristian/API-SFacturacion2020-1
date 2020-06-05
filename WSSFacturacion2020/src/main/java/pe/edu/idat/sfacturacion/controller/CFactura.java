package pe.edu.idat.sfacturacion.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.idat.sfacturacion.dao.entity.Factura;
import pe.edu.idat.sfacturacion.dao.repository.RFactura;
import pe.edu.idat.sfacturacion.model.MFactura;

@Component
public class CFactura {
	@Autowired
	private RFactura repository;
	@Autowired
	private CCliente compCliente;
	@Autowired
	private CUsuario compUsuario;
	
	public List<MFactura> lista(){
		List<MFactura> lista = new ArrayList<>();
		for(Factura a : ((List<Factura>)repository.findAll()).stream().filter(x->x.getVista()!=0).collect(Collectors.toList())) { 
			lista.add(new MFactura(a));
		}
		return lista;
	}
	
	public MFactura buscar(int id) {
		try {
			MFactura factura = null;
			for(MFactura a : lista().stream().filter(x->x.getId()==id).collect(Collectors.toList())) {
				factura = a;
			}
			return factura;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public String guardar(MFactura factura) {
		try {
			repository.save(invertir(factura));
			return "Factura registrada correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public String actualizar(MFactura factura) {
		try {
			repository.save(invertir(factura));
			return "Factura actualizada correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public String eliminar(MFactura factura) {
		try {
			Factura eliminar = invertir(factura);
			eliminar.setVista(0);
			repository.save(eliminar);
			return "Factura eliminada correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public Factura invertir(MFactura factura) {
		return new Factura(
				factura.getId(),
				factura.getNumero(),
				factura.getFecha(),
				factura.getTipo(),
				factura.getEstado(),
				factura.getSubTotal(),
				factura.getIgv(),
				factura.getTotal(),
				factura.getTipoPago(),
				factura.getVista(),
				compCliente.invertir(compCliente.buscar(factura.getIdcliente())),
				compUsuario.invertir(compUsuario.buscar(factura.getIdusuario()))
				);				
	}
}
