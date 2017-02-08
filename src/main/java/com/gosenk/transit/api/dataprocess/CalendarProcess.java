package com.gosenk.transit.api.dataprocess;

import com.gosenk.transit.api.entity.Calendar;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

@Component
public class CalendarProcess extends DataProcessor implements BaseDataProcess {

    public CalendarProcess(){
        super("Calendar", "calendar.txt", "service_id,monday,tuesday,wednesday,thursday,friday,saturday,sunday,start_date,end_date");
    }

    @Override
    public void processData(String[] columns) throws Exception{

        Calendar cal = new Calendar();
        cal.setId(UUID.randomUUID().toString());
        cal.setServiceId(columns[0].trim());
        cal.setMonday("1".equals(columns[1].trim()));
        cal.setTuesday("1".equals(columns[2].trim()));
        cal.setWednesday("1".equals(columns[3].trim()));
        cal.setThursday("1".equals(columns[4].trim()));
        cal.setFriday("1".equals(columns[5].trim()));
        cal.setSaturday("1".equals(columns[6].trim()));
        cal.setSunday("1".equals(columns[7].trim()));

        String startDateStr = columns[8].trim();
        Date startDate = null;
        if(StringUtils.isNotEmpty(startDateStr)){
            startDate = sdf.parse(startDateStr);
        }

        String endDateStr = columns[9].trim();
        Date endDate = null;
        if(StringUtils.isNotEmpty(endDateStr)){
            endDate = sdf.parse(endDateStr);
        }

        cal.setStartDate(startDate);
        cal.setEndDate(endDate);

    }
}
