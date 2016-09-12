package com.adaming.tpLocVoitures.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adaming.tpLocVoitures.entities.Facture;
import com.adaming.tpLocVoitures.tools.UtilitaireDate;

/**
 * @author inti0314
 *
 */
public class FactureServiceImplTestU {
	
	private static ClassPathXmlApplicationContext context;
	private static IFactureService service;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("appContext.xml");
		service = (IFactureService) context.getBean("factureServiceImpl");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	/**
	 * Test method for {@link com.adaming.tpLocVoitures.service.impl.FactureServiceImpl#add(com.adaming.tpLocVoitures.entities.Facture)}.
	 */
	@Test
	public void testAdd() {
		Facture f = new Facture(UtilitaireDate.getDate());
		service.add(f);
		assertNotNull(f.getIdFacture());
	}

	/**
	 * Test method for {@link com.adaming.tpLocVoitures.service.impl.FactureServiceImpl#update(com.adaming.tpLocVoitures.entities.Facture)}.
	 */
	@Test
	public void testUpdate() {
		Long id = 1L;
		Facture f = service.find(id);
		f.setDate(UtilitaireDate.getDate(2012, 5, 12));
		service.update(f);
		Facture fModif = service.find(id);
		assertTrue(UtilitaireDate.equals(UtilitaireDate.getDate(2012, 5, 12), fModif.getDate()));
	}

	/**
	 * Test method for {@link com.adaming.tpLocVoitures.service.impl.FactureServiceImpl#find(java.lang.Long)}.
	 */
	@Test
	public void testFind() {
		Long id = 1L;
		Facture f = service.find(id);
		assertNotNull(f);
	}

	/**
	 * Test method for {@link com.adaming.tpLocVoitures.service.impl.FactureServiceImpl#getAll()}.
	 */
	@Test
	public void testGetAll() {
		List<Facture> liste = service.getAll();
		assertTrue(liste.size() > 0);
	}
}
