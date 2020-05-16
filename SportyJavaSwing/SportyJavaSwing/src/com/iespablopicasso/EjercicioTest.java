package com.iespablopicasso;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


class EjercicioTest {
	Ejercicio miEjercicio = new Ejercicio("nadar;3.5");

	@Disabled
	@Test 
	void test() {
		fail("Not yet implemented");
	}
	@BeforeEach
	void beforeEachTest() {
		System.out.println("prueba beforeEachTest: se ejecuta una vez por prueba");
	}
	@AfterEach
	void afterEachTest() {
		System.out.println("prueba afterEachTest: se ejecuta una vez por prueba");
	}
	@BeforeAll
	static void beforeAllTest() {
		System.out.println("prueba beforeAllTest: se ejecuta solo una vez");
	}
	@AfterAll
	static void afterAllTest() {
		System.out.println("prueba afterAllTest: se ejecuta solo una vez");
	} 
	@Test
	void calcularKcalTest() {
		String valorEsperado = "500";
		String valorObtenido = miEjercicio.calcularKCal(60,60 );
		
		assertEquals(valorEsperado,valorObtenido,"caso uno de calcularKcalTest -- El valor esperado no es igual al valor obtenido");
	}
	@Test
	void getDescripcionTest() {
		String valorEsperado = "nadar";
		String valorObtenido = miEjercicio.getDescripcion();
		
		assertEquals(valorEsperado,valorObtenido,"caso uno de getDescripcionTest -- El valor esperado no es igual al valor obtenido");
	}

}
