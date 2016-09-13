package com.adaming.tpLocVoitures.dao.impl;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.adaming.tpLocVoitures.dao.IClientDAO;
import com.adaming.tpLocVoitures.entities.Client;
import com.adaming.tpLocVoitures.entities.Reservation;

/**
 * @author inti0314
 *
 */
@Repository
public class ClientDAOImpl extends GenericDAOImpl<Client> implements IClientDAO {
	
	@PersistenceContext
	protected EntityManager em;
	
	private Logger log = Logger.getLogger("ClientDAOImpl");
	
	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.dao.IClientDAO#getAllReservations(java.lang.Integer)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Reservation> getAllReservations(Long idClient) {
		Client client = this.find(idClient);
		Query query = em.createQuery("FROM Reservation r WHERE r.client = ?");
		query.setParameter(1, client);
		List<Reservation> reservations = query.getResultList();
		
		log.info("------    RECUP DE LA LISTE DES RESERVATIONS POUR UN CLIENT DONNE     ------");
		return reservations;
	}
}
