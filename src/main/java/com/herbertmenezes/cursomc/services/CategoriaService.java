package com.herbertmenezes.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.herbertmenezes.cursomc.domain.Categoria;
import com.herbertmenezes.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository caRepo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = caRepo.findById(id); 
		return obj.orElse(null);
	}
}
