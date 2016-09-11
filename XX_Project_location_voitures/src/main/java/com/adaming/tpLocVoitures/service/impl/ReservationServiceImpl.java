package com.adaming.tpLocVoitures.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.tpLocVoitures.entities.Reservation;
import com.adaming.tpLocVoitures.service.IReservationService;

/**
 * @author inti0314
 *
 */
@Service
@Transactional
public class ReservationServiceImpl extends GenericServiceImpl<Reservation>
		implements IReservationService {

}
