package dev.erika.api_movies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.erika.api_movies.models.Movie;

public interface MoviRepository extends JpaRepository<Movie,Long> {

  
}
