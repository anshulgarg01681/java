package com.sapient.client;

import com.sapient.bean.Mtable;

public class ClientA {

	public static void main(String[] args) {
		
		Mtable tbl = new Mtable();
		try {
			tbl.setNum(5);
			tbl.display(6);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
