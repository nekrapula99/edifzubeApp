package com.edifzube.inventarioApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edifzube.inventarioApp.model.Empleado;
import com.edifzube.inventarioApp.service.EmpleadoService;

@Controller
public class EmpleadoController {
	
	@Autowired
	private EmpleadoService empleadoService;
	
	@GetMapping("/empleados")
	public String getEmpleados(Model model) {
		List<Empleado> empleadosList = empleadoService.getEmpleados();
		model.addAttribute("empleados", empleadosList);
		return "empleado";
	}
	
	@PostMapping("/empleados/addNew")
	public String addNewEmpleado(Empleado empleado) {
		empleadoService.save(empleado);
		return "redirect:/empleados";
	}
	
	@RequestMapping("empleados/findById")
	@ResponseBody
	public Optional<Empleado> findById(int id) {
		return empleadoService.findById(id);
	}
	
	@RequestMapping(value = "empleados/update", method = {RequestMethod.PUT,RequestMethod.GET})
	public String update(Empleado empleado){
		empleadoService.save(empleado);
		return "redirect:/empleados";
	}
	
	@RequestMapping(value = "empleados/delete", method = {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id){
		empleadoService.delete(id);
		return "redirect:/empleados";
	}

}
