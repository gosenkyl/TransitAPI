package com.gosenk.transit.api.dataprocess;

import com.gosenk.transit.api.entity.Agency;
import com.gosenk.transit.api.entity.Stops;
import org.apache.commons.lang3.StringUtils;
import org.apache.el.lang.ELArithmetic;
import org.springframework.stereotype.Component;

@Component
public class StopsProcess extends DataProcessor implements BaseDataProcess {

    public StopsProcess(){
        super("Stops", "stops.txt", "stop_id,stop_code,stop_name,stop_desc,stop_lat,stop_lon,zone_id,stop_url,location_type,parent_station,stop_timezone,wheelchair_boarding");
    }

    @Override
    public void processData(String[] columns) throws Exception{

        Stops stops = new Stops();

        stops.setStopId(columns[0].trim());
        stops.setStopCode(columns[1].trim());
        stops.setStopName(columns[2].trim());
        stops.setStopDesc(columns[3].trim());

        Double stopLat = null;
        if(StringUtils.isNotEmpty(columns[4])){
            stopLat = Double.parseDouble(columns[4].trim());
        }

        Double stopLon = null;
        if(StringUtils.isNotEmpty(columns[5])){
            stopLon = Double.parseDouble(columns[5].trim());
        }

        stops.setStopLat(stopLat);
        stops.setStopLon(stopLon);

        stops.setZoneId(columns[6].trim());
        stops.setStopUrl(columns[7].trim());

        Integer locType = null;
        if(StringUtils.isNotEmpty(columns[8])){
            locType = Integer.parseInt(columns[8].trim());
        }

        stops.setLocationType(locType);

        Integer parentStation = null;
        if(StringUtils.isNotEmpty(columns[9])){
            parentStation = Integer.parseInt(columns[9].trim());
        }
        stops.setParentStation(parentStation);

        stops.setStopTimezone(columns[10].trim());

        Integer wheelcharBoarding = null;
        if(StringUtils.isNotEmpty(columns[11])){
            wheelcharBoarding = Integer.parseInt(columns[11].trim());
        }
        stops.setWheelchairBoarding(wheelcharBoarding);

    }
}
