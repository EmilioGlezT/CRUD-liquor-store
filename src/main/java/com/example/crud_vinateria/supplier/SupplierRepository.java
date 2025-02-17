package com.example.crud_vinateria.supplier;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "supplier", path = "supplier")
public interface SupplierRepository extends CrudRepository<Supplier, Long>, PagingAndSortingRepository<Supplier, Long>  {
    
}
