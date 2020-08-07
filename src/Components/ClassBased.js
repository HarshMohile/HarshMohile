import React from "react"

// function App(props) {
//     return (
//         <div>
//             <h1>{props.whatever}</h1>
//         </div>
//     )
// }


// in class  based put this.props instead of props

class App extends React.Component {

    yourMethodHere() {

    }

    render() {

        const style_or_anydata_tobe_rendered = this.yourMethodHere()
        return (
            <div>
                <h1>{this.props.whatever}</h1>
            </div>
        )
    }
}

export default App
