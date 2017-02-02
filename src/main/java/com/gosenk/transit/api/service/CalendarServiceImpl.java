package com.gosenk.transit.api.service;

import com.gosenk.transit.api.entity.Calendar;
import com.gosenk.transit.api.repository.CalendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalendarServiceImpl extends BaseServiceImpl<Calendar, CalendarRepository> implements CalendarService{

    @Autowired
    public CalendarServiceImpl(CalendarRepository repository) {
        super(repository);
    }

}
