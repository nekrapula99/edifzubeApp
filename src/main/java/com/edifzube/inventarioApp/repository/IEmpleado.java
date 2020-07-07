package com.edifzube.inventarioApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edifzube.inventarioApp.model.Empleado;

@Repository
public interface IEmpleado extends JpaRepository<Empleado, Integer>{

}
