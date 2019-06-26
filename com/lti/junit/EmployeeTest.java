package com.lti.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void mySimpleEqualsTest() {
		String expectedName = "anil";
		assertEquals(expectedName, Employee.getEmpNameWithHighestsalary());
}
	@Test
	public void myObjectEqualsTest() {
		Employee expectedEmpObj=new Employee(1, "anil", 15000);
		assertEquals(expectedEmpObj, Employee.getHighestpaidEmployee());
}
}
