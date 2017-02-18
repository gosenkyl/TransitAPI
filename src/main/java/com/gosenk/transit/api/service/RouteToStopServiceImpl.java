package com.gosenk.transit.api.service;

import com.gosenk.transit.api.entity.RouteToStop;
import com.gosenk.transit.api.repository.RouteToStopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteToStopServiceImpl extends BaseServiceImpl<RouteToStop, RouteToStopRepository> implements RouteToStopService{

    @Autowired
    public RouteToStopServiceImpl(RouteToStopRepository repository) {
        super(repository);
    }

    public List<RouteToStop> findByRouteId(String routeId){
        return getRepository().findByRouteId(routeId);
    }

}
