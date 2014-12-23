package com.blogspot.lifeinide.clibernate.respository;

import com.blogspot.lifeinide.clibernate.model.BaseEnity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

/**
 * Base for repositories. Implement your own repositories using:
 * <pre>{@code
 * @literal@Repository
 * class MyRespository extends BaseRepository {
 * }
 * }</pre>
 *
 * @author l0co@wp.pl
 */
@SuppressWarnings("SpringJavaAutowiredMembersInspection")
@Transactional
public abstract class BaseRepository<T extends BaseEnity> {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

}
