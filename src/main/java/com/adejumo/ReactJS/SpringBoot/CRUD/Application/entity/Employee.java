package com.adejumo.ReactJS.SpringBoot.CRUD.Application.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "first_names")
    private String firstName;
    @Column(name = "last_names")
    private String lastName;
    @Column(name = "email_ids")

    private String emailId;

}
