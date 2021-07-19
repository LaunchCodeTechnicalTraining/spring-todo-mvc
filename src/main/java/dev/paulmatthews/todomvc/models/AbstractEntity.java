package dev.paulmatthews.todomvc.models;

public abstract class AbstractEntity {
    private static int nextId = 1;

    private int id;

    public AbstractEntity() {
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }
}
