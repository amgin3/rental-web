//package com.rentalcars.rentalcarssystem.models;
//
//import java.util.List;
//
//import javax.transaction.Transactional;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//public class UserDAO {
//
//	@Repository
//	@Transactional
//	public class UserDao {
//	  
//	  @Autowired
//	  private SessionFactory _sessionFactory;
//	  
//	  private Session getSession() {
//	    return _sessionFactory.getCurrentSession();
//	  }
//
//	  public void save(User user) {
//	    getSession().save(user);
//	  }
//	  
//	  public void delete(User user) {
//	    getSession().delete(user);
//	  }
//	  
//	  @SuppressWarnings("unchecked")
//	  public List getAll() {
//	    return getSession().createQuery("from users").list();
//	  }
//	  
//	  public User getByUserName(String user_name) {
//	    return (User) getSession().createQuery(
//	        "from users where user_name = :user_name")
//	        .setParameter("user_name", user_name)
//	        .uniqueResult();
//	  }
//
//	  public User getById(long id) {
//	    return (User) getSession().load(User.class, id);
//	  }
//
//	  public void update(User user) {
//	    getSession().update(user);
//	  }
//
//	}
//}
