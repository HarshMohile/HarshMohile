// https://scrimba.com/g/greacthooks
// Uncaught Invariant Violation: Maximum update depth exceeded.
// This can happen when a component repeatedly calls setState inside componentWillUpdate or componentDidUpdate.
// React limits the number of nested updates to prevent infinite loops.



/*
without didMount method extra code to write .we use the didupdate to forxe some logic everytime we change something 
In this case look at the didmount method 
didMount (prevprops,prevState)
we are using state (prevState.count) .If we were using prevprops/ props  then it wouldnt be the components
 that decides(in charge)
*/



/*
An infinite loop in 

 componentDidUpdate() {
        const newColor = randomcolor()
        this.setState({color: newColor})
    }
   
    Because stepwise 
    1. increment() -> setState() -->which triggered render() --->which caused componentDidUpdate()--> which has setState()

    setState() -render() an so on.
*/
import React from "react"
import randomcolor from "randomcolor"

class App extends React.Component {
    constructor() {
        super()
        this.state = {
            count: 0,
            color: ""
        }
        this.increment = this.increment.bind(this)
        this.decrement = this.decrement.bind(this)
    }
    
    increment() {
        this.setState(prevState => {
            return {
                count: prevState.count + 1,
               // color: randomcolor()
            }
        })
    }
    decrement() {
        this.setState(prevState => {
            return {
                count: prevState.count - 1,
                //color: randomcolor()
            }
        })
    }
    
    componentDidUpdate(prevProps, prevState) {
        if(prevState.count !== this.state.count) {
            const newColor = randomcolor()
            this.setState({color: newColor})
        }
    }
    
    render() {
        return (
            <div>
                <h1 style={{color: this.state.color}}>{this.state.count}</h1>
                <button onClick={this.increment}>
                    Increment!
                </button>
                <button onClick={this.decrement}>
                    Decrement!
                </button>
            </div>
        )
    }
}

export default App
