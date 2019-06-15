package br.com.cmd.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;

import br.com.cmd.app.StartCMD;
import br.com.cmd.jpa.Conexao;

public abstract class GenericDAO<T> implements IGenericDAO<T> {

	private Class<T> clazz;
	private EntityManager entityManager;
	static final Logger LOG = LogManager.getLogger(GenericDAO.class.getName());

	public GenericDAO() {
		entityManager = Conexao.getEntity();
	}

	public GenericDAO(Class<T> persistedClass) {
		this();
		this.clazz = persistedClass;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setClazz(Class<T> clazzToSet) {
		this.clazz = clazzToSet;
	}

	public void beginTransaction() {
		this.entityManager.getTransaction().begin();

	}

	public void commitTransaction() {
		this.entityManager.getTransaction().commit();

	}

	public void save(T entity) {
		try {
			beginTransaction();
			entityManager.persist(entity);
			commitTransaction();
		} catch (HibernateException e) {
			LOG.error("Não foi possível salvar o " + clazz.getName());
			LOG.error(e.getMessage());
		} finally {
			entityManager.close();
		}
	}

	public void update(T entity) {
		try {
			entityManager.merge(entity);
		} catch (HibernateException e) {
			LOG.error("Não foi possível atualizar o " + clazz.getName());
			LOG.error(e.getMessage());
		} finally {
			entityManager.close();
		}
	}

	public void delete(T entity) {
		// TODO Auto-generated method stub
		try {
			entityManager.remove(entity);
		} catch (HibernateException e) {
			LOG.error("Não foi possível deletar o " + clazz.getName());
			LOG.error(e.getMessage());
		} finally {
			entityManager.close();
		}
	}

	public void deleteById(Long entityId) {
		try {
			T entity = this.findOne(entityId);
			delete(entity);
		} catch (HibernateException e) {
			LOG.error("Não foi possível deletar o " + clazz.getName());
			LOG.error(e.getMessage());
		} finally {
			entityManager.close();
		}
	}

	public List<T> listAll() {
		// TODO Auto-generated method stub
		try {
			@SuppressWarnings("unchecked")
			List<T> all = this.getEntityManager().createQuery("from " + clazz.getName()).getResultList();
			return all;
		} catch (HibernateException e) {
			LOG.error("Não foi obter os dados de " + clazz.getName());
			LOG.error(e.getMessage());
		} finally {
			entityManager.close();
		}
		return null;
	}

	public T findOne(Long id) {
		try {
			return entityManager.find(clazz, id);
		} catch (HibernateException e) {
			LOG.error("Não encontrei " + clazz.getName());
			LOG.error(e.getMessage());
		} finally {
			entityManager.close();
		}
		return null;
	}

}
