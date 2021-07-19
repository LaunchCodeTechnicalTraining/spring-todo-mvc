package dev.paulmatthews.todomvc;

import dev.paulmatthews.todomvc.data.TodoListData;
import dev.paulmatthews.todomvc.models.TodoItem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoMvcApplication {

	public static void main(String[] args) {

		// for manual testing purposes only
		TodoListData.todoItems.add(new TodoItem("dishes"));
		TodoListData.todoItems.add(new TodoItem("laundry"));
		TodoListData.todoItems.add(new TodoItem("cook dinner"));
		TodoListData.todoItems.add(new TodoItem("walk bernie"));
		// end manual testing
		SpringApplication.run(TodoMvcApplication.class, args);
	}

}
