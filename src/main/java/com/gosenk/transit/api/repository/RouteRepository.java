package com.gosenk.transit.api.repository;

import com.gosenk.transit.api.entity.Route;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends PagingAndSortingRepository<Route, String> {

    //List<ReferenceData> findBySetIdOrderByOrderAsc(String setId);

}
