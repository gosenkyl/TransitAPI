package com.gosenk.transit.api.service;

import com.gosenk.transit.api.entity.StopTimes;

import java.util.Collection;
import java.util.List;

public interface StopTimesService extends BaseService<StopTimes>{

    List<StopTimes> getByRouteStopDate(String routeId, String stopId, String date);

}
