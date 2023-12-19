package dev.erika.api_movies.service;

import java.util.List;
import org.springframework.stereotype.Service;

import dev.erika.api_movies.models.Movie;
import dev.erika.api_movies.repositories.MoviRepository;

@Service

public class MovieService {
  MoviRepository repository;

  public MovieService(MoviRepository repository) {
    this.repository = repository;
  }
  public List <Movie> getAll () {
    List <Movie> movies = repository.findAll();
    return movies;
  }

}


