// Camada de serviço

package com.procopio.ajcatalog.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.procopio.ajcatalog.dto.CategoryDTO;
import com.procopio.ajcatalog.entities.Category;
import com.procopio.ajcatalog.respositories.CategoryRepository;
import com.procopio.ajcatalog.services.exceptions.EntityNotFoundException;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository; 
	
	@Transactional(readOnly = true)
	public List<CategoryDTO> findAll() {
		List<Category> list =  repository.findAll();

		return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
	}
	@Transactional(readOnly = true)
	public CategoryDTO findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		Category entity = obj.orElseThrow(() -> new EntityNotFoundException("Entity not found"));
		return new CategoryDTO(entity);
	}
}
