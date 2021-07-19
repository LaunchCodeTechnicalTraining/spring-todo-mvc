package dev.paulmatthews.todomvc.data;

import dev.paulmatthews.todomvc.models.TodoItem;

import java.util.ArrayList;

public class TodoListData {
    private static ArrayList<TodoItem> todoItems = new ArrayList<TodoItem>();

    public static ArrayList<TodoItem> getAllTodoItems() {
        return todoItems;
    }

    public static void addTodoItem(TodoItem todoItem) {
        todoItems.add(todoItem);
    }
}
