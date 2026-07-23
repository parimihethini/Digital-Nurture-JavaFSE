import { useEffect, useState } from "react";
import axios from "axios";
import "./App.css";

function App() {

    const [users, setUsers] = useState([]);

    const indianNames = [
        "Hethini Parimi",
        "Rahul",
        "Priya Reddy",
        "Arjun Kumar",
        "Sneha",
        "Rohith",
        "Anjali",
        "Karthik",
        "Meera",
        "Vikram Reddy"
    ];

    useEffect(() => {

        axios.get("https://jsonplaceholder.typicode.com/users")
            .then((response) => {

                const data = response.data.map((user, index) => ({
                    ...user,
                    name: indianNames[index]
                }));

                setUsers(data);

            })
            .catch((error) => {
                console.log(error);
            });

    }, []);

    return (

        <div className="container">

            <h1>Axios Example</h1>

            {users.map((user) => (

                <div className="card" key={user.id}>

                    <h2>{user.name}</h2>

                    <p>Email : {user.email}</p>

                    <p>Phone : {user.phone}</p>

                </div>

            ))}

        </div>

    );

}

export default App;