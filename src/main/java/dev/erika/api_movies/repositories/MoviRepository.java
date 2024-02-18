package dev.erika.api_movies.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.erika.api_movies.models.Movie;

public interface MoviRepository extends JpaRepository<Movie,Long> {
  Optional<Movie> findByTitle(String title);
  
}
