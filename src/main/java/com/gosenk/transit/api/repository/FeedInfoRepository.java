package com.gosenk.transit.api.repository;

import com.gosenk.transit.api.entity.FeedInfo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedInfoRepository extends PagingAndSortingRepository<FeedInfo, String> {

    //List<ReferenceData> findBySetIdOrderByOrderAsc(String setId);

}
