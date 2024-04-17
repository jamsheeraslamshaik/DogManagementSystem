package com.shaikClasses.DMS.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.shaikClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);
}