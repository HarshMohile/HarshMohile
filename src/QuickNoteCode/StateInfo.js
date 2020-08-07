import React from "react"


/*
1. handClick method called from onClick event . but becuase we are using Class
    we have tho use {this.handleClick} . Even in Component.js we use the {this.props.username}

2. In handClick() we are changing state of the this.state object property "count" so we use
    this.setState() method and changing the object value will cause error 


3. Because whenever we have a method that uses setState() we need to bind the method (in this case handleClick) to bind
    Bind to class 'App' in constructor(){
        and use this
        ****
        this.handleClick = this.handleClick.bind(this)
        ****
    }  
    to use the React.Component method setState() to change the state object property without error --{Cannot read properrty}


4. the .bind(this) will bound whichever method 
        is written before it to bound to the context of "this" as it exist within the class it resides.
        */



class App extends React.Component {
    constructor() {
        super()
        this.state = {
            count: 0
        }
        this.handleClick = this.handleClick.bind(this)
    }
    
    // handleClick() {
    //     this.setState({ count: 1 })
    // }

    /*
   5. the above handleClick method will overwrite count 0 ->1 and only display 1 1 1 1...
    we need to preserve previous state of object then we can pass an Arrow function inside this.setState(here)
    parameter as "prevState"

    this.setState((prevState)=>{})
     
   6. I CAN USE ANYNAME .DOESNT HAVE TO BE PREVSTATE

    INSIDE THE ARROW FUNCTION "RETURN" THE MODIFIED VERSION ON STATE BY 

    LIKETHIS      count : oldcount +1

    PROGRAMMATICALLY    count : prevState.count +1

    this will make the value go 1 2 3 4 5 6 . cuz it remembers old state count by prevState.count
    ( : becuase count is an object . Remember not = , use : for object property)


    7. ALSO RETURN IS IN CURLY BRACES BECUASE ITS WORKING  WITH WITH OBJECT SO MAYBE {} IS USED 
    UNIKE IN RENDER OR FUNCTIONCOMPONENENT WE USE ()
    */
    


    handleClick(){
        this.setState((prevState)=>{
            return{
                count : prevState.count + 1
            }
        })
    }



    render() {
        return (
            <div>
                <h1>{this.state.count}</h1>
                <button onClick={this.handleClick}>Change!</button>
            </div>
        )
    }
}

export default App
