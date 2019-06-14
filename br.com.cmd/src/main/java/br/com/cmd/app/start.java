package br.com.cmd.app;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.cmd.jpa.Conexao;

public class start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conexao conectar = new Conexao();
		conectar.getEntity();
		
		

	}

}
