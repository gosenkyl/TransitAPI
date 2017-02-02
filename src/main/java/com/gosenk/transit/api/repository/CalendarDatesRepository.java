package com.gosenk.transit.api.repository;

import com.gosenk.transit.api.entity.CalendarDates;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarDatesRepository extends PagingAndSortingRepository<CalendarDates, String> {

    //List<ReferenceData> findBySetIdOrderByOrderAsc(String setId);

}
