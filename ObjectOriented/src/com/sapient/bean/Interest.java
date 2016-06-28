package com.sapient.bean;

import com.sapient.util.MyUtil;

public class Interest {

	public double amt;
	public int years;
	public float rate;

	public double calcSimple() {
		return MyUtil.round2places(amt * years * rate / 100);
	}

	public double calcCompound() {
		return MyUtil.round2places(amt * Math.pow((1 + rate / 100.0), years) - amt);
	}

}
