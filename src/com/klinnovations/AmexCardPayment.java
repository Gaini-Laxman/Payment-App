package com.klinnovations;

public class AmexCardPayment implements IPayment{
@Override
public boolean processPayment(double billAmt) {
	System.out.println("Amex Card  Payment Process...");
	// TODO Auto-generated method stub
	return true;
}
}
