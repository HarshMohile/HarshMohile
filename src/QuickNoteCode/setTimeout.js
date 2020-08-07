import React, {Component} from "react"
import Conditional from "./Conditional"

class App extends Component {
    constructor() {
        super()
        this.state = {
            isLoading: true
        }
    }
    
    componentDidMount() {
        setTimeout(() => {
            this.setState({
                isLoading: false
            })
        }, 1500)
    }

    // setTimeout(()=>{},1500)
    // YOU CAN GIVE ARROW FUNCTION IN SETSTATE ALL THE TIME .ABOVE E,G
    // WE ARE JUST CHANGING A THIS.STATE OBJ VALUE SO NO => FUNC NEEDED

            //THIS ALSO WORKS . MADE IT LOOK SAME LIKE IN StateInfo.js

    componentDidMount(){
        setTimeout(()=>{
            this.setState(()=>{
                return{
                    isLoading : false
                }
            })
        },1500)
    }
 
    render() {
        return (
            <div>
                {this.state.isLoading ?
                <h1>Loading...</h1> :
                <Conditional />}
            </div>
        )
    }
}

export default App


