/**
 * GenericDAOImpl used to perform the common database operations 
 * Created Date : 04-07-2012
 */
package com.customer.manager.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class GenericDAOImpl.
 * 
 * @param <T> the generic type
 */
@Repository("BaseDAO")
@Transactional
public class GenericDAOImpl<T> extends BaseDAO {

	/**
	 * Find by query.
	 * 
	 * @param queryString the query string
	 * @return the list
	 * @throws Exception the exception
	 */
	@SuppressWarnings("unchecked")
	public List<T> findByQuery(String queryString) throws Exception {
		Session session = getHibernateSession();
		
		Query query = (Query) session.createQuery(queryString);
		List<T> list = query.list();

		return list;
	}
	
	
	@SuppressWarnings("unchecked")
	public T findById(Long identifier, Class<?> persistClass) {
	    return (T) this.getHibernateSession().get(persistClass, identifier);
	}

	/**
	 * Delete.
	 * 
	 * @param newInstance the new instance
	 * @throws Exception the exception
	 */

	public void delete(T newInstance) throws Exception {
		getHibernateSession().delete(newInstance);

	}

	/**
	 * Delete all.
	 * 
	 * @param deleteList the delete list
	 * @throws Exception the exception
	 */

	public void deleteAll(List<T> deleteList) throws Exception {
		getHibernateSession().delete(deleteList);
	}

	/**
	 * Save.
	 * 
	 * @param newInstance the new instance
	 * @throws Exception the exception
	 */
	public void save(T newInstance) throws Exception {
		getHibernateSession().save(newInstance);
	}

	/**
	 * Merge.
	 * 
	 * @param newInstance the new instance
	 * @throws Exception the exception
	 */
	public void merge(T newInstance) throws Exception {
		getHibernateSession().merge(newInstance);
	}

	/**
	 * Save or update.
	 * 
	 * @param newInstance the new instance
	 * @throws Exception the exception
	 */

	public void saveOrUpdate(T newInstance) throws Exception {
		getHibernateSession().saveOrUpdate(newInstance);

	}

	/**
	 * Save or update all.
	 * 
	 * @param saveList the save list
	 * @throws Exception the exception
	 */

	public void saveOrUpdateAll(List<T> saveList) throws Exception {
		getHibernateSession().saveOrUpdate(saveList);
	}
	
	
}
