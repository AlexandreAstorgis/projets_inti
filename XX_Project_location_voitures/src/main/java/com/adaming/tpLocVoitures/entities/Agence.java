package com.adaming.tpLocVoitures.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "clients_par_agence")
	private List<Client> listeClients;
	
	@OneToMany(mappedBy = "agence", fetch = FetchType.LAZY)
	private List<Reservation> listeReservations;
	
	@OneToMany(mappedBy = "agence", fetch = FetchType.LAZY)
	private List<Facture> listeFactures;
	
	@OneToMany(mappedBy = "agence", fetch = FetchType.LAZY)
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

	/**
	 * @return the listeClients
	 */
	public List<Client> getListeClients() {
		return listeClients;
	}

	/**
	 * @param listeClients the listeClients to set
	 */
	public void setListeClients(List<Client> listeClients) {
		this.listeClients = listeClients;
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
	 * @return the listeFactures
	 */
	public List<Facture> getListeFactures() {
		return listeFactures;
	}

	/**
	 * @param listeFactures the listeFactures to set
	 */
	public void setListeFactures(List<Facture> listeFactures) {
		this.listeFactures = listeFactures;
	}

	/**
	 * @return the listeVoitures
	 */
	public List<Voiture> getListeVoitures() {
		return listeVoitures;
	}

	/**
	 * @param listeVoitures the listeVoitures to set
	 */
	public void setListeVoitures(List<Voiture> listeVoitures) {
		this.listeVoitures = listeVoitures;
	}
	
	/**
	 * 
	 * @param client
	 */
	public void ajouterClient(Client client) {
		if (this.listeClients == null) this.setListeClients(new ArrayList<Client>());
		this.listeClients.add(client);
	}
}
