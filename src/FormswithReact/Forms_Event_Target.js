import React, {Component} from "react"

class App extends Component {
    constructor() {
        super()
        this.state = {
            firstName: "",
            lastName: ""
        }
        this.handleChange = this.handleChange.bind(this)
    }
    
    handleChange(event) {
        const {name, value} = event.target
        this.setState({ 
            [name]: value
          /*
          E.g firstName input box
            value is something that is typed in the form by you so 
            event.target.value contains thing i typed that i am giving to name property
            name property [event.target.name] is the same name as in this.setState --> name="firstName"
            value property contains the text that i give to name by --> [name] :value 
            Both have the same name in state object so that it represents the this.state.xyz whatever i typed.
            So basically this.state.firstName = event,target.value via name property .
           */
        })
    }
    
    render() {
        return (
            <form>
                <input 
                    type="text" 
                    value={this.state.firstName} 
                    name="firstName" 
                    placeholder="First Name" 
                    onChange={this.handleChange} 
                />
                <br />
                <input 
                    type="text" 
                    value={this.state.lastName} 
                    name="lastName" 
                    placeholder="Last Name" 
                    onChange={this.handleChange} 
                />
                <h1>{this.state.firstName} {this.state.lastName}</h1>
            </form>
        )
    }
}

export default App
 /*
            firstName : event.target.value
            This works but or any other form filling it will overwtite firstName so
            We are using const diff names instead of this.state.firstName
            or
            [event.target.name]: event.target.value i.e

            [name property in input ]  : value property in input

            ****
            [event.target.name] represents the name="firstName" which is actually in this.setState
            ***


            [] becuase name property is a String 
            <input type ="text"   name ="firstName" same name used in this.state.firstName
            So it matches name=" " to event.target.name
            Making it firstName : event.target.value 
            */