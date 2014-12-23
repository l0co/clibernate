package com.blogspot.lifeinide.clibernate.respository;

import com.blogspot.lifeinide.clibernate.model.BaseEnity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Base for repositories.
 *
 * @see IRepository
 * @author l0co@wp.pl
 */
@SuppressWarnings({"SpringJavaAutowiredMembersInspection", "unchecked"})
@Transactional
public abstract class BaseRepository<T extends BaseEnity> implements IRepository<T> {

	@Autowired
	private SessionFactory sessionFactory;

	protected Class<T> clazz;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public BaseRepository(Class<T> clazz) {
		this.clazz = clazz;
	}

	@Override
	public T get(long id) {
		return (T) getSession().get(clazz, id);
	}

	@Override
	public Long save(T object) {
		return (Long) getSession().save(object);
	}

	@Override
	public void delete(T object) {
		getSession().delete(object);
	}

	@Override
	public List<T> findAll() {
		return (List<T>) getSession().createQuery(String.format("from %s", clazz.getSimpleName())).list();
	}

}
