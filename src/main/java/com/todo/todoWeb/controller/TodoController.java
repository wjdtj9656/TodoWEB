package com.todo.todoWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.todo.todoWeb.dto.ResponseDTO;
import com.todo.todoWeb.dto.TodoDTO;
import com.todo.todoWeb.service.TodoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("todo")
public class TodoController {

	TodoService todoService;
	@Autowired
	public TodoController(TodoService todoServcie) {
		this.todoService = todoServcie;
	}
	
	@PostMapping("/")
	@ResponseBody
	public ResponseEntity<TodoDTO> createTodo(@RequestBody TodoDTO todo) throws Exception {
		todoService.createTodo(todo);
		log.warn("haha");
		return new ResponseEntity<TodoDTO>(HttpStatus.OK);
	}
	@GetMapping("/b")
	@ResponseBody
	public String hi2() {
		return"haha2";
	}
}
