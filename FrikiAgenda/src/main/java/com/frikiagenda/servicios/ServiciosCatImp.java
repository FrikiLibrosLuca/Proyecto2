package com.frikiagenda.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frikiagenda.dao.IDAO;
import com.frikiagenda.model.Categoria;

@Service
public class ServiciosCatImp implements IServicios {
	@Autowired
	private IDAO dao;

	@Override
	public <T> void update(T t) {
		dao.update(t);
	}

	@Override
	public void delete(int id) {
		dao.delete(id);
	}

	@Override
	public <T> void insert(T t) {
		dao.insert(t);

	}

	@Override
	public <T> T read(T item) {
		
		return dao.read(((Categoria) item).getId());
		
	}

	@Override
	public <T> T read(String nombre) {
		return dao.read(nombre);

	}

	@Override
	public <T> List<T> read() {
		List<T> lista = dao.read();
		return lista;
	}

}
