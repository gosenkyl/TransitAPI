package com.gosenk.transit.api.service;

import com.gosenk.transit.api.entity.FeedInfo;
import com.gosenk.transit.api.repository.FeedInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedInfoServiceImpl extends BaseServiceImpl<FeedInfo, FeedInfoRepository> implements FeedInfoService{

    @Autowired
    public FeedInfoServiceImpl(FeedInfoRepository repository) {
        super(repository);
    }

}
