package com.adaming.tpLocVoitures;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adaming.tpLocVoitures.entities.Agence;
import com.adaming.tpLocVoitures.entities.Voiture;

/**
 * @author inti0314
 *
 */
public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		
		// Création des objets
		Agence ag1 = new Agence("INTI LOC VOITURE", "Paris Montparnasse", "0147852369", "loc-voiture@inti.fr");
		Agence ag2 = new Agence("Jardins d'uvalie loc auto", "Quincy Voisins", "0123654789", "jardins-uvalie@orange.fr");

		Voiture v1 = new Voiture("FORD", "FOCUS", "AA-148-DS", new byte[1], 21000d, 80d);
		Voiture v2 = new Voiture("PEUGEOT", "FOCUS", "AA-148-DS", new byte[1], 21000d, 80d);
		Voiture v3 = new Voiture("CITROEN", "FOCUS", "AA-148-DS", new byte[1], 21000d, 80d);
		Voiture v4 = new Voiture("MERCEDES", "FOCUS", "AA-148-DS", new byte[1], 21000d, 80d);
		Voiture v5 = new Voiture("FORD", "FIESTA", "AA-148-DS", new byte[1], 21000d, 80d);
		
		
		
		context.close();
	}
}
