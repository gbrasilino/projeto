package br.com.cmd.jpa;

import java.sql.Connection;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	
	static Connection conn = null;
	EntityManagerFactory emf = null;
	
	/*m�todo construtor-------------------------------------------------*/
	public Conexao() 
	{
		if(emf == null)//verifica se existe uma conexao aberta se tiver ele aproveita se n�o ele cria uma outra
			emf = createEntity();
		else
			getEntity();
	}
	/*recupera a conex�o aberta para persistir objeto-----------------*/
	public EntityManagerFactory getEntity() 
	{
		return emf;
	}
	
	/*Faz conexao JDBC-------------------------------------------------*/
	public static Connection getConnection() 
	{
		return conn;
	}
	
	/*Cria uma conex�o com o banco de dados---------------------------*/
	public EntityManagerFactory createEntity() 
	{
		emf = Persistence.createEntityManagerFactory("cmdJPA");
		
		return emf;
	}
	
	/*metodo respons�vel por fechar as conex�es-----------------------*/
	public void closeEMF() 
	{
		emf.close();
	}
	

}
