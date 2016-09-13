package com.adaming.tpLocVoitures.service;

import java.util.List;

import com.adaming.tpLocVoitures.entities.Reservation;
import com.adaming.tpLocVoitures.entities.Voiture;

/**
 * @author inti0314
 *
 */
public interface IVoitureService extends IGenericService<Voiture> {

	List<Reservation> getAllReservations(Long idVoiture);
}
