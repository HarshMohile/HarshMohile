import React, { Component } from "react"
import Conditional from "./Conditional"

class App extends Component {
    constructor() {
        super()
        this.state = {
            isLoading: true
        }
    }



    componentDidMount() {
        ///setTimeout(()=>{}, 1500)

        setTimeout(() => {
            this.setState({ isLoading: false })
        }, 1500)
    }


render() {
    return (
        <div>
            <Conditional isLoading={this.state.isLoading}/>
        </div>
    )
}
}

export default App
