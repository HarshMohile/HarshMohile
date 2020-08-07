import React from "react"
import ReactDOM from "react-dom"

import Joke from "./Joke"
import JokesData from "./JokesData"
import App from "../App"


function App() {
    const JokeArrObj = JokesData.map((joke) => {
        return (
            <Joke key={joke.id} question={joke.question} punchline={joke.punchline} />


            // Or u can just write one prop  jokeprop = {joke} // allitems in one props
            // so in Joke.js u have to write  props.jokeprop.question  , props.jokeprop.punchline 
            // or any other property in the object.


            // TLDR: u are passing the entire object as a prop .so have to write in Joke.js 
            // props.object.property
        )
    })


    return (
        <div>{JokeArrObj}</div>
    )

}

ReactDOM.render(<App />, document.getElementById("root"))

/* map :== it acts a for loop  with array elements.
            for every element in the array i.e joke .it performs certain actions and
             then puts the updated value in the const jokeArrObj= function .just like java 

            side note :: int i = getintValue(10); this func has return type of int so it assigns
             the returned value to i.
        
            Takes value from JokesData array object and puts them in JokeArrObj ,
       key:==     the key  prop is required because  react wants to differtiate btw each array of obj element basis.
                .it gives o/p but also warning.

        question  prop :== its just for inputting the prop the value from JokeData array of object which question property.
        same for punchline.


More cleaner way 

const JokeArrObj = 
            JokeData.map(  joke=> <Joke key={joke.id} question={joke.question} punchline={joke.punchline}  )





REFER THE MDN DOCS ::


// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/filter
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/map
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/sort
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/reduce
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/every
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/some
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/find
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/findindex



*/




