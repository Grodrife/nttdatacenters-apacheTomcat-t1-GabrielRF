package com.nttdata.tomcat;

/**
 * 
 * Taller practico Apache Tomcat - JSP
 * 
 * @author Gabriel Rodriguez Felix
 *
 */
public class NTTDataJSP {

	/**
	 * Constructor vacio
	 */
	private NTTDataJSP() {

	}

	/**
	 * Metodo para la separacion de los caracteres del String pasado por parametro 
	 * 
	 * @param name
	 * @return StringBuilder
	 */
	public static StringBuilder nameChars(String name) {
		StringBuilder message = new StringBuilder();
		// En caso de estar vacio el String, se devuelve un mensaje en concreto
		if (name.equals("")) {
			message.append("El nombre no ha sido introducido");
		} else {
			char[] nameChars = name.toCharArray();
			for (int i = 0; i < nameChars.length; i++) {
				message.append(nameChars[i] + ", ");
			}
		}

		return message;
	}
}
