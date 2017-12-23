package com.valoyes.projectjunit.helper;

import static org.junit.Assert.*;

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

	private static final String CDAA_STRING_CONSTANT = "CDAA";
	private static final String CDEF_STRING_CONSTANT = "CDEF";
	private static final String CD_STRING_CONSTANT = "CD";
	StringHelper helper = new StringHelper();
	
	@Test
	public void casPassant_truncateAInFirst2Positions_Ainfirst2Positions() {
		assertEquals(CD_STRING_CONSTANT, helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void casPassant_truncateAInFirst2Positions_AinfirstPositionOnly() {
		assertEquals(CD_STRING_CONSTANT, helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void cassPassant_truncateAInFirst2Positions_NoAFoundInString() {
		assertEquals(CDEF_STRING_CONSTANT, helper.truncateAInFirst2Positions("CDEF"));
	}
	
	@Test
	public void cassPassant_truncateAInFirst2Positions_AIn2LastPositions() {
		assertEquals(CDAA_STRING_CONSTANT, helper.truncateAInFirst2Positions("CDAA"));
	}

}
