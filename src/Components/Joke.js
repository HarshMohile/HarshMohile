import React from "react"

function Joke(props) {
    return (
        <div>
            <h3 style={{ display: !props.question && "none" }}>Question: {props.question}</h3>
            <h3>Answer: {props.punchLine}</h3>
            <hr />
        </div>
    )
}

/*
 <div>
            <h3 style={{display: props.question ? "block" : "none"}}>Question: {props.question}</h3>
            <h3>Answer: {props.punchLine}</h3>
            <hr/>
        </div>
  
        this is also one way of writin to check whether question exist  then display :block  else display: none
        */

export default Joke



