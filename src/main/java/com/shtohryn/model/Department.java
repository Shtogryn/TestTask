package com.shtohryn.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "department", schema = "university")
public class Department {
    private Collection<EmployeeEntity> lectors;
    @Id
    @Column(name = "department_name", nullable = false, length = 50)
    private String departmentName;

    @OneToMany(mappedBy = "cityByCity")
    public Collection<EmployeeEntity> getPeopleByCity() {
        return lectors;
    }
}
