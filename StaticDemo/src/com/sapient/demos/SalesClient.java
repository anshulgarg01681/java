package com.sapient.demos;

public class SalesClient {

	public static void main(String[] args) {
		Sales s1 = new Sales("ram",15000);
		Sales s2 = new Sales("tom",25000);
		Sales s3 = new Sales("sam", 35000);
		System.out.println(Sales.TOT_SALES);

	}

}
