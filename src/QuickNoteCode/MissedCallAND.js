import React, { Component } from "react"
import Conditional from "./Conditional"

class App extends Component {
    constructor() {
        super()
        this.state = {
            unreadMessages: ["arr1", "arr2"]
        }
    }
    // &&
    // false && false


    /*
        A > B && 
        
          means if condition true  then return whatever is written after && 
    */
    render() {
        return (
            <div>
                {
                    this.state.unreadMessages.length > 0 &&
                    <h2>You have {this.state.unreadMessages.length} unread messages!</h2>
                }
            </div>
        )
    }
}

export default App
