package com.klinnovations;

public class CreditCardPayment implements IPayment {
	@Override
	public boolean processPayment(double billAmt) {
		// business logic
		System.out.println("Credit Card Payment Process... ");
		return true;
	}

}
