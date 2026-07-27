import { useState } from "react";
import "./App.css";

function App() {
  const [count, setCount] = useState(0);

  function increment() {
    console.log("Increment button clicked");
    setCount(count + 1);
  }

  function reset() {
    console.log("Counter reset");
    setCount(0);
  }

  return (
      <div className="container">
        <h1>Week 6 Debugging Demo</h1>

        <h2>Counter : {count}</h2>

        <button onClick={increment}>
          Increment
        </button>

        <button onClick={reset}>
          Reset
        </button>
      </div>
  );
}

export default App;