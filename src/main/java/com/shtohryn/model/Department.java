package com.shtohryn.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "department", schema = "university")
public class Department {
    private Collection<EmployeeEntity> lectors;
    private Collection<DepartmentStatistic> departments;
    @Id
    @Column(name = "department_name", nullable = false, length = 50)
    private String departmentName;
    @Column(name = "assistams_count", nullable = true, length = 50)
    private Integer assistamsCount;
    @Column(name = "professors_count", nullable = true, length = 50)
    private Integer professorsCount;
    @Column(name = "associate_professors_count", nullable = true, length = 50)
    private Integer associateProfessorsCount;
    @Column(name = "average_salary", nullable = true, length = 50)
    private Integer averageSalary;
    @OneToMany(mappedBy = "department_department_name")
    public Collection<EmployeeEntity> getLectors() {
        return lectors;
    }

    @OneToMany(mappedBy = "university_department_name")
    public Collection<DepartmentStatistic> getDepartmentStatistic() {
        return departments;
    }

    public Department() {
    }

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setLectors(Collection<EmployeeEntity> lectors) {
        this.lectors = lectors;
    }

    public Collection<DepartmentStatistic> getDepartments() {
        return departments;
    }

    public void setDepartments(Collection<DepartmentStatistic> departments) {
        this.departments = departments;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getAssistamsCount() {
        return assistamsCount;
    }

    public void setAssistamsCount(Integer assistamsCount) {
        this.assistamsCount = assistamsCount;
    }

    public Integer getProfessorsCount() {
        return professorsCount;
    }

    public void setProfessorsCount(Integer professorsCount) {
        this.professorsCount = professorsCount;
    }

    public Integer getAssociateProfessorsCount() {
        return associateProfessorsCount;
    }

    public void setAssociateProfessorsCount(Integer associateProfessorsCount) {
        this.associateProfessorsCount = associateProfessorsCount;
    }

    public Integer getAverageSalary() {
        return averageSalary;
    }

    public void setAverageSalary(Integer averageSalary) {
        this.averageSalary = averageSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return Objects.equals(lectors, that.lectors) &&
                Objects.equals(departments, that.departments) &&
                departmentName.equals(that.departmentName) &&
                Objects.equals(assistamsCount, that.assistamsCount) &&
                Objects.equals(professorsCount, that.professorsCount) &&
                Objects.equals(associateProfessorsCount, that.associateProfessorsCount) &&
                Objects.equals(averageSalary, that.averageSalary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lectors, departments, departmentName, assistamsCount, professorsCount,
                associateProfessorsCount, averageSalary);
    }
}
