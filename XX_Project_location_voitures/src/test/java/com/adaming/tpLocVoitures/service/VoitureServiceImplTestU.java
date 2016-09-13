package com.adaming.tpLocVoitures.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adaming.tpLocVoitures.entities.Reservation;
import com.adaming.tpLocVoitures.entities.Voiture;

/**
 * @author inti0314
 *
 */
public class VoitureServiceImplTestU {

	private static ClassPathXmlApplicationContext context;
	private static IVoitureService service;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("appContext.xml");
		service = (IVoitureService) context.getBean("voitureServiceImpl");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	/**
	 * Test method for {@link com.adaming.tpLocVoitures.service.impl.VoitureServiceImpl#getAllReservations(java.lang.Integer)}.
	 */
	@Test
	public void testGetAllReservations() {
		Long idVoiture = 8L;
		List<Reservation> liste = service.getAllReservations(idVoiture);

		assertTrue(liste.size() > 0);
	}

	/**
	 * Test method for {@link com.adaming.tpLocVoitures.service.impl.VoitureServiceImpl#add(com.adaming.tpLocVoitures.entities.Voiture)}.
	 */
	@Test
	public void testAdd() {
		byte[] img = new byte[1];
		Voiture v = new Voiture("FORD", "FOCUS", "DA-456-AZ", img, 21456.5d, 83d);
		service.add(v);
		assertNotNull(v.getIdVoiture());
	}

	/**
	 * Test method for {@link com.adaming.tpLocVoitures.service.impl.VoitureServiceImpl#update(com.adaming.tpLocVoitures.entities.Voiture)}.
	 */
	@Test
	public void testUpdate() {
		Long id = 1L;
		Voiture v = service.find(id);
		v.setMarque("AUDI");
		service.update(v);
		Voiture vModif = service.find(id);
		assertTrue(vModif.getMarque().equals("AUDI"));
	}

	/**
	 * Test method for {@link com.adaming.tpLocVoitures.service.impl.VoitureServiceImpl#find(java.lang.Long)}.
	 */
	@Test
	public void testFind() {
		Long id = 1L;
		Voiture v = service.find(id);
		assertNotNull(v);
	}

	/**
	 * Test method for {@link com.adaming.tpLocVoitures.service.impl.VoitureServiceImpl#getAll()}.
	 */
	@Test
	public void testGetAll() {
		List<Voiture> liste = service.getAll();
		assertTrue(liste.size() > 0);
	}
}
