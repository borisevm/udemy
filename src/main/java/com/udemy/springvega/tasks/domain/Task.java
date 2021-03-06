package com.udemy.springvega.tasks.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Task {
	
	@Id
	@GeneratedValue
	@JsonFormat
	private Long id;
	@JsonFormat
	private String name;
	@JsonFormat(pattern = "MM/dd/yyyy")
	private LocalDate dueDate;
	@JsonFormat
	private Boolean completed;
	
	
	public Task(Long id, String name, LocalDate dueDate, Boolean completed) {
		super();
		this.id = id;
		this.name = name;
		this.dueDate = dueDate;
		this.completed = completed;
	}
	
	
	public Task() {
		
	}

	
	

}
