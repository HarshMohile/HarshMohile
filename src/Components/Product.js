import React from 'react'

export default function Product(props){
    return(
        <div>
        <h3>{props.name}</h3>
        <h2>{props.price}</h2>
        <h1>{props.description}</h1>
        </div>
    )
}


