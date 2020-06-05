package pe.edu.idat.sfacturacion.controller;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.idat.sfacturacion.dao.entity.Usuario;
import pe.edu.idat.sfacturacion.dao.repository.RUsuario;
import pe.edu.idat.sfacturacion.model.MUsuario;


@Component
public class CUsuario {
	@Autowired
	private RUsuario repository;
	
	public List<MUsuario> lista(){
		List<MUsuario> lista = new ArrayList<>();
		for(Usuario a : ((List<Usuario>)repository.findAll()).stream().filter(x->x.getVista()!=0).collect(Collectors.toList())) {
			lista.add(new MUsuario(a));
		}
		return lista;
	}
	public MUsuario buscar(int id) {
		try {
			MUsuario usuario= null;
			for(MUsuario a: lista().stream().filter(x->x.getId()==id).collect(Collectors.toList())) {
				usuario = a;
			}
			return usuario;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public String guardar(MUsuario usuario) {
		try {			
			repository.save(invertir(usuario));
			return "Usuario registrado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	public String actualizar(MUsuario usuario) {
		try {
			repository.save(invertir(usuario));
			return "Usuario actualizado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	public String eliminar(MUsuario usuario) {
		try {
			Usuario eliminar = invertir(usuario);
			eliminar.setVista(0);
			repository.save(eliminar);
			return "Usuario actualizado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	public Usuario invertir(MUsuario usuario) {		
		return new Usuario(usuario.getId(),usuario.getApellidos(),usuario.getNombres(),usuario.getDni()
				,usuario.getCorreo(),usuario.getTelefono(),usuario.getRol(),usuario.getVista());
	}	
}
