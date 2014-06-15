package com.codelious.combinaciones.model;

public class SeccionDTO {

	private Integer id;
	private String nombre;
	private String[] listaLlaves;

	public SeccionDTO() {
		super();
	}

	public SeccionDTO(Integer id, String nombre, String[] listaLlaves) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.listaLlaves = listaLlaves;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String[] getListaLlaves() {
		return listaLlaves;
	}

	public void setListaLlaves(String[] listaLlaves) {
		this.listaLlaves = listaLlaves;
	}

}
