package com.gosenk.transit.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "calendar_dates")
public class CalendarDates extends BaseEntity {

    @Id
    @Column(name = "calendar_dates_id")
    private String calendarDatesId;
    @Column(name = "service_id")
    private String serviceId;
    @Column(name = "date")
    private Date date;
    @Column(name = "exception_type")
    private int exceptionType;

    public String getCalendarDatesId() {
        return calendarDatesId;
    }

    public void setCalendarDatesId(String calendarDatesId) {
        this.calendarDatesId = calendarDatesId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(int exceptionType) {
        this.exceptionType = exceptionType;
    }
}
