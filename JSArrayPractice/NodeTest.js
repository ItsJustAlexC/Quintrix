const http = require("http")
const port = "8085"

const fs = require('fs');

const server = http.createServer((req, res) => {
    res.writeHead(200, { "Content-Type": "text/html" });
    fs.readFile("index.html", (error, data) => {
        if(error) {
            res.writeHead(404)
            res.write("Error: File Not Found")
        } else {
            res.write(data);
        }
        res.end();
    })
    
})

server.listen(port, error =>{
    if(error){
        console.log(error)
    } else {
        console.log("listening to " + port)
    }
})