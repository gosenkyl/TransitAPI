package com.gosenk.transit.api.service;

import com.gosenk.transit.api.entity.Shapes;
import com.gosenk.transit.api.repository.ShapesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShapesServiceImpl extends BaseServiceImpl<Shapes, ShapesRepository> implements ShapesService{

    @Autowired
    public ShapesServiceImpl(ShapesRepository repository) {
        super(repository);
    }

}
