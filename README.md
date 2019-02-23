# Levels Beyond Java Note API

### Installation

- On MacOS, type the command below into your terminal

```brew install maven```

- type the command below inside the repo to run the server on locahost:8080

```mvn tomcat7:run```

- use Postman, HTTPie/cURL, or any browser to reach the server

- CTRL-C to stop the server process

### Routes

Fetch all notes: 
`GET /api/notes`

Fetch note by id: 
`GET /api/notes/{id}`

Fetch for notes by query parameter: 
`GET /api/notes/?query=parameter`

Create new note: 
`POST /api/notes BODY {"body" : "Pick up milk."}`

Update note: 
`PUT /api/notes/{id} BODY {"body" : "Water the plant."}`

Delete note: 
`DELETE /api/notes/{id}`

