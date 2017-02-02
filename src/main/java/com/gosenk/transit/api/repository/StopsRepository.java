package com.gosenk.transit.api.repository;

import com.gosenk.transit.api.entity.Stops;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StopsRepository extends PagingAndSortingRepository<Stops, String> {

    //List<ReferenceData> findBySetIdOrderByOrderAsc(String setId);

}
