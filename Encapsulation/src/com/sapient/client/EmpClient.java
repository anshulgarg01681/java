package com.sapient.client;

import com.sapient.beans.Emp;

public class EmpClient {

	public static void main(String[] args) {
		
		Emp emp = new Emp();
		
		try {
			emp.setAge(21);
			emp.setName("ram");
			System.out.println(emp.getAge());
			System.out.println(emp.getName());
			System.out.println(emp.getCompName());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
