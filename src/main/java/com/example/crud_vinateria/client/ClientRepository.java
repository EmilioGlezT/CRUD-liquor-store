package com.example.crud_vinateria.client;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "client", path = "client")
public interface ClientRepository extends CrudRepository<Client, Long>, PagingAndSortingRepository<Client, Long>  {
    
}
