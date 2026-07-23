import { useEffect, useState } from "react";
import "./App.css";

function App() {

    const [users, setUsers] = useState([]);

    const indianNames = [
        "Hethini Parimi",
        "Ravi",
        "Priya Reddy",
        "Arjun",
        "Sneha ",
        "Vikram",
        "Ananya",
        "Rohan",
        "Meera",
        "Karthik"
    ];

    useEffect(() => {
        fetch("https://jsonplaceholder.typicode.com/users")
            .then(res => res.json())
            .then(data => {
                const updatedUsers = data.map((user, index) => ({
                    ...user,
                    name: indianNames[index]
                }));

                setUsers(updatedUsers);
            });
    }, []);

    return (
        <div className="container">

            <h1>Fetch API Example</h1>

            {users.map((user) => (
                <div className="card" key={user.id}>
                    <h3>{user.name}</h3>
                    <p>{user.email}</p>
                </div>
            ))}

        </div>
    );
}

export default App;