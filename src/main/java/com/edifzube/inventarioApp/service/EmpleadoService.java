package com.edifzube.inventarioApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edifzube.inventarioApp.model.Empleado;
import com.edifzube.inventarioApp.repository.IEmpleado;

@Service
public class EmpleadoService {
	
	@Autowired
	private IEmpleado empleadoRepository;
	
	public List<Empleado> getEmpleados(){
		return empleadoRepository.findAll();
	}
	
	public void save(Empleado empleado) {
		empleadoRepository.save(empleado);
	}
	
	public Optional<Empleado> findById(int id) {
		return empleadoRepository.findById(id);
	}

}
