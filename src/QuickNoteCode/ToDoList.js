import React from 'react'
import TodoImpl from './TodoImpl'

export default function ToDoList({todos}) {
    return (
        
        todos.map(todoImpl =>{
            return<TodoImpl key={todoImpl.id} todo={todoImpl}/>
        })
    )
}
