package pe.edu.idat.sfacturacion.dao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.idat.sfacturacion.dao.entity.Usuario;
@Repository
public interface RUsuario extends CrudRepository<Usuario, Integer> {

}
