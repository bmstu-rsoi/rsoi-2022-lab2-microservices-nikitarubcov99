package org.rubcov.loyalty.dto;


import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.validation.annotation.Validated;
import org.rubcov.loyalty.dto.enums.StatusEnum;


@Data
@Validated
@Accessors(chain = true)
public class LoyaltyDTO {
    private Integer id;
    private String username;
    private Integer reservationCount;
    private StatusEnum status;
    private Integer discount;
}
