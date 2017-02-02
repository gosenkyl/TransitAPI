package com.gosenk.transit.api.service;

import com.gosenk.transit.api.entity.FareRules;
import com.gosenk.transit.api.repository.FareRulesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FareRulesServiceImpl extends BaseServiceImpl<FareRules, FareRulesRepository> implements FareRulesService{

    @Autowired
    public FareRulesServiceImpl(FareRulesRepository repository) {
        super(repository);
    }

}
