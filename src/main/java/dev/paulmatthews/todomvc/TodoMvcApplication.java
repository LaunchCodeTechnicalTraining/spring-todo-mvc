package dev.paulmatthews.todomvc;

import dev.paulmatthews.todomvc.data.TodoListData;
import dev.paulmatthews.todomvc.models.TodoItem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoMvcApplication.class, args);
	}

}
