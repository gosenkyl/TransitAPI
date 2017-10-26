package com.gosenk.transit.api.resource;

import com.gosenk.transit.api.entity.FareRules;
import com.gosenk.transit.api.service.FareRulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("farerules")
public class FareRulesResource {

    @Autowired
    private FareRulesService service;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<FareRules>> getAll(){
        try {
            return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<FareRules>(), HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public FareRules getById(@PathVariable String id){
        return service.findById(id);
    }
}
