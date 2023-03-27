package com.klinnovations;

public class UpiPayment implements IPayment{
	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("UPI Payment Process...");
		// TODO Auto-generated method stub
		return true;
	}

}
