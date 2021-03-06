package com.valoyes.projectjunit.helper;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperTest {

	private static final String ACD = "ACD";
	private static final String AACD = "AACD";
	private static final String CD = "CD";
	StringHelper helper = new StringHelper();
	private String input = "";
	private String expectedOutput;
	
	
	public StringHelperTest(String input, String expectedOutput) {
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
		assertEquals(CD, helper.truncateAInFirst2Positions(AACD));
	}
	
	@Test
	public void casPassant_truncateAInFirst2Positions_AinfirstPositionOnly() {
		assertEquals(CD, helper.truncateAInFirst2Positions(ACD));
	}
		
}
