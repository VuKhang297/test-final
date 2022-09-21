package com.ou.film.services;

import com.ou.film.dtos.TicketDTO;

import java.util.List;

public interface ITicketService {
    List<TicketDTO> getTicketsByUserId(Integer userId);
}
