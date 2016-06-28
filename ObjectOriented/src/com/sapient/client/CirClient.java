package com.sapient.client;

import com.sapient.bean.Circle;

public class CirClient {

	public static void main(String[] args){
		Circle service = new Circle();
		service.radius= 5.2;
		double area = service.calcArea();
		double peri = service.calcPeri();
		System.out.println("area " + area);
		System.out.println("peri " + peri);
	}
}
