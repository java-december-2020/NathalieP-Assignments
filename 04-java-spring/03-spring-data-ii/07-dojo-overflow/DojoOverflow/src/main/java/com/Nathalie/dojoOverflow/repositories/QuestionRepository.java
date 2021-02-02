package com.Nathalie.dojoOverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Nathalie.dojoOverflow.models.Question;

public interface QuestionRepository extends CrudRepository<Question, Long>{
	List<Question> findAll();
}