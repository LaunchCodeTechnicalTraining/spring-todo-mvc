package dev.paulmatthews.todomvc.models;

public class TodoItem extends AbstractEntity {
    private String name;
    private Boolean completed;

    public TodoItem(String name) {
        super();
        this.name = name;
        this.completed = false;
    }

    public String getName() {
        return name;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void markComplete() {
        this.completed = true;
    }
}
