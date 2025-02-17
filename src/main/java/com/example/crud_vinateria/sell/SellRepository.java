package com.example.crud_vinateria.sell;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "sell", path = "sell")
public interface SellRepository extends CrudRepository<Sell, Long>, PagingAndSortingRepository<Sell, Long>  {
    
}


