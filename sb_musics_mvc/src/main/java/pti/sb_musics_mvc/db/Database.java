package pti.sb_musics_mvc.db;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import pti.sb_musics_mvc.model.User;


@Repository
public class Database {

	private SessionFactory sessionFactory;
	
	public Database()
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		
		sessionFactory = cfg.buildSessionFactory();
	}
	
	public void closeDb()
	{
		sessionFactory.close();
	}

	public User getUserById(int userId) {
		
		User user = null;
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		user = session.get(User.class, userId);
		
		if (user != null)
		{
			Query q = session.createNativeQuery("SELECT * FROM users_musics_mapping WHERE userid = ?1 ", Object[].class);
			q.setParameter(1,userId);
			List<Object[]> rows = q.getResultList();
			
			for (int index = 0; index < rows.size(); index++)
			{
				int musicId = Integer.parseInt(rows.get(index)[2].toString());
				user.addMusicId(musicId);
			}
		}
		
		tx.commit();
		session.close();
		
		return user;
	}
	
	

}
