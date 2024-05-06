package com.cydeo;

import com.cydeo.bean_practice.ConfigEmployee;
import com.cydeo.bean_practice.FullTimeEmployee;
import com.cydeo.bean_practice.ParTimeEmployee;
import com.cydeo.bean_practice.RandomConfig;
import com.cydeo.stereotypeAnnotation.config.ConfigApp;
import com.cydeo.stereotypeAnnotation.model.DataStructure;
import com.cydeo.stereotypeAnnotation.model.MicroService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.print.DocFlavor;

public class EmployeeMain {

    public static void main(String[] args) {


//        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigEmployee.class, RandomConfig.class);
//
//        FullTimeEmployee fullTimeEmployee = container.getBean(FullTimeEmployee.class);
//       ParTimeEmployee parTimeEmployee =  container.getBean(ParTimeEmployee.class);
//
//       fullTimeEmployee.createAccount2();
//       parTimeEmployee.createAccount();
//      String str1 =  container.getBean("printString", String.class);
//        String str2 =  container.getBean("printString2", String.class);
//        System.out.println(str1);
//        System.out.println(str2);


        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);
        DataStructure dataStructure = container.getBean(DataStructure.class);
        MicroService microService = container.getBean(MicroService.class);

        dataStructure.getTotalHours0();
        microService.getTotalHours();
    }
}
