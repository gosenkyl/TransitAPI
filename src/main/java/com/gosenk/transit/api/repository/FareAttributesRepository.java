package com.gosenk.transit.api.repository;

import com.gosenk.transit.api.entity.FareAttributes;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FareAttributesRepository extends PagingAndSortingRepository<FareAttributes, String> {

    //List<ReferenceData> findBySetIdOrderByOrderAsc(String setId);

}
