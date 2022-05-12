package com.todo.todoWeb.service;

import java.util.List;

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
	private void validate(TodoDTO dto) {
		if(dto == null) {
			log.warn("Entity can't be null.");
			throw new RuntimeException("dto can't be null");
		}
		if(dto.getId() == null) {
			log.warn("unknown user");
			throw new RuntimeException("Unknown user");
		}
	}
	@Override
	public int createTodo(TodoDTO dto) throws Exception {
		// TODO Auto-generated method stub
		validate(dto);
		log.info("user id : {} is saved.",dto.getId());
		return todoMapper.createTodo(dto);
	}
	@Override
	public List<TodoDTO> retrieve(String userId) throws Exception {
		// TODO Auto-generated method stub
		return todoMapper.selectAllTodo(userId);
	}
	@Override
	public int updateTodo(TodoDTO dto) throws Exception {
		// TODO Auto-generated method stub
		return todoMapper.updateTodo(dto);
	}
	@Override
	public int deleteTodo(String id) throws Exception {
		// TODO Auto-generated method stub
		return todoMapper.deleteTodo(id);
	}

}
