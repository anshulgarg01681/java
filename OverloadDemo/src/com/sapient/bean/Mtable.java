package com.sapient.bean;

public class Mtable {

	private int num;

	public void setNum(int num) throws Exception {
		if (num > 0)
			this.num = num;
		else
			throw new Exception("number must be +ve");
	}

	public void display() {
		for (int i = 1; i <= 10; ++i)
			System.out.printf("%d * %d = %d\n", num, i, num * i);
	}

	public void display( int rows) {
		for (int i = 1; i <= rows; ++i)
			System.out.printf("%d * %d = %d\n", num, i, num * i);
	}
	
	public void display(int start, int end) {
		for (int i = start; i <= end; ++i)
			System.out.printf("%d * %d = %d\n", num, i, num * i);
	}
	
}
