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

    @Column(name = "direction_id")
    private Integer directionId;

    @Column(name = "stop_sequence")
    private Integer stopSequence;

    public Route getRoute() {
        return route;
    }

    public Stops getStop() {
        return stop;
    }

    public Integer getDirectionId() {
        return directionId;
    }

    public Integer getStopSequence() {
        return stopSequence;
    }
}
