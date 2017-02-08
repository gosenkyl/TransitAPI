package com.gosenk.transit.api.dataprocess;

import com.gosenk.transit.api.entity.FeedInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

@Component
public class FeedInfoProcess extends DataProcessor implements BaseDataProcess {

    public FeedInfoProcess(){
        super("FeedInfo", "feed_info.txt", "feed_publisher_name,feed_publisher_url,feed_lang,feed_start_date,feed_end_date,feed_version");
    }

    @Override
    public void processData(String[] columns) throws Exception{

        FeedInfo feedInfo = new FeedInfo();

        feedInfo.setId(UUID.randomUUID().toString());
        feedInfo.setFeedPublisherName(columns[0].trim());
        feedInfo.setFeedPublisherUrl(columns[1].trim());
        feedInfo.setFeedLang(columns[2].trim());

        String startDateStr = columns[3].trim();
        Date startDate = null;
        if(StringUtils.isNotEmpty(startDateStr)){
            startDate = sdf.parse(startDateStr);
        }

        String endDateStr = columns[4].trim();
        Date endDate = null;
        if(StringUtils.isNotEmpty(endDateStr)){
            endDate = sdf.parse(endDateStr);
        }

        feedInfo.setFeedStartDate(startDate);
        feedInfo.setFeedEndDate(endDate);
        feedInfo.setFeedVersion(columns[5].trim());

    }
}
