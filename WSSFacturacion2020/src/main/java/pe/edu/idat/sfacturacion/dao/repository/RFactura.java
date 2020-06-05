package pe.edu.idat.sfacturacion.dao.repository;

import org.springframework.data.repository.CrudRepository;

import pe.edu.idat.sfacturacion.dao.entity.Factura;

public interface RFactura extends CrudRepository<Factura, Integer> {

}
