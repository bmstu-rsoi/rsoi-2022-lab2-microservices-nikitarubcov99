package ru.rubcov.gateway.dto;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.validation.annotation.Validated;
import ru.rubcov.gateway.dto.enums.ReservationStatusEnum;

import java.sql.Date;
import java.util.UUID;

@Data
@Validated
@Accessors(chain = true)
public class CreateReservationResponse {
    private UUID reservationUid;
    private UUID hotelUid;
    private Date startDate;
    private Date endDate;
    private Integer discount;
    private ReservationStatusEnum status;
    private PaymentInfo payment;
}
