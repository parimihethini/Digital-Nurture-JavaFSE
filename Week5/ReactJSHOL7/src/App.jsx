import { useState } from "react";
import "./App.css";

function App() {

  const [name, setName] = useState("");
  const [email, setEmail] = useState("");

  function submitForm(e) {
    e.preventDefault();
    alert("Name : " + name + "\nEmail : " + email);
  }

  return (
      <div className="container">

        <h1>React Forms</h1>

        <form onSubmit={submitForm}>

          <input
              type="text"
              placeholder="Enter Name"
              value={name}
              onChange={(e) => setName(e.target.value)}
          />

          <br /><br />

          <input
              type="email"
              placeholder="Enter Email"
              value={email}
              onChange={(e) => setEmail(e.target.value)}
          />

          <br /><br />

          <button>Submit</button>

        </form>

      </div>
  );
}

export default App;