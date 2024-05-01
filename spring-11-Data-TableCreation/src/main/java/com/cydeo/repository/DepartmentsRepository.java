package com.cydeo.repository;

import com.cydeo.entity.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentsRepository extends JpaRepository<Departments,Integer> {
}
