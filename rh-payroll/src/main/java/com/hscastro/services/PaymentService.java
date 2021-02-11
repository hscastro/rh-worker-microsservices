package com.hscastro.services;

import org.springframework.stereotype.Service;

import com.hscastro.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		
		return new Payment("Pedro", 200.00, days);
	}
}
