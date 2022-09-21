package com.ou.film.services;



import com.ou.film.dtos.SeatDTO;

import java.util.List;

public interface ISeatService {
    List<SeatDTO> getSeatsByScheduleId(Integer scheduleId);
}
