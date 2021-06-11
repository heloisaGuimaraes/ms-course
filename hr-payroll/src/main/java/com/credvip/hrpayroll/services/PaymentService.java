package com.credvip.hrpayroll.services;
//é um service pois não teremos banco de dados aqui

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credvip.hrpayroll.entities.Payment;
import com.credvip.hrpayroll.entities.Worker;
import com.credvip.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClient workerFeignClient;

	public Payment getPayment(long workerId, int days) {

		Worker worker = workerFeignClient.findById(workerId).getBody();

		return new Payment(worker.getName(), worker.getDailyIncome(), days);

	}
}
