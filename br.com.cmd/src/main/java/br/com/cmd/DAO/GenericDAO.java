package br.com.cmd.DAO;

import java.util.List;

import javax.persistence.EntityManager;

public abstract class GenericDAO<T> implements IGenericDAO<T> {
	
	private Class< T > clazz;	
	private EntityManager entityManager;
	
	
	public GenericDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public GenericDAO(Class<T> persistedClass) {
		this();		
		this.clazz = persistedClass;
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setClazz( Class< T > clazzToSet ) {
	      this.clazz = clazzToSet;
	   }
	
	
	public void beginTransaction() {
		this.entityManager.getTransaction().begin();
		
	}

	public void commitTransaction() {
		this.entityManager.getTransaction().commit();
		
	}

	public void save(T entity) {
		entityManager.persist( entity );
		
	}
	
	public void update( T entity ){
	      entityManager.merge( entity );
	   }

	public void delete(T entity) {
		// TODO Auto-generated method stub
		entityManager.remove( entity );
	}
	
	public void deleteById( Long entityId ){
	      T entity = this.findOne( entityId );
	      delete( entity );
	   }

	public List<T> listAll() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<T> all = this.getEntityManager().createQuery( "from " + clazz.getName() ).getResultList(); 
		return  all;
	}
	
	public T findOne( Long id ){
	      return entityManager.find( clazz, id );
	   }

}
