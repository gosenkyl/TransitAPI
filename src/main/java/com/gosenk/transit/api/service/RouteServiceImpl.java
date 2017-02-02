package com.gosenk.transit.api.service;

import com.gosenk.transit.api.entity.Route;
import com.gosenk.transit.api.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RouteServiceImpl extends BaseServiceImpl<Route, RouteRepository> implements RouteService{

    @Autowired
    public RouteServiceImpl(RouteRepository repository) {
        super(repository);
    }

}
