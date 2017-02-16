package com.gosenk.transit.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "stops")
public class Stops extends BaseEntity {

    @Column(name = "stop_code")
    private String stopCode;
    @Column(name = "stop_name")
    private String stopName;
    @Column(name = "stop_desc")
    private String stopDesc;
    @Column(name = "stop_lat")
    private Double stopLat;
    @Column(name = "stop_lon")
    private Double stopLon;
    @Column(name = "zone_id")
    private String zoneId;
    @Column(name = "stop_url")
    private String stopUrl;
    @Column(name = "location_type")
    private Integer locationType;
    @Column(name = "parent_station")
    private Integer parentStation;
    @Column(name = "stop_timezone")
    private String stopTimezone;
    @Column(name = "wheelchair_boarding")
    private Integer wheelchairBoarding;

    public String getStopCode() {
        return stopCode;
    }

    public void setStopCode(String stopCode) {
        this.stopCode = stopCode;
    }

    public String getStopName() {
        return stopName == null ? null : stopName.toLowerCase();
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public String getStopDesc() {
        return stopDesc;
    }

    public void setStopDesc(String stopDesc) {
        this.stopDesc = stopDesc;
    }

    public Double getStopLat() {
        return stopLat;
    }

    public void setStopLat(Double stopLat) {
        this.stopLat = stopLat;
    }

    public Double getStopLon() {
        return stopLon;
    }

    public void setStopLon(Double stopLon) {
        this.stopLon = stopLon;
    }

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getStopUrl() {
        return stopUrl;
    }

    public void setStopUrl(String stopUrl) {
        this.stopUrl = stopUrl;
    }

    public Integer getLocationType() {
        return locationType;
    }

    public void setLocationType(Integer locationType) {
        this.locationType = locationType;
    }

    public Integer getParentStation() {
        return parentStation;
    }

    public void setParentStation(Integer parentStation) {
        this.parentStation = parentStation;
    }

    public String getStopTimezone() {
        return stopTimezone;
    }

    public void setStopTimezone(String stopTimezone) {
        this.stopTimezone = stopTimezone;
    }

    public Integer getWheelchairBoarding() {
        return wheelchairBoarding;
    }

    public void setWheelchairBoarding(Integer wheelchairBoarding) {
        this.wheelchairBoarding = wheelchairBoarding;
    }
}
