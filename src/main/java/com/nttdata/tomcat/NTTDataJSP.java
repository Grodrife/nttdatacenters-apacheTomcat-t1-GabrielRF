package com.nttdata.tomcat;

/**
 * 
 * Taller pr�ctico Apache Tomcat - JSP
 * 
 * @author Gabriel Rodr�guez F�lix
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
