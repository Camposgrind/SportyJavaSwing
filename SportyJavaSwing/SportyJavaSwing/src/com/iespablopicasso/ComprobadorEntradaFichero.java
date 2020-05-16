package com.iespablopicasso;

public class ComprobadorEntradaFichero {
	
	/**Este metodo se utiliza para ver si tiene dos trozos separados por ;
	 * @param linea que hay que analizar
	 * @return true si si tiene dos trozo false si tiene mas o menos trozos de 2
	 */
	public boolean test(String linea) {
		String[] trozos = linea.split(";");
		try {
			Float.parseFloat(trozos[1]);
		} catch (Exception e) {
			return false;
		}
		return (trozos.length == 2);
	}

}
