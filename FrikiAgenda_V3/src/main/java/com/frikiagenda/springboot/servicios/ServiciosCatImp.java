package com.frikiagenda.springboot.servicios;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.frikiagenda.springboot.control.Control;
import com.frikiagenda.springboot.dao.IDAO;
import com.frikiagenda.springboot.model.Categoria;

@Service
@Transactional
public class ServiciosCatImp implements IServicios {
	
	private static Logger logger;

    static {
        try {
            logger = Logger.getLogger(Control.class.getName());
        } catch (Throwable e) {
            System.out.println("Don't work");
        }
    }
	
	@Autowired
	private IDAO dao;

	@Override
	public <T> void update(T t) {
		//dao.update(t);
	}

	@Override
	public void delete(int id) {
		//dao.delete(id);
	}

	@Override
	public <T> void insert(T t) {
		//dao.insert(t);

	}
	
	
/*
	@Override
	public <T> T read(T item) {
		
		return dao.read(((Categoria) item).getId());
		
	}

	@Override
	public <T> T read(String nombre) {
		return dao.read(nombre);

	}
*/
	
	@Override
	public <T> List<T> read() {
		logger.log(Level.INFO,"Servicios read ida");
		
		//List<T> lista = dao.read();
		
		@SuppressWarnings("unchecked")
		List<T> lista = (List<T>) dao.findAll();
		
		logger.log(Level.INFO,"Servicios read bu");
		
		return lista;
	
	}

	@Override
	public <T> T read(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T read(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Categoria> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
