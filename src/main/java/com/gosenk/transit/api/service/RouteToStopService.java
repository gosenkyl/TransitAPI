package com.gosenk.transit.api.service;

import com.gosenk.transit.api.entity.RouteToStop;

import java.util.List;

public interface RouteToStopService extends BaseService<RouteToStop>{

    List<RouteToStop> findByRouteId(String routeId);

}
