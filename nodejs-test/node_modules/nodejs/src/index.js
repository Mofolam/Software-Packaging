
const express = require("express");

const app = express();
const PORT = process.env.PORT || 3000;

// Home route
app.get("/", (req, res) => {
    res.send("Welcome to the Software Packaging Project!");
});

// Health check route
app.get("/health", (req, res) => {
    res.json({
        status: "healthy",
        application: "Node.js Packaging App"
    });
});

// Start server
app.listen(PORT, () => {
    console.log(`Server running on port ${PORT}`);
});
