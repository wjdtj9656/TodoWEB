package com.todo.todoWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public ResponseEntity<?> createTodo(@RequestBody TodoDTO todo) throws Exception {
		todoService.createTodo(todo);
		log.info("haha");
		return new ResponseEntity<TodoDTO>(HttpStatus.OK);
	}
	@GetMapping("/")
	public ResponseEntity<?> retrieveTodoList() throws Exception{
		String temporalid ="abc";
		List<TodoDTO> response = todoService.retrieve(temporalid);
		return ResponseEntity.ok().body(response);
	}
	@PutMapping("/")
	public ResponseEntity<?> updateTodoList(@RequestBody TodoDTO todo) throws Exception{
		todoService.updateTodo(todo);
		return new ResponseEntity<TodoDTO>(HttpStatus.OK);
	}
	@DeleteMapping("/")
	public ResponseEntity<?> deleteTodoList() throws Exception{
		todoService.deleteTodo("1234");
		return new ResponseEntity<TodoDTO>(HttpStatus.OK);
	}
}
