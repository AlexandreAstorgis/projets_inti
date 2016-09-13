package com.adaming.tpLocVoitures.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adaming.tpLocVoitures.entities.Reservation;
import com.adaming.tpLocVoitures.tools.UtilitaireDate;

/**
 * @author inti0314
 *
 */
public class ReservationServiceImplTestU {
	
	private static ClassPathXmlApplicationContext context;
	private static IReservationService service;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("appContext.xml");
		service = (IReservationService) context.getBean("reservationServiceImpl");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	/**
	 * Test method for {@link com.adaming.tpLocVoitures.service.impl.ReservationServiceImpl#add(com.adaming.tpLocVoitures.entities.Reservation)}.
	 */
	@Test
	public void testAdd() {
		Reservation r = new Reservation(UtilitaireDate.getDate(2016, 9, 10), UtilitaireDate.getDate());
		service.add(r);
		assertNotNull(r.getIdReservation());
	}

	/**
	 * Test method for {@link com.adaming.tpLocVoitures.service.impl.ReservationServiceImpl#update(com.adaming.tpLocVoitures.entities.Reservation)}.
	 */
	@Test
	public void testUpdate() {
		Long id = 1L;
		Reservation r = service.find(id);
		r.setPrixTotal(400d);
		service.update(r);
		Reservation rModif = service.find(id);
		assertTrue(rModif.getPrixTotal() == 400d);
	}

	/**
	 * Test method for {@link com.adaming.tpLocVoitures.service.impl.ReservationServiceImpl#find(java.lang.Long)}.
	 */
	@Test
	public void testFind() {
		Long id = 1L;
		Reservation r = service.find(id);
		assertNotNull(r);
	}

	/**
	 * Test method for {@link com.adaming.tpLocVoitures.service.impl.ReservationServiceImpl#getAll()}.
	 */
	@Test
	public void testGetAll() {
		List<Reservation> liste = service.getAll();
		assertTrue(liste.size() > 0);
	}
}
