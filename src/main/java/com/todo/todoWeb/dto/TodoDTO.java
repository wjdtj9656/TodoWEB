package com.todo.todoWeb.dto;

import com.todo.todoWeb.mapper.TodoMapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoDTO {

	private String id;
	private String userId;
	private String title;
	private boolean done;
	
}
