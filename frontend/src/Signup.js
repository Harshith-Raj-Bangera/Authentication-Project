import React, { useState } from "react";
import axios from "axios";

function Signup() {
  const [formData, setFormData] = useState({
    name: "",
    email: "",
    password: ""
  });

  const handleChange = (e) => {
    setFormData({
      ...formData,
      [e.target.name]: e.target.value
    });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const response = await axios.post(
        "http://localhost:8080/api/signup",
        formData
      );

      alert(response.data);
    } catch (error) {
      alert("Signup failed");
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <input name="name" placeholder="Name" onChange={handleChange} />
      <input name="email" placeholder="Email" onChange={handleChange} />
      <input name="password" placeholder="Password" onChange={handleChange} />
      <button type="submit">Signup</button>
    </form>
  );
}

export default Signup;