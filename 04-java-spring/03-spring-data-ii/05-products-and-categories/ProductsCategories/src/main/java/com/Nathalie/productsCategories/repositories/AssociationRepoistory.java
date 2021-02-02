package com.Nathalie.productsCategories.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Nathalie.productsCategories.models.Association;

@Repository
public interface AssociationRepoistory extends CrudRepository<Association, Long>{

}