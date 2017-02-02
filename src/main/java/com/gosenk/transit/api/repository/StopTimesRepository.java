package com.gosenk.transit.api.repository;

import com.gosenk.transit.api.entity.StopTimes;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StopTimesRepository extends PagingAndSortingRepository<StopTimes, String> {

    //List<ReferenceData> findBySetIdOrderByOrderAsc(String setId);

}
