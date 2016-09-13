package com.adaming.tpLocVoitures.dao.impl;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
	public List<Reservation> getAllReservations(Long idAgence) {
		Agence agence = this.find(idAgence);
		Query query = em.createQuery("FROM Reservation r WHERE r.agence = ?");
		query.setParameter(1, agence);
		List<Reservation> results = query.getResultList();

		log.info("------    RECUP DE LA LISTE DES RESERVATIONS POUR UNE AGENCE DONNEE     ------");
		return results;
	}

	
	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.dao.IAgenceDAO#getAllVoitures(java.lang.Integer)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Voiture> getAllVoitures(Long idAgence) {
		Agence agence = this.find(idAgence);
		Query query = em.createQuery("FROM Voiture v WHERE v.agence = ?");
		query.setParameter(1, agence);
		List<Voiture> results = query.getResultList();

		log.info("------    RECUP DE LA LISTE DES VOITURES POUR UNE AGENCE DONNEE     ------");
		return results;
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.dao.IAgenceDAO#getAllFactures(java.lang.Integer)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Facture> getAllFactures(Long idAgence) {
		Agence agence = this.find(idAgence);
		Query query = em.createQuery("FROM Facture f WHERE f.agence = ?");
		query.setParameter(1, agence);
		List<Facture> results = query.getResultList();

		log.info("------    RECUP DE LA LISTE DES FACTURES POUR UNE AGENCE DONNEE     ------");
		return results;
	}

	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.dao.IAgenceDAO#getAllClients(java.lang.Integer)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Client> getAllClients(Long idAgence) {
		Agence agence = this.find(idAgence);
		Query query = em.createQuery("SELECT c FROM Client c, Agence a WHERE a = :agence AND c MEMBER OF a.listeClients");
		query.setParameter("agence", agence);
		List<Client> results = query.getResultList();

		log.info("------    RECUP DE LA LISTE DES CLIENTS POUR UNE AGENCE DONNEE     ------");
		return results;
	}


	/* (non-Javadoc)
	 * @see com.adaming.tpLocVoitures.dao.IAgenceDAO#addClient(java.lang.Long, com.adaming.tpLocVoitures.entities.Client)
	 */
	@Override
	public Agence addClient(Long idAgence, Client client) {
		Agence agence = this.find(idAgence);
		agence.ajouterClient(client);
		this.update(agence);
		return agence;
	}
}
