package ru.rubcov.reservation.service.converter;

import ru.rubcov.reservation.dto.ReservationDTO;
import ru.rubcov.reservation.dto.enums.StatusEnum;
import ru.rubcov.reservation.model.ReservationEntity;


public class ReservationConverter {
    public static ReservationDTO fromReservationEntityToReservationDTO(ReservationEntity reservationEntity) {
        return new ReservationDTO()
                .setReservationUid(reservationEntity.getReservationUid())
                .setHotelId(reservationEntity.getHotelId())
                .setStartDate(reservationEntity.getStartDate())
                .setEndDate(reservationEntity.getEndDate())
                .setStatus(StatusEnum.valueOf(reservationEntity.getStatus()))
                .setPaymentUid(reservationEntity.getPaymentUid());
    }

    public static ReservationEntity fromReservationDTOTOReservationEntity(ReservationDTO reservationDTO, String username) {
        return new ReservationEntity()
                .setReservationUid(reservationDTO.getReservationUid())
                .setUsername(username)
                .setPaymentUid(reservationDTO.getPaymentUid())
                .setHotelId(reservationDTO.getHotelId())
                .setStatus(reservationDTO.getStatus().toString())
                .setStartDate(reservationDTO.getStartDate())
                .setEndDate(reservationDTO.getEndDate());
    }
}
