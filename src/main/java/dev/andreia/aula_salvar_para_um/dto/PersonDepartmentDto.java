package dev.andreia.aula_salvar_para_um.dto;

import dev.andreia.aula_salvar_para_um.entities.Person;

public class PersonDepartmentDto {

    private Long id;
    private String name;
    private Double salary;
    private DepartmentDto department;

    public PersonDepartmentDto() {
    }

    public PersonDepartmentDto(Long id, String name, Double salary, DepartmentDto department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public PersonDepartmentDto(Person person){
        this.id = person.getId();
        this.name = person.getName();
        this.salary = person.getSalary();
        this.department = new DepartmentDto(person.getDepartment());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public DepartmentDto getDepartment() {
        return department;
    }
}
