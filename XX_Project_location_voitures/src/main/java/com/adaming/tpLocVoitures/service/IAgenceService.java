package com.adaming.tpLocVoitures.service;

import java.util.List;

import com.adaming.tpLocVoitures.entities.Agence;
import com.adaming.tpLocVoitures.entities.Client;
import com.adaming.tpLocVoitures.entities.Facture;
import com.adaming.tpLocVoitures.entities.Reservation;
import com.adaming.tpLocVoitures.entities.Voiture;

/**
 * @author inti0314
 *
 */
public interface IAgenceService extends IGenericService<Agence>{

	List<Reservation> getAllReservations(Integer idAgence);
	List<Voiture> getAllVoitures(Integer idAgence);
	List<Facture> getAllFactures(Integer idAgence);
	List<Client> getAllClients(Integer idAgence);
}
