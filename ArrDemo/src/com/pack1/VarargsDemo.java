package com.pack1;

public class VarargsDemo {

	public static void main(String[] args) {
		display();
		display(5,2);
		display(10,2,34,78,90);
	}

	public static void display(int... arr){
		System.out.println("var args called");
		for(int val: arr){
			System.out.println(val);
		}
		System.out.println("-------------------------");
	}

}
