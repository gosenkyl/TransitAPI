package com.gosenk.transit.api.dataprocess;

import com.gosenk.transit.api.entity.Agency;
import org.springframework.stereotype.Component;

@Component
public class AgencyProcess extends DataProcessor implements BaseDataProcess {

    public AgencyProcess(){
        super("Agency", "agency.txt", "agency_id,agency_name,agency_url,agency_timezone,agency_lang,agency_phone,agency_fare_url");
    }

    @Override
    public void processData(String[] columns) throws Exception{

        Agency agency = new Agency();
        agency.setId(columns[0].trim());
        agency.setAgencyName(columns[1].trim());
        agency.setAgencyUrl(columns[2].trim());
        agency.setAgencyTimezone(columns[3].trim());
        agency.setAgencyLang(columns[4].trim());
        agency.setAgencyPhone(columns[5].trim());
        agency.setAgencyFareUrl(columns[6].trim());

    }
}
