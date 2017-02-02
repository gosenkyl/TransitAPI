package com.gosenk.transit.api.dataprocess;

import com.gosenk.transit.api.entity.FareRules;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class FareRulesProcess extends DataProcessor implements BaseDataProcess {

    public FareRulesProcess(){
        super("FareRules", "fare_rules.txt", "fare_id,route_id,origin_id,destination_id,contains_id");
    }

    @Override
    public void processData(String[] columns) throws Exception{

        FareRules fareRules = new FareRules();

        fareRules.setFareRulesId(UUID.randomUUID().toString());
        fareRules.setFareId(columns[0].trim());
        fareRules.setRouteId(columns[1].trim());
        fareRules.setOriginId(columns[2].trim());
        fareRules.setDestinationId(columns[3].trim());
        fareRules.setContainsId(columns[4].trim());

    }
}
