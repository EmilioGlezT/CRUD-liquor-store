package com.example.crud_vinateria.employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "employee", path = "employee")
public interface EmployeeRepository extends CrudRepository<Employee, Long>, PagingAndSortingRepository<Employee, Long>  {
    
}
