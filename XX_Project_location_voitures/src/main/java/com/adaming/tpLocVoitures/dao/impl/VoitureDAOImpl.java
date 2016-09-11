package com.adaming.tpLocVoitures.dao.impl;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.SQLQuery;
import org.springframework.stereotype.Repository;

import com.adaming.tpLocVoitures.dao.IVoitureDAO;
import com.adaming.tpLocVoitures.entities.Reservation;
import com.adaming.tpLocVoitures.entities.Voiture;

/**
 * @author inti0314
 *
 */
@Repository
public class VoitureDAOImpl extends GenericDAOImpl<Voiture> implements
		IVoitureDAO {
	
	@PersistenceContext
	protected EntityManager em;
	
	private Logger log = Logger.getLogger("VoitureDAOImpl");
	
	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.dao.IVoitureDAO#getAllReservations(java.lang.Integer)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Reservation> getAllReservations(Integer idVoiture) {
		SQLQuery query = (SQLQuery) em.createQuery("SELECT r.* "
												 + "FROM voiture v "
												 + "INNER JOIN reservations_par_voiture rv ON rv.voiture_idVoiture = v.idVoiture "
												 + "INNER JOIN reservation r ON rv.idReservation = r.idReservation "
												 + "WHERE v.idVoiture = ?");
		query.setInteger(1, idVoiture);
		List<Reservation> reservations = query.list();
		log.info("------    RECUP DE LA LISTE DES RESERVATIONS POUR UNE VOITURE DONNEE     ------");
		return reservations;
	}
}
