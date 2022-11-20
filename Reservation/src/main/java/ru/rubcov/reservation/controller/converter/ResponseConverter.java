package ru.rubcov.reservation.controller.converter;

import org.springframework.data.domain.Page;
import ru.rubcov.reservation.dto.HotelResponse;
import ru.rubcov.reservation.dto.PaginationResponse;

public class ResponseConverter {
    public static PaginationResponse toPaginationResponse(Integer page, Integer pageSize,
                                                              Page<HotelResponse> hotelResponsePage) {
        return new PaginationResponse()
                .setPage(page)
                .setPageSize(pageSize)
                .setTotalElements(hotelResponsePage.getTotalElements())
                .setItems(hotelResponsePage.getContent());
    }
}
