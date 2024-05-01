package com.cydeo.bootstrap;

import com.cydeo.entity.Car;
import com.cydeo.entity.Departments;
import com.cydeo.entity.Employee;
import com.cydeo.entity.Employees;
import com.cydeo.enums.Gender;
import com.cydeo.repository.CarRepository;
import com.cydeo.repository.DepartmentsRepository;
import com.cydeo.repository.EmployeesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {

    private final CarRepository carRepository;
    private final DepartmentsRepository departmentsRepository;
    private final EmployeesRepository employeesRepository;

    public DataGenerator(CarRepository carRepository, DepartmentsRepository departmentsRepository, EmployeesRepository employeesRepository) {
        this.carRepository = carRepository;
        this.departmentsRepository = departmentsRepository;
        this.employeesRepository = employeesRepository;
    }


    @Override
    public void run(String... args) throws Exception {


        Car c1 = new Car("BMW","M3");
        Car c2 = new Car("Honda","Civic");
        Car c3 = new Car("Toyota","Corolla");

        carRepository.save(c1);
        carRepository.save(c2);
        carRepository.save(c3);

        Employees e1 = new Employees("Berrie", "Manueau", "bmanueau0@dion.ne.jp", LocalDate.of(2006,04,20), Gender.FEMALE, 2500);
        Employees e2 = new Employees("Aeriell", "McNee", "amcnee1@google.es", LocalDate.of(2009,01,26),Gender.FEMALE, 2500);
        Employees e3 = new Employees("Sydney", "Symonds", "ssymonds2@hhs.gov", LocalDate.of(2010,05,17), Gender.FEMALE, 2500);
        Employees e4 = new Employees("Avrom", "Rowantree", null, LocalDate.of(2014,03,02), Gender.MALE, 2500);
        Employees e5 = new Employees("Feliks", "Morffew", "fmorffew4@a8.net", LocalDate.of(2003,01,14), Gender.MALE, 2500);

        Departments d1 = new Departments("Sports", "Outdoors");
        Departments d2 = new Departments("Tools", "Hardware");
        Departments d3 = new Departments("Clothing", "Home");
        Departments d4 = new Departments("Phones & Tablets", "Electronics");
        Departments d5 = new Departments("Computers", "Electronics");


        List<Employees> list = new ArrayList<>();
        List<Departments> list1 = new ArrayList<>();

        list.addAll(Arrays.asList(e1,e2,e3,e4,e5));
        list1.addAll(Arrays.asList(d1,d2,d3,d4,d5));

        employeesRepository.saveAll(list);
        departmentsRepository.saveAll(list1);


    }
}
