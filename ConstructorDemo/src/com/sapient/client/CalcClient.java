package com.sapient.client;

import com.sapient.beans.StdCalculator;

public class CalcClient {

	public static void main(String[] args) {
		// invoking a constructor using double arg
		try {
			StdCalculator calc = new StdCalculator(56.37867);
			System.out.println(calc.round2dec());
			System.out.println(calc.round2dec(3));
			System.out.println(calc.convert2Int());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// invoking a constructor using int arg
		try {
			StdCalculator calc = new StdCalculator(200);
			System.out.println(calc.convertToBin());
			System.out.println(calc.convertToOcatl());
			System.out.println(calc.convertToDecimal());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// invoking a constructor using two arg
		try {
			StdCalculator calc = new StdCalculator(20.7889, 50.3875);
			System.out.println(calc.doAdd());
			System.out.println(calc.doSub());
			System.out.println(calc.doMultiply());
			System.out.println(calc.round2dec());
			System.out.println(calc.round2dec(3));
			System.out.println(calc.convertToBin());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
