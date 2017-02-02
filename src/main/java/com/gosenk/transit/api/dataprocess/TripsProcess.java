package com.gosenk.transit.api.dataprocess;

import com.gosenk.transit.api.entity.Agency;
import com.gosenk.transit.api.entity.Trips;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TripsProcess extends DataProcessor implements BaseDataProcess {

    public TripsProcess(){
        super("Trips", "trips.txt", "route_id,service_id,trip_id,trip_headsign,trip_short_name,direction_id,block_id,shape_id,wheelchair_accessible,bikes_allowed");
    }

    @Override
    public void processData(String[] columns) throws Exception{

        Trips trips = new Trips();

        trips.setRouteId(columns[0].trim());
        trips.setServiceId(columns[1].trim());
        trips.setTripsId(columns[2].trim());
        trips.setTripHeadsign(columns[3].trim());
        trips.setTripShortName(columns[4].trim());

        Integer directionId = null;
        if(StringUtils.isNotEmpty(columns[5])){
            directionId = Integer.parseInt(columns[5].trim());
        }
        trips.setDirectionId(directionId);

        trips.setBlockId(columns[6].trim());
        trips.setShapeId(columns[7].trim());

        Integer wheelchairAccessible = null;
        if(StringUtils.isNotEmpty(columns[8])){
            wheelchairAccessible = Integer.parseInt(columns[8].trim());
        }

        Integer bikesAllowed = null;
        if(StringUtils.isNotEmpty(columns[9])){
            bikesAllowed = Integer.parseInt(columns[9].trim());
        }

        trips.setWheelchairAccessible(wheelchairAccessible);
        trips.setBikesAllowed(bikesAllowed);

    }
}
