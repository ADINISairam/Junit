package com.lti.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class SuiteTest1 {
	public String message = "anil";
	JUnitMessage  junitmessage = new JUnitMessage(message);
	
	
	@Test // (extepcted  = Arithmetic exception.class)
	public void JUnitMessage()
	
	{
		System.out.println("JUnit Message is printing");
		junitmessage.printMessage();
	}
	
	@Test
	public void JUnitHiMessage()
	
	{
		message = "Hi!" + message;
		System.out.println("JUnit Hi Message is printing");
		assertEquals(message, junitmessage.printHiMessage());
		System.out.println("Suite Test 1 is suceesful " + message);
		
	}

	
	
}
