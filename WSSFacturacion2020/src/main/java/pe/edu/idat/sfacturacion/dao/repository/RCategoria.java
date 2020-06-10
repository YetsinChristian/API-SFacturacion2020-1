package pe.edu.idat.sfacturacion.dao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.idat.sfacturacion.dao.entity.Categoria;
@Repository
public interface RCategoria extends CrudRepository<Categoria, Integer> {

}
