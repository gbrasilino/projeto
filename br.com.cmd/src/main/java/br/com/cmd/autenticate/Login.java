package br.com.cmd.autenticate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;

import br.com.cmd.jpa.Conexao;
import br.com.cmd.model.UserAccount;

public class Login {
	private static Logger LOG = LogManager.getLogger(Login.class.getName());
	private EntityManager em;
	
	public Login() {
		em = Conexao.getEntity();
	}
	
	public boolean getLogin(String user, String pwd) {
		
		String sqlLogin = "FROM UserAccount as usuario WHERE usuario.email = :user AND usuario.senha = :senha";
		try {
			Query result = em.createQuery(sqlLogin);
			result.setParameter("user", user);
			result.setParameter("senha", pwd);
			List<UserAccount> resultList = result.getResultList();
			if (resultList.size() > 0) return true;
		} catch (HibernateException e) {
			LOG.error("Erro localizando usuário!");
			LOG.error(e.getMessage());
		} finally {
			em.close();
		}
		
		return false;
	}
	

}
