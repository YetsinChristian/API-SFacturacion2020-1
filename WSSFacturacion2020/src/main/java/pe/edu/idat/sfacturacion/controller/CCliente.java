package pe.edu.idat.sfacturacion.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.idat.sfacturacion.dao.entity.Cliente;
import pe.edu.idat.sfacturacion.dao.repository.RCliente;
import pe.edu.idat.sfacturacion.model.MCliente;

@Component
public class CCliente {
	@Autowired
	private RCliente repository;
	
	public List<MCliente> lista(){
		List<MCliente> lista = new ArrayList<>();
		for(Cliente a : ((List<Cliente>)repository.findAll()).stream().filter(x->x.getVista()!=0).collect(Collectors.toList())) {
			lista.add(new MCliente(a));
		}
		return lista;
	}
	public MCliente buscar(int id) {
		try {
			MCliente cliente = null;
			for(MCliente a : lista().stream().filter(x->x.getId()==id).collect(Collectors.toList())) {
				cliente = a;			
			}
			return cliente;
		}catch(Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public String guardar(MCliente cliente) {
		try {
			repository.save(invertir(cliente));
			return "Cliente registrado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public String actualizar(MCliente cliente) {
		try {
			repository.save(invertir(cliente));
			return "Cliente actualizado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public String eliminar(MCliente cliente) {
		try {
			Cliente eliminar = (invertir(cliente));
			eliminar.setVista(0);
			repository.save(eliminar);
			return "Cliente eliminado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public Cliente invertir(MCliente cliente) {
		return new Cliente(cliente.getId(),cliente.getRuc(),cliente.getRazonSocial(),cliente.getDireccion(),cliente.getTelefono(),cliente.getCorreo(),cliente.getVista());
	}	
}
