package pe.edu.idat.sfacturacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import pe.edu.idat.sfacturacion.model.MCategoria;
import pe.edu.idat.sfacturacion.services.SCategoria;

@RestController
@RequestMapping("/sfacturacion/categorias")
public class CCategoria {
	@Autowired
	private SCategoria controller;
	
	@GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Object> lista(){
		return new ResponseEntity<Object>(controller.lista(),HttpStatus.OK);
	}
	
	@GetMapping(value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> buscar(@PathVariable(name="id")int id){		
		if(controller.buscar(id) == null)
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Categoria no encontrada");
		return new ResponseEntity<Object>(controller.buscar(id),HttpStatus.OK);
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> crear(@RequestBody MCategoria categoria){
		String respuesta = controller.guardar(categoria);
		if(respuesta==null)
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"Error al registrar");
		return new ResponseEntity<Object>(respuesta, HttpStatus.CREATED);
	}
	
	@PutMapping(value="/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> actualizar(@PathVariable(name="id") int id, @RequestBody MCategoria categoria){		
		if(controller.buscar(id) == null)
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Categoria no encontrada");
		String respuesta = controller.actualizar(categoria);
		if(respuesta == null)
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"Error al actualizar");
		return new ResponseEntity<Object>(respuesta, HttpStatus.ACCEPTED);			
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Object> eliminar(@PathVariable(name="id") int id){				
		if(controller.buscar(id) == null)
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Categoria no encontrada");
		String respuesta = controller.eliminar(controller.buscar(id));
		if(respuesta == null)
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"Error al eliminar");
		return new ResponseEntity<Object>(respuesta, HttpStatus.ACCEPTED);
	}
}
