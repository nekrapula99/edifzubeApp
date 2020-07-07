package com.edifzube.inventarioApp.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "SECCION")
public class Seccion {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IDSECCION")
	private int idseccion;
	
	@Column(name = "CODSECCION",length = 50)
	private String codseccion;
	
	@Column(name = "NOMBRESECCION",length = 50)
	private String nombreseccion;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "seccion")
	private List<Item> listItems;

	public int getIdseccion() {
		return idseccion;
	}

	public void setIdseccion(int idseccion) {
		this.idseccion = idseccion;
	}

	public String getCodseccion() {
		return codseccion;
	}

	public void setCodseccion(String codseccion) {
		this.codseccion = codseccion;
	}

	public String getNombreseccion() {
		return nombreseccion;
	}

	public void setNombreseccion(String nombreseccion) {
		this.nombreseccion = nombreseccion;
	}

	public List<Item> getListItems() {
		return listItems;
	}

	public void setListItems(List<Item> listItems) {
		this.listItems = listItems;
	}

	@Override
	public String toString() {
		return "Seccion [idseccion=" + idseccion + ", codseccion=" + codseccion + ", nombreseccion=" + nombreseccion
				+ ", listItems=" + listItems + "]";
	}
	

}
