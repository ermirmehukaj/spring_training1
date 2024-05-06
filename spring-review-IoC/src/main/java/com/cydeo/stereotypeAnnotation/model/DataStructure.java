package com.cydeo.stereotypeAnnotation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataStructure {

    private ExtraHours extraHours;

    public void getTotalHours0(){
        System.out.println("Total hours " +(10 + extraHours.getHours()));

    }
}
