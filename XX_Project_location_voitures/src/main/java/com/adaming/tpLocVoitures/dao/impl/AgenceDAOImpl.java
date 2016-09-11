package com.adaming.tpLocVoitures.dao.impl;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.SQLQuery;
import org.springframework.stereotype.Repository;

import com.adaming.tpLocVoitures.dao.IAgenceDAO;
import com.adaming.tpLocVoitures.entities.Agence;
import com.adaming.tpLocVoitures.entities.Client;
import com.adaming.tpLocVoitures.entities.Facture;
import com.adaming.tpLocVoitures.entities.Reservation;
import com.adaming.tpLocVoitures.entities.Voiture;

/**
 * @author inti0314
 *
 */
@Repository
public class AgenceDAOImpl extends GenericDAOImpl<Agence> implements IAgenceDAO {
	
	@PersistenceContext
	protected EntityManager em;
	
	private Logger log = Logger.getLogger("AgenceDAOImpl");
	
	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.dao.IAgenceDAO#getAllReservations(java.lang.Integer)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Reservation> getAllReservations(Integer idAgence) {
		SQLQuery query = (SQLQuery) em.createQuery("SELECT r.* "
												 + "FROM agence a "
												 + "INNER JOIN reservations_par_agence ra ON ra.agence_idAgence = a.idAgence "
												 + "INNER JOIN reservation r ON ra.idReservation = r.idReservation "
												 + "WHERE a.idAgence = ?");
		query.setInteger(1, idAgence);
		List<Reservation> reservations = query.list();
		log.info("------    RECUP DE LA LISTE DES RESERVATIONS POUR UNE AGENCE DONNEE     ------");
		return reservations;
	}

	
	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.dao.IAgenceDAO#getAllVoitures(java.lang.Integer)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Voiture> getAllVoitures(Integer idAgence) {
		SQLQuery query = (SQLQuery) em.createQuery("SELECT v.* "
												 + "FROM agence a "
												 + "INNER JOIN voitures_par_agence va ON va.agence_idAgence = a.idAgence "
												 + "INNER JOIN voiture v ON va.idVoiture = v.idVoiture "
												 + "WHERE a.idAgence = ?");
		query.setInteger(1, idAgence);
		List<Voiture> voitures = query.list();
		log.info("------    RECUP DE LA LISTE DES VOITURES POUR UNE AGENCE DONNEE     ------");
		return voitures;
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.dao.IAgenceDAO#getAllFactures(java.lang.Integer)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Facture> getAllFactures(Integer idAgence) {
		SQLQuery query = (SQLQuery) em.createQuery("SELECT f.* "
												 + "FROM agence a "
												 + "INNER JOIN factures_par_agence fa ON fa.agence_idAgence = a.idAgence "
												 + "INNER JOIN facture f ON fa.idFacture = f.idFacture "
												 + "WHERE a.idAgence = ?");
		query.setInteger(1, idAgence);
		List<Facture> factures = query.list();
		log.info("------    RECUP DE LA LISTE DES FACTURES POUR UNE AGENCE DONNEE     ------");
		return factures;
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.dao.IAgenceDAO#getAllClients(java.lang.Integer)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Client> getAllClients(Integer idAgence) {
		SQLQuery query = (SQLQuery) em.createQuery("SELECT c.* "
												 + "FROM agence a "
												 + "INNER JOIN clients_par_agence ca ON ca.agence_idAgence = a.idAgence "
												 + "INNER JOIN client c ON ca.idFacture = c.idFacture "
												 + "WHERE a.idAgence = ?");
		query.setInteger(1, idAgence);
		List<Client> clients = query.list();
		log.info("------    RECUP DE LA LISTE DES CLIENTS POUR UNE AGENCE DONNEE     ------");
		return clients;
	}
}
