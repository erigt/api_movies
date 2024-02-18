package dev.erika.api_movies.service;

import java.util.List;

import dev.erika.api_movies.repositories.MoviRepository;

import org.springframework.stereotype.Service;

import dev.erika.api_movies.exceptions.MovieNotFoundException;
import dev.erika.api_movies.models.Movie;
import dev.erika.api_movies.messages.Message;

@Service

public class MovieService implements IGenericService<Movie> {
  MoviRepository repository;

  public MovieService(MoviRepository repository) {
    this.repository = repository;
  }

  public List <Movie> getAll () {
    List <Movie> movies = repository.findAll();
    return movies;
  }

  public Movie getById(Long id) throws Exception {
    Movie movie = repository.findById(id).orElseThrow(() -> new MovieNotFoundException("Movie not found"));

    return movie;
  }

  public Movie save(Movie movie) {
    
    Movie newMovie = repository.save(movie);
    return newMovie;
  }

  public Movie update(Long id, Movie movie) throws Exception {
    
    Movie updatingMovie = repository.findById(id).orElseThrow(() -> new MovieNotFoundException("Movie not found"));

    updatingMovie.setTitle(movie.getTitle());
    updatingMovie.setDescription(movie.getDescription());
    updatingMovie.setRunning_time(movie.getRunning_time());
    
    Movie updatedMovie = repository.save(updatingMovie);
    
    return updatedMovie;
  }

  public Message delete(Long id) throws Exception {
        
  Movie movie = repository.findById(id).orElseThrow(() -> new MovieNotFoundException("Movie not found"));

  String movieName = movie.getTitle();

  Message message = new Message();

  message.setMessage(movieName + " is deleted from the movies table");

  return message;
}

public Movie getByTitle (String title) throws Exception {
  Movie movie = repository.findByTitle(title).orElseThrow(() -> new MovieNotFoundException("Movie not found"));

  return movie;
}


}


