package com.practice;

public class Student implements Comparable<Student> {

	private String name;
	private int accNo;
	private String adharNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}

	public Student(String name, int accNo, String adharNo) {
		super();
		this.name = name;
		this.accNo = accNo;
		this.adharNo = adharNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", accNo=" + accNo + ", adharNo=" + adharNo + "]";
	}

	@Override
	public int compareTo(Student o) {

		if (accNo == o.getAccNo())
			return 0;
		else if (accNo > o.getAccNo())
			return 1;
		else
			return -1;
	}

}
