package com.edifzube.inventarioApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edifzube.inventarioApp.model.Ingresos;

@Repository
public interface IngresosRepository extends JpaRepository<Ingresos, Integer>{

}
