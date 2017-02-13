package com.gosenk.transit.api.repository;

import com.gosenk.transit.api.entity.StopTimes;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StopTimesRepository extends PagingAndSortingRepository<StopTimes, String> {

    //List<ReferenceData> findBySetIdOrderByOrderAsc(String setId);

}
