package ru.rubcov.payment.service;

import ru.rubcov.payment.dto.PaymentDTO;

import java.util.UUID;

public interface PaymentService {
    PaymentDTO getPaymentByUid(UUID paymentUid);
    PaymentDTO postPayment(Integer price);
    void cancelPayment(UUID paymentUid);
}
