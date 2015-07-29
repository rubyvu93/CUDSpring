package oop.dao;

import java.util.List;
import oop.model.CoffeeType;

public interface CoffeeTypeDao {
	public void add(CoffeeType coffeeType);

	public void edit(CoffeeType coffeeType);

	public void delete(int id);

	public CoffeeType getCoffeeType(int id);

	public List getAllCoffee();
	
	public void test();
}
