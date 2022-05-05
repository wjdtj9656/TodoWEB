package com.todo.todoWeb.service;

import com.todo.todoWeb.dto.TodoDTO;

public interface TodoService {

	int createTodo(TodoDTO dto) throws Exception;
}
