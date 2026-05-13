package dev.andreia.aula_salvar_para_um.controllers;

import dev.andreia.aula_salvar_para_um.dto.PersonDepartmentDto;
import dev.andreia.aula_salvar_para_um.dto.PersonDto;
import dev.andreia.aula_salvar_para_um.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/people")
public class PersonController {

    @Autowired
    private PersonService service;

    @PostMapping(value = "/personDepartmentDto")
    public ResponseEntity<PersonDepartmentDto> insert(@RequestBody PersonDepartmentDto dto){
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(dto.getId())
                .toUri();

        return ResponseEntity.created(uri).body(dto);

    }

    @PostMapping(value = "/personDto")
    public ResponseEntity<PersonDto> insert(@RequestBody PersonDto dto){
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(dto.getId())
                .toUri();

        return ResponseEntity.created(uri).body(dto);
    }
}
