package com.adaming.tpLocVoitures.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 * @author inti0314
 *
 */
@Entity
public class Agence {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAgence;
	private String nom;
	private String adresse;
	private String tel;
	private String mail;
	
	
	@ManyToMany
	@JoinTable(name = "clients_par_agence")
	private List<Client> listeClients;
	
	@OneToMany(mappedBy = "agence")
	private List<Reservation> listeReservations;
	
	@OneToMany
	@JoinTable(name = "factures_par_agence")
	private List<Facture> listeFactures;
	
	@OneToMany
	@JoinTable(name = "voitures_par_agence")
	private List<Voiture> listeVoitures;
	
	
	
	
	
	
	
	
	
	
	/**
	 * 
	 */
	public Agence() {
		super();
	}

	/**
	 * @param nom
	 * @param adresse
	 * @param tel
	 * @param mail
	 */
	public Agence(String nom, String adresse, String tel, String mail) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.tel = tel;
		this.mail = mail;
	}

	/**
	 * @param idAgence
	 * @param nom
	 * @param adresse
	 * @param tel
	 * @param mail
	 */
	public Agence(Long idAgence, String nom, String adresse, String tel,
			String mail) {
		super();
		this.idAgence = idAgence;
		this.nom = nom;
		this.adresse = adresse;
		this.tel = tel;
		this.mail = mail;
	}
	
	
	
	
	
	
	
	
	

	/**
	 * @return the idAgence
	 */
	public Long getIdAgence() {
		return idAgence;
	}

	/**
	 * @param idAgence the idAgence to set
	 */
	public void setIdAgence(Long idAgence) {
		this.idAgence = idAgence;
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
}
