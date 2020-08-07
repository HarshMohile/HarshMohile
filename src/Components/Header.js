import React from 'react'
import Childheader from './Childheader'

 class  Header extends React.Component{
     render(props){
            return (
                <div>
                    <header className="navbar">this is header</header>
                    <header>{this.props.username} </header>
                    <Childheader  child="garbage"/>
                </div>
            )
     }
//className is a vanilla javsScript DOM api . instead of class="" like in htmlcss .here we use className.
    
}

export default Header