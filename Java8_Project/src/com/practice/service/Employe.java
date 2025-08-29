package com.practice.service;

public class Employe {

	private Integer empId;
	private String employeeName;
	private String department;
	private Double salary;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public Employe(Integer empId, String employeeName, String department, Double salary) {
		super();
		this.empId = empId;
		this.employeeName = employeeName;
		this.department = department;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employe [empId=" + empId + ", employeeName=" + employeeName + ", department=" + department + ", salary="
				+ salary + "]";
	}

	
	
}
