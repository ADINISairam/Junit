package com.lti.junit;

public class Employee {
	private int empId, salary;
	private String name;
	public Employee (int empId , String name, int salary)
	{
		super();
		this.name = name;
		this.empId=empId;
		this.salary= salary;
}
public boolean equals(Object obj) {
	Employee emp=(Employee) obj;
	boolean status= false;
	if(this.name.equalsIgnoreCase(emp.name)
			&& this.empId==emp.empId
			&& this.salary == emp.salary)
	{
		status = true;
	}
	return status;
}

public int getEmpId() {
	return empId;
	}

public void setEmpId(int empId) {
	this.empId = empId;
	} 

public int getSalary() {
	return salary;
	}

public void setSalary(int salary) {
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public static String getEmpNameWithHighestsalary() {
	return "anil";
}
	public static Employee getHighestpaidEmployee() {
		return new Employee(1, "anil", 15000);
	}
	public int hashCode() {
		return this.empId;
	}
	
}
