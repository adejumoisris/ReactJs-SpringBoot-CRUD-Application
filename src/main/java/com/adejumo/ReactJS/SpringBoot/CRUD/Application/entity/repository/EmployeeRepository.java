package com.adejumo.ReactJS.SpringBoot.CRUD.Application.entity.repository;

import com.adejumo.ReactJS.SpringBoot.CRUD.Application.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
