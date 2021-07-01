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
- [ ] Get Java 11
    - [ ] Get project management tool (Gradle) (Optional)
        - Below are dependencies needed:
            - [ ] Get corresponding database driver dependency
            - [x] Get Spring Boot (REST) dependency
            - [ ] Get Hibernate (ORM) dependency
            - [ ] Spring Security dependency (for later)
            - [ ] Get Java JWT dependency (for later)
    
- [ ] Get API Key for Movie API
    - https://www.themoviedb.org/documentation/api


### Installing/Building Project Dependencies (Gradle)
To build the app on CLI, go into the project directory and use: 
    - `gradle build` *(if gradle installed)*
    - `./gradlew build` *(if gradle not installed)*

Or use IDE Gradle extension to build the project.

If any dependencies are missing from your machine, they should get downloaded when gradle tries to build the project.

### Installing Frontend
Get Node.js either from the website or your favorite package manager.

Install with npm/yarn globally: `@angular/cli`

#### Bootstrap
##### Option 1
Download to computer with npm/yarn: `bootstrap`

##### Option 2
Make a reference to it in `src/index.html` with the line:

###### Bootstrap JS
`<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>`

---

###### Bootstrap CSS
`<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">`

##### Option 3
If you only want to have the styling options from Bootstrap.

Add Bootstrap folders directly into the `app/assets` folder and then reference them directly in `styles.css`.


