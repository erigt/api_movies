package dev.erika.api_movies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.erika.api_movies.models.Movie;

public interface GenreRepository extends JpaRepository<Movie,Long> {
  
}
