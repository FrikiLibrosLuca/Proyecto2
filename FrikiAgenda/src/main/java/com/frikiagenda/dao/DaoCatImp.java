package com.frikiagenda.dao;

import java.util.List;

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

	@Override
	public <T> List<T> read() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
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
