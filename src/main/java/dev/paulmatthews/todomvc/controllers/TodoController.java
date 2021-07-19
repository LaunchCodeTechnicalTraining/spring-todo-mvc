package dev.paulmatthews.todomvc.controllers;

import dev.paulmatthews.todomvc.data.TodoListData;
import dev.paulmatthews.todomvc.models.TodoItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

    // GET /todo -> http://localhost:8080/todo
    @GetMapping
    public String getTodoItems(Model model) {
        // we know that we need to show them a representation of the list, so we need to pass that list to the thymeleaf engine, so it can build our HTML using that data!
        // how do we pass data to thymeleaf?
        model.addAttribute("todoList", TodoListData.getAllTodoItems());
        return "todo";
    }

    @PostMapping
    public String postTodoItems(@RequestParam String value, Model model) {
        TodoListData.addTodoItem(new TodoItem(value));
        model.addAttribute("todoList", TodoListData.getAllTodoItems());
        return "todo";
    }

    @GetMapping(value = "/complete")
    public String markItemAsComplete(@RequestParam int id, Model model) {
        TodoListData.getTodoItemById(id).markComplete();
        model.addAttribute("todoList", TodoListData.getAllTodoItems());
        return "todo";
    }
}
