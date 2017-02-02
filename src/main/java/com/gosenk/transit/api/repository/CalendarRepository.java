package com.gosenk.transit.api.repository;

import com.gosenk.transit.api.entity.Calendar;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarRepository extends PagingAndSortingRepository<Calendar, String> {

    //List<ReferenceData> findBySetIdOrderByOrderAsc(String setId);

}
