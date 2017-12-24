package com.valoyes.projectjunit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {

	@Test
	public void casPassant_ComparingTwoArrays() {

		int[] numbers = {12, 3, 4, 1};
		// como deberia ser el array, una vez sorted
		int[] expected = {1, 3, 4, 12};
		Arrays.sort(numbers);
		// assert
		assertArrayEquals(expected, numbers);
	}

	@Test
	public void testArraySort_NullArray_UsingTryCatch() {
		// hacemos el array nulo
		int[] numbers = null;
		// lo intentamos ordenar
		// esto es un escenario posible
		// y lo que ocurre es que Arrays.sort lanza una 
		// NPE como es de esperar
		
		try {
		
			Arrays.sort(numbers);
		
		}catch(NullPointerException e) {
			// SUCCESS
			// pq es lo esperado
		}
	}

	@Test(expected=NullPointerException.class)
	public void testArraySortNullArray_UsingParameterExpectedInAnnotation() {
		int[] numbers = null;
		Arrays.sort(numbers);
	}
	
	// Quiero verificar si puedo hacer 1.000.000 sorts en el intervalo
	// de una decima de segundo
	@Test(timeout=100)
	public void testSort_Performance() {
		int array[] = {12, 23, 4};
		for(int i = 1; i <= 10; i++) {
			// de esta manera no tendremos siemrpe el mismo array
			array[0] = i;
			Arrays.sort(array);
		}
	}

}
