package com.gosenk.transit.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "fare_attributes")
public class FareAttributes extends BaseEntity {

    @Column(name = "fare_id")
    private String fareId;
    @Column(name = "price")
    private Float price;
    @Column(name = "currency_type")
    private String currencyType;
    @Column(name = "payment_method")
    private Integer paymentMethod;
    @Column(name = "transfers")
    private Integer transfers;
    @Column(name = "transfer_duration")
    private Long transferDuration;

    public String getFareId() {
        return fareId;
    }

    public void setFareId(String fareId) {
        this.fareId = fareId;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public Integer getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Integer getTransfers() {
        return transfers;
    }

    public void setTransfers(Integer transfers) {
        this.transfers = transfers;
    }

    public Long getTransferDuration() {
        return transferDuration;
    }

    public void setTransferDuration(Long transferDuration) {
        this.transferDuration = transferDuration;
    }
}
