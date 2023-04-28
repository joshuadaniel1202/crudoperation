package com.restapi.entity;

public class Student {
	
	private String name;
	private int age;
	private int stdId;
	private String dept;
	private int moNo;
	
    public Student() {
    	
    }    
	
	public Student(String name, int age, int stdId, String dept, int moNo) {
		super();
		this.name = name;
		this.age = age;
		this.stdId = stdId;
		this.dept = dept;
		this.moNo = moNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", empId=" + stdId + ", dept=" + dept + ", moNo=" + moNo
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStdId() {
		return stdId;
	}

	public void setEmpId(int empId) {
		this.stdId = stdId;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getMoNo() {
		return moNo;
	}

	public void setMoNo(int moNo) {
		this.moNo = moNo;
	}
	
	

}
