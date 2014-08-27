package com.batmz.ajay.dao;

import java.io.Serializable;
import java.util.List;

public interface IOperations<T extends Serializable> {

    T findOne(final long id);
    
    T findOne(final String id);

    List<T> findAll();

  //  List<T> findAllByFieldName(final String fieldName);

    void create(final T entity);

    T update(final T entity);

    void delete(final T entity);

    void deleteById(final long entityId);
    
    void deleteById(final String entityId);

    Object findRecordsCount();
}
