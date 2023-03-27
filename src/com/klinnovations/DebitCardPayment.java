package com.klinnovations;

public class DebitCardPayment implements IPayment {
	@Override
	public boolean processPayment(double billAmt) {

		// business logic

		System.out.println("Debit Card Payment Procesess...");
		return true;
	}

}
