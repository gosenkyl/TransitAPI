package com.gosenk.transit.api.resource;

import com.gosenk.transit.api.entity.StopTimes;
import com.gosenk.transit.api.service.StopTimesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping( value = "api/stoptimes", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class StopTimesResource {

    @Autowired
    private StopTimesService service;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<StopTimes>> getAll(@RequestParam Map<String, String> requestParams){
        try {
            String routeId = requestParams.get("routeId");
            String stopId = requestParams.get("stopId");
            String date = requestParams.get("date");

            List<StopTimes> stopTimes;
            if(requestParams.size() == 0 || routeId == null || stopId == null || date == null){
                stopTimes = service.findAll();
            } else {
                stopTimes = service.getByRouteStopDate(routeId, stopId, date);
            }

            return new ResponseEntity<>(stopTimes, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<StopTimes>(), HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public StopTimes getById(@PathVariable String id){
        return service.findById(id);
    }
}
