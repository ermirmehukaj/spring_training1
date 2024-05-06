package com.cydeo.stereotypeAnnotation.model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class ExtraHours {

    public int getHours(){
        return 10;
    }
}
