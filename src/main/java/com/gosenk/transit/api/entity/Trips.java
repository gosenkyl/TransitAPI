package com.gosenk.transit.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "trips")
public class Trips extends BaseEntity {

    @Column(name = "route_id")
    private String routeId;
    @Column(name = "service_id")
    private String serviceId;
    @Column(name = "trip_headsign")
    private String tripHeadsign;
    @Column(name = "trip_short_name")
    private String tripShortName;
    @Column(name = "direction_id")
    private Integer directionId;
    @Column(name = "block_id")
    private String blockId;
    @Column(name = "shape_id")
    private String shapeId;
    @Column(name = "wheelchair_accessible")
    private Integer wheelchairAccessible;
    @Column(name = "bikes_allowed")
    private Integer bikesAllowed;

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getTripHeadsign() {
        return tripHeadsign;
    }

    public void setTripHeadsign(String tripHeadsign) {
        this.tripHeadsign = tripHeadsign;
    }

    public String getTripShortName() {
        return tripShortName;
    }

    public void setTripShortName(String tripShortName) {
        this.tripShortName = tripShortName;
    }

    public Integer getDirectionId() {
        return directionId;
    }

    public void setDirectionId(Integer directionId) {
        this.directionId = directionId;
    }

    public String getBlockId() {
        return blockId;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    public String getShapeId() {
        return shapeId;
    }

    public void setShapeId(String shapeId) {
        this.shapeId = shapeId;
    }

    public Integer getWheelchairAccessible() {
        return wheelchairAccessible;
    }

    public void setWheelchairAccessible(Integer wheelchairAccessible) {
        this.wheelchairAccessible = wheelchairAccessible;
    }

    public Integer getBikesAllowed() {
        return bikesAllowed;
    }

    public void setBikesAllowed(Integer bikesAllowed) {
        this.bikesAllowed = bikesAllowed;
    }
}
