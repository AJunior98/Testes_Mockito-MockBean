// Camada de acesso a dados

package com.procopio.ajcatalog.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.procopio.ajcatalog.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
}



