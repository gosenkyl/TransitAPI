package com.gosenk.transit.api.repository;

import com.gosenk.transit.api.entity.Agency;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgencyRepository extends PagingAndSortingRepository<Agency, String> {

    //List<ReferenceData> findBySetIdOrderByOrderAsc(String setId);

}
