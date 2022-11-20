package ru.rubcov.gateway.dto;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.validation.annotation.Validated;
import ru.rubcov.gateway.dto.enums.UserStatusEnum;

@Data
@Validated
@Accessors(chain = true)
public class LoyaltyInfoResponse {
    private UserStatusEnum status;
    private Integer discount;
    private Integer reservationCount;
}
