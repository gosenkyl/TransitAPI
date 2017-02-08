package com.gosenk.transit.api.entity;

import javax.persistence.*;

@Entity
@Table(name = "route_to_stop")
public class RouteToStop extends BaseEntity {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "route_id", insertable = false, updatable = false)
    private Route route;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "stop_id", insertable = false, updatable = false)
    private Stops stop;

    @Column(name = "stop_name")
    private String stopName;

    public Route getRoute() {
        return route;
    }

    public Stops getStop() {
        return stop;
    }

    public String getStopName() {
        return stopName;
    }
}
