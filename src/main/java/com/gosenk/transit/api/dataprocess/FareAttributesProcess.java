package com.gosenk.transit.api.dataprocess;

import com.gosenk.transit.api.entity.FareAttributes;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class FareAttributesProcess extends DataProcessor implements BaseDataProcess {

    public FareAttributesProcess(){
        super("FareAttributes", "fare_attributes.txt", "fare_id,price,currency_type,payment_method,transfers,transfer_duration");
    }

    @Override
    public void processData(String[] columns) throws Exception{

        FareAttributes fareAttributes = new FareAttributes();

        fareAttributes.setId(UUID.randomUUID().toString());
        fareAttributes.setFareId(columns[0].trim());

        Float price = StringUtils.isEmpty(columns[1]) ? null : Float.parseFloat(columns[1].trim());
        fareAttributes.setPrice(price);

        fareAttributes.setCurrencyType(columns[2]);

        Integer paymentMethod = StringUtils.isEmpty(columns[3]) ? null : Integer.parseInt(columns[3].trim());
        fareAttributes.setPaymentMethod(paymentMethod);

        Integer transfers = StringUtils.isEmpty(columns[4]) ? null : Integer.parseInt(columns[4].trim());
        fareAttributes.setTransfers(transfers);

        Long transferDuration = StringUtils.isEmpty(columns[5]) ? null : Long.parseLong(columns[5].trim());
        fareAttributes.setTransferDuration(transferDuration);

    }
}
