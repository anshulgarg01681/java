package com.sapient.client;

import com.sapient.bean.NokiaLumia;

public class ClientA {

	public static void main(String[] args) {
		NokiaLumia obj = new NokiaLumia();
		obj.browseNet();
		obj.captureVideo();
		obj.doConverse();

	}

}
