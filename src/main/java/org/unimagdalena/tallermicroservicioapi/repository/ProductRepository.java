package org.unimagdalena.tallermicroservicioapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.unimagdalena.tallermicroservicioapi.entities.Product;

import java.util.List;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {

    //Buscar productos según un término de búsqueda
    List<Product> findByNombreContainingIgnoreCase(String searchTerm);

    // Buscar los productos que están en stock.
    @Query("SELECT p FROM Product p WHERE p.stock > 0")
    List<Product> findInStock();

    // Buscar los productos que no superen un precio y un stock determinado
    List<Product> findByPriceLessThanAndStockLessThan(Float precio, Integer stock);


}
