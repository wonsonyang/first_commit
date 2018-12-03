package com.efun.dao;

import java.io.Serializable;
import java.util.List;

interface GenericDao<T, PK extends Serializable> {

    T getById(PK id);

    List<T> findAll();

    PK save(T entity);
}
