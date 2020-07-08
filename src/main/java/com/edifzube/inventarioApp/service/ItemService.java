package com.edifzube.inventarioApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edifzube.inventarioApp.model.Item;
import com.edifzube.inventarioApp.repository.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository itemRepository;
	
	public List<Item> getItems(){
		return itemRepository.findAll();
	}
	
	public void save(Item empleado) {
		itemRepository.save(empleado);
	}
	
	public Optional<Item> findById(int id) {
		return itemRepository.findById(id);
	}
	
	public void delete(Integer id) {
		itemRepository.deleteById(id);
	}


}
