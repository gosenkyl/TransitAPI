package com.gosenk.transit.api.repository;

import com.gosenk.transit.api.entity.Trips;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripsRepository extends PagingAndSortingRepository<Trips, String> {

    //List<ReferenceData> findBySetIdOrderByOrderAsc(String setId);

}
