package com.sapient.client;

import java.util.Scanner;

import com.sapient.bean.Interest;

public class IntClientB {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount");
		double amt = scan.nextDouble();
		System.out.println("Enter the Years");
		int years = scan.nextInt();
		System.out.println("Enter the rate of interest");
		float rate = scan.nextFloat();
		System.out.println("Press si to calculate Simple Interest and ci for Compound Interest");
		String opt = scan.next();
		Interest obj = new Interest();
		obj.amt = amt;
		obj.rate = rate;
		obj.years = years;
		switch (opt) {
		case "si":
			System.out.println("Simple Interest " + obj.calcSimple());
			break;
		case "ci":
			System.out.println("Compound Interest " + obj.calcCompound());
			break;
		default:
			System.out.println("invalid input");
		}

	}

}
