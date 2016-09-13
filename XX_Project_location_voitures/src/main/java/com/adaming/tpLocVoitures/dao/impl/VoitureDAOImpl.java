package com.adaming.tpLocVoitures.dao.impl;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
	public List<Reservation> getAllReservations(Long idVoiture) {
		Voiture voiture = this.find(idVoiture);
		Query query = em.createQuery("FROM Reservation r WHERE r.voiture = ?");
		query.setParameter(1, voiture);
		List<Reservation> results = query.getResultList();

		log.info("------    RECUP DE LA LISTE DES RESERVATIONS POUR UNE VOITURE DONNEE     ------");
		return results;
	}
}
