package com.in28minutes.springmvc.todo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("userName")
public class TodoController {

	@Autowired
	private TodoService service;

	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
	public String showTodosList(ModelMap modelMap) {

		{
			String userName = (String) modelMap.get("userName");

			modelMap.put("todoListForUser", service.retrieveTodos(userName));
		}

		return "list-todos";
	}

	@RequestMapping(value = "/add-todo", method = RequestMethod.GET)
	public String showTodoPage(ModelMap modelMap) {

		{
			/*
			 * used in add-todo.jsp as commandName="todoObj"
			 */

			// modelMap.addAttribute("todoObj", new Todo());

			modelMap.addAttribute("todoObj", new Todo(-1, null, "Default Desc", null, false));
		}

		return "add-todo";
	}

	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	public String addTodo(ModelMap modelMap, Todo todo) {

		{
			String userName = (String) modelMap.get("userName");

			service.addTodo(userName, todo.getDesc(), new Date(), false);
		}

		{
			/*
			 * http://localhost:8080/list-todos?userName=in28Minutes
			 * 
			 * If you remove (as discussed previously) @SessionAttributes("name") from
			 * TodoController then you will not have problem that GET passes parameter (in
			 * your case list-todos?name=in28Minutes) and then you don't have to use
			 * model.clear(); i
			 */
			modelMap.clear();
		}

		return "redirect:list-todos";
	}

	@RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
	public String deleteTodo(ModelMap modelMap, @RequestParam int id) {

		{
			service.deleteTodo(id);
		}

		modelMap.clear();

		return "redirect:list-todos";
	}
}
