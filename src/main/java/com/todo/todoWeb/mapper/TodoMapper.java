package com.todo.todoWeb.mapper;

import java.sql.SQLException;

import javax.persistence.Id;

import org.apache.ibatis.annotations.Mapper;

import com.todo.todoWeb.dto.TodoDTO;
import java.util.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Mapper
public interface TodoMapper {
	int createTodo(TodoDTO dto) throws SQLException;
	int updateTodo(TodoDTO dto) throws SQLException;
	int deleteTodo(String id) throws SQLException;
	List<TodoDTO> selectAllTodo(String userId) throws SQLException;
}
