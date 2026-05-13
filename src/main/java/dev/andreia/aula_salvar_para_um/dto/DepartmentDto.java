package dev.andreia.aula_salvar_para_um.dto;

import dev.andreia.aula_salvar_para_um.entities.Department;

public class DepartmentDto {

    private Long id;
    private String name;

    public DepartmentDto() {
    }

    public DepartmentDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public DepartmentDto(Department department) {
        this.id = department.getId();
        this.name = department.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
