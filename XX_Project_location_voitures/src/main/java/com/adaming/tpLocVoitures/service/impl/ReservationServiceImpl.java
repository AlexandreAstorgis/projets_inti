package com.adaming.tpLocVoitures.service.impl;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.tpLocVoitures.dao.IReservationDAO;
import com.adaming.tpLocVoitures.entities.Reservation;
import com.adaming.tpLocVoitures.service.IReservationService;

/**
 * @author inti0314
 *
 */
@Service
@Transactional
public class ReservationServiceImpl implements IReservationService {

	@Inject
	private IReservationDAO dao;
	private Logger log = Logger.getLogger("ReservationServiceImpl");

	/**
	 * @param dao the dao to set
	 */
	public void setDao(IReservationDAO dao) {
		this.dao = dao;
		log.info("<--------------------      DAO INJECTED     ------------------------------->");
	}
	
	
	
	
	
	
	
	

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IGenericService#add(java.lang.Object)
	 */
	@Override
	public Reservation add(Reservation reservation) {
		return dao.add(reservation);
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IGenericService#update(java.lang.Object)
	 */
	@Override
	public Reservation update(Reservation reservation) {
		return dao.update(reservation);
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IGenericService#find(java.lang.Long)
	 */
	@Override
	public Reservation find(Long id) {
		return dao.find(id);
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IGenericService#getAll()
	 */
	@Override
	public List<Reservation> getAll() {
		return dao.getAll();
	}
}
