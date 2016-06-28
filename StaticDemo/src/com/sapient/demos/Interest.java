package com.sapient.demos;

import java.util.Scanner;

import com.sapient.util.MyUtil;

public class Interest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount");
		double amt = scan.nextDouble();
		System.out.println("Enter the Years");
		int years = scan.nextInt();
		System.out.println("Enter the rate of interest");
		float rate = scan.nextFloat();
		double si = calcSimple(amt, years, rate);
		double ci = calcComp(amt, years, rate);
		System.out.println("Simple Interest " + MyUtil.round2places(si));
		System.out.println("Compound Interest " + MyUtil.round2places(ci));

	}
	
	public static double calcSimple(double amt, int years, float rate){
		return amt * years * rate / 100;
	}

	public static double calcComp(double amt, int years, float rate){
		return amt * Math.pow((1+rate/100.0), years) - amt;
	}
}
