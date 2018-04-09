package com.frikiagenda.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.frikiagenda.model.Categoria;

@Repository
public class DaoCatImp implements IDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public DaoCatImp() {}
	
	public DaoCatImp(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public <T> T read(int id) {
		String hql = "from categoria where idcategorias=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		List<Categoria> lista = (List<Categoria>) query.list();
		
		if (lista != null && !lista.isEmpty()) {
			return (T) lista.get(0);
			}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public <T> T read(String nombre) {
		String hql = "from categoria where nombre=" + nombre;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		List<Categoria> lista = (List<Categoria>) query.list();
		
		if (lista != null && !lista.isEmpty()) {
			return (T) lista.get(0);
			}
		return null;
	}

	@Override
	@Transactional
	@SuppressWarnings("unchecked")
	public <T> List<T> read() {
		List<Categoria> listaCategoria = (List<Categoria>) sessionFactory.getCurrentSession().createCriteria(Categoria.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return (List<T>)listaCategoria;
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
