package ru.rubcov.reservation.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.rubcov.reservation.dto.ReservationDTO;
import ru.rubcov.reservation.model.ReservationEntity;
import ru.rubcov.reservation.repository.ReservationRepository;
import ru.rubcov.reservation.service.ReservationService;
import ru.rubcov.reservation.service.converter.ReservationConverter;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {
    private final ReservationRepository reservationRepository;

    @Transactional(readOnly = true)
    public List<ReservationDTO> getReservationsByUsername(String username) {
        return reservationRepository
                .getReservationsByUsername(username)
                .stream()
                .map(ReservationConverter::fromReservationEntityToReservationDTO)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public ReservationDTO getReservationsByUsernameReservationUid(String username, UUID reservationUid) {
        ReservationEntity reservationEntity = reservationRepository.getReservationsByUsernameReservationUid(username, reservationUid);
        return (reservationEntity == null) ? null : ReservationConverter.fromReservationEntityToReservationDTO(reservationEntity);
    }

    @Transactional
    public ReservationDTO postReservation(String username, ReservationDTO reservationDTO) {
        ReservationEntity reservationEntity = reservationRepository.save(ReservationConverter
                    .fromReservationDTOTOReservationEntity(reservationDTO, username));
        return ReservationConverter.fromReservationEntityToReservationDTO(reservationEntity);
    }

    @Transactional
    public void revokeReservation(String username, UUID reservationUid) {
        reservationRepository.revokeReservation(username, reservationUid);
    }
}
