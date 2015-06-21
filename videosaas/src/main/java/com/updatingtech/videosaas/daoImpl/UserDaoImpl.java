package com.updatingtech.videosaas.daoImpl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.updatingtech.videosaas.dao.UserDao;
import com.updatingtech.videosaas.model.User;

@Repository
public class UserDaoImpl implements UserDao{

	private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
	private SessionFactory sessionFactory;
	
	
	public SessionFactory getSession() {
		return sessionFactory;
	}

	public void setSession(SessionFactory session) {
		this.sessionFactory = session;
	}

	@Override
	public void addUser(User u) {
		Session session = this.getSession().getCurrentSession();
		session.persist(u);
		logger.info("Register successfully.");
	}

	@Override
	public void updateUser(User u) {
		 Session session = this.sessionFactory.getCurrentSession();
	     session.update(u);
	     logger.info("User updated successfully, User Details="+u);
		
	}

	@Override
	public List<User> listUsers() {
		 Session session = this.sessionFactory.getCurrentSession();
		 List<User> usersList = session.createQuery("from Person").list();
	        for(User u : usersList){
	            logger.info("User List::"+u);
	        }
	     return usersList;
	}

	@Override
	public User getUserById(int id) {
		 Session session = this.sessionFactory.getCurrentSession();      
	     User p = (User) session.load(User.class, new Integer(id));
	     logger.info("User loaded successfully, User details="+p);
	     return p;
	}

	@Override
	public void deleteUser(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		User p = (User) session.load(User.class, new Integer(id));
        if(null != p){
            session.delete(p);
        }
        logger.info("User deleted successfully, User details="+p);
		
	}

}
