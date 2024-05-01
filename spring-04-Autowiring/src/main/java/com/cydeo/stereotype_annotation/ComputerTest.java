package com.cydeo.stereotype_annotation;

import com.cydeo.stereotype_annotation.config.PcConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {

    public static void main(String[] args) {


        ApplicationContext container = new AnnotationConfigApplicationContext(PcConfig.class);
       PC myPC =  container.getBean(PC.class);

       myPC.powerUp();
        System.out.println(myPC.getTheCase().getDimensions().getDepth());

    }
}
