package com.lti.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class SuiteTest2 {
	@Test
	public void createAndSetName() {
		String actual="Y";
		String expected="Y";
		assertEquals(expected,actual);
		System.out.println("Suite Test2 is executed successful " + actual);
	}

	
}
