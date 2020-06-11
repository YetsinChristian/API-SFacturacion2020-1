package pe.edu.idat.sfacturacion.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.idat.sfacturacion.entity.Usuario;
@Repository
public interface RUsuario extends CrudRepository<Usuario, Integer> {

}
