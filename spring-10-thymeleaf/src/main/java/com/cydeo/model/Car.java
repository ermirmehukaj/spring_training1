package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    private String make;
    private String name;
    private int year;
    private String color;
    private boolean electric;
    private String company;

}
