package com.springmicroservices.xmlsupport.domain;

public class Employee {

	private String empId;
	private String empName;
	private String address;
	
	public Employee(String empId, String empName, String address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}

	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
