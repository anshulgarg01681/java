package com.sapient.client;

import java.util.Scanner;

import com.sapient.beans.Factorial;

public class FactClient {

	public static void main(String[] args){
		Factorial obj = new Factorial();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		try {
			obj.setNum(num);
			System.out.println("factorial " + obj.findFact());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
