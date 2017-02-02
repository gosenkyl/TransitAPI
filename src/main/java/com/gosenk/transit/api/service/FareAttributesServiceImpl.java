package com.gosenk.transit.api.service;

import com.gosenk.transit.api.entity.FareAttributes;
import com.gosenk.transit.api.repository.FareAttributesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FareAttributesServiceImpl extends BaseServiceImpl<FareAttributes, FareAttributesRepository> implements FareAttributesService{

    @Autowired
    public FareAttributesServiceImpl(FareAttributesRepository repository) {
        super(repository);
    }

}
