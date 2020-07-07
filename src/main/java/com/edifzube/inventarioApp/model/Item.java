package com.edifzube.inventarioApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ITEM")
public class Item {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IDITEM")
	private int iditem;
	
	@Column(name = "CODITEM",length = 50)
	private String coditem;
	
	@Column(name = "DESCRIPCION",length = 50)
	private String descripcion;
	
	@Column(name = "CANTIDAD")
	private int cantidad;
	
	@Column(name = "UNIMEDIDA",length = 50)
	private String unimedida;
	
	@Column(name = "IVA")
	private int iva;
	
	@Column(name = "PRECIO")
	private double precio;
	
	@Column(name = "PROVEEDOR",length = 50)
	private String provedor;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SECCIONID", insertable = false,updatable = false)
	private Seccion seccion;

	public int getIditem() {
		return iditem;
	}

	public void setIditem(int iditem) {
		this.iditem = iditem;
	}

	public String getCoditem() {
		return coditem;
	}

	public void setCoditem(String coditem) {
		this.coditem = coditem;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getUnimedida() {
		return unimedida;
	}

	public void setUnimedida(String unimedida) {
		this.unimedida = unimedida;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getProvedor() {
		return provedor;
	}

	public void setProvedor(String provedor) {
		this.provedor = provedor;
	}

	public Seccion getSeccion() {
		return seccion;
	}

	public void setSeccion(Seccion seccion) {
		this.seccion = seccion;
	}

	@Override
	public String toString() {
		return "Item [iditem=" + iditem + ", coditem=" + coditem + ", descripcion=" + descripcion + ", cantidad="
				+ cantidad + ", unimedida=" + unimedida + ", iva=" + iva + ", precio=" + precio + ", provedor="
				+ provedor + ", seccion=" + seccion + "]";
	}
	

}
