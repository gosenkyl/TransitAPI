package com.gosenk.transit.api.dataprocess;

import com.gosenk.transit.api.entity.Route;
import org.springframework.stereotype.Component;

@Component
public class RoutesProcess extends DataProcessor implements BaseDataProcess {

    public RoutesProcess(){
        super("Routes", "routes.txt", "route_id,agency_id,route_short_name,route_long_name,route_desc,route_type,route_url,route_color,route_text_color");
    }

    @Override
    public void processData(String[] columns) throws Exception{

        Route route = new Route();

        route.setRouteId(columns[0].trim());
        route.setAgencyId(columns[1].trim());
        route.setRouteShortName(columns[2].trim());
        route.setRouteLongName(columns[3].trim());
        route.setRouteDesc(columns[4].trim());
        route.setRouteType(columns[5].trim());
        route.setRouteUrl(columns[6].trim());
        route.setRouteColor(columns[7].trim());
        route.setRouteTextColor(columns[8].trim());

    }
}
