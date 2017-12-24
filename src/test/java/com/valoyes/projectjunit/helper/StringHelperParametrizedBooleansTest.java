package com.valoyes.projectjunit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParametrizedBooleansTest {

	StringHelper helper = new StringHelper();
	private String input;
	private Boolean expectedOutput;

	public StringHelperParametrizedBooleansTest(String input, Boolean expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	// aqui definiremos todos los test conditions
	@Parameters
	public static Collection<Object[]> testConditions() {
		Object expectedOutput[][] = {
				{"ABCD", false},
				{"ABAB", true},
				{"AB", true},
				{"A", false}
		};
		

		return Arrays.asList(expectedOutput);
	}

	@Test
	public void casNonPassant_areFirstAndLastTwoCharactersTheSame_FourDifferentCharacters() {
		assertEquals(expectedOutput, helper.areFirstAndLastTwoCharactersTheSame(input));
	}
}
