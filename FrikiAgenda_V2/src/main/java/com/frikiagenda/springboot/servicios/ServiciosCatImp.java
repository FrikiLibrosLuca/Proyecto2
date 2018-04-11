package com.frikiagenda.springboot.servicios;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frikiagenda.springboot.control.Control;
import com.frikiagenda.springboot.dao.IDAO;
import com.frikiagenda.springboot.model.Categoria;

@Service
public class ServiciosCatImp implements IServicios {
	
	private static Logger logger;

    static {
        try {
            logger = LogManager.getLogger(Control.class);
        } catch (Throwable e) {
            System.out.println("Don't work");
        }
    }
	
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
		logger.trace("Servicio read");
		
		List<T> lista = dao.read();
		
		logger.debug("Lista recuperada" + lista.toString());
		
		return lista;
	
	}

}
