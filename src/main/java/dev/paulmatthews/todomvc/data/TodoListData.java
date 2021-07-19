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

    public static TodoItem getTodoItemById(int id) {
        for(TodoItem todoItem : todoItems) {
            if(todoItem.getId() == id) {
                return todoItem;
            }
        }
        return null;
    }

    public static TodoItem getTodoItemByName(String name) {
        for(TodoItem todoItem : todoItems) {
            if(todoItem.getName().equals(name)) {
                return todoItem;
            }
        }
        return null;
    }
}
