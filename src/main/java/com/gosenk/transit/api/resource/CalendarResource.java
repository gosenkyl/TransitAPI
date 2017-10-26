package com.gosenk.transit.api.resource;

import com.gosenk.transit.api.entity.Calendar;
import com.gosenk.transit.api.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("calendars")
public class CalendarResource {

    @Autowired
    private CalendarService service;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Calendar>> getAll(){
        try {
            return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<Calendar>(), HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Calendar getById(@PathVariable String id){
        return service.findById(id);
    }
}
