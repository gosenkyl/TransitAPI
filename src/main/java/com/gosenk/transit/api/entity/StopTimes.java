package com.gosenk.transit.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Time;

@Entity
@Table(name = "stop_times")
public class StopTimes extends BaseEntity {

    @Column(name = "trip_id")
    private String tripId;
    @Column(name = "arrival_time")
    private Time arrivalTime;
    @Column(name = "departure_time")
    private Time departureTime;
    @Column(name = "stop_id")
    private String stopId;
    @Column(name = "stop_sequence")
    private Long stopSequence;
    @Column(name = "stop_headsign")
    private String stopHeadsign;
    @Column(name = "pickup_type")
    private Long pickupType;
    @Column(name = "drop_off_type")
    private Long dropOffType;
    @Column(name = "shape_dist_traveled")
    private Double shapeDistTraveled;
    @Column(name = "timepoint")
    private Long timepoint;

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public Time getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Time arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public String getStopId() {
        return stopId;
    }

    public void setStopId(String stopId) {
        this.stopId = stopId;
    }

    public Long getStopSequence() {
        return stopSequence;
    }

    public void setStopSequence(Long stopSequence) {
        this.stopSequence = stopSequence;
    }

    public String getStopHeadsign() {
        return stopHeadsign;
    }

    public void setStopHeadsign(String stopHeadsign) {
        this.stopHeadsign = stopHeadsign;
    }

    public Long getPickupType() {
        return pickupType;
    }

    public void setPickupType(Long pickupType) {
        this.pickupType = pickupType;
    }

    public Long getDropOffType() {
        return dropOffType;
    }

    public void setDropOffType(Long dropOffType) {
        this.dropOffType = dropOffType;
    }

    public Double getShapeDistTraveled() {
        return shapeDistTraveled;
    }

    public void setShapeDistTraveled(Double shapeDistTraveled) {
        this.shapeDistTraveled = shapeDistTraveled;
    }

    public Long getTimepoint() {
        return timepoint;
    }

    public void setTimepoint(Long timepoint) {
        this.timepoint = timepoint;
    }
}
