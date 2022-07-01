# 😊 Very Simple Spring Boot Application for Deplolying to Heroku
A simple spring boot application to deploy using heroku.

### 🌳 Environment
- JDK 11
- Spring Boot 2.7.1
- Maven

There is only one API endpoint `/demo` in this project to check whether the server deployed by heroku operates properly or not.

### Brief Compositions
- **DemoController.java**: A simple controller that has only one GET method API endpoint `/demo`
- **application.yml**: it has server port placeholder so that heroku can inject a random port, and has a brief placeholder named `test.str` and its key is `test-string`, which will be used in `/demo` GET method.
- **system.properties**: used to specify what java version will be used on heroku build.
- **Procfile**: used to specify commands that are executed by the app on startup after the build is finished. 

### 🖇️ Blog
This project is created to explain how to deploy using heroku, and its more detail explanation is on my blog below.

[Click Here!](https://mad8e.tistory.com/entry/Spring-Boot-Maven-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-Heroku-%EC%97%90-%EB%B0%B0%ED%8F%AC%ED%95%98%EA%B8%B0)
