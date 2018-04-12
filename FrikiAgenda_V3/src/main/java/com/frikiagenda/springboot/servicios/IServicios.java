package com.frikiagenda.springboot.servicios;



public interface IServicios {

	//insertar
	public <T> int insert(T t);
	
	//update
	public <T> int update(T t);
	
	//delete
	public int delete(int id);

	//read
	public <T>Iterable<T>listar(); //lee todo
	public <T> T read(T t);
}
