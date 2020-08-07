function App() {
    const [count, setCount] = useState(0)
    
//     return (
//         <div>
//             <h1>{count}</h1>
//           <button onClick={() => setCount(prevCount => prevCount + 1)}>Change!</button>
//         </div>
//     )
// }
    function increment() {
        setCount(prevCount => prevCount + 1)
        
    }
    
    function decrement() {
        setCount(prevCount => prevCount - 1)
    }
    
    function square() {
        setCount(prevCount => prevCount * prevCount)
    }
    
    function sqroot() {
        setCount(prevCount => Math.sqrt(prevCount))
    }
    return (
        <div>
            <h1>{count}</h1>
            <button onClick={increment}>Increment</button>
            <button onClick={decrement}>Decrement</button>
             <button onClick={square}>square</button>
              <button onClick={sqroot}>square Root</button>
            
        </div>
    )
}

/*
    function increment(){
        setCount((prevCount)=>{
                    prevCount +1
            })
    }
        */