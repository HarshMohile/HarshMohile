import React from 'react'

function DateTimeProp() {
    const firstName = 'Harsh'
    const LastName = 'Mohile'
    const date = new Date();
    const hours = date.getHours();
    let currentTime

    if (hours <= 12)
        currentTime = "Morning"
    else if (hours > 12 && hours <= 17)
        currentTime = "afternoon"
    else
        currentTime = "Night"

    const styleobj = {
        backgroundColor: "#FF2d60",
        fontSize: "20px"
    }

    return (
        <h1 style={styleobj}>Hello {`${currentTime} ${firstName} ${LastName}`}</h1>

        //<h1 style ={{ color : "yellow"}}>Hello {`${currentTime} ${firstName} ${LastName}`}</h1>
        // Inner { } is for javscript object i.e style and outer {} is for traversing btw JSX and javaScript.
    )
}

export default DateTimeProp