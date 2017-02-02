package com.gosenk.transit.api.service;

import com.gosenk.transit.api.entity.BaseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface BaseService<T extends BaseEntity> {

    List<T> findAll();
    List<T> findAll(Sort sort);
    Page<T> findAll(Pageable sort);
    T findById(String id);
    T save(T dso);
    List<T> save(Iterable<T> dso);
    void delete(String id);
    void delete(T dso);
    void delete(List<T> dsoList);
    void deleteAll();
    long count();
}
