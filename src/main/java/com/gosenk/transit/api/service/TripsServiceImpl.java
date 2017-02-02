package com.gosenk.transit.api.service;

import com.gosenk.transit.api.entity.Trips;
import com.gosenk.transit.api.repository.TripsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TripsServiceImpl extends BaseServiceImpl<Trips, TripsRepository> implements TripsService{

    @Autowired
    public TripsServiceImpl(TripsRepository repository) {
        super(repository);
    }

}
