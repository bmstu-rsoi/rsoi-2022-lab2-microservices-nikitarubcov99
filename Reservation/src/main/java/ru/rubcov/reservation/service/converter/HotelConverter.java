package ru.rubcov.reservation.service.converter;

import ru.rubcov.reservation.dto.HotelResponse;
import ru.rubcov.reservation.model.HotelEntity;

public class HotelConverter {
    public static HotelResponse fromHotelsEntityToHotelResponse(HotelEntity hotelEntity) {
        return new HotelResponse()
                .setHotelUid(hotelEntity.getHotelUid())
                .setName(hotelEntity.getName())
                .setCountry(hotelEntity.getCountry())
                .setCity(hotelEntity.getCity())
                .setAddress(hotelEntity.getAddress())
                .setStars(hotelEntity.getStars())
                .setPrice(hotelEntity.getPrice());
    }
}
