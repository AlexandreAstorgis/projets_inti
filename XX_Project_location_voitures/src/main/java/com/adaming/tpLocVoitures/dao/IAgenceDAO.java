package com.adaming.tpLocVoitures.dao;

import java.util.List;

import com.adaming.tpLocVoitures.entities.Agence;
import com.adaming.tpLocVoitures.entities.Client;
import com.adaming.tpLocVoitures.entities.Facture;
import com.adaming.tpLocVoitures.entities.Reservation;
import com.adaming.tpLocVoitures.entities.Voiture;

/**
 * @author inti0314555
 *
 */
public interface IAgenceDAO extends IGenericDAO<Agence> {

	List<Reservation> getAllReservations(Integer idAgence);
	List<Voiture> getAllVoitures(Integer idAgence);
	List<Facture> getAllFactures(Integer idAgence);
	List<Client> getAllClients(Integer idAgence);
}
