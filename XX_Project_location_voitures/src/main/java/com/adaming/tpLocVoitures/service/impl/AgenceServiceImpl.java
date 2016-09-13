package com.adaming.tpLocVoitures.service.impl;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.tpLocVoitures.dao.IAgenceDAO;
import com.adaming.tpLocVoitures.entities.Agence;
import com.adaming.tpLocVoitures.entities.Client;
import com.adaming.tpLocVoitures.entities.Facture;
import com.adaming.tpLocVoitures.entities.Reservation;
import com.adaming.tpLocVoitures.entities.Voiture;
import com.adaming.tpLocVoitures.service.IAgenceService;

/**
 * @author inti0314
 *
 */
@Service
@Transactional
public class AgenceServiceImpl implements IAgenceService {
	
	@Inject
	private IAgenceDAO dao;
	private Logger log = Logger.getLogger("AgenceServiceImpl");

	/**
	 * @param dao the dao to set
	 */
	public void setDao(IAgenceDAO dao) {
		this.dao = dao;
		log.info("<--------------------      DAO INJECTED     ------------------------------->");
	}
	
	
	
	

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IAgenceService#getAllReservations(java.lang.Integer)
	 */
	@Override
	public List<Reservation> getAllReservations(Long idAgence) {
		return dao.getAllReservations(idAgence);
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IAgenceService#getAllVoitures(java.lang.Integer)
	 */
	@Override
	public List<Voiture> getAllVoitures(Long idAgence) {
		return dao.getAllVoitures(idAgence);
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IAgenceService#getAllFactures(java.lang.Integer)
	 */
	@Override
	public List<Facture> getAllFactures(Long idAgence) {
		return dao.getAllFactures(idAgence);
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IAgenceService#getAllClients(java.lang.Integer)
	 */
	@Override
	public List<Client> getAllClients(Long idAgence) {
		return dao.getAllClients(idAgence);
	}
	
	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IGenericService#add(java.lang.Object)
	 */
	@Override
	public Agence add(Agence agence) {
		return dao.add(agence);
	}
	
	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IGenericService#update(java.lang.Object)
	 */
	@Override
	public Agence update(Agence agence) {
		return dao.update(agence);
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IGenericService#find(java.lang.Long)
	 */
	@Override
	public Agence find(Long id) {
		return dao.find(id);
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IGenericService#getAll()
	 */
	@Override
	public List<Agence> getAll() {
		return dao.getAll();
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.service.IAgenceService#addClient(java.lang.Long, com.adaming.tpLocVoitures.entities.Client)
	 */
	@Override
	public Agence addClient(Long idAgence, Client client) {
		return dao.addClient(idAgence, client);
	}
}
