package com.udemy.springvega.tasks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.springvega.tasks.domain.Task;
import com.udemy.springvega.tasks.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService{

//	@Autowired
	private TaskRepository taskRepository;
	
	public TaskServiceImpl(TaskRepository taskRepository) {		
		this.taskRepository = taskRepository;
	} 
	
	@Override
	public Iterable<Task> list() {
		// TODO Auto-generated method stub
		return this.taskRepository.findAll();
	}

	@Override
	public Task save(Task task) {
		// TODO Auto-generated method stub
		return this.taskRepository.save(task);
	}	
	

}
