package com.iespablopicasso;

import java.util.ArrayList;

public class TiposEjercicios {
	
	//ESTADO
	
	/**Lista de ejercicios disponibles*/
	protected ArrayList<Ejercicio> listaEjercicios;
	
	

	//Comportamiento
	
	
	/**Constructor de los ejercicios*/
	public TiposEjercicios() {
		listaEjercicios = new ArrayList();
	}
	
	/**M�todo para a�adir ejercicios a la Array
	 * @param Ejercicio que hay que a�adir*/
	public void addEjercicio(Ejercicio nuevoE) {
		listaEjercicios.add(nuevoE);
	}
	
	/**M�todo para ver cuantos ejercicios hay
	 * @return los ejercicios que hay en la array*/
	public int size() {
		return listaEjercicios.size();
	}
	/**Dalos ejercicios de cada posici�n
	 * @param �ndice del ejercicio
	 * @return devuelve el ejercicios que queremos*/
	//Dar el ejercicio de la posición i
	public Ejercicio getEjercicioByIndex(int index) {
		return listaEjercicios.get(index);
	}
	/**M�todo para darnos el ejercicios por descripci�n
	 * @param descripci�n del ejercicios que queremos
	 * @return devuelve el ejercicio*/
	public Ejercicio getEjercicioByDescripcion(String descr) {
		Ejercicio ejer = null;
		
		int i = 0;
		
		
		while (ejer==null && i<listaEjercicios.size()) {
		    if (listaEjercicios.get(i).getDescripcion() == descr) {
		    	ejer = listaEjercicios.get(i);
		    } else
		    	i++;
		}
		
		
		return ejer;
		
	}
	
}
