package oop.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import oop.dao.CoffeeTypeDao;
import oop.model.CoffeeType;
@Repository
public class CoffeeTypeDaoImpl implements CoffeeTypeDao {
	@Autowired
	private SessionFactory session;
	@Override
	public void add(CoffeeType coffeeType) {
		session.getCurrentSession().save(coffeeType);

	}
	@Override
	public void edit(CoffeeType coffeeType) {
		session.getCurrentSession().update(coffeeType);

	}
	@Override
	public void delete(int id) {
		session.getCurrentSession().delete(getCoffeeType(id));
		System.out.println("DELETED!");

	}
	@Override
	public CoffeeType getCoffeeType(int id) {
		
		return (CoffeeType)session.getCurrentSession().get(CoffeeType.class, id);
	}
	@Override
	public List getAllCoffee() {
		return session.getCurrentSession().createQuery("from CoffeeType").list();
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("TEST");
	}

}
