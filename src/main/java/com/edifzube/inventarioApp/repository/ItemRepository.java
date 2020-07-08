package com.edifzube.inventarioApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edifzube.inventarioApp.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{

}
