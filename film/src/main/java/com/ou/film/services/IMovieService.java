package com.ou.film.services;


import com.ou.film.dtos.MovieDTO;

import java.util.List;

public interface IMovieService {
    List<MovieDTO> findAllShowingMovies();
    MovieDTO getById(Integer movieId);
    List<MovieDTO> findAllShowingMoviesByName(String name);
}
