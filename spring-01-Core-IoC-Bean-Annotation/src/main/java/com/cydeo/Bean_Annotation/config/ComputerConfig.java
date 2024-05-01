package com.cydeo.Bean_Annotation.config;

import com.cydeo.Bean_Annotation.casefactory.Case;
import com.cydeo.Bean_Annotation.casefactory.DellCase;
import com.cydeo.Bean_Annotation.monitorfactory.AcerMonitor;
import com.cydeo.Bean_Annotation.monitorfactory.Monitor;
import com.cydeo.Bean_Annotation.monitorfactory.SonyMonitor;

import com.cydeo.Bean_Annotation.motherboardfactory.AsusMotherboard;
import com.cydeo.Bean_Annotation.motherboardfactory.Motherboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ComputerConfig {

    @Bean(name="sony")
    public Monitor monitorSony(){

        return new SonyMonitor("25 inch Beast","Sony",25);
    }

    @Bean(name="sony2")
    public Monitor monitorSony2(){

        return new SonyMonitor("40 inch Beast","Sony",40);
    }


    @Bean
    @Primary
    public Monitor monitorAcer(){
        return new AcerMonitor("23 inch Beast","Acer",23);
    }


    @Bean
    public Case caseDell(){
        return new DellCase("220B","Dell","240");
    }

    @Bean
    public Motherboard motherboardAsus(){
        return new AsusMotherboard("BJ-200","Asus",4,6,"v2.44");
    }




}