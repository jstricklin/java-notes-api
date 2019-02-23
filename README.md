# Levels Beyond Java Note API

### Installation

The easiest way to run this server on your localhost is to:

- For MacOS type the command below into your terminal

```brew install maven```

- type the command below inside the repo to run the server on locahost:8080

```mvn tomcat7:run```

- use Postman, HTTPie/cURL, or any browser to reach the server

### Routes

Fetch all notes
`GET /api/notes`

Fetch note by id
`GET /api/notes/{id}`

Fetch for notes by query parameter
`GET /api/notes/?query={parameter}`

Create new note
`POST /api/notes BODY note content`

Update note
`PUT /api/notes/{id} BODY note content`

Delete note
`DELETE /api/notes/{id}`

