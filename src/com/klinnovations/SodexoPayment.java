package com.klinnovations;

public class SodexoPayment implements IPayment {
	@Override
	public boolean processPayment(double billAmt) {

		// business logic
		System.out.println("Sodexo Payment Process...");
		return true;
	}

}
