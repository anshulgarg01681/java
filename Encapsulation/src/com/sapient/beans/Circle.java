package com.sapient.beans;

public class Circle {

	private double radius;
	
	public double calcArea(){
		return Math.PI * radius * radius;
	}
	
	public double calcPeri(){
		return 2 * Math.PI * radius;
	}
}
