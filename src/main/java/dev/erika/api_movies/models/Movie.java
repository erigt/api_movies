package dev.erika.api_movies.models;

import java.time.Year;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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


  @ManyToOne
  @JoinColumn (name = "year_id", nullable = true)

  private Year creation_year;
  public Object getCreation_year;


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
  public String getTitle() {
    return null;
  }
  public String getDescription() {
    return null;
  }
  public Long getRunning_time() {
    return null;
  }
  public long getId() {
    return id;
  }
  public Year getCreation_year() {
    return creation_year;
  }
  public void setCreation_year(Year creation_year) {
    this.creation_year = creation_year;
  }
  public Object getGetCreation_year() {
    return getCreation_year;
  }
  public void setGetCreation_year(Object getCreation_year) {
    this.getCreation_year = getCreation_year;
  }
  
  
}



