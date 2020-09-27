package com.project.market.persistence.crud;

import com.project.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

//creamos los metodos para llamarlos en los repositorios
public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> { //extendemos a CRUDREPOSITORY pones producto y el tipo de variable del ID
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

}
