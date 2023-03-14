package com.adejumo.ReactJS.SpringBoot.CRUD.Application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @jakarta.persistence.Id
    private Long Id;
    private String name;
    private String email;

    private String address;
}
