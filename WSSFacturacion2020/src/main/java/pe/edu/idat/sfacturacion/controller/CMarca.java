package pe.edu.idat.sfacturacion.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.idat.sfacturacion.dao.entity.Marca;
import pe.edu.idat.sfacturacion.dao.repository.RMarca;
import pe.edu.idat.sfacturacion.model.MMarca;

@Component
public class CMarca {
	@Autowired
	private RMarca repository;
	
	public List<MMarca> lista(){
		List<MMarca> lista = new ArrayList<>();
		for(Marca a : ((List<Marca>)repository.findAll()).stream().filter(x->x.getVista()!=0).collect(Collectors.toList())) {
			lista.add(new MMarca(a));
		}
		return lista;
	}
	
	public MMarca buscar(int id) {
		try {
			MMarca marca = null;
			for(MMarca a: lista().stream().filter(x->x.getId()==id).collect(Collectors.toList())) {
				marca = a;
			}
			return marca;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}			
	}
	
	public String guardar(MMarca marca) {
		try {
			repository.save(invertir(marca));
			return "Marca registrada correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}		
	}
	
	public String actualizar(MMarca marca) {
		try {
			repository.save(invertir(marca));
			return "Marca actualizada correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public String eliminar(MMarca marca) {
		try {
			Marca eliminar = invertir(marca);
			eliminar.setVista(0);
			repository.save(eliminar);
			return "Marca eliminada correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public Marca invertir(MMarca marca) {		
		return new Marca(marca.getId(),marca.getDescripcion(),marca.getVista());
	}
}
