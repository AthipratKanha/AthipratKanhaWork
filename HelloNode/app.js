/*const HTTP = require('http')
const PORT = 3030

const app = HTTP.createServer((request, response) => {
    response.statusCode = 200
    response.setHeader = ('Content-Type', 'text/plain')
    response.end('Hello World')
})

app.listen(PORT, () => {
    console.log(`SEVER IS RUNNING ON PORT [${PORT}]`)
}) */

const express = require('express')
const app = express()

app.get('/', (request, response) => {
    response.status(200).send('Hello World')
})

const PORT = 3030
app.listen(PORT, () => {
    console.log(`SERVER IS RUNNING ON PORT [${PORT}]`)
})