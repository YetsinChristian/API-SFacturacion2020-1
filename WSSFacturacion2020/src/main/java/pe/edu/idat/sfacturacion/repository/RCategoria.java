package pe.edu.idat.sfacturacion.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.idat.sfacturacion.entity.Categoria;
@Repository
public interface RCategoria extends CrudRepository<Categoria, Integer> {

}
