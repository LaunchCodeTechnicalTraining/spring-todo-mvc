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

## Add new items to TodoList

- update TodoList
  - right now it's public, it should probably be private -- and then we can add a static addTodoItem method to interface with it
  - add getAllTodoItems() method to the data layer
  - create a new view with a form for adding a new Todo Item
  - GET /todo -> update it has a form for adding new TodoItems
  - POST /todo?name={todoName}
    
## Mark an Item as Complete

- controller request handler that will take a todoItem, or a name of a todo item, or something unique to that todo item, so that it can mark it as complete
- datalayer is going to need some way of exposing a todo item -- findTodoItemByName() findTodoItemByID()
- models/TodoItem -> method to update the completed status of the TodoItem