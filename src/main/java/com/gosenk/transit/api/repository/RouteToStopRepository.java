package com.gosenk.transit.api.repository;

import com.gosenk.transit.api.entity.RouteToStop;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteToStopRepository extends PagingAndSortingRepository<RouteToStop, String> {

    @Query(value = "select rts.* from route_to_stop rts where rts.route_id = ?1 order by stop_name asc", nativeQuery = true)
    List<RouteToStop> findByAndSort(@Param("routeId") String routeId);

}
