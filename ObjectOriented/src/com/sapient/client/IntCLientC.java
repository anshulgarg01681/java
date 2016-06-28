package com.sapient.client;

import java.util.Scanner;

import com.sapient.bean.Interest;

enum CalcOptions{
	SIMPLE, COMPOUND
}

public class IntCLientC {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount");
		double amt = scan.nextDouble();
		System.out.println("Enter the Years");
		int years = scan.nextInt();
		System.out.println("Enter the rate of interest");
		float rate = scan.nextFloat();
		System.out.println("Press simple to calculate Simple Interest and compound for Compound Interest");
		String str = scan.next();
		CalcOptions opt = CalcOptions.valueOf(str.toUpperCase());
		Interest obj = new Interest();
		obj.amt = amt;
		obj.rate = rate;
		obj.years = years;
		switch (opt) {
		case SIMPLE :
			System.out.println("Simple Interest " + obj.calcSimple());
			break;
		case COMPOUND :
			System.out.println("Compound Interest " + obj.calcCompound());
			break;
		}
	}

}
