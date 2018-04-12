package com.frikiagenda.springboot.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.frikiagenda.springboot.model.Categoria;


 

public interface  IDAOCat extends CrudRepository<Categoria, Long>{

	/*
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
	
	*/

}
