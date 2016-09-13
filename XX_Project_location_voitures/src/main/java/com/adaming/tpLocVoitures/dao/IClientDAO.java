package com.adaming.tpLocVoitures.dao;

import java.util.List;

import com.adaming.tpLocVoitures.entities.Client;
import com.adaming.tpLocVoitures.entities.Reservation;

/**
 * @author inti0314
 *
 */
public interface IClientDAO extends IGenericDAO<Client> {

	List<Reservation> getAllReservations(Long idClient);
}
