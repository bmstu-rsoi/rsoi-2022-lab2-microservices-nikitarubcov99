package ru.rubcov.payment.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.rubcov.payment.dto.PaymentDTO;
import ru.rubcov.payment.repository.PaymentRepository;
import ru.rubcov.payment.service.PaymentService;

import java.util.UUID;

import static ru.rubcov.payment.service.converter.PaymentConverter.createPaymentEntity;
import static ru.rubcov.payment.service.converter.PaymentConverter.fromPaymentEntityToPaymentDTO;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    private final PaymentRepository paymentRepository;

    @Transactional(readOnly = true)
    public PaymentDTO getPaymentByUid(UUID paymentUid) {
        return fromPaymentEntityToPaymentDTO(paymentRepository.getPaymentByUid(paymentUid));
    }

    @Transactional
    public PaymentDTO postPayment(Integer price) {
        return fromPaymentEntityToPaymentDTO(paymentRepository.save(createPaymentEntity(price)));
    }

    @Transactional
    public void cancelPayment(UUID paymentUid) {
        paymentRepository.cancelPayment(paymentUid);
    }
}
