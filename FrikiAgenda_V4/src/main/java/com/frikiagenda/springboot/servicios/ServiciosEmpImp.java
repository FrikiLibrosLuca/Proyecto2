package com.frikiagenda.springboot.servicios;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.frikiagenda.springboot.control.Control;
import com.frikiagenda.springboot.dao.IDAO;
import com.frikiagenda.springboot.model.Empleado;

@Service
@Transactional
public class ServiciosEmpImp implements IServicios{

	private static Logger logger;

    static {
        try {
            logger = Logger.getLogger(Control.class.getName());
        } catch (Throwable e) {
            System.out.println("Don't work");
        }
    }
	
    
	@Autowired
	private  IDAOEmple daoEmp;
	
	@Override
	public <T> int insert(T t) {
		try{
			daoEmp.save((Empleado)t);
			}catch(IllegalArgumentException iae){
				logger.log(Level.FINE,"No se ha recibido objeto");
				return 1;
			}
		return 0;
	}

	@Override
	public <T> int update(T t) {
		try{
			daoEmp.save((Empleado)t);
			}catch(IllegalArgumentException iae){
				logger.log(Level.FINE,"No se ha recibido objeto");
				return 1;
			}
		return 0;
	}

	@Override
	public int delete(int id) {
		try{
			daoEmp.delete((long) id);
			}catch(IllegalArgumentException iae){
				logger.log(Level.FINE,"No se ha recibido id");
				return 1;
			}
		return 0;
	}

	@Override
	public Iterable<Empleado> listar() {
		Empleado emp = new Empleado();
		emp = (Empleado) daoEmp.findAll();
		return null;
	}

	@Override
	public <T> T read(T t) {
		Empleado emp = (Empleado)t;
		
		try{
			emp = daoEmp.findOne((long)emp.getIdempleados());
		}catch(IllegalArgumentException iae){
			logger.log(Level.FINE,"No se ha recibido id");
			return null;
		}	
		
		return (T)emp;
	}

}
