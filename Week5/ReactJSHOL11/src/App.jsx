import { useState } from "react";
import "./App.css";

function App() {

  const [name, setName] = useState("");
  const [students, setStudents] = useState([]);

  function addStudent() {

    if (name === "") {
      alert("Please enter a student name");
      return;
    }

    setStudents([...students, name]);
    setName("");
  }

  function deleteStudent(index) {

    const newList = students.filter((student, i) => i !== index);
    setStudents(newList);

  }

  return (
      <div className="container">

        <h1>Student Management</h1>

        <input
            type="text"
            placeholder="Enter Student Name"
            value={name}
            onChange={(e) => setName(e.target.value)}
        />

        <button onClick={addStudent}>
          Add Student
        </button>

        <table>

          <thead>

          <tr>
            <th>S.No</th>
            <th>Student Name</th>
            <th>Action</th>
          </tr>

          </thead>

          <tbody>

          {students.map((student, index) => (

              <tr key={index}>

                <td>{index + 1}</td>

                <td>{student}</td>

                <td>

                  <button
                      className="delete"
                      onClick={() => deleteStudent(index)}
                  >
                    Delete
                  </button>

                </td>

              </tr>

          ))}

          </tbody>

        </table>

      </div>
  );
}

export default App;