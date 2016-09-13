package com.adaming.tpLocVoitures;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adaming.tpLocVoitures.entities.Agence;
import com.adaming.tpLocVoitures.entities.Client;
import com.adaming.tpLocVoitures.entities.Facture;
import com.adaming.tpLocVoitures.entities.Reservation;
import com.adaming.tpLocVoitures.entities.Voiture;
import com.adaming.tpLocVoitures.service.IAgenceService;
import com.adaming.tpLocVoitures.service.IClientService;
import com.adaming.tpLocVoitures.service.IFactureService;
import com.adaming.tpLocVoitures.service.IReservationService;
import com.adaming.tpLocVoitures.service.IVoitureService;
import com.adaming.tpLocVoitures.tools.UtilitaireDate;

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
		
		IAgenceService agenceService = (IAgenceService) context.getBean("agenceServiceImpl");
		IClientService clientService = (IClientService) context.getBean("clientServiceImpl");
		IFactureService factureService = (IFactureService) context.getBean("factureServiceImpl");
		IReservationService reservationService = (IReservationService) context.getBean("reservationServiceImpl");
		IVoitureService voitureService = (IVoitureService) context.getBean("voitureServiceImpl");
		

		/* ================================================= */
		/* =========   CONSTRUCTIONS DES OBJETS   ========== */
		/* ================================================= */
		
		Agence ag1 = new Agence("INTI LOC AUTOS", "Paris Montparnasse", "0147852369", "auto-loc@inti.fr");
		Agence ag2 = new Agence("FREESCALE AUTOS LOC", "Toulouse", "0547896321", "auto-loc@freescale.com");
		Agence ag3 = new Agence("ASTO LOC", "Quincy-Voisins", "0164632145", "asto-loc@qv77.fr");
		
		agenceService.add(ag1);
		agenceService.add(ag2);
		agenceService.add(ag3);		

		//--------------------------------------------------------------------------------------------------------------------------------------

		Voiture v1 = new Voiture("FORD", "FOCUS", "AA-123-AA", new byte[5], 12045d, 82d);
		Voiture v2 = new Voiture("FORD", "FIESTA", "AA-123-BB", new byte[5], 12045d, 45d);
		Voiture v3 = new Voiture("PEUGEOT", "2008", "AA-123-CC", new byte[5], 12045d, 65d);
		Voiture v4 = new Voiture("AUDI", "A5", "AA-123-DD", new byte[5], 12045d, 125d);
		Voiture v5 = new Voiture("RENAULT", "CLIO", "AA-123-EE", new byte[5], 12045d, 47d);
		Voiture v6 = new Voiture("CITROEN", "106", "AA-123-FF", new byte[5], 12045d, 32d);
		Voiture v7 = new Voiture("FORD", "FOCUS", "BB-123-GG", new byte[5], 12045d, 98d);
		Voiture v8 = new Voiture("FORD", "FIESTA", "BB-123-HH", new byte[5], 12045d, 65d);
		Voiture v9 = new Voiture("AUDI", "A4", "BB-123-II", new byte[5], 12045d, 118d);
		Voiture v10 = new Voiture("FORD", "FIESTA", "BB-123-JJ", new byte[5], 12045d, 65d);
		Voiture v11 = new Voiture("CITROEN", "C5", "BB-123-KK", new byte[5], 12045d, 95d);
		Voiture v12 = new Voiture("FORD", "MONDEO", "BB-123-LL", new byte[5], 12045d, 74d);
		Voiture v13 = new Voiture("MERCEDES", "AMG-X", "CC-123-MM", new byte[5], 12045d, 145d);
		Voiture v14 = new Voiture("FORD", "KA", "CC-123-NN", new byte[5], 12045d, 32d);
		Voiture v15 = new Voiture("FORD", "FOCUS", "CC-123-OO", new byte[5], 12045d, 85d);

		v1.setAgence(ag1);
		v2.setAgence(ag1);
		v3.setAgence(ag1);
		v4.setAgence(ag1);
		v5.setAgence(ag1);
		v6.setAgence(ag1);
		v7.setAgence(ag2);
		v8.setAgence(ag2);
		v9.setAgence(ag2);
		v10.setAgence(ag2);
		v11.setAgence(ag2);
		v12.setAgence(ag2);
		v13.setAgence(ag3);
		v14.setAgence(ag3);
		v15.setAgence(ag3);

		voitureService.add(v1);
		voitureService.add(v2);
		voitureService.add(v3);
		voitureService.add(v4);
		voitureService.add(v5);
		voitureService.add(v6);
		voitureService.add(v7);
		voitureService.add(v8);
		voitureService.add(v9);
		voitureService.add(v10);
		voitureService.add(v11);
		voitureService.add(v12);
		voitureService.add(v13);
		voitureService.add(v14);
		voitureService.add(v15);

		//--------------------------------------------------------------------------------------------------------------------------------------

		Client c1 = new Client("ASTORGIS", "Alexandre", "0687902886", "Quicy-voisins", "asto@gmail.com",
				UtilitaireDate.getDate(1993, 1, 27), UtilitaireDate.getDate(2010, 7, 6));
		Client c2 = new Client("COMTE", "Pierre", "0147852369", "Paris", "comte@gmail.com",
				UtilitaireDate.getDate(1992, 5, 27), UtilitaireDate.getDate(2008, 7, 6));
		Client c3 = new Client("SEVENO", "Florent", "0123654789", "Trilport", "seve@gmail.com",
				UtilitaireDate.getDate(1987, 1, 4), UtilitaireDate.getDate(2010, 9, 6));
		Client c4 = new Client("CAGNARD", "Maximilien", "0687836548", "Quicy-voisins", "naxi@gmail.com",
				UtilitaireDate.getDate(1994, 10, 27), UtilitaireDate.getDate(2012, 1, 6));
		Client c5 = new Client("HOUCHARD", "Corentin", "0647851239", "Rennes", "coco@gmail.com",
				UtilitaireDate.getDate(1994, 3, 15), UtilitaireDate.getDate(2015, 5, 3));

		clientService.add(c1);
		clientService.add(c2);
		clientService.add(c3);
		clientService.add(c4);
		clientService.add(c5);

		Long idAg1 = ag1.getIdAgence();
		Long idAg2 = ag2.getIdAgence();
		Long idAg3 = ag3.getIdAgence();

		agenceService.addClient(idAg1, c1);
		agenceService.addClient(idAg1, c2);
		agenceService.addClient(idAg1, c3);
		agenceService.addClient(idAg1, c4);
		agenceService.addClient(idAg2, c2);
		agenceService.addClient(idAg2, c3);
		agenceService.addClient(idAg2, c4);
		agenceService.addClient(idAg2, c5);
		agenceService.addClient(idAg3, c1);
		agenceService.addClient(idAg3, c2);
		

		//--------------------------------------------------------------------------------------------------------------------------------------

		
		
		Reservation r1 = new Reservation(UtilitaireDate.getDate(2014, 5, 3), UtilitaireDate.getDate(2014, 5, 6));
		Reservation r2 = new Reservation(UtilitaireDate.getDate(2014, 6, 3), UtilitaireDate.getDate(2014, 6, 6));
		Reservation r3 = new Reservation(UtilitaireDate.getDate(2014, 7, 3), UtilitaireDate.getDate(2014, 7, 6));
		Reservation r4 = new Reservation(UtilitaireDate.getDate(2014, 8, 3), UtilitaireDate.getDate(2014, 8, 6));
		Reservation r5 = new Reservation(UtilitaireDate.getDate(2014, 9, 3), UtilitaireDate.getDate(2014, 9, 6));
		Reservation r6 = new Reservation(UtilitaireDate.getDate(2014, 10, 3), UtilitaireDate.getDate(2014, 10, 6));
		Reservation r7 = new Reservation(UtilitaireDate.getDate(2014, 11, 3), UtilitaireDate.getDate(2014, 11, 6));
		Reservation r8 = new Reservation(UtilitaireDate.getDate(2015, 1, 3), UtilitaireDate.getDate(2015, 1, 6));
		Reservation r9 = new Reservation(UtilitaireDate.getDate(2015, 3, 3), UtilitaireDate.getDate(2015, 3, 6));
		Reservation r10 = new Reservation(UtilitaireDate.getDate(2015, 7, 3), UtilitaireDate.getDate(2015, 7, 6));

		
		r1.setAgence(ag1);
		r1.setClient(c1);
		r1.setVoiture(v1);
		
		r2.setAgence(ag1);
		r2.setClient(c3);
		r2.setVoiture(v5);
		
		r3.setAgence(ag1);
		r3.setClient(c2);
		r3.setVoiture(v2);
		
		r4.setAgence(ag3);
		r4.setClient(c2);
		r4.setVoiture(v13);
		
		r5.setAgence(ag2);
		r5.setClient(c5);
		r5.setVoiture(v9);
		
		r6.setAgence(ag1);
		r6.setClient(c4);
		r6.setVoiture(v5);
		
		r7.setAgence(ag2);
		r7.setClient(c2);
		r7.setVoiture(v8);
		
		r8.setAgence(ag2);
		r8.setClient(c2);
		r8.setVoiture(v8);
		
		r9.setAgence(ag2);
		r9.setClient(c4);
		r9.setVoiture(v8);
		
		r10.setAgence(ag2);
		r10.setClient(c3);
		r10.setVoiture(v8);
		

		reservationService.add(r1);
		reservationService.add(r2);
		reservationService.add(r3);
		reservationService.add(r4);
		reservationService.add(r5);
		reservationService.add(r6);
		reservationService.add(r7);
		reservationService.add(r8);
		reservationService.add(r9);
		reservationService.add(r10);
		


		//--------------------------------------------------------------------------------------------------------------------------------------

		

		Facture f1 = new Facture(UtilitaireDate.getDate());
		Facture f2 = new Facture(UtilitaireDate.getDate());
		Facture f3 = new Facture(UtilitaireDate.getDate());
		Facture f4 = new Facture(UtilitaireDate.getDate());
		Facture f5 = new Facture(UtilitaireDate.getDate());
		Facture f6 = new Facture(UtilitaireDate.getDate());
		Facture f7 = new Facture(UtilitaireDate.getDate());
		Facture f8 = new Facture(UtilitaireDate.getDate());
		Facture f9 = new Facture(UtilitaireDate.getDate());
		Facture f10 = new Facture(UtilitaireDate.getDate());

		f1.setReservation(r1);
		f2.setReservation(r2);
		f3.setReservation(r3);
		f4.setReservation(r4);
		f5.setReservation(r5);
		f6.setReservation(r6);
		f7.setReservation(r7);
		f8.setReservation(r8);
		f9.setReservation(r9);
		f10.setReservation(r10);

		f1.setAgence(ag1);
		f2.setAgence(ag1);
		f3.setAgence(ag1);
		f4.setAgence(ag3);
		f5.setAgence(ag2);
		f6.setAgence(ag1);
		f7.setAgence(ag2);
		f8.setAgence(ag2);
		f9.setAgence(ag2);
		f10.setAgence(ag2);

		factureService.add(f1);
		factureService.add(f2);
		factureService.add(f3);
		factureService.add(f4);
		factureService.add(f5);
		factureService.add(f6);
		factureService.add(f7);
		factureService.add(f8);
		factureService.add(f9);
		factureService.add(f10);
		
		
		
		
		
		
		context.close();
	}
}
