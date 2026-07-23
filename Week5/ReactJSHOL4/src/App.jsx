import { useState } from "react";
import "./App.css";

function App() {

  const [name, setName] = useState("");

  function showMessage() {
    alert("Welcome to React Events!");
  }

  return (
      <div className="container">

        <h1>React Events</h1>

        <button onClick={showMessage}>
          Click Me
        </button>

        <br /><br />

        <input
            type="text"
            placeholder="Enter Name"
            onChange={(e) => setName(e.target.value)}
        />

        <h2>{name}</h2>

      </div>
  );
}

export default App;