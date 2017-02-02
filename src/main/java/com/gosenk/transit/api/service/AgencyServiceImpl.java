package com.gosenk.transit.api.service;

import com.gosenk.transit.api.entity.Agency;
import com.gosenk.transit.api.repository.AgencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgencyServiceImpl extends BaseServiceImpl<Agency, AgencyRepository> implements AgencyService{

    @Autowired
    public AgencyServiceImpl(AgencyRepository repository) {
        super(repository);
    }

}
