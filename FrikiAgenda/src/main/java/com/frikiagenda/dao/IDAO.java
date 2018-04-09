package com.frikiagenda.dao;

import java.util.List;

public interface IDAO {
	
	//inserts
	<T> int insert(T t);
	
	//reads
	<T> T read(int id);
	<T> List<T> read();
	
	//updates
	int update();
	
	//deletes
	int delete();
	
	

}
