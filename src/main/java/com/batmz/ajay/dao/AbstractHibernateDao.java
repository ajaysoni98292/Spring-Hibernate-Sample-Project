package com.batmz.ajay.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.common.base.Preconditions;

@SuppressWarnings("unchecked")
public abstract class AbstractHibernateDao<T extends Serializable> implements IOperations<T> {
	private Class<T> clazz;

	@Autowired
	private SessionFactory sessionFactory;

	// API

	protected final void setClazz(final Class<T> clazzToSet) {
		clazz = Preconditions.checkNotNull(clazzToSet);
	}

	@Override
	public final T findOne(final long id) {
		return (T) getCurrentSession().get(clazz, id);
	}
	
	@Override
	public final T findOne(final String id) {
		return (T) getCurrentSession().get(clazz, id);
	}

	@Override
	public final List<T> findAll() {
		return getCurrentSession().createQuery("from " + clazz.getName()).list();
	}

/*    @Override
    public final List<T> findAllByFieldName(final String fieldName) {

        return (List<T>) getCurrentSession().get(clazz,fieldName);
    }*/

	@Override
	public final void create(final T entity) {
		Preconditions.checkNotNull(entity);
		// getCurrentSession().persist(entity);
		getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public final T update(final T entity) {
		Preconditions.checkNotNull(entity);
		return (T) getCurrentSession().merge(entity);
	}

	@Override
	public final void delete(final T entity) {
		Preconditions.checkNotNull(entity);
		getCurrentSession().delete(entity);
	}

	@Override
	public final void deleteById(final long entityId) {
		final T entity = findOne(entityId);
		Preconditions.checkState(entity != null);
		delete(entity);
	}
	
	@Override
	public final void deleteById(final String entityId) {
		final T entity = findOne(entityId);
		Preconditions.checkState(entity != null);
		delete(entity);
	}
	
	@Override
	public final Object findRecordsCount(){
		return getCurrentSession().createCriteria(clazz.getName()).setProjection(Projections.rowCount()).uniqueResult();
	}
	protected final Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public final Class<T> getClazz(){
		return clazz;
	}
}