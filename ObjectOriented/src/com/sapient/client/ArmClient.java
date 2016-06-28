package com.sapient.client;

import java.util.Scanner;

import com.sapient.bean.Armstrong;

public class ArmClient {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String opt=null;
		do{
			System.out.println("enter the number");
			Armstrong obj = new Armstrong();
			obj.num = scan.nextInt();
			System.out.println(obj.findArmstrong());
			System.out.println("prompt y to continue");
			opt = scan.next();
		} while(opt.equals("y"));
	}

}
