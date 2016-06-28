package com.sapient.beans;

public class Emp {

	private int age;
	private String name;
	private String compName = "Sapient Nitro";

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if (age >= 20 && age <= 55)
			this.age = age;
		else
			throw new Exception("age must be 20 and 55");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		if (name.matches("[A-Za-z]{3,}"))
			this.name = name;
		else
			throw new Exception("name must be min 3 alphabets");
	}

	public String getCompName() {
		return compName;
	}

}
