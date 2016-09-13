package com.adaming.tpLocVoitures.entities;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 * @author inti0314
 *
 */
@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClient;
	private String nom;
	private String prenom;
	private String tel;
	private String adresse;
	private String mail;
	private Calendar dateDeNaissance;
	private Calendar dateDePermis;
	
	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
	private List<Reservation> listeReservations;
	
	@ManyToMany(mappedBy = "listeClients", fetch = FetchType.LAZY)
	private List<Agence> agences;
	
	
	
	
	
	
	/**
	 * 
	 */
	public Client() {
		super();
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param tel
	 * @param adresse
	 * @param mail
	 * @param dateDeNaissance
	 * @param dateDePermis
	 */
	public Client(String nom, String prenom, String tel, String adresse,
			String mail, Calendar dateDeNaissance, Calendar dateDePermis) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.adresse = adresse;
		this.mail = mail;
		this.dateDeNaissance = dateDeNaissance;
		this.dateDePermis = dateDePermis;
	}

	/**
	 * @param idClient
	 * @param nom
	 * @param prenom
	 * @param tel
	 * @param adresse
	 * @param mail
	 * @param dateDeNaissance
	 * @param dateDePermis
	 */
	public Client(Long idClient, String nom, String prenom, String tel,
			String adresse, String mail, Calendar dateDeNaissance,
			Calendar dateDePermis) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.adresse = adresse;
		this.mail = mail;
		this.dateDeNaissance = dateDeNaissance;
		this.dateDePermis = dateDePermis;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/**
	 * @return the idClient
	 */
	public Long getIdClient() {
		return idClient;
	}

	/**
	 * @param idClient the idClient to set
	 */
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * @return the dateDeNaissance
	 */
	public Calendar getDateDeNaissance() {
		return dateDeNaissance;
	}

	/**
	 * @param dateDeNaissance the dateDeNaissance to set
	 */
	public void setDateDeNaissance(Calendar dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	/**
	 * @return the dateDePermis
	 */
	public Calendar getDateDePermis() {
		return dateDePermis;
	}

	/**
	 * @param dateDePermis the dateDePermis to set
	 */
	public void setDateDePermis(Calendar dateDePermis) {
		this.dateDePermis = dateDePermis;
	}

	/**
	 * @return the listeReservations
	 */
	public List<Reservation> getListeReservations() {
		return listeReservations;
	}

	/**
	 * @param listeReservations the listeReservations to set
	 */
	public void setListeReservations(List<Reservation> listeReservations) {
		this.listeReservations = listeReservations;
	}

	/**
	 * @return the agences
	 */
	public List<Agence> getAgences() {
		return agences;
	}

	/**
	 * @param agences the agences to set
	 */
	public void setAgences(List<Agence> agences) {
		this.agences = agences;
	}
}
