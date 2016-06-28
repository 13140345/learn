package cn.edu.nuc.io;

import java.io.Serializable;

public class Emp implements Serializable {
	

	private static final long serialVersionUID = -7209736928933191450L;

	private int empNo;
	
	private String name;
	
	private transient int age;
	
	
	private Cart cart = new Cart("");
	
	public Emp() {}
	public Emp(int empNo, String name, int age) {
		this.empNo = empNo;
		this.name = name;
		this.age = age;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
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
	
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + "]";
	}

}
