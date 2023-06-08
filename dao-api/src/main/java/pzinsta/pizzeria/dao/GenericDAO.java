package pzinsta.pizzeria.dao;

import java.util.List;
import java.util.Optional;

public interface GenericDAO <T, ID> {
    Optional<T> findById(Long id);
    List<T> findAll();
    Long getCount();
    T saveOrUpdate(T entity);
    void delete(T entity);
}
