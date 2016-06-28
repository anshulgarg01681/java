package com.pack1;

public class Demo3 {

	public static void main(String[] args) {
		// copying the elements from one array to another
		
		String[] arr = {"ram","anand","balmukand","mukund"};
		
		String[] arr2 = new String[arr.length];
		
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		
		for(String str: arr2){
			System.out.println(str);
		}

	}

}
