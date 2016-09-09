/**
 * 
 */
package com.adaming.tpLocVoitures.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.adaming.tpLocVoitures.dao.IGenericDAO;

/**
 * @author inti0314
 *
 */
public abstract class GenericDAOImpl<T> implements IGenericDAO<T> {
	
	@PersistenceContext
	protected EntityManager em;
	
	private Logger log;
	private Class<T> classe;

	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public GenericDAOImpl() {
		ParameterizedType pType = (ParameterizedType) this.getClass().getGenericSuperclass();
		this.classe = (Class<T>) pType.getActualTypeArguments()[0];
		
		log = Logger.getLogger("GenericDAOImpl<" + this.classe.getSimpleName() + ">");
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.dao.IGenericDAO#add(java.lang.Object)
	 */
	@Override
	public T add(T t) {
		em.persist(t);
		log.info("------    AJOUT D'UN ELEMENT DE TYPE : " + classe.getSimpleName() + "   -------");
		return t;
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.dao.IGenericDAO#update(java.lang.Object)
	 */
	@Override
	public T update(T t) {
		em.merge(t);
		log.info("------     MODIF D'UN ELEMENT DE TYPE : " + classe.getSimpleName() + "   -------");
		return t;
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.dao.IGenericDAO#find(java.lang.Long)
	 */
	@Override
	public T find(Long id) {
		T result = em.find(classe, id);
		log.info("------     RECHERCHE D'UN ELEMENT DE TYPE : " + classe.getSimpleName() + " AVEC L'ID " + id.toString() + "   -------");
		return result;
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.dao.IGenericDAO#getAll()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		List<T> resultList = em.createQuery("from " + classe.getSimpleName()).getResultList();
		log.info("------     RECHERCHE DE TOUS LES ELEMENTS DE TYPE : " + classe.getSimpleName() + "   -------");
		return resultList;
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.dao.IGenericDAO#delete(java.lang.Object)
	 */
	@Override
	public T delete(T t) {
		em.remove(t);
		log.info("------     SUPPRESSION D'UN ELEMENT DE TYPE : " + classe.getSimpleName() + "   -------");
		return t;
	}

}
