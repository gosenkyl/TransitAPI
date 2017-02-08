package com.gosenk.transit.api.dataprocess;

import com.gosenk.transit.api.entity.StopTimes;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.util.UUID;

@Component
public class StopTimesProcess extends DataProcessor implements BaseDataProcess {

    public StopTimesProcess(){
        super("StopTimes", "stop_times.txt", "trip_id,arrival_time,departure_time,stop_id,stop_sequence,stop_headsign,pickup_type,drop_off_type,shape_dist_traveled");
    }

    @Override
    public void processData(String[] columns) throws Exception{
        StopTimes stopTimes = new StopTimes();

        stopTimes.setId(UUID.randomUUID().toString());
        stopTimes.setTripId(columns[0].trim());

        String timeStr = columns[1].trim();
        String[] timeParts = timeStr.split(":");

        Time arrivalTime = null;
        if(timeParts.length == 3){
            arrivalTime = new Time(Integer.parseInt(timeParts[0]), Integer.parseInt(timeParts[1]), Integer.parseInt(timeParts[2]));
        }

        timeStr = columns[2].trim();
        timeParts = timeStr.split(":");

        Time departTime = null;
        if(timeParts.length == 3){
            departTime = new Time(Integer.parseInt(timeParts[0]), Integer.parseInt(timeParts[1]), Integer.parseInt(timeParts[2]));
        }

        stopTimes.setArrivalTime(arrivalTime);
        stopTimes.setDepartureTime(departTime);

        stopTimes.setStopId(columns[3].trim());

        String stopSequence = columns[4].trim();
        stopTimes.setStopSequence(StringUtils.isEmpty(stopSequence) ? null : Long.parseLong(stopSequence));
        stopTimes.setStopHeadsign(columns[5].trim());

        String pickupType = columns[6].trim();
        stopTimes.setPickupType(StringUtils.isEmpty(pickupType) ? null : Long.parseLong(pickupType));

        String dropOffType = columns[7].trim();
        stopTimes.setDropOffType(StringUtils.isEmpty(dropOffType) ? null : Long.parseLong(dropOffType));

        String shapeDistTraveled = columns[8].trim();
        stopTimes.setShapeDistTraveled(StringUtils.isEmpty(shapeDistTraveled) ? null : Double.parseDouble(shapeDistTraveled));
    }
}
