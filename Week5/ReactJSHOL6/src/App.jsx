import "./App.css";

function App() {

  const students = [
    "Hethini",
    "Rahul",
    "Sneha",
    "Anjali",
    "Kiran"
  ];

  return (
      <div className="container">

        <h1>React Lists and Keys</h1>

        <ul>
          {students.map((student, index) => (
              <li key={index}>{student}</li>
          ))}
        </ul>

      </div>
  );
}

export default App;