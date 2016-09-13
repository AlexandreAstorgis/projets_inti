package com.adaming.tpLocVoitures.service.impl;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.tpLocVoitures.dao.IVoitureDAO;
import com.adaming.tpLocVoitures.entities.Reservation;
import com.adaming.tpLocVoitures.entities.Voiture;
import com.adaming.tpLocVoitures.service.IVoitureService;

/**
 * @author inti0314
 *
 */
@Service
@Transactional
public class VoitureServiceImpl implements IVoitureService {
	
	@Inject
	private IVoitureDAO dao;
	private Logger log = Logger.getLogger("VoitureServiceImpl");

	/**
	 * @param dao the dao to set
	 */
	public void setDao(IVoitureDAO dao) {
		this.dao = dao;
		log.info("<--------------------      DAO INJECTED     ------------------------------->");
	}

	
	
	
	
	
	
	
	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IVoitureService#getAllReservations(java.lang.Integer)
	 */
	@Override
	public List<Reservation> getAllReservations(Long idVoiture) {
		return dao.getAllReservations(idVoiture);
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IGenericService#add(java.lang.Object)
	 */
	@Override
	public Voiture add(Voiture voiture) {
		return dao.add(voiture);
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IGenericService#update(java.lang.Object)
	 */
	@Override
	public Voiture update(Voiture voiture) {
		return dao.update(voiture);
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IGenericService#find(java.lang.Long)
	 */
	@Override
	public Voiture find(Long id) {
		return dao.find(id);
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IGenericService#getAll()
	 */
	@Override
	public List<Voiture> getAll() {
		return dao.getAll();
	}
}
