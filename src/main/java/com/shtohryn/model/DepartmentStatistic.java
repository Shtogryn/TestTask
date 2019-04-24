package com.shtohryn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "department_statistic", schema = "university")
public class DepartmentStatistic {
    @Column(name = "surname", nullable = false, length = 50)
    private String headOfDepartmentName;
    @Column(name = "assistams_count", nullable = false, length = 50)
    private Integer assistamsCount;
    @Column(name = "professors_count", nullable = false, length = 50)
    private Integer professorsCount;
    @Column(name = "associate_professors_count", nullable = false, length = 50)
    private Integer associateProfessorsCount;
    @Column(name = "average_salary", nullable = false, length = 50)
    private Integer averageSalary;
}
