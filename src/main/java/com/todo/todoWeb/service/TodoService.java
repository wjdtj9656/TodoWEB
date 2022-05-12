package com.todo.todoWeb.service;

import com.todo.todoWeb.dto.TodoDTO;
import java.util.*;
public interface TodoService {

	int createTodo(TodoDTO dto) throws Exception;
	int updateTodo(TodoDTO dto) throws Exception;
	int deleteTodo(String id) throws Exception;
	List<TodoDTO> retrieve(final String userId) throws Exception;
}
