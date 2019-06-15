package br.com.cmd.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.cmd.app.StartCMD;

public class Conexao {
	
	static final Logger LOG = LogManager.getLogger(Conexao.class.getName());
	EntityManagerFactory emf = null;
	static EntityManager em = null;
	
	/*método construtor-------------------------------------------------*/
	public Conexao() 
	{
		
		if(emf == null)//verifica se existe uma conexao aberta se tiver ele aproveita se não ele cria uma outra
			emf = createEntity();
		else
			getEntity();
	}
	/*recupera a conex�o aberta para persistir objeto-----------------*/
	public static EntityManager getEntity() 
	{
		return em;
	}
	
	
	/*Cria uma conex�o com o banco de dados---------------------------*/
	public EntityManagerFactory createEntity() 
	{
		LOG.warn("Abrindo conexao!");
		emf = Persistence.createEntityManagerFactory("cmdJPA");
		
		return emf;
	}
	
	/*metodo respons�vel por fechar as conex�es-----------------------*/
	public void closeEMF() 
	{
		emf.close();
	}
	

}
