package com.edifzube.inventarioApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edifzube.inventarioApp.model.Seccion;


@Repository
public interface SeccionRepository extends JpaRepository<Seccion, Integer>{

}
