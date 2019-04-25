package com.shtohryn.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

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
    @ManyToOne
    @JoinColumn(name = "department_name", referencedColumnName = "department_name", nullable = false)
    private Department department;

    public EmployeeEntity() {
    }

    public EmployeeEntity(String surName, String name, String rank, Integer salary, Department department) {
        this.surName = surName;
        this.name = name;
        this.rank = rank;
        this.salary = salary;
        this.department = department;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeEntity)) return false;
        EmployeeEntity that = (EmployeeEntity) o;
        return getSurName().equals(that.getSurName()) &&
                getName().equals(that.getName()) &&
                getRank().equals(that.getRank()) &&
                getSalary().equals(that.getSalary()) &&
                getDepartment().equals(that.getDepartment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSurName(), getName(), getRank(), getSalary(), getDepartment());
    }
}
