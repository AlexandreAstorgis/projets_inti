package com.adaming.tpLocVoitures.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adaming.tpLocVoitures.entities.Agence;

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
	@Ignore
	public void testGetAllReservations() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.adaming.tpLocVoitures.service.impl.AgenceServiceImpl#getAllVoitures(java.lang.Integer)}.
	 */
	@Test
	@Ignore
	public void testGetAllVoitures() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.adaming.tpLocVoitures.service.impl.AgenceServiceImpl#getAllFactures(java.lang.Integer)}.
	 */
	@Test
	@Ignore
	public void testGetAllFactures() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.adaming.tpLocVoitures.service.impl.AgenceServiceImpl#getAllClients(java.lang.Integer)}.
	 */
	@Test
	@Ignore
	public void testGetAllClients() {
		fail("Not yet implemented");
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
