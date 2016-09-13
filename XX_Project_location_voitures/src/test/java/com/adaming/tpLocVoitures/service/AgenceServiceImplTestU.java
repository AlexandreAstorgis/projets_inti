package com.adaming.tpLocVoitures.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adaming.tpLocVoitures.entities.Agence;
import com.adaming.tpLocVoitures.entities.Client;
import com.adaming.tpLocVoitures.entities.Facture;
import com.adaming.tpLocVoitures.entities.Reservation;
import com.adaming.tpLocVoitures.entities.Voiture;

/**
 * @author inti0314
 *
 */
public class AgenceServiceImplTestU {
	
	private static ClassPathXmlApplicationContext context;
	private static IAgenceService service;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("appContext.xml");		
		service = (IAgenceService) context.getBean("agenceServiceImpl");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	/**
	 * Test method for {@link com.adaming.tpLocVoitures.service.impl.AgenceServiceImpl#getAllReservations(java.lang.Integer)}.
	 */
	@Test
	public void testGetAllReservations() {
		Long idAgence1 = 1L;
		Long idAgence2 = 3L;
		List<Reservation> liste1 = service.getAllReservations(idAgence1);
		List<Reservation> liste2 = service.getAllReservations(idAgence2);
		
		assertTrue(liste1.size() < 5 && liste2.size() > 0);
	}

	/**
	 * Test method for {@link com.adaming.tpLocVoitures.service.impl.AgenceServiceImpl#getAllVoitures(java.lang.Integer)}.
	 */
	@Test
	public void testGetAlletAllVoitures() {
		Long idAgence1 = 1L;
		Long idAgence2 = 3L;
		List<Voiture> liste1 = service.getAllVoitures(idAgence1);
		List<Voiture> liste2 = service.getAllVoitures(idAgence2);
		
		assertTrue(liste1.size() > 5 && liste2.size() < 4);
	}

	/**
	 * Test method for {@link com.adaming.tpLocVoitures.service.impl.AgenceServiceImpl#getAllFactures(java.lang.Integer)}.
	 */
	@Test
	public void testGetAllFactures() {
		Long idAgence1 = 1L;
		Long idAgence2 = 3L;
		List<Facture> liste1 = service.getAllFactures(idAgence1);
		List<Facture> liste2 = service.getAllFactures(idAgence2);
		
		assertTrue(liste1.size() < 5 && liste2.size() > 0);
	}

	/**
	 * Test method for {@link com.adaming.tpLocVoitures.service.impl.AgenceServiceImpl#getAllClients(java.lang.Integer)}.
	 */
	@Test
	public void testGetAllClients() {
		Long idAgence1 = 1L;
		Long idAgence2 = 3L;
		List<Client> liste1 = service.getAllClients(idAgence1);
		List<Client> liste2 = service.getAllClients(idAgence2);
		
		assertTrue(liste1.size() > 3 && liste2.size() < 3);
	}

	/**
	 * Test method for {@link com.adaming.tpLocVoitures.service.impl.GenericServiceImpl#add(java.lang.Object)}.
	 */
	@Test
	public void testAdd() {
		Agence ag = new Agence("INTI LOC AUTO", "Paris Montparnasse", "0147852369", "loc-auto@inti.fr");
		service.add(ag);
		assertNotNull(ag.getIdAgence());
	}

	/**
	 * Test method for {@link com.adaming.tpLocVoitures.service.impl.GenericServiceImpl#update(java.lang.Object)}.
	 */
	@Test
	public void testUpdate() {
		Long id = 1L;
		Agence ag = service.find(id);
		ag.setNom("TOTO");
		service.update(ag);
		Agence agModif = service.find(id);
		assertTrue(agModif.getNom().equals("TOTO"));
	}

	/**
	 * Test method for {@link com.adaming.tpLocVoitures.service.impl.GenericServiceImpl#find(java.lang.Long)}.
	 */
	@Test
	public void testFind() {
		Long id = 1L;
		Agence ag = service.find(id);
		assertNotNull(ag.getIdAgence());
	}

	/**
	 * Test method for {@link com.adaming.tpLocVoitures.service.impl.GenericServiceImpl#getAll()}.
	 */
	@Test
	public void testGetAll() {
		List<Agence> liste = service.getAll();
		assertTrue(liste.size() > 0);
	}
}
