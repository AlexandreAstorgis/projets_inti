package com.adaming.tpLocVoitures.entities;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * @author inti0314
 *
 */
@Entity
public class Facture {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFacture;
	private Calendar date;
	
	@OneToOne
	@JoinColumn(name = "idReservation")
	private Reservation reservation;
	
	@ManyToOne
	@JoinTable(name = "factures_par_agence")
	private Agence agence;
	
	
	
	
	
	
	
	/**
	 * 
	 */
	public Facture() {
		super();
	}

	/**
	 * @param date
	 */
	public Facture(Calendar date) {
		super();
		this.date = date;
	}

	/**
	 * @param idFacture
	 * @param date
	 */
	public Facture(Long idFacture, Calendar date) {
		super();
		this.idFacture = idFacture;
		this.date = date;
	}
	
	
	
	
	
	
	
	

	/**
	 * @return the idFacture
	 */
	public Long getIdFacture() {
		return idFacture;
	}

	/**
	 * @param idFacture the idFacture to set
	 */
	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}

	/**
	 * @return the date
	 */
	public Calendar getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Calendar date) {
		this.date = date;
	}

	/**
	 * @return the reservation
	 */
	public Reservation getReservation() {
		return reservation;
	}

	/**
	 * @param reservation the reservation to set
	 */
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	/**
	 * @return the agence
	 */
	public Agence getAgence() {
		return agence;
	}

	/**
	 * @param agence the agence to set
	 */
	public void setAgence(Agence agence) {
		this.agence = agence;
	}
}
