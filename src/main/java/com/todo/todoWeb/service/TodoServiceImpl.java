package com.todo.todoWeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.todoWeb.dto.TodoDTO;
import com.todo.todoWeb.mapper.TodoMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TodoServiceImpl implements TodoService {
	TodoMapper todoMapper;
	@Autowired
	public TodoServiceImpl(TodoMapper todoMapper) {
		this.todoMapper = todoMapper;
	}
	@Override
	public int createTodo(TodoDTO dto) throws Exception {
		// TODO Auto-generated method stub
		return todoMapper.createTodo(dto);
	}

}
