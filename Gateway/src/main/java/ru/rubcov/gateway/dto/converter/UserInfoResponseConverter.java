package ru.rubcov.gateway.dto.converter;

import ru.rubcov.gateway.dto.LoyaltyInfoResponse;
import ru.rubcov.gateway.dto.ReservationResponse;
import ru.rubcov.gateway.dto.UserInfoResponse;

import java.util.ArrayList;

public class UserInfoResponseConverter {
    public static UserInfoResponse createUserInfoResponse(ArrayList<ReservationResponse> reservationResponses,
                                                          LoyaltyInfoResponse loyaltyInfoResponse) {
        return new UserInfoResponse()
                .setReservations(reservationResponses)
                .setLoyalty(loyaltyInfoResponse);
    }
}
