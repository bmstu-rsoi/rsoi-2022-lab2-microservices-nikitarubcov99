package org.rubcov.loyalty.service;

import org.rubcov.loyalty.dto.LoyaltyIntoResponse;


public interface LoyaltyService {
    Integer getDiscountByUsername(String username);
    LoyaltyIntoResponse getLoyaltyInfoResponseByUsername(String username);
    Integer getReservationUpdatedPrice(Integer price, Integer discount);
    LoyaltyIntoResponse updateReservationCount(String username);
    LoyaltyIntoResponse cancelReservationCount(String username);
}
