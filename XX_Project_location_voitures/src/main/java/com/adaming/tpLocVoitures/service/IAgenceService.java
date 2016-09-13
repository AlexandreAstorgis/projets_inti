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

	List<Reservation> getAllReservations(Long idAgence);
	List<Voiture> getAllVoitures(Long idAgence);
	List<Facture> getAllFactures(Long idAgence);
	List<Client> getAllClients(Long idAgence);
	Agence addClient(Long idAgence, Client client);
}
