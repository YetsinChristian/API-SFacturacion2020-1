package pe.edu.idat.sfacturacion.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.idat.sfacturacion.dao.entity.Articulo;
import pe.edu.idat.sfacturacion.dao.repository.RArticulo;
import pe.edu.idat.sfacturacion.model.MArticulo;

@Component
public class CArticulo {
	@Autowired
	private RArticulo repository;
	@Autowired
	private CMarca compMarca;
	@Autowired
	private CCategoria compCategoria;
	
	public List<MArticulo> lista(){
		List<MArticulo> lista = new ArrayList<>();
		for(Articulo a : ((List<Articulo>)repository.findAll()).stream().filter(x->x.getVista()!=0).collect(Collectors.toList())) {
			lista.add(new MArticulo(a));
		}
		return lista;
	}
	
	public MArticulo buscar(int id) {
		try {
			MArticulo articulo = null;
			for(MArticulo a : lista().stream().filter(x->x.getId()==id).collect(Collectors.toList())) {
				articulo = a;
			}
			return articulo;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public String guardar(MArticulo articulo) {
		try {
			repository.save(invertir(articulo));
			return "Articulo registrado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public String actualizar(MArticulo articulo) {
		try {
			repository.save(invertir(articulo));
			return "Articulo actualizado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public String eliminar(MArticulo articulo) {
		try {
			Articulo eliminar = invertir(articulo);
			eliminar.setVista(0);
			repository.save(eliminar);
			return "Articulo eliminado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public Articulo invertir(MArticulo articulo) {
		return new Articulo(
				articulo.getId(),
				articulo.getDescripcion(),
				articulo.getPrecio(),
				articulo.getStock(),
				articulo.getVista(),
				compMarca.invertir(compMarca.buscar(articulo.getIdmarca())),
				compCategoria.invertir(compCategoria.buscar(articulo.getIdcategoria()))
				);
	}
}
