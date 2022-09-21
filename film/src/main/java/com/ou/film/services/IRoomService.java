package com.ou.film.services;

import com.ou.film.dtos.RoomDTO;

import java.util.List;

public interface IRoomService {
    List<RoomDTO> getRooms(Integer movieId, Integer branchId, String startDate, String startTime);
}
