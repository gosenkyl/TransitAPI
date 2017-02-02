package com.gosenk.transit.api.service;

import com.gosenk.transit.api.entity.StopTimes;
import com.gosenk.transit.api.repository.StopTimesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StopTimesServiceImpl extends BaseServiceImpl<StopTimes, StopTimesRepository> implements StopTimesService{

    @Autowired
    public StopTimesServiceImpl(StopTimesRepository repository) {
        super(repository);
    }

}
