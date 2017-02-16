package com.gosenk.transit.api.repository;

import com.gosenk.transit.api.entity.RouteToStop;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteToStopRepository extends PagingAndSortingRepository<RouteToStop, String> {

    @Query(value = "select r from RouteToStop r where r.route.id = :routeId")
    List<RouteToStop> findByRouteIdAndSort(@Param("routeId") String routeId, Sort sort);

}
