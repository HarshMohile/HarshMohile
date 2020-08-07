// componentDidMount
// componentDidUpdate
// componentWillUnmount

// Side effects?
// Network request
// Manual DOM manipulation
// Event listeners or timeouts and intervals

import React, {useState, useEffect} from "react"
import randomcolor from "randomcolor"

function App() {
    const [count, setCount] = useState(0)
    const [color, setColor] = useState("")
    
    function increment() {
        setCount(prevCount => prevCount + 1)
    }
    
    function decrement() {
        setCount(prevCount => prevCount - 1)
    }
         
    useEffect(() => {
        setColor(randomcolor())
    }, [count])
    
    return (
        <div>
            <h1 style={{color: color}}>{count}</h1>
            <button onClick={increment}>Increment</button>
            <button onClick={decrement}>Decrement</button>
        </div>
    )
}

//setColor(randomcolor()) will cause infinite loop just like in componentDidUpdate
/*
   
    return -->  useEffect --> setColor  (setting state)   ---> re -Render  -->useEffect

    componentDidUpdate has prevState and prevprops to determine when to render again .
    In useEffect ( your arrow func , [array])
    this array will have values. this array acts like a flag to look for changes for those variables.
    If changes found on prevValues ONLY then re-render.


    If you put useEffect(f(), []) empty array then it will only setState /re-render the very firsy time (componentDidMount) 
    like a constructor in java that runs once during class loading to initialize variables
    */