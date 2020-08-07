import React from 'react'
import Header from './Components/Header'
import DateTimeProp from './Components/DateTimeProp'

class App extends React.Component {
  constructor() {
    super()
    this.state = {

      //state is an object hence {}
      id: "1",
      name: "Harsh",
      pwd: "%^&&5Leo"
    }
  }

  componentDidMount() {
    console.log("Mounted")
  }

  componentDidUpdate() {
    console.log("Did update")
  }


  /*
       Render
      >Mounted
      >Render
      >Did Update
  */
  render() {
    console.log("Render")
    return (
      <div>
        <h1>
          {this.state.id}
        </h1>
        <Header username="Leonardo" />
        <DateTimeProp />
      </div>
    )
  }
}


export default App