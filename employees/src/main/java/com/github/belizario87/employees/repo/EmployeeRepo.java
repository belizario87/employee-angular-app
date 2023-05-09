package com.github.belizario87.employees.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.belizario87.employees.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    Optional<Employee> findEmployeeById(Long id);

}
