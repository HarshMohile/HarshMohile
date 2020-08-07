/*
In the previous iteration of this todo list app, we pulled in todos data from a JSON file and mapped over it to display the todo items.

Eventually we'll want to be able to modify the data, which will only happen if we've "loaded" the data in to the component's state

Challenge: Change the <App /> component into a stateful class component and load the imported `todosData` into state.
*/

import React from "react"
import TodoItem from "./TodoItem"
import todosData from "./todosData"

class App extends React.Component {
    constructor() {
        super()
        this.state = {
            todos: todosData
        }
        this.handleChange = this.handleChange.bind(this)
    }
    



    //todos : todosData .. in JS we can pass an entire (array,  array of obj, obj of array ) to a property of an object.
                            //in this.state 's property. its like  int [] arr = int barr[] kinda


// todo.completed = !todo.completed
                   // WE ARE CHANGING THE STATE OF OLD OBJECT IE. TODO ===PREVSTATE.TODOS 
                   //WE SHOULD PRESERVE THE OLD VALUE THATS THE WHOLE POINT OF STATE
                   // WE ARE CHANGING THE VALUE IN UPDATES TODOS ARRAY INSTEAD OF UPDATEING THE OLD TODO
                   // CHNGE UPDATED VALUES IN UPDATEDTODOS NOT IN todo i.e( prevState.todos)
                   // ...todo, means give the entire array but 
                    //only change the below operation in updated todo to be stored in updatedTodos

    handleChange(id) {
        this.setState(prevState => {
            const updatedTodos = prevState.todos.map(todo => {
                if (todo.id === id) {
                   
                    return{
                            ...todo,
                            completed : !todo.completed
                            
                    }
                }   
                return todo
            })
            return {
                todos: updatedTodos
            }
        })
    }



    render() {

        //const todoItems = todosData.map(item => <TodoItem key={item.id} item={item}/>)
        //todosData got changed into this.state object property todos

        const todoItems = this.state.todos.map(item => <TodoItem key={item.id} item={item}
             handleChange={this.handleChange}/>)
        
        return (
            <div className="todo-list">
                {todoItems}
            </div>
        )    
    }
}

export default App

