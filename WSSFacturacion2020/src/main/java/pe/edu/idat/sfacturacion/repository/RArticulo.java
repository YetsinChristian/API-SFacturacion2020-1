package pe.edu.idat.sfacturacion.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.idat.sfacturacion.entity.Articulo;
@Repository
public interface RArticulo extends CrudRepository<Articulo, Integer> {

}
