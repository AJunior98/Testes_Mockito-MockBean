// Camada de acesso a dados

package com.procopio.ajcatalog.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.procopio.ajcatalog.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
}



