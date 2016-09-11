package com.adaming.tpLocVoitures.dao;

import java.util.List;

import com.adaming.tpLocVoitures.entities.Reservation;
import com.adaming.tpLocVoitures.entities.Voiture;

/**
 * @author inti0314
 *
 */
public interface IVoitureDAO extends IGenericDAO<Voiture> {

	List<Reservation> getAllReservations(Integer idVoiture);
}
