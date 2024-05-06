package com.cydeo.bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class RandomConfig {
    @Bean
    @Primary
    public String printString(){
        return "Welcome to Cydeo";
    }
    @Bean
    public String printString2(){

        return "Spring Core Practice";
    }
}
