import "./App.css";

function App() {

  const name = "Hethini";
  const course = "React";
  const year = "3rd Year";

  function welcome() {
    return "Welcome to React ES6 & JSX";
  }

  return (
      <div className="container">
        <h1>{welcome()}</h1>

        <h2>Student Details</h2>

        <p>Name : {name}</p>
        <p>Course : {course}</p>
        <p>Year : {year}</p>

        <p>Current Year : {new Date().getFullYear()}</p>

        <p>10 + 20 = {10 + 20}</p>
      </div>
  );
}

export default App;