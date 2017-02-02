package com.gosenk.transit.api.repository;

import com.gosenk.transit.api.entity.Shapes;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShapesRepository extends PagingAndSortingRepository<Shapes, String> {

    //List<ReferenceData> findBySetIdOrderByOrderAsc(String setId);

}
