package com.cydeo;


import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QueryDemo implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;


    public QueryDemo(RegionRepository regionRepository, DepartmentRepository departmentRepository) {
        this.regionRepository = regionRepository;

        this.departmentRepository = departmentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("-----------REGIONS-----------");

        System.out.println("findByCountry:" + regionRepository.findByCountry("Canada"));
        System.out.println("findByCountry:" + regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountry:" + regionRepository.findByCountryContainingOrderByRegion("United"));
        System.out.println("findByCountry:" + regionRepository.findTop2ByCountry("United States"));
        System.out.println("findByCountry:" + regionRepository.findTopByCountryContainsOrderByRegion("United States"));


        System.out.println("-----------Department-----------");

        System.out.println("find by department " + departmentRepository.findByDepartment("Furniture"));
        System.out.println("find by division" + departmentRepository.findByDivision("Health"));
        System.out.println("find by division ends with" + departmentRepository.findByDivisionEndingWith("ics"));
        System.out.println("find by division top 3 division contains" + departmentRepository.findDistinctTop3ByDivisionContains("Hea"));

    }
}