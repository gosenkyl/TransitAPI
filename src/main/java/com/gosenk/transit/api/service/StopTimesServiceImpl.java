package com.gosenk.transit.api.service;

import com.gosenk.transit.api.entity.StopTimes;
import com.gosenk.transit.api.repository.CalendarRepository;
import com.gosenk.transit.api.repository.StopTimesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StopTimesServiceImpl extends BaseServiceImpl<StopTimes, StopTimesRepository> implements StopTimesService{

    @Autowired
    public StopTimesServiceImpl(StopTimesRepository repository) {
        super(repository);
    }

    @Autowired
    public CalendarRepository calendarRepository;

    @Override
    public List<StopTimes> getByRouteStopDate(String routeId, String stopId, String date) {

        calendarRepository.

        return getRepository().findByStopId(stopId);
    }
}
