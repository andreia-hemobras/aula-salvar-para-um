package dev.andreia.aula_salvar_para_um.dto;

import dev.andreia.aula_salvar_para_um.entities.Person;

public class PersonDto {

    private Long id;
    private String name;
    private Double salary;
    private Long departmentId;

    public PersonDto() {
    }

    public PersonDto(Long id, String name, Double salary, Long departmentId) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departmentId = departmentId;
    }

    public PersonDto(Person person){
        this.id = person.getId();
        this.name = person.getName();
        this.salary = person.getSalary();
        this.departmentId = person.getDepartment().getId();
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

    public Long getDepartmentId() {
        return departmentId;
    }
}
