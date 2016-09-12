package com.adaming.tpLocVoitures;

import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		
		context.close();
	}
}
