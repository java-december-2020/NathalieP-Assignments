package com.Nathalie.dojosNinjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Nathalie.dojosNinjas.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long>{
	List<Dojo> findAll();
}