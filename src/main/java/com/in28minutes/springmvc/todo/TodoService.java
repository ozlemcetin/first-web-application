package com.in28minutes.springmvc.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todoList = new ArrayList<>();
	private static int todoCount = 0;

	static {

		todoList.add(new Todo(++todoCount, "in28Minutes", "Learn Spring MVC", new Date(), false));

		todoList.add(new Todo(++todoCount, "in28Minutes", "Learn Struts", new Date(), false));

		todoList.add(new Todo(++todoCount, "in28Minutes", "Learn Hibernate", new Date(), false));

	}

	public List<Todo> retrieveTodos(String user) {

		return todoList.stream().filter(todo -> todo.getUser().equals(user)).collect(Collectors.toList());
	}

	public void addTodo(String user, String desc, Date targetDate, boolean isDone) {

		todoList.add(new Todo(++todoCount, user, desc, targetDate, isDone));
	}

	/*
	 * 
	 * Iterator<Todo> iterator = todoList.iterator();
	 * 
	 * while (iterator.hasNext()) {
	 * 
	 * Todo todo = iterator.next();
	 * 
	 * if (id == todo.getId()) {
	 * 
	 * iterator.remove(); }
	 * 
	 * } // while loop
	 */
	public void deleteTodo(int id) {

		List<Todo> todosToDelete = todoList.stream().filter(todo -> id == todo.getId()).collect(Collectors.toList());

		todosToDelete.stream().forEach(todo -> todoList.remove(todo));
	}

}
