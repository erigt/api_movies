package dev.erika.api_movies.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "movies")

public class Movie {
  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY) @Column (name = "id_movie")
  private long id;
  private String title;
  private String description;
  private Long running_time;
  public void setId(long id) {
    this.id = id;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public void setRunning_time(Long running_time) {
    this.running_time = running_time;
  }
}



