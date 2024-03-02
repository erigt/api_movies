package dev.erika.api_movies.controllers;

import java.util.List;

import org.aspectj.bridge.Message;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.erika.api_movies.service.IGenericService;
import dev.erika.api_movies.models.Movie;
import dev.erika.api_movies.service.MovieService;




@RestController
@RequestMapping (path = "${api-endpoint}/movies")

public class MovieController {
  IGenericService<Movie> service;
  

  public MovieController(MovieService service) {
    this.service = service;
  }
  
  @GetMapping (path = "")
  public List <Movie> index (){
  List <Movie> movies = service.getAll();

  return movies;
  }

  @GetMapping(path = "/{id}")
    public ResponseEntity<Movie> show(@PathVariable("id") Long id) throws Exception {

        Movie movie = service.getById(id);

        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(movie);
    }

    @PostMapping(path = "")
    public ResponseEntity<Movie> create(@RequestBody Movie movie) {

        Movie newMovie = service.save(movie);

        return ResponseEntity.status(201).body(newMovie);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Movie> update(@PathVariable("id") Long id, @RequestBody Movie movie) throws Exception {

        Movie updatedMovie = service.update(id, movie);

        return ResponseEntity.status(200).body(updatedMovie);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<org.aspectj.bridge.Message> remove(@PathVariable("id") Long id) throws Exception { 

        service.delete(id);
          return ResponseEntity.status(200).build();
    }

    @GetMapping(path = "/bytitle/{title}")
    public ResponseEntity<Movie> showByTitle(@PathVariable("title") String title) throws Exception {

    Movie movie = service.getByTitle(title);

    return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(movie);
  }

}
