package com.example.ia.restapi.service;

import java.util.List;

public interface AbstractService<T> {

	T findOne(Long id);

	List<T> findAll();
	
	T save(T t);
	
	void delete(T t);
	
}
