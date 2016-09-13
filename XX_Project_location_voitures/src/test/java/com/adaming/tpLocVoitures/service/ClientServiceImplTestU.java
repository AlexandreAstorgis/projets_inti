package com.adaming.tpLocVoitures.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adaming.tpLocVoitures.entities.Client;
import com.adaming.tpLocVoitures.entities.Reservation;
import com.adaming.tpLocVoitures.tools.UtilitaireDate;

public class ClientServiceImplTestU {

	private static ClassPathXmlApplicationContext context;
	private static IClientService service;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("appContext.xml");		
		service = (IClientService) context.getBean("clientServiceImpl"); 
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	@Test
	public void testGetAllReservations() {
		Long idClient1 = 1L;
		Long idClient2 = 2L;
		List<Reservation> liste1 = service.getAllReservations(idClient1);
		List<Reservation> liste2 = service.getAllReservations(idClient2);
		
		assertTrue(liste1.size() > 0 && liste2.size() < 5);
	}

	@Test
	public void testAdd() {
		Client cl = new Client("ASTORGIS", "Alexandre", "0687902886", "rue du chapite, Quincy-Voisins", "asto@gmail.com",
				UtilitaireDate.getDate(1993, 1, 27), UtilitaireDate.getDate(2010, 7, 6));
		service.add(cl);
		assertNotNull(cl.getIdClient());
	}

	@Test
	public void testUpdate() {
		Long id = 1L;
		Client cl = service.find(id);
		cl.setNom("TOTO");
		service.update(cl);
		Client clModif = service.find(id);
		assertTrue(clModif.getNom().equals("TOTO"));
	}

	@Test
	public void testFind() {
		Long id = 1L;
		Client cl = service.find(id);
		assertNotNull(cl);
	}

	@Test
	public void testGetAll() {
		List<Client> liste = service.getAll();
		assertTrue(liste.size() > 0);
	}
}
