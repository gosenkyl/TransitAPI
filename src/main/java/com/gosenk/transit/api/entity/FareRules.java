package com.gosenk.transit.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fare_rules")
public class FareRules extends BaseEntity {

    @Id
    @Column(name = "fare_rules_id")
    private String fareRulesId;
    @Column(name = "fare_id")
    private String fareId;
    @Column(name = "route_id")
    private String routeId;
    @Column(name = "origin_id")
    private String originId;
    @Column(name = "destination_id")
    private String destinationId;
    @Column(name = "contains_id")
    private String containsId;

    public String getFareRulesId() {
        return fareRulesId;
    }

    public void setFareRulesId(String fareRulesId) {
        this.fareRulesId = fareRulesId;
    }

    public String getFareId() {
        return fareId;
    }

    public void setFareId(String fareId) {
        this.fareId = fareId;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getOriginId() {
        return originId;
    }

    public void setOriginId(String originId) {
        this.originId = originId;
    }

    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public String getContainsId() {
        return containsId;
    }

    public void setContainsId(String containsId) {
        this.containsId = containsId;
    }
}
