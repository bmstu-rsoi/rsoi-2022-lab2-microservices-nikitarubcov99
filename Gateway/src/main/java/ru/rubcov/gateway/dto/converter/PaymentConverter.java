package ru.rubcov.gateway.dto.converter;

import ru.rubcov.gateway.dto.PaymentDTO;
import ru.rubcov.gateway.dto.PaymentInfo;

public class PaymentConverter {
    public static PaymentInfo fromPaymentDTOToPaymentInfo(PaymentDTO paymentDTO) {
        return new PaymentInfo()
                .setStatus(paymentDTO.getStatus())
                .setPrice(paymentDTO.getPrice());
    }
}
