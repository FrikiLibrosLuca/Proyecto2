package com.frikiagenda.springboot.servicios;

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
	public <T> int insert(T t) {
		
		try{
		dao.save((Categoria)t);
		}catch(IllegalArgumentException iae){
			logger.log(Level.FINE,"No se ha recibido objeto");
			return 1;
		}
		return 0;
		
	}
	
	@Override
	public <T> int update(T t) {
		try{
		dao.save((Categoria)t);
		}catch(IllegalArgumentException iae){
			logger.log(Level.FINE,"No se ha recibido objeto");
			return 1;
		}
		return 0;
	}

	@Override
	public int delete(int id) {
		try{
		dao.delete((long) id);
		}catch(IllegalArgumentException iae){
			logger.log(Level.FINE,"No se ha recibido id");
			return 1;
		}
		return 0;
	}

	@Override
	public <T> T read(T t) {
		Categoria cat = (Categoria)t;
	
		try{
			cat = dao.findOne((long)cat.getId());
		}catch(IllegalArgumentException iae){
			logger.log(Level.FINE,"No se ha recibido id");
			return null;
		}	
		
		return (T)cat;
	}


	@SuppressWarnings("unchecked")
	@Override
	public Iterable<Categoria> listar() {
		return dao.findAll();
	}



}
