import React, { Component } from "react"
import Conditional from "./Conditional"

class App extends Component {
    constructor() {
        super()
        this.state = {
            isLoading: true
        }
    }
    //Componentdidmount  runs when you mount a component on screen for the first time into DOM tree.
    /*

    pput a console log in componentdidmount()
    put a <div> hi</div> in render() .it will run render first and immediately console.log after render


    1st. render
    2nd. componentdidmount
    */

    componentDidMount() {
        setTimeout(() => {
            this.setState({
                isLoading: false
            })
        }, 1500)
    }

    render() {
        return (
            //CONDITONAL RENDERING IN THE FROM SHORTHAND IF   conditon true ? then do this : else this
            <div>
                {this.state.isLoading ?
                    <h1>Loading...</h1> :
                    <Conditional />}
            </div>
        )
    }
}
// DIFF  IN THIS COND-RENDER IS .. SINCE THIS IS THE PAGE RESPONSIBLE FOR HANDLING THE ISLOADING object property .
//THIS APP.JS SHOULD HAVE THE COND-RENDER FOR THE HANDLING THE ISLOADING MESSAGES. NOT CONDITIONAL.JS
export default App
