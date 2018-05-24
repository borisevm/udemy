package com.udemy.springvega.tasks.service;


import com.udemy.springvega.tasks.domain.Task;


public interface TaskService {
	
	Iterable<Task> list();
	
	Task save(Task task);

}
