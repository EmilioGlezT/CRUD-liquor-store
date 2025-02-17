package com.example.crud_vinateria.sell;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "detailSell", path = "detailSell")
public interface DetailSellRepository extends CrudRepository<DetailSell, Long>, PagingAndSortingRepository<DetailSell, Long>  {
    
}