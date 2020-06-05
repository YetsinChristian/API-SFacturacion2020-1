package pe.edu.idat.sfacturacion.dao.repository;

import org.springframework.data.repository.CrudRepository;

import pe.edu.idat.sfacturacion.dao.entity.Cliente;

public interface RCliente extends CrudRepository<Cliente, Integer> {

}
