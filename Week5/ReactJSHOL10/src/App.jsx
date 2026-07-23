import "./App.css";

function App() {

  const employees = [
    { id: 101, name: "Hethini", department: "React", salary: 50000 },
    { id: 102, name: "Rahul", department: "Java", salary: 45000 },
    { id: 103, name: "Sneha", department: "Python", salary: 55000 },
    { id: 104, name: "Arjun", department: "Testing", salary: 40000 },
    { id: 105, name: "Priya", department: "AI & ML", salary: 60000 }
  ];

  return (
      <div className="container">

        <h1>Employee Management System</h1>

        <table>

          <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Department</th>
            <th>Salary</th>
          </tr>
          </thead>

          <tbody>

          {employees.map((emp) => (

              <tr key={emp.id}>
                <td>{emp.id}</td>
                <td>{emp.name}</td>
                <td>{emp.department}</td>
                <td>₹ {emp.salary}</td>
              </tr>

          ))}

          </tbody>

        </table>

      </div>
  );
}

export default App;