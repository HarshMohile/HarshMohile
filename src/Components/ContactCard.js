import React from "react"

function ContactCard(props) {
    console.log(props)
    return (
        <div className="contact-card">
            <h3>{props.contact.name}</h3>
            <p>Phone: {props.contact.phone}</p>
            <p>Email: {props.contact.email}</p>
            <h1>Age: {props.contact.age}</h1>
        </div>
    )
}

export default ContactCard