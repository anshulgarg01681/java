package com.sapient.client;

import java.util.Scanner;

import com.sapient.bean.Factorial;

public class FactClient {

	public static void main(String[] args){
		Factorial obj = new Factorial();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		obj.num = scan.nextInt();
		System.out.println("factorial" + obj.findFact());
		
	}
}
