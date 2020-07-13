package com.edifzube.inventarioApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edifzube.inventarioApp.model.Ingresos;
import com.edifzube.inventarioApp.repository.IngresosRepository;

@Service
public class IngresosService {
	
	@Autowired
	private IngresosRepository ingresosRepository;
	
	public List<Ingresos> getIngresos(){
		return ingresosRepository.findAll();
	}
	
	public void save(Ingresos ingresos) {
		System.out.println("ingresos ser: "+ingresos);
		ingresosRepository.save(ingresos);
	}
	
	public Optional<Ingresos> findById(int id) {
		return ingresosRepository.findById(id);
	}
	
	public void delete(Integer id) {
		ingresosRepository.deleteById(id);
	}

}
