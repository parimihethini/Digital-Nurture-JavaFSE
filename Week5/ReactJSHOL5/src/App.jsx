import { useState } from "react";
import "./App.css";

function App() {

  const [loggedIn, setLoggedIn] = useState(false);

  return (
      <div className="container">

        <h1>Conditional Rendering</h1>

        {
          loggedIn
              ? <h2>Welcome Hethini</h2>
              : <h2>Please Login</h2>
        }

        <button onClick={() => setLoggedIn(!loggedIn)}>
          Toggle Login
        </button>

      </div>
  );
}

export default App;