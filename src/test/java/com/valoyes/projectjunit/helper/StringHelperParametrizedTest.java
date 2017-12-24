package com.valoyes.projectjunit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * La manera como funciona es, los parametros que hemos creado en
 * el metodo bajo la annotation @Parameters se pasaran como parametros 
 * al constructor, que hara una especia de inyeccion de estos valores
 * a los campos que alimenta que luego seran utilizados en los respectivos
 * tests. Y aunque existan un solo tests tendremos tantos casos de ejecucion,
 * como pares de parametros
 * 
 * @author benito
 *
 */
@RunWith(Parameterized.class)
public class StringHelperParametrizedTest {

	StringHelper helper = new StringHelper();
	private String input;
	private String expectedOutput;
	
	
	public StringHelperParametrizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	// aqui definiremos todos los test conditions
	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutput[][] = {
			{"AACD", "CD"},
			{"ACD", "CD"}
		};

		return Arrays.asList(expectedOutput);
	}
	
	@Test
	public void casPassant_truncateAInFirst2Positions_Ainfirst2Positions() {
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}
}
