package br.com.cmd.DAO;

import java.util.List;

public interface IGenericDAO<T> {
	
	void beginTransaction();

	void commitTransaction();

	void save(T entity);
	
	void update( T entity );

	void delete (T entity);

	List<T> listAll();
	
	T find(final long id);
		

}
