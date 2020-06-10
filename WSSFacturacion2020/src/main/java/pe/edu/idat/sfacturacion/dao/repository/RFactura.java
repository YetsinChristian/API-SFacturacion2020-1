package pe.edu.idat.sfacturacion.dao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.idat.sfacturacion.dao.entity.Factura;
@Repository
public interface RFactura extends CrudRepository<Factura, Integer> {

}
