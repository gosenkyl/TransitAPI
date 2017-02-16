package com.gosenk.transit.api.resource;

import com.gosenk.transit.api.entity.RouteToStop;
import com.gosenk.transit.api.service.RouteToStopServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/routetostops")
@CrossOrigin
public class RouteToStopResource {

    @Autowired
    private RouteToStopServiceImpl service;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<RouteToStop>> getAll(){
        try {
            return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<RouteToStop>(), HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<RouteToStop>> getById(@PathVariable String id){
        return new ResponseEntity<>(service.findByRouteId(id), HttpStatus.OK);
    }

}
