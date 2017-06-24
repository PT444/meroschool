package webapp;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import java.util.List;
public class LoginDAOImpl implements LoginDAO {
	
	@Resource(name="sessionFactory")
	protected SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


//	@Override
	public boolean checkLogin(String username, String password) {
		System.out.println("\n \n inside checkLogin");
		Session session= sessionFactory.openSession();
		boolean userFound=false;
		String SQL_QUERY = " Select * from Users as o where o.username=? and o.password=?";
		Query query=session.createSQLQuery(SQL_QUERY);
		query.setParameter(0, username);
		query.setParameter(1, password);
		List list=query.list();
		System.out.println("list:::"+list);
		if(list != null && list.size()>0)
			userFound=true;
		session.close();
		return userFound;
	}

}
