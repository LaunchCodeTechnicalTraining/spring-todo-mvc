package dev.paulmatthews.todomvc.data;

import dev.paulmatthews.todomvc.models.TodoItem;

import java.util.ArrayList;

public class TodoListData {
    private static ArrayList<TodoItem> todoItems = new ArrayList<TodoItem>();
    private static ArrayList<TodoItem> deletedItems = new ArrayList<>();

    public static ArrayList<TodoItem> getAllTodoItems() {
        return todoItems;
    }

    public static ArrayList<TodoItem> getDeletedItems() {
        return deletedItems;
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

    public static void removeTodoItem(int id) {
        TodoItem itemToDelete = getTodoItemById(id);
        deletedItems.add(itemToDelete);
        todoItems.remove(itemToDelete);
        // loop through all of the todoItems
        // compare the provided id, to the todoItem.Id() if they equal each other grabbed its index
    }

    public static TodoItem getTodoItemByName(String name) {
        for(TodoItem todoItem : todoItems) {
            if(todoItem.getName().equals(name)) {
                return todoItem;
            }
        }
        return null;
    }

    public static ArrayList<TodoItem> getCompletedTodoItems() {
        ArrayList<TodoItem> completedItems = new ArrayList<>();
        for(TodoItem todoItem : todoItems) {
            if(todoItem.getCompleted()) {
                completedItems.add(todoItem);
            }
        }
        return completedItems;
    }

    public static ArrayList<TodoItem> getUncompletedTodoItems() {
        ArrayList<TodoItem> uncompletedItems = new ArrayList<>();
        for(TodoItem todoItem : todoItems) {
            if(!todoItem.getCompleted()) {
                uncompletedItems.add(todoItem);
            }
        }
        return uncompletedItems;
    }
}
