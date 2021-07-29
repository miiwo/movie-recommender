# Setup Checklist

## Frontend
- [ ] Get Node.js
    - [ ] Get Angular
- [ ] Get Bootstrap5 (Optional)

### Optional Frontend setup
- Dependencies for fancy-ness
    - [ ] font-awesome
    - [ ] Browser dev tools

## Backend
- [ ] Get database (mySQL/MongoDB)
- [ ] Get **Java 11**
    - [ ] Get project management tool (Gradle) (Optional)
        - Below are dependencies needed:
            - [x] Get corresponding database driver dependency
            - [x] Get Spring Boot (REST) dependency
            - [x] Get Hibernate (ORM) dependency
            - [ ] Spring Security dependency (for later)
            - [ ] Get Java JWT dependency (for later)
    
- [ ] Get API Key for Movie API
    - https://www.themoviedb.org/documentation/api (Ask miiwo for the key)

---

### Installing/Building Project Dependencies (Gradle)
To build the app on CLI, go into the project directory and use: 

- `gradle build` *(if gradle installed)*
- `./gradlew build` *(if gradle not installed)*

Or use your IDE's Gradle extension to build the project.

If any dependencies are missing from your machine, they should get downloaded when gradle tries to build/run the project.

### Running the backend

In order to run the backend application, use the `bootRun` task. ie. `gradle bootRun`

In order to test if it is working, go to `localhost:8080` on any web browser and see if anything is returned.

### Installing Frontend
Get Node.js either from the website or your favorite package manager.

Install `@angular/cli` with npm/yarn globally:

    npm install -g @angular/cli

In order to run the front end, use the command: `ng serve --open` in a terminal.

---

### Bootstrap
##### Option 1 (NPM)
Download `bootstrap` to computer with npm/yarn: 

    npm install bootstrap

##### Option 2 (CDN)
Make a reference to it in `src/index.html` with the line:

###### Bootstrap JS
`<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>`

---

###### Bootstrap CSS
`<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">`

##### Option 3 (Straight stick it into the appropriate folder struct)
If you only want to have the styling options from Bootstrap.

Add Bootstrap folders directly into the `app/assets` folder and then reference them directly in `styles.css`.


