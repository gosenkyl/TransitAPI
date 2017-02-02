package com.gosenk.transit.api.service;

import com.gosenk.transit.api.entity.Stops;
import com.gosenk.transit.api.repository.StopsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StopsServiceImpl extends BaseServiceImpl<Stops, StopsRepository> implements StopsService{

    @Autowired
    public StopsServiceImpl(StopsRepository repository) {
        super(repository);
    }

}
