package com.frikiagenda.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frikiagenda.dao.IDAO;

@Service
public class ServiciosCatImp implements IServicios {
	@Autowired	
	private IDAO dao;
	

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void insert(T t) {
		// TODO Auto-generated method stub
		int resu=dao.insert(t);
		
		
	}

	@Override
	public <T> T read(int id) {
		
		 return dao.read(id);
		
	}

	
}
