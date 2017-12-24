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

}
