import React from 'react'

class Childheader extends React.Component{
    render(props){
        return(
            <div>
                <h1>{this.props.child}</h1>
            </div>
        )
            
        
    }

}

export default Childheader