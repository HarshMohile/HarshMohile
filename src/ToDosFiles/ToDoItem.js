import React from "react"

function TodoItem(props) {

    const completedStyle = {
        fontStyle: "italic",
        color: "#cdcdcd",
        textDecoration: "line-through"
    }



    return (
        <div className="todo-item">
            <input 
                type="checkbox" 
                checked={props.item.completed} 
                onChange={() => props.handleChange(props.item.id)}
            />
            <p style={props.item.completed ? completedStyle : null} >{props.item.text}</p>
        </div>
    )
}
export default TodoItem
// instead of <div> {props.handleChange(parameter)} we are passing it in onChange method
/*
    actaual working is onChange={converting to js and here will be method name} so instead of method we are passing

    a props called ---- props.handleChange that has a function((((((((handleChange={this.handleChange}))))))))
     as a property in ToDoApp.js

    props.handleChange will call the function handleChange

     We are passing props.item.id as parameter for the  function as a way to check CURRENT ID 
*/
