package com.gosenk.transit.api.service;

import com.gosenk.transit.api.entity.Calendar;
import com.gosenk.transit.api.entity.StopTimes;
import com.gosenk.transit.api.repository.StopTimesRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.SqlResultSetMapping;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Exchanger;

@Service
public class StopTimesServiceImpl extends BaseServiceImpl<StopTimes, StopTimesRepository> implements StopTimesService{

    @Autowired
    public StopTimesServiceImpl(StopTimesRepository repository) {
        super(repository);
    }

    @Autowired
    public EntityManager entityManager;

    @Override
    public List<StopTimes> getByRouteStopDate(String routeId, String stopId, String date) {
        List<StopTimes> stopTimes = new ArrayList<>();

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            java.util.Calendar cal = java.util.Calendar.getInstance();
            cal.setTime(sdf.parse(date));

            int dayOfWeek = cal.get(java.util.Calendar.DAY_OF_WEEK);

            String day;

            switch(dayOfWeek){
                case 1:
                    day = "sunday";
                    break;
                case 2:
                    day = "monday";
                    break;
                case 3:
                    day = "tuesday";
                    break;
                case 4:
                    day = "wednesday";
                    break;
                case 5:
                    day = "thursday";
                    break;
                case 6:
                    day = "friday";
                    break;
                case 7:
                    day = "saturday";
                    break;
                default:
                    day = "";
                    break;
            }

            if(StringUtils.isEmpty(day)){
                return new ArrayList<>();
            }

            String query = "select distinct st.id, st.trip_id, st.arrival_time, st.departure_time, st.stop_id, st.stop_sequence, " +
                    " st.stop_headsign, st.pickup_type, st.drop_off_type, st.shape_dist_traveled " +
                    "from calendar c " +
                    "inner join trips t on t.service_id = c.service_id " +
                    "inner join stop_times st on st.trip_id = t.id " +
                    "where c.start_date <= :startDate and c.end_date >= :endDate and " + day + " = 1 " +
                    "and t.route_id = :routeId " +
                    "and st.stop_id = :stopId " +
                    "order by arrival_time asc ";

            Query q = entityManager.createNativeQuery(query, StopTimes.class);

            q.setParameter("startDate", date);
            q.setParameter("endDate", date);
            q.setParameter("routeId", routeId);
            q.setParameter("stopId", stopId);

            stopTimes = q.getResultList();
        }catch (Exception e){
            e.printStackTrace();
        }

        return stopTimes;
    }
}
