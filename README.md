# spring-boot-demo-web-controller-gradle-jacoco
This is a spring boot application that demos the following:
* [Gradle](https://gradle.org/)
* Unit Tests 
* Integration Tests 
* Using [JaCoco](http://www.eclemma.org/index.html) to view testing coverage
* Spring Boot
* Controllers
  * Simple Controller
  * Controller With a Service
  * Controller with a Class
* Creating a custom task in Gradle (The integrationTest task)
* Setting up a Gradle task to depend on another Gradle task (JaCoCo task)

# Project Purpose
This project was to demo creating controllers in Spring Boot and mapping them to rest endpoints. The project includes unit tests which run everytime the project is build. The results of the unit tests will be located at **/build/reports/test/index.html**.

The project also includes integration tests which can be run with the **./gradlew integrationTest** command on Linux and Mac. The integration tests results will be located at **/build/reports/integrationTest/index.html**. 

The integration tests are seperate from the build because it's best practices to keep them seperate because they take longer to run. 

[JaCoco](http://www.eclemma.org/index.html) is setup to generate a test coverage report every build. This report will be located at **/build/reports/jacoco/test/html/index.html**

This project uses [Gradle](https://gradle.org/) to do the following:
* Build the project
* Run the unit tests
* Generate the testing coverage report
* Run the integration tests
* Run the project

# Building and Running the project
To build the project use the **./gradlew clean build** command. This command will build a excutable jar file called **spring-boot-demo-web-controller-gradle-jacoco-0.0.1-SNAPSHOT.jar** in the **/build/libs** folder. The jar file has the whole spring boot application inside of it and you can run it by using the **java -jar spring-boot-demo-web-con
troller-gradle-jacoco-0.0.1-SNAPSHOT.jar** command. 

You can also run the application using **./gradlew bootRun** in the root folder. 

The **./gradlew** command using the gradle wrapper to run the project so you do not need to have gradle installed to run the application. 

  
