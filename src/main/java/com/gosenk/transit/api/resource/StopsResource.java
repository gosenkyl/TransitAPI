package com.gosenk.transit.api.resource;

import com.gosenk.transit.api.entity.Stops;
import com.gosenk.transit.api.service.StopsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("stops")
public class StopsResource {

    @Autowired
    private StopsService service;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Stops>> getAll(){
        try {
            return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<Stops>(), HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Stops getById(@PathVariable String id){
        return service.findById(id);
    }
}
