package dev.erika.api_movies.service;

import java.util.List;


public interface IGenericService<T> {
  public List<T> getAll();
  public T getById(Long id) throws Exception;
  public T save(T obj);
  public T update(Long id, T obj) throws Exception;
  public void delete (Long id) throws Exception;
  public T getByTitle(String title) throws Exception;
  
}
