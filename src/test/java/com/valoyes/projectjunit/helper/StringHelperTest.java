package com.valoyes.projectjunit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

/**
 * En esta clase voy a probar los casos:
 * AACC => CD
 * ACD => CD
 * CDEF => CDEF
 * CDAA => CDAA
 *  
 * @author benito
 *
 */
public class StringHelperTest {

	private static final String A = "A";
	private static final String AB = "AB";
	private static final String ABAB = "ABAB";
	private static final String ABCD = "ABCD";
	private static final String ACD = "ACD";
	private static final String AACD = "AACD";
	private static final String CDAA = "CDAA";
	private static final String CDEF = "CDEF";
	private static final String CD = "CD";
	StringHelper helper;
	
	@Before
	public void septup() {
		// en este caso no es realmente necesario, pero si fuera
		// util actualizar/reinicializar la informacion ecc
		helper = new StringHelper();
	}
	
	@Test
	public void casPassant_truncateAInFirst2Positions_Ainfirst2Positions() {
		assertEquals(CD, helper.truncateAInFirst2Positions(AACD));
	}
	
	@Test
	public void casPassant_truncateAInFirst2Positions_AinfirstPositionOnly() {
		assertEquals(CD, helper.truncateAInFirst2Positions(ACD));
	}
	
	@Test
	public void casPassant_truncateAInFirst2Positions_NoAFoundInString() {
		assertEquals(CDEF, helper.truncateAInFirst2Positions(CDEF));
	}
	
	@Test
	public void casPassant_truncateAInFirst2Positions_AIn2LastPositions() {
		assertEquals(CDAA, helper.truncateAInFirst2Positions(CDAA));
	}
	
	@Test
	public void casNonPassant_areFirstAndLastTwoCharactersTheSame_FourDifferentCharacters() {
		// ABCD => false
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame(ABCD));
	}
	
	@Test
	public void casPassant_areFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assert(helper.areFirstAndLastTwoCharactersTheSame(ABAB));
	}
	
	@Test
	public void casPassant_areFirstAndLastTwoCharactersTheSame_TwoCharactersOnly() {
		// AB => true
		assert(helper.areFirstAndLastTwoCharactersTheSame(AB));
	}
	
	@Test
	public void casNonPassant_areFirstAndLastTwoCharactersTheSame_OnlyOneCharacter() {
		// A => false
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame(A));
	}
}
