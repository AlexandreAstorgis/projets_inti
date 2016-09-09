package com.adaming.tpLocVoitures.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author inti0314
 *
 */
@Entity
public class Voiture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVoiture;
	private String marque;
	private String modele;
	private String immatriculation;
	private byte[] img;
	private Double kmParcourus;
	private Double prix;
	
	
	@OneToMany(mappedBy = "voiture")
	private List<Reservation> reservation;
	
	
	
	
	
	
	
	/**
	 * 
	 */
	public Voiture() {
		super();
	}

	/**
	 * @param marque
	 * @param modele
	 * @param immatriculation
	 * @param img
	 * @param kmParcourus
	 * @param prix
	 */
	public Voiture(String marque, String modele, String immatriculation,
			byte[] img, Double kmParcourus, Double prix) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.immatriculation = immatriculation;
		this.img = img;
		this.kmParcourus = kmParcourus;
		this.prix = prix;
	}

	/**
	 * @param idVoiture
	 * @param marque
	 * @param modele
	 * @param immatriculation
	 * @param img
	 * @param kmParcourus
	 * @param prix
	 */
	public Voiture(Long idVoiture, String marque, String modele,
			String immatriculation, byte[] img, Double kmParcourus, Double prix) {
		super();
		this.idVoiture = idVoiture;
		this.marque = marque;
		this.modele = modele;
		this.immatriculation = immatriculation;
		this.img = img;
		this.kmParcourus = kmParcourus;
		this.prix = prix;
	}
	
	
	
	
	
	
	
	
	
	
	

	/**
	 * @return the idVoiture
	 */
	public Long getIdVoiture() {
		return idVoiture;
	}

	/**
	 * @param idVoiture the idVoiture to set
	 */
	public void setIdVoiture(Long idVoiture) {
		this.idVoiture = idVoiture;
	}

	/**
	 * @return the marque
	 */
	public String getMarque() {
		return marque;
	}

	/**
	 * @param marque the marque to set
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}

	/**
	 * @return the modele
	 */
	public String getModele() {
		return modele;
	}

	/**
	 * @param modele the modele to set
	 */
	public void setModele(String modele) {
		this.modele = modele;
	}

	/**
	 * @return the immatriculation
	 */
	public String getImmatriculation() {
		return immatriculation;
	}

	/**
	 * @param immatriculation the immatriculation to set
	 */
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	/**
	 * @return the img
	 */
	public byte[] getImg() {
		return img;
	}

	/**
	 * @param img the img to set
	 */
	public void setImg(byte[] img) {
		this.img = img;
	}

	/**
	 * @return the kmParcourus
	 */
	public Double getKmParcourus() {
		return kmParcourus;
	}

	/**
	 * @param kmParcourus the kmParcourus to set
	 */
	public void setKmParcourus(Double kmParcourus) {
		this.kmParcourus = kmParcourus;
	}

	/**
	 * @return the prix
	 */
	public Double getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(Double prix) {
		this.prix = prix;
	}
}
