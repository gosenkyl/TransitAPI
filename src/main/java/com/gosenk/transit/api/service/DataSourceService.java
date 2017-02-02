package com.gosenk.transit.api.service;

import com.gosenk.transit.api.dataprocess.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataSourceService {

    @Autowired
    private AgencyProcess agencyProcess;
    @Autowired
    private CalendarProcess calendarProcess;
    @Autowired
    private CalendarDatesProcess calendarDatesProcess;
    @Autowired
    private FareAttributesProcess fareAttributesProcess;
    @Autowired
    private FareRulesProcess fareRulesProcess;
    @Autowired
    private FeedInfoProcess feedInfoProcess;
    @Autowired
    private RoutesProcess routesProcess;
    @Autowired
    private ShapesProcess shapesProcess;
    @Autowired
    private StopsProcess stopsProcess;
    @Autowired
    private StopTimesProcess stopTimesProcess;
    @Autowired
    private TripsProcess tripsProcess;

    public String update() throws Exception {
        // Dev Only or Emergency through resource later
        boolean forceUpdate = true;

        // Check sum of files
        boolean updateFound = false;

        if(forceUpdate == true || updateFound == true){
            return processUpdate();
        }

        return "No Update Necessary";
    }

    public String processUpdate() throws Exception{
        // Drop Table Data

        // Kill and fill new data
        return getData();
    }

    public String getData() throws Exception {
        StringBuffer sb = new StringBuffer();

        sb.append(agencyProcess.process());
        sb.append("\n");
        sb.append(calendarProcess.process());
        sb.append("\n");
        sb.append(calendarDatesProcess.process());
        sb.append("\n");
        sb.append(fareAttributesProcess.process());
        sb.append("\n");
        sb.append(fareRulesProcess.process());
        sb.append("\n");
        sb.append(feedInfoProcess.process());
        sb.append("\n");
        sb.append(routesProcess.process());
        sb.append("\n");
        sb.append(shapesProcess.process());
        sb.append("\n");
        sb.append(stopsProcess.process());
        sb.append("\n");
        sb.append(stopTimesProcess.process());
        sb.append("\n");
        sb.append(tripsProcess.process());
        sb.append("\n");

        return sb.toString();
    }
}