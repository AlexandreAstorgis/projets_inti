package com.adaming.tpLocVoitures.service;

import java.util.List;

import com.adaming.tpLocVoitures.entities.Client;
import com.adaming.tpLocVoitures.entities.Reservation;

/**
 * @author inti0314
 *
 */
public interface IClientService extends IGenericService<Client> {

	List<Reservation> getAllReservations(Integer idClient);
}
