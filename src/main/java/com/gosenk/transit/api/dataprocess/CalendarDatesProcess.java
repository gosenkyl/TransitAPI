package com.gosenk.transit.api.dataprocess;

import com.gosenk.transit.api.entity.CalendarDates;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

@Component
public class CalendarDatesProcess extends DataProcessor implements BaseDataProcess {

    public CalendarDatesProcess(){
        super("CalendarDates", "calendar_dates.txt", "service_id,date,exception_type");
    }

    @Override
    public void processData(String[] columns) throws Exception{
        CalendarDates calendarDates = new CalendarDates();

        calendarDates.setCalendarDatesId(UUID.randomUUID().toString());
        calendarDates.setServiceId(columns[0].trim());

        String dateStr = columns[1].trim();
        Date date = null;
        if(StringUtils.isNotEmpty(dateStr)){
            date = sdf.parse(dateStr);
        }

        calendarDates.setDate(date);

        calendarDates.setExceptionType(Integer.parseInt(columns[2].trim()));
    }
}
