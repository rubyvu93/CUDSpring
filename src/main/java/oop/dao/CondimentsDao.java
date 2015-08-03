package oop.dao;

import oop.model.Condiments;
import java.util.List;

public interface CondimentsDao {
	public void add(Condiments con);

	public void edit(Condiments con);

	public void delete(int id);

	public Condiments getCondiments(int id);

	public List<Condiments> getAllCondiments();
}
