package com.gosenk.transit.api.dataprocess;

import com.gosenk.transit.api.entity.Shapes;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class ShapesProcess extends DataProcessor implements BaseDataProcess {

    public ShapesProcess(){
        super("Shapes", "shapes.txt", "shape_id,shape_pt_lat,shape_pt_lon,shape_pt_sequence,shape_dist_traveled");
    }

    @Override
    public void processData(String[] columns) throws Exception{

        Shapes shapes = new Shapes();
        shapes.setId(columns[0].trim());

        Double shapePtLat = null;
        if(StringUtils.isNotEmpty(columns[1])){
            shapePtLat = Double.parseDouble(columns[1].trim());
        }

        Double shapePtLon = null;
        if(StringUtils.isNotEmpty(columns[2])){
            shapePtLon = Double.parseDouble(columns[2].trim());
        }

        shapes.setShapePtLat(shapePtLat);
        shapes.setShapePtLon(shapePtLon);

        Integer shapePtSeq = null;
        if(StringUtils.isNotEmpty(columns[3])){
            shapePtSeq = Integer.parseInt(columns[3].trim());
        }
        shapes.setShapePtSequence(shapePtSeq);

        Double shapeDistTraveled = null;
        if(StringUtils.isNotEmpty(columns[4])){
            shapeDistTraveled = Double.parseDouble(columns[4]);
        }

        shapes.setShapeDistTraveled(shapeDistTraveled);

    }
}
