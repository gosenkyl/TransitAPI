package com.gosenk.transit.api.service;

import com.gosenk.transit.api.entity.BaseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public class BaseServiceImpl<T extends BaseEntity, R extends PagingAndSortingRepository<T, String>> implements BaseService<T>{

    private final R repository;

    @SuppressWarnings("WeakerAccess")
    public BaseServiceImpl(R repository) {
        this.repository = repository;
    }

    public R getRepository() {
        return repository;
    }

    @Override
    public List<T> findAll() {
        return (List) getRepository().findAll();
    }

    @Override
    public List<T> findAll(Sort sort){
        return (List) getRepository().findAll(sort);
    }

    @Override
    public Page<T> findAll(Pageable pageable){
        return getRepository().findAll(pageable);
    }

    @Override
    public T findById(String id) {
        if (id == null) {
            return null;
        } else {
            return getRepository().findOne(id);
        }
    }

    @Override
    public T save(T dso) {
        return getRepository().save(dso);
    }

    @Override
    public List<T> save(Iterable<T> dsoList){
        return (List) getRepository().save(dsoList);
    }

    @Override
    public void delete(String id){
        getRepository().delete(id);
    }

    @Override
    public void delete(T dso) {
        getRepository().delete(dso);
    }

    @Override
    public void delete(List<T> dsoList){
        getRepository().delete(dsoList);
    }

    @Override
    public void deleteAll(){
        getRepository().deleteAll();
    }

    @Override
    public long count(){
        return getRepository().count();
    }
}
