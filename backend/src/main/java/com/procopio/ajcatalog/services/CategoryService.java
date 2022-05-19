// Camada de serviço

package com.procopio.ajcatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.procopio.ajcatalog.entities.Category;
import com.procopio.ajcatalog.respositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository; 
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
}
