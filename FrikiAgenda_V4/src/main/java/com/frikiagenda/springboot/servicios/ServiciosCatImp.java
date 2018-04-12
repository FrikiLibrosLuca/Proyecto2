package com.frikiagenda.springboot.servicios;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.frikiagenda.springboot.control.Control;
import com.frikiagenda.springboot.dao.IDAOCat;
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
	private IDAOCat dAOCat;

	
	
	@Override
	public <T> int insert(T t) {
		
		try{
		dAOCat.save((Categoria)t);
		}catch(IllegalArgumentException iae){
			logger.log(Level.FINE,"No se ha recibido objeto");
			return 1;
		}
		return 0;

	}
	
	@Override
	public <T> int update(T t) {
		try{
		dAOCat.save((Categoria)t);
		}catch(IllegalArgumentException iae){
			logger.log(Level.FINE,"No se ha recibido objeto");
			return 1;
		}
		return 0;
	}

	@Override
	public int delete(int id) {
		try{
		dAOCat.delete((long) id);
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
			cat = dAOCat.findOne(cat.getId());
		}catch(IllegalArgumentException iae){
			logger.log(Level.FINE,"No se ha recibido id");
			return null;
		}	
		
		return (T)cat;
	}


	@SuppressWarnings("unchecked")
	@Override
	public Iterable<Categoria> listar() {
		return dAOCat.findAll();
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
	/*
	@Override
	public <T> List<T> read() {
		logger.log(Level.INFO,"Servicios read ida");
		
		//List<T> lista = dao.read();
		
		@SuppressWarnings("unchecked")
		List<T> lista = (List<T>) dao.findAll();
		
		logger.log(Level.INFO,"Servicios read bu");
		
		return lista;
	
	}*/



}
