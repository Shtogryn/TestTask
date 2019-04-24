package com.shtohryn.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "lecturer", schema = "university")
public class EmployeeEntity {
    @Id
    @Column(name = "surname", nullable = false, length = 50)
    private String surName;
    @Column(name = "name", nullable = false, length = 25)
    private String name;
    @Column(name = "rank", nullable = false, length = 50)
    private String rank;
    @Column(name = "salary", nullable = false, length = 50)
    private Integer salary;
    @ManyToMany
    @JoinTable(name = "department_statistic", schema = "university",
            joinColumns = @JoinColumn(name = "surname", referencedColumnName = "surname", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "surname", referencedColumnName = "surname", nullable = false))
    private List<EmployeeEntity> employee;
}
