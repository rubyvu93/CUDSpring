package oop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import oop.dao.CondimentsDao;
import oop.model.Condiments;
import oop.service.CondimentsService;
@Service
public class CondimentsServiceImpl implements CondimentsService {
	@Autowired
	private CondimentsDao conDao;
	
	@Transactional
	public void add(Condiments con) {
		conDao.add(con);
		
	}

	@Transactional
	public void edit(Condiments con) {
		conDao.edit(con);
		
	}

	@Transactional
	public void delete(int id) {
		conDao.delete(id);
		
	}

	@Transactional
	public Condiments getCondiments(int id) {
		return conDao.getCondiments(id);
	}

	@Transactional
	public List getAllCondiments() {
		return conDao.getAllCondiments();
	}

	@Transactional
	public float getTotal(Condiments con) {
		float sum;
		sum=con.getPrice()*con.getTotal();
		return sum;
	}

}
