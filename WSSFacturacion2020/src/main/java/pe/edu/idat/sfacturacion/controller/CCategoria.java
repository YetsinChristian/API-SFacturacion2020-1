package pe.edu.idat.sfacturacion.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.idat.sfacturacion.dao.entity.Categoria;
import pe.edu.idat.sfacturacion.dao.repository.RCategoria;
import pe.edu.idat.sfacturacion.model.MCategoria;

@Component
public class CCategoria {
	@Autowired
	private RCategoria repository;

	public List<MCategoria> lista(){
		List<MCategoria> lista = new ArrayList<>();
		for(Categoria a : ((List<Categoria>)repository.findAll()).stream().filter(x->x.getVista()!=0).collect(Collectors.toList())) {
			lista.add(new MCategoria(a));
		}
		return lista;
	}
	
	public MCategoria buscar(int id) {
		try {
			MCategoria categoria = null;
			for(MCategoria a : lista().stream().filter(x->x.getId()==id).collect(Collectors.toList())) {
				categoria = a;
			}
			return categoria;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public String guardar(MCategoria categoria) {
		try {
			repository.save(invertir(categoria));
			return "Categoria registrada correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public String actualizar(MCategoria categoria) {
		try {
			repository.save(invertir(categoria));
			return "Categoria actualizada correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public String eliminar(MCategoria categoria) {
		try {
			Categoria eliminar = invertir(categoria);
			eliminar.setVista(0);
			repository.save(eliminar);
			return "Categoria eliminada correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public Categoria invertir(MCategoria categoria) {
		return new Categoria(categoria.getId(),categoria.getDescripcion(),categoria.getVista());
	}
}
