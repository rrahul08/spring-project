package com.rahul.springproject.examples.c1;

import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.util.Arrays;
@Component
public class BusinessCalculationService {
    private DataService dataService;

    public BusinessCalculationService(DataService dataService) {
        super();
        this.dataService = dataService;
    }


    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
