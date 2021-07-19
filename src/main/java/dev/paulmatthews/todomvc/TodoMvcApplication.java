package dev.paulmatthews.todomvc;

import dev.paulmatthews.todomvc.data.TodoListData;
import dev.paulmatthews.todomvc.models.TodoItem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoMvcApplication {

	public static void main(String[] args) {

		// for manual testing purposes only
		TodoListData.addTodoItem(new TodoItem("dishes"));
		TodoListData.addTodoItem(new TodoItem("laundry"));
		TodoListData.addTodoItem(new TodoItem("cook dinner"));
		TodoListData.addTodoItem(new TodoItem("walk bernie"));
		TodoListData.removeTodoItem(1);
		// end manual testing
		SpringApplication.run(TodoMvcApplication.class, args);
	}

}
