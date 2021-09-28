package com.exampleU1.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="maquinaria")
public class Maquinaria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String tipo_maquinaria;
	private String marca;
	private String modelo;
	private String nr_serie;
	private String tipo_combustible;
	
	public Maquinaria() {
	}
	
	public Maquinaria(int id, String tipo_maquinaria, String marca, String modelo, String nr_serie,
			String tipo_combustible) {
		super();
		this.id = id;
		this.tipo_maquinaria = tipo_maquinaria;
		this.marca = marca;
		this.modelo = modelo;
		this.nr_serie = nr_serie;
		this.tipo_combustible = tipo_combustible;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTipo_maquinaria() {
		return tipo_maquinaria;
	}


	public void setTipo_maquinaria(String tipo_maquinaria) {
		this.tipo_maquinaria = tipo_maquinaria;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getNr_serie() {
		return nr_serie;
	}


	public void setNr_serie(String nr_serie) {
		this.nr_serie = nr_serie;
	}


	public String getTipo_combustible() {
		return tipo_combustible;
	}


	public void setTipo_combustible(String tipo_combustible) {
		this.tipo_combustible = tipo_combustible;
	}
}
