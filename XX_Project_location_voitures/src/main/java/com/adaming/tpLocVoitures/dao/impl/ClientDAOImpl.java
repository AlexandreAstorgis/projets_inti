package com.adaming.tpLocVoitures.dao.impl;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.SQLQuery;
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
	public List<Reservation> getAllReservations(Integer idClient) {
		SQLQuery query = (SQLQuery) em.createQuery("SELECT r.* "
												 + "FROM client c "
												 + "INNER JOIN reservations_par_client rc ON rc.client_idClient = c.idClient "
												 + "INNER JOIN reservation r ON rc.idReservation = r.idReservation "
												 + "WHERE c.idClient = ?");
		query.setInteger(1, idClient);
		List<Reservation> reservations = query.list();
		log.info("------    RECUP DE LA LISTE DES RESERVATIONS POUR UN CLIENT DONNE     ------");
		return reservations;
	}
}
