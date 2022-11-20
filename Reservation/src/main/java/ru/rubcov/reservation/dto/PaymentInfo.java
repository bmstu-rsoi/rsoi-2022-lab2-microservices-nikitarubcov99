package ru.rubcov.reservation.dto;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.validation.annotation.Validated;
import ru.rubcov.reservation.dto.enums.StatusEnum;

@Data
@Validated
@Accessors(chain = true)
public class PaymentInfo {
    private StatusEnum status;
    private Integer price;
}
