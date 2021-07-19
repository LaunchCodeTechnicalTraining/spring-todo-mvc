package dev.paulmatthews.todomvc.models;

public class TodoItem {
    private String name;
    private Boolean completed;

    public TodoItem(String name) {
        this.name = name;
        this.completed = false;
    }

    public String getName() {
        return name;
    }

    public Boolean getCompleted() {
        return completed;
    }
}
