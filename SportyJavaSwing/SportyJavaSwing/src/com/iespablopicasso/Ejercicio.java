package com.iespablopicasso;

public class Ejercicio {
	//ESTADO
	/**Descripcción del ejercicio*/
	protected String descripcion;
	/**Met que tiene el ejercicio*/
	protected float met;
	
	
	//Comportamientos
	
	/**Constructor del ejercicio
	 * @param serializado es la linea que nos dan y que hay que partir
	 * */
	public Ejercicio(String serializado) {
		String[] trozos;
		trozos = serializado.split(";");
		descripcion = trozos[0];
		met = Float.parseFloat(trozos[1]);
	}
	
	
	/**Método Calcular KCal nos dice como se calculan
	 * @param minutos realizados
	 * @param kgs del usuario
	 * @return devuelve las KCal quemadas con ese ejercicio
	 * */
	public String calcularKCal(float minutos, float kgs) {
		return String.valueOf(minutos*kgs*met/60);
	}
	/**Getter que da la descripccion
	 * @return la descripción del ejercicio para utilizarla en el controlador
	 * */
	public String getDescripcion() {
		return descripcion;
	}
	
	

}
