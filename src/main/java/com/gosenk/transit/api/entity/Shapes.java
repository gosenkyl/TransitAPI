package com.gosenk.transit.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "shapes")
public class Shapes extends BaseEntity {

    @Column(name = "shape_pt_lat")
    private Double shapePtLat;
    @Column(name = "shape_pt_lon")
    private Double shapePtLon;
    @Column(name = "shape_pt_sequence")
    private Integer shapePtSequence;
    @Column(name = "shape_dist_traveled")
    private Double shapeDistTraveled;

    public Double getShapePtLat() {
        return shapePtLat;
    }

    public void setShapePtLat(Double shapePtLat) {
        this.shapePtLat = shapePtLat;
    }

    public Double getShapePtLon() {
        return shapePtLon;
    }

    public void setShapePtLon(Double shapePtLon) {
        this.shapePtLon = shapePtLon;
    }

    public Integer getShapePtSequence() {
        return shapePtSequence;
    }

    public void setShapePtSequence(Integer shapePtSequence) {
        this.shapePtSequence = shapePtSequence;
    }

    public Double getShapeDistTraveled() {
        return shapeDistTraveled;
    }

    public void setShapeDistTraveled(Double shapeDistTraveled) {
        this.shapeDistTraveled = shapeDistTraveled;
    }
}
