import React from "react"
import ContactCard from "./ContactCard"

function App() {
    return (
        <div className="contacts">
            <ContactCard
                contact=
                {{
                    name: "Mr. Whiskerson",
                    imgUrl: "http://placekitten.com/300/200",
                    phone: "(212) 555-1234",
                    email: "mr.whiskaz@catnap.meow"
                }}

            // name="Mr. Whiskerson"
            // imgUrl="http://placekitten.com/300/200"
            // phone="(212) 555-1234"
            // email="mr.whiskaz@catnap.meow"

            /* We had to put the above props (name, imgUrl, phone ,email ) in a object
            called contact={{}} bcuz ...
            imagine if there were infinite props then it would look lengthy.+

            the data is hardcoded below . usually it comes from json file .then we can put the data from json 
            in props and it would be secure .
            Above is also not secure as  {name, imgurl, phone , email}
            are still hardcoded STRINGS                 */
            />

            <ContactCard
                name="Fluffykins"
                imgUrl="http://placekitten.com/400/200"
                phone="(212) 555-2345"
                email="fluff@me.com"
            />

            <ContactCard
                name="Destroyer"
                imgUrl="http://placekitten.com/400/300"
                phone="(212) 555-3456"
                email="ofworlds@yahoo.com"
            />

            <ContactCard
                name="Felix"
                imgUrl="http://placekitten.com/200/100"
                phone="(212) 555-4567"
                email="thecat@hotmail.com"
            />

        </div>
    )
}

export default App