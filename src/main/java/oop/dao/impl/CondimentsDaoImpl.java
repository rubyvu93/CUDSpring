package oop.dao.impl;

import java.util.List;

import oop.dao.CondimentsDao;
import oop.model.Condiments;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class CondimentsDaoImpl implements CondimentsDao {
	
	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(Condiments con) {
		session.getCurrentSession().save(con);

	}

	@Override
	public void edit(Condiments con) {
		session.getCurrentSession().update(con);

	}

	@Override
	public void delete(int id) {
		session.getCurrentSession().delete(getCondiments(id));;

	}

	@Override
	public Condiments getCondiments(int id) {
		return (Condiments)session.getCurrentSession().get(Condiments.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Condiments> getAllCondiments() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from Condiments").list();
	}

	

}
