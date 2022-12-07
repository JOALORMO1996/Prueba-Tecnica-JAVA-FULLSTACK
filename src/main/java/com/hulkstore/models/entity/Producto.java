package com.hulkstore.models.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;


@Entity
@Table(name = "productos")
public class Producto implements Serializable{


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProducto;
	private String nombre;
	private Double precio;
	private Integer existencia;
	
	@Column(name = "creado_en")
	@Temporal(TemporalType.DATE)
	private Date creadoEn;

	public Producto() {
	}

	public Producto(Integer idProducto, String nombre, Double precio, Integer existencia, Date creadoEn) {
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.precio = precio;
		this.existencia = existencia;
		this.creadoEn = creadoEn;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getExistencia() {
		return existencia;
	}

	public void setExistencia(Integer existencia) {
		this.existencia = existencia;
	}

	public Date getCreadoEn() {
		return creadoEn;
	}

	public void setCreadoEn(Date creadoEn) {
		this.creadoEn = creadoEn;
	}

	private static final long serialVersionUID = 3761225518456846188L;

}
