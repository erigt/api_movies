package dev.erika.api_movies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.erika.api_movies.models.Year;


public interface YearRepository extends JpaRepository<Year,Long> {

}
