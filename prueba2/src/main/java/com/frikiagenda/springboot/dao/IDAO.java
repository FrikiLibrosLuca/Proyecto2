package com.frikiagenda.springboot.dao;

import java.util.List;

public interface IDAO {
	
	//inserts
	public <T> int insert(T t);
	
	//reads
	public <T> T read(int id);
	public <T> T read(String nombre);
	public <T> List<T> read();
	
	//updates
	public <T>void update(T t);
	
	//deletes
	public void delete(int id);
	
	

}
