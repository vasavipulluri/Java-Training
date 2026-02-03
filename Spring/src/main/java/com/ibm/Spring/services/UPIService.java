package com.ibm.Spring.services;

import org.springframework.stereotype.Component;

@Component("UPIService")
public class UPIService implements PaymentService {

	@Override
	public void processPayment(double amount) {
		System.out.println(amount+ " payment done using UPI");

	}

}
