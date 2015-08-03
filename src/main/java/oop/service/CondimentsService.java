package oop.service;

import java.util.List;

import oop.model.Condiments;

public interface CondimentsService {
	public void add(Condiments con);

	public void edit(Condiments con);

	public void delete(int id);

	public Condiments getCondiments(int id);

	public List<Condiments> getAllCondiments();
	
	public float getTotal(Condiments con);
}
