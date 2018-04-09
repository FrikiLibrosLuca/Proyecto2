package com.frikiagenda.servicios;

public interface IServicios {
	//insertar
	<T> void insert(T t);
	
	//read
	<T> T read(int id);
	
	//update
	void update();
	
	//delete
	void delete();
	

}
