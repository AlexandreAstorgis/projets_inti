package com.adaming.tpLocVoitures.service.impl;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.tpLocVoitures.dao.IFactureDAO;
import com.adaming.tpLocVoitures.entities.Facture;
import com.adaming.tpLocVoitures.service.IFactureService;

/**
 * @author inti0314
 *
 */
@Service
@Transactional
public class FactureServiceImpl implements IFactureService {

	@Inject
	private IFactureDAO dao;
	private Logger log = Logger.getLogger("FactureServiceImpl");

	/**
	 * @param dao the dao to set
	 */
	public void setDao(IFactureDAO dao) {
		this.dao = dao;
		log.info("<--------------------      DAO INJECTED     ------------------------------->");
	}
	
	
	
	
	
	
	

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IGenericService#add(java.lang.Object)
	 */
	@Override
	public Facture add(Facture facture) {
		return dao.add(facture);
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IGenericService#update(java.lang.Object)
	 */
	@Override
	public Facture update(Facture facture) {
		return dao.update(facture);
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IGenericService#find(java.lang.Long)
	 */
	@Override
	public Facture find(Long id) {
		return dao.find(id);
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IGenericService#getAll()
	 */
	@Override
	public List<Facture> getAll() {
		return dao.getAll();
	}
}
