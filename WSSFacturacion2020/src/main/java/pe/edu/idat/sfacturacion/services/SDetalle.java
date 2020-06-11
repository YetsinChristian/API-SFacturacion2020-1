package pe.edu.idat.sfacturacion.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.idat.sfacturacion.entity.Detalle;
import pe.edu.idat.sfacturacion.model.MDetalle;
import pe.edu.idat.sfacturacion.repository.RDetalle;

@Component
public class SDetalle {
	@Autowired
	private RDetalle repository;
	@Autowired
	private SArticulo compArticulo;
	@Autowired
	private SFactura compFactura;
	
	public List<MDetalle> lista(int id){
		List<MDetalle> lista = new ArrayList<>();
		for(Detalle a : ((List<Detalle>)repository.findAll()).stream().filter(x->x.getFactura().getId() ==id).collect(Collectors.toList())) {
			lista.add(new MDetalle(a));
		}
		return lista;
	}
	
	public String guardar(List<MDetalle> listaDetalle) {
		try {
			for(MDetalle detalle : listaDetalle) {
				repository.save(invertir(detalle));
			}			
			return "Detalle registrado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public String eliminar(int id) {		
		try {
			List<MDetalle> lista = lista(id);
			for(int i=0; i<lista.size();i++) {
				repository.delete(invertir(lista.get(i)));
			}
			return "Detalle eliminado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}			
	}
	
	public Detalle invertir(MDetalle detalle) {
		return new Detalle(
				detalle.getId(),
				detalle.getPrecio(),
				detalle.getCantidad(),
				compArticulo.invertir(compArticulo.buscar(detalle.getIdarticulo())),
				compFactura.invertir(compFactura.buscar(detalle.getIdfactura()))
				);
	}
}
