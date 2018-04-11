package com.frikiagenda.springboot.dao;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.frikiagenda.springboot.model.Categoria;


@Repository
public class DaoCatImp implements IDAO {

	
	private static Logger logger;

    static {
        try {
            logger = LogManager.getLogger(DaoCatImp.class);
        } catch (Throwable e) {
            System.out.println("Don't work");
        }
    }
	
	@Autowired
	private SessionFactory sessionFactory;
	private Session session = sessionFactory.openSession();
	private Criteria criteria = session.createCriteria(Categoria.class);

	public DaoCatImp() {}
	
	public DaoCatImp(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public <T> T read(int id) {
		logger.debug("DAO read integer");
		criteria.add(Restrictions.eq("id", id));
		Categoria c1 = (Categoria) criteria.uniqueResult();
		
		return (T)c1;
		
		/* 
		 * HQL:
		String hql = "from categoria where idcategorias=" + id;
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		List<Categoria> lista = (List<Categoria>) query.list();
		
		if (lista != null && !lista.isEmpty()) {
			return (T) lista.get(0);
			}
		return null;
		*/
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public <T> T read(String nombre) {
		
		logger.debug("DAO read string");
		
		criteria.add(Restrictions.eq("nombre", nombre));
		Categoria c1 = (Categoria) criteria.uniqueResult();
		
		return (T)c1;
		
		/*
		 * HQL
		String hql = "from categoria where nombre=" + nombre;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		List<Categoria> lista = (List<Categoria>) query.list();
		
		if (lista != null && !lista.isEmpty()) {
			return (T) lista.get(0);
			}
		return null;
		*/
	}

	@Override
	@Transactional
	@SuppressWarnings("unchecked")
	public <T> List<T> read() {
		
		logger.trace("DAO read");
		List<Categoria> listaCategoria = (List<Categoria>) criteria.list();
		return (List<T>)listaCategoria;
		
		/*
		 * HQL:
		 
		logger.trace("DAO read");
		
		List<Categoria> listaCategoria = (List<Categoria>) sessionFactory.getCurrentSession().createCriteria(Categoria.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		logger.debug("Lista Dao" + listaCategoria.toString());
		return (List<T>)listaCategoria;
		*/
	}

	@Override
	@Transactional
	public <T> void update(T t) {
		sessionFactory.getCurrentSession().saveOrUpdate(t);
		
	}

	@Override
	@Transactional
	public void delete(int id) {
		Categoria catToDelete = new Categoria();
		catToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(catToDelete);
	}

	@Override
	@Transactional
	public <T> int insert(T dato) {
		Categoria categoria;
		if(dato instanceof Categoria){
			categoria = (Categoria) dato;
			
			//comprobar que retorna en caso de que el insert no se pueda hacer
			int resu = (int)sessionFactory.getCurrentSession().save(categoria);
			
			return resu;
		}
		else
			return -1; //error el objeto dado no es correcto
	}
	
	
	

}
