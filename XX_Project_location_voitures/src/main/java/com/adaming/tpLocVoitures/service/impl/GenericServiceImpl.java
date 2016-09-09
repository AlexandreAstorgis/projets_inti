package com.adaming.tpLocVoitures.service.impl;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.tpLocVoitures.dao.IGenericDAO;
import com.adaming.tpLocVoitures.service.IGenericService;

/**
 * @author inti0314
 *
 */
@Transactional
public class GenericServiceImpl<T> implements IGenericService<T> {
	
	@Inject
	private IGenericDAO<T> dao;
	private Logger log = Logger.getLogger("GenericService");

	/**
	 * @param dao the dao to set
	 */
	public void setDao(IGenericDAO<T> dao) {
		this.dao = dao;
		log.info("<--------------------      DAO INJECTED     ------------------------------->");
	}
	
	
	

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IGenericService#add(java.lang.Object)
	 */
	@Override
	public T add(T t) {
		return dao.add(t);
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IGenericService#update(java.lang.Object)
	 */
	@Override
	public T update(T t) {
		return dao.update(t);
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IGenericService#find(java.lang.Long)
	 */
	@Override
	public T find(Long id) {
		return dao.find(id);
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IGenericService#getAll()
	 */
	@Override
	public List<T> getAll() {
		return dao.getAll();
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IGenericService#delete(java.lang.Object)
	 */
	@Override
	public T delete(T t) {
		return dao.delete(t);
	}
}
