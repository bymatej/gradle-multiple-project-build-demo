# Gradle multiple project build
### gradle-multiple-project-build-demo

This is a demo project. The goal was to set up one project that has a common code (library) shared between two (or more) projects.

Those projects (that share the same library) have some slight differences in the code, and have different dependencies.

The goal is to output 3 JAR files once the `./gradlew clean build` command is executed: 
- One JAR for the library
- Another one for project1
- Another one for project2  
- ... 

## Projects

### multiple-build (root project)
Root project.

#### common-library
Common library used by other projects.

#### subproject-one
First project that uses the `common-library`.

#### subproject-two
Second project that uses the `common-library`.


## Building
From the repository root (in the root project) execute `./gradlew clean build`. 

The JAR file will be in `build/libs` folder of each project. The root project will have an empty `build/libs` folder.

# Good reads
- https://docs.gradle.org/current/userguide/multi_project_builds.html
- https://docs.gradle.org/current/userguide/structuring_software_products.html#structure_large_projects
- https://stackoverflow.com/questions/46601359/gradle-one-project-multiple-packages-multiple-jars

