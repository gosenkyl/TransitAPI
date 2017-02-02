package com.gosenk.transit.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "feed_info")
public class FeedInfo extends BaseEntity {

    @Id
    @Column(name = "feed_info_id")
    private String feedInfoId;
    @Column(name = "feed_publisher_name")
    private String feedPublisherName;
    @Column(name = "feed_publisher_url")
    private String feedPublisherUrl;
    @Column(name = "feed_lang")
    private String feedLang;
    @Column(name = "feed_start_date")
    private Date feedStartDate;
    @Column(name = "feed_end_date")
    private Date feedEndDate;
    @Column(name = "feed_version")
    private String feedVersion;

    public String getFeedInfoId() {
        return feedInfoId;
    }

    public void setFeedInfoId(String feedInfoId) {
        this.feedInfoId = feedInfoId;
    }

    public String getFeedPublisherName() {
        return feedPublisherName;
    }

    public void setFeedPublisherName(String feedPublisherName) {
        this.feedPublisherName = feedPublisherName;
    }

    public String getFeedPublisherUrl() {
        return feedPublisherUrl;
    }

    public void setFeedPublisherUrl(String feedPublisherUrl) {
        this.feedPublisherUrl = feedPublisherUrl;
    }

    public String getFeedLang() {
        return feedLang;
    }

    public void setFeedLang(String feedLang) {
        this.feedLang = feedLang;
    }

    public Date getFeedStartDate() {
        return feedStartDate;
    }

    public void setFeedStartDate(Date feedStartDate) {
        this.feedStartDate = feedStartDate;
    }

    public Date getFeedEndDate() {
        return feedEndDate;
    }

    public void setFeedEndDate(Date feedEndDate) {
        this.feedEndDate = feedEndDate;
    }

    public String getFeedVersion() {
        return feedVersion;
    }

    public void setFeedVersion(String feedVersion) {
        this.feedVersion = feedVersion;
    }
}
