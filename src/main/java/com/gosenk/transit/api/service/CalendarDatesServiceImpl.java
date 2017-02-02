package com.gosenk.transit.api.service;

import com.gosenk.transit.api.entity.CalendarDates;
import com.gosenk.transit.api.repository.CalendarDatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalendarDatesServiceImpl extends BaseServiceImpl<CalendarDates, CalendarDatesRepository> implements CalendarDatesService{

    @Autowired
    public CalendarDatesServiceImpl(CalendarDatesRepository repository) {
        super(repository);
    }

}
