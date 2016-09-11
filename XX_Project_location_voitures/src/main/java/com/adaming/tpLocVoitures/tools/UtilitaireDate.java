package com.adaming.tpLocVoitures.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author inti0314
 *
 */
public class UtilitaireDate {
	
	/**
	 * Methode qui permet de créer une instance de l'objet Calendar
	 * representant la date actuelle
	 * 
	 * @return
	 */
	public static Calendar getDate() {
		return Calendar.getInstance();
	}

	/**
	 * Methode qui permet de créer une instance de l'objet Calendar
	 * representant une date donnee en parametre
	 * 
	 * @param year
	 * @param month
	 * @param day
	 * @return
	 */
	public static Calendar getDate(int year, int month, int day) {
		Calendar result = Calendar.getInstance();
		// Janvier = 0
		// Decembre = 11
		result.set(Calendar.YEAR, year);
		result.set(Calendar.MONTH, month - 1);
		result.set(Calendar.DATE, day);
		
		return result;
	}
	
	/**
	 * 
	 * @param dateA
	 * @param dateB
	 * @return
	 */
	public static Calendar substract(Calendar dateA, Calendar dateB) {
		Calendar result = dateA;
		result.add(Calendar.YEAR, - dateB.get(Calendar.YEAR));
		result.add(Calendar.MONTH, - dateB.get(Calendar.MONTH));
		result.add(Calendar.DATE, - dateB.get(Calendar.DATE));
		return result;
	}
	
	
	/**
	 * Methode qui permet de créer une instance de l'objet Calendar
	 * representant une date donnee en parametre
	 * 
	 * @param dateString
	 * @return
	 */
	public static Calendar parseDate(String dateString) {
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date date = sdf.parse(dateString);
			Calendar result = Calendar.getInstance();
			result.setTime(date);
			return result;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
