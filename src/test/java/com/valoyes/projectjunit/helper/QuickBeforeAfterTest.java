package com.valoyes.projectjunit.helper;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QuickBeforeAfterTest {

	@Before
	public void setup() {
		System.out.println("Code executed before every other test");
	}
	
	@Test
	public void test1() {
		System.out.println("test1 executed");
	}
	
	@Test
	public void test2() {
		System.out.println("test2 executed");
	}

	@After
	public void teardown() {
		System.out.println("Code executed AFTER every test");
	}
}
