package com.ou.film.services;

import com.ou.film.dtos.BookingRequestDTO;

public interface IBillService {
    void createNewBill(BookingRequestDTO bookingRequestDTO) throws RuntimeException;
}
