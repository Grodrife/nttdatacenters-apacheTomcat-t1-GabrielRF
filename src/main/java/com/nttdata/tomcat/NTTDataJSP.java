package com.nttdata.tomcat;

/**
 * 
 * Taller práctico Apache Tomcat - JSP
 * 
 * @author Gabriel Rodríguez Félix
 *
 */
public class NTTDataJSP {

	/**
	 * Constructor
	 */
	private NTTDataJSP() {

	}

	public static String nameChars(String name) {
		String message = "";

		if (name.equals("")) {
			message += "El nombre no ha sido introducido";
		} else {
			char[] nameChars = name.toCharArray();
			for (int i = 0; i < nameChars.length; i++) {
				message += nameChars[i] + ", ";
			}
		}

		return message;
	}
}
