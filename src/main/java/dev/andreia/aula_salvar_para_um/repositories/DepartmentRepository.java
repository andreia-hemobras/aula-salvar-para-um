package dev.andreia.aula_salvar_para_um.repositories;

import dev.andreia.aula_salvar_para_um.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
