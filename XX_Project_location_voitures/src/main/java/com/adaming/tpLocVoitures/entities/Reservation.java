package com.adaming.tpLocVoitures.entities;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * @author inti0314
 *
 */
@Entity
public class Reservation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReservation;
	private Calendar dateDebut;
	private Calendar dateFin;
	private Double prixTotal;
	
	
	@ManyToOne
	@JoinTable(name = "reservations_par_client")
	private Client client;
	
	@ManyToOne
	@JoinTable(name = "reservations_par_voiture")
	private Voiture voiture;
	
	@OneToOne(mappedBy = "reservation")
	private Facture facture;
	
	@ManyToOne
	@JoinTable(name = "reservations_par_agence")
	private Agence agence;
	
	
	
	
	
	
	
	
	
	/**
	 * 
	 */
	public Reservation() {
		super();
	}

	/**
	 * @param dateDebut
	 * @param dateFin
	 * @param prixTotal
	 */
	public Reservation(Calendar dateDebut, Calendar dateFin, Double prixTotal) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.prixTotal = prixTotal;
	}

	/**
	 * @param idReservation
	 * @param dateDebut
	 * @param dateFin
	 * @param prixTotal
	 */
	public Reservation(Long idReservation, Calendar dateDebut,
			Calendar dateFin, Double prixTotal) {
		super();
		this.idReservation = idReservation;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.prixTotal = prixTotal;
	}
	
	
	
	
	
	
	
	
	
	
	
	

	/**
	 * @return the idReservation
	 */
	public Long getIdReservation() {
		return idReservation;
	}

	/**
	 * @param idReservation the idReservation to set
	 */
	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}

	/**
	 * @return the dateDebut
	 */
	public Calendar getDateDebut() {
		return dateDebut;
	}

	/**
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Calendar dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * @return the dateFin
	 */
	public Calendar getDateFin() {
		return dateFin;
	}

	/**
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Calendar dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * @return the prixTotal
	 */
	public Double getPrixTotal() {
		return prixTotal;
	}

	/**
	 * @param prixTotal the prixTotal to set
	 */
	public void setPrixTotal(Double prixTotal) {
		this.prixTotal = prixTotal;
	}
}
