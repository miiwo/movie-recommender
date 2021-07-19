# Running the backend
Type into the command line: `gradle bootRun` or `./gradlew bootRun`.

Use `./gradlew bootRun` if you have a version of Gradle that is not `7.1` exactly.

# Don't grab application.properties after the first go
Once cloned, run this command from the movie-recommender directory: `git update-index --skip-worktree back-end/app/src/main/resources/application.properties`

This will make sure Git will not track any changes you make to the application.properties file thereafter.
And any pushes made to the source code will not include your modified application.properties file with db user+pass.

# Big Note
Remember to change the user/pass combo in application.properties, and don't push the file again with your user/pass combo.
