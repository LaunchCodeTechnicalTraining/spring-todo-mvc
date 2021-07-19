# Todo Application

1. display all of the items on the todo list
2. add new items to the todo list
3. mark an item as complete from the todo list
    a. completed list & uncompleted list
    b. TodoItem (completed field) -> OOP
4. remove an item from (both completed and uncompleted?)
5. list all completed items
6. list all uncompleted items
7. list all delete items

## Display all of the items on the todo list

- todo list (arrayList<TodoItem>)
  - DataRepo/TodoListRepo
- model/TodoItem
- controller/TodoController
  - /todo
    - GET /todo -> return the entire todolist
    - ? GET /todo?id={id}
