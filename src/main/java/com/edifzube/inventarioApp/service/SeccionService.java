package com.edifzube.inventarioApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edifzube.inventarioApp.model.Seccion;
import com.edifzube.inventarioApp.repository.SeccionRepository;

@Service
public class SeccionService {
	
	@Autowired
	private SeccionRepository seccionRepository;
	
	public List<Seccion> getSecciones(){
		return seccionRepository.findAll();
	}
	
	public void save(Seccion seccion) {
		seccionRepository.save(seccion);
	}
	
	public Optional<Seccion> findById(int id) {
		return seccionRepository.findById(id);
	}
	
	public void delete(Integer id) {
		seccionRepository.deleteById(id);
	}


}
