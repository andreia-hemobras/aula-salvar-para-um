package dev.andreia.aula_salvar_para_um.services;

import dev.andreia.aula_salvar_para_um.dto.PersonDepartmentDto;
import dev.andreia.aula_salvar_para_um.dto.PersonDto;
import dev.andreia.aula_salvar_para_um.entities.Department;
import dev.andreia.aula_salvar_para_um.entities.Person;
import dev.andreia.aula_salvar_para_um.repositories.DepartmentRepository;
import dev.andreia.aula_salvar_para_um.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public PersonDepartmentDto insert(PersonDepartmentDto dto){
        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

        Department department = departmentRepository.getReferenceById(dto.getDepartment().getId());
        entity.setDepartment(department);

        personRepository.save(entity);
        return new PersonDepartmentDto(entity);
    }

    public PersonDto insert(PersonDto dto){
        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

        Department department = departmentRepository.getReferenceById(dto.getDepartmentId());
        entity.setDepartment(department);

        personRepository.save(entity);
        return new PersonDto(entity);
    }

}
