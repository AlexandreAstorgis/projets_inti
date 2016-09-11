package com.adaming.tpLocVoitures.service.impl;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.tpLocVoitures.dao.IClientDAO;
import com.adaming.tpLocVoitures.entities.Client;
import com.adaming.tpLocVoitures.entities.Reservation;
import com.adaming.tpLocVoitures.service.IClientService;

/**
 * @author inti0314
 *
 */
@Service
@Transactional
public class ClientServiceImpl extends GenericServiceImpl<Client> implements
		IClientService {
	
	@Inject
	private IClientDAO dao;
	private Logger log = Logger.getLogger("ClientServiceImpl");

	/**
	 * @param dao the dao to set
	 */
	public void setDao(IClientDAO dao) {
		this.dao = dao;
		log.info("<--------------------      DAO INJECTED     ------------------------------->");
	}
	
	
	
	
	

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IClientService#getAllReservations(java.lang.Integer)
	 */
	@Override
	public List<Reservation> getAllReservations(Integer idClient) {
		return dao.getAllReservations(idClient);
	}
}
