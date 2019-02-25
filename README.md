# Levels Beyond Java Note API

>#### Note 
>
>This server uses Maven to pack its dependencies and run the the server locally, and requires Java 1.7+
>
>To install Java type the command below into your terminal
>
>```brew cask install java```


### Installation

To install and run this server on your localhost:

- Clone this repo and cd into the new directory

- On MacOS, type the command below into your terminal

```brew install maven```

- type the command below inside the repo to run the server on locahost:8080

```mvn tomcat7:run```

- use Postman, HTTPie/cURL, or any browser to reach the server

### Routes

Fetch all notes: 
`GET /api/notes`

Fetch note by id: 
`GET /api/notes/{id}`

Fetch for notes by query parameter: 
`GET /api/notes/?query={parameter}`

Create new note: 
`POST /api/notes BODY note content`

Update note: 
`PUT /api/notes/{id} BODY note content`

Delete note: 
`DELETE /api/notes/{id}`

