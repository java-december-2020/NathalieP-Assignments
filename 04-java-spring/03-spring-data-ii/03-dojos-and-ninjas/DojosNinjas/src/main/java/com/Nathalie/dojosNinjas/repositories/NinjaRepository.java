package com.Nathalie.dojosNinjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Nathalie.dojosNinjas.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long>{
	List<Ninja> findAll();
}