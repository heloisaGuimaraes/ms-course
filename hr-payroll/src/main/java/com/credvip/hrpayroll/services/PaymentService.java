package com.credvip.hrpayroll.services;
//é um service pois não teremos banco de dados aqui

import org.springframework.stereotype.Service;

import com.credvip.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	public Payment getPayment(long workerId, int days) {
		return new Payment ("Bob", 200.0, days);
		
	}
}
