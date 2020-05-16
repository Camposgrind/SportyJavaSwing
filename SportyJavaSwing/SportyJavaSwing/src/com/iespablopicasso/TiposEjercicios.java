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
	
	/**Método para añadir ejercicios a la Array
	 * @param Ejercicio que hay que añadir*/
	public void addEjercicio(Ejercicio nuevoE) {
		listaEjercicios.add(nuevoE);
	}
	
	/**Método para ver cuantos ejercicios hay
	 * @return los ejercicios que hay en la array*/
	public int size() {
		return listaEjercicios.size();
	}
	/**Dalos ejercicios de cada posición
	 * @param índice del ejercicio
	 * @return devuelve el ejercicios que queremos*/
	//Dar el ejercicio de la posiciÃ³n i
	public Ejercicio getEjercicioByIndex(int index) {
		return listaEjercicios.get(index);
	}
	/**Método para darnos el ejercicios por descripción
	 * @param descripción del ejercicios que queremos
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
