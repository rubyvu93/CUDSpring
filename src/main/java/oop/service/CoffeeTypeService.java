package oop.service;

import oop.model.CoffeeType;
import java.util.List;

public interface CoffeeTypeService {
	public void add(CoffeeType coffeeType);

	public void edit(CoffeeType coffeeType);

	public void delete(int id);

	public CoffeeType getCoffeeType(int id);

	public List<CoffeeType> getAllCoffee();
	
	public float getTotal(CoffeeType coffeeType);
	
	public void getTest();
}
