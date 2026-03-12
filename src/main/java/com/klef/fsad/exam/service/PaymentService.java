package com.klef.fsad.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.exam.model.Payment;
import com.klef.fsad.exam.repository.PaymentRepository;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repo;

    public Payment addPayment(Payment payment) {
        return repo.save(payment);
    }

    public List<Payment> getAllPayments() {
        return repo.findAll();
    }
}
