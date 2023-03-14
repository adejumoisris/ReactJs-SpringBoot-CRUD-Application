package com.adejumo.ReactJS.SpringBoot.CRUD.Application.repository;

import com.adejumo.ReactJS.SpringBoot.CRUD.Application.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
