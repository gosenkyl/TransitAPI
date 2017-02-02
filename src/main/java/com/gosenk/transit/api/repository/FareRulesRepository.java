package com.gosenk.transit.api.repository;

import com.gosenk.transit.api.entity.FareRules;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FareRulesRepository extends PagingAndSortingRepository<FareRules, String> {

    //List<ReferenceData> findBySetIdOrderByOrderAsc(String setId);

}
