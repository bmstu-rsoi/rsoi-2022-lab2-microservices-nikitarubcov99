package ru.rubcov.reservation.dto;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.validation.annotation.Validated;
import ru.rubcov.reservation.dto.enums.StatusEnum;

import java.sql.Date;
import java.util.UUID;

@Data
@Validated
@Accessors(chain = true)
public class ReservationDTO {
    private UUID reservationUid;
    private Integer hotelId;
    private Date startDate;
    private Date endDate;
    private StatusEnum status;
    private UUID paymentUid;
}
