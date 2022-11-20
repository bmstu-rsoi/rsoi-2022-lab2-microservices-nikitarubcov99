package ru.rubcov.payment.service.converter;

import ru.rubcov.payment.dto.PaymentDTO;
import ru.rubcov.payment.dto.enums.StatusEnum;
import ru.rubcov.payment.model.PaymentEntity;

import java.util.UUID;

public class PaymentConverter {
    public static PaymentDTO fromPaymentEntityToPaymentDTO(PaymentEntity paymentEntity) {
        return new PaymentDTO()
                .setPaymentUid(paymentEntity.getPaymentUid())
                .setStatus(StatusEnum.valueOf(paymentEntity.getStatus()))
                .setPrice(paymentEntity.getPrice());
    }

    public static PaymentEntity createPaymentEntity(Integer price) {
        return new PaymentEntity()
                .setStatus(StatusEnum.PAID.name())
                .setPaymentUid(UUID.randomUUID())
                .setPrice(price);
    }
}
