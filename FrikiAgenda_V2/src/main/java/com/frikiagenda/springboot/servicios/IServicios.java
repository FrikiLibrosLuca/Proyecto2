package com.frikiagenda.springboot.servicios;

import java.util.List;

public interface IServicios {
	//insertar
	public <T> void insert(T t);
	
	//read
	public <T> T read(T t);
	public <T> T read(String nombre);
	public <T> List<T> read();
	
	//update
	public <T> void update(T t);
	
	//delete
	public void delete(int id);
	

}