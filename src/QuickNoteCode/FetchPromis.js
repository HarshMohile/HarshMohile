import React, { Component } from "react"

// https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/fetch
// https://swapi.co/
// https://medium.com/javascript-scene/master-the-javascript-interview-what-is-a-promise-27fc71e77261

class App extends Component {
    constructor() {
        super()
        this.state = {
            loading: false,
            character: {}
        }
    }


    /*
  A  in constructor  : loading false .start with showing data ie.
  B  in  1st setstate  :  make it true assuming it wont load on time since the component just mount after render
  C   in 2nd setstate   : when setting setstate = true in  B. next time while  printing . 
                            it will keep loading value : true .
                            and never display the data cuz of ternarny condition in render.
                            so HENCE  setstate : false in setstate again so that it shows data
                            



    */



    componentDidMount() {
        this.setState({ loading: true })
        fetch("https://swapi.co/api/people/1")
            .then(response => response.json())
            .then(data => {
                this.setState({
                    loading: false, //otherwise it will always be true for laoding and never show data
                    character: data
                })
            })
    }

    render() {
        const text = this.state.loading ? "loading..." : this.state.character.name
        return (
            <div>
                <p>{text}</p>
            </div>
        )
    }
}

export default App
