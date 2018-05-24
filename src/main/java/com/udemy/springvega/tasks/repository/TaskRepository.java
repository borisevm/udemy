package com.udemy.springvega.tasks.repository;

import org.springframework.data.repository.CrudRepository;

import com.udemy.springvega.tasks.domain.Task;

public interface TaskRepository extends CrudRepository<Task, Long>{

}
