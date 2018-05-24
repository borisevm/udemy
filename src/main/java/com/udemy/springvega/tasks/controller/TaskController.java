package com.udemy.springvega.tasks.controller;



import org.springframework.web.bind.annotation.*;
import com.udemy.springvega.tasks.domain.Task;
import com.udemy.springvega.tasks.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
	
//	@Autowired
	private TaskService taskService;	
	
	
	public TaskController(TaskService taskService) {		
		this.taskService = taskService;
	}


	@GetMapping(value = {"", "/"})
	public Iterable<Task> list() {
		return this.taskService.list();
	}
	
	@PostMapping("/save")
	public Task saveTask(@RequestBody Task task) {
		return this.taskService.save(task);
	}

}
	