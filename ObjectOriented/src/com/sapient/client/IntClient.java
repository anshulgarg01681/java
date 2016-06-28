package com.sapient.client;

import java.util.Scanner;

import com.sapient.bean.Interest;

public class IntClient {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount");
		double amt = scan.nextDouble();
		System.out.println("Enter the Years");
		int years = scan.nextInt();
		System.out.println("Enter the rate of interest");
		float rate = scan.nextFloat();
		System.out.println("Press 1 to calculate Simple Interest and 2 for Compound Interest");
		int opt = scan.nextInt();
		Interest obj = new Interest();
		obj.amt = amt;
		obj.rate = rate;
		obj.years = years;
		switch (opt) {
		case 1:
			System.out.println("Simple Interest " + obj.calcSimple());
			break;
		case 2:
			System.out.println("Compound Interest " + obj.calcCompound());
			break;
		default:
			System.out.println("invalid input");
		}

	}

}
