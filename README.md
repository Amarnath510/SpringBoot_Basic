# Microservices (as standalone)
Here we are will setup two microservices in two different ways.
1. IntelliJ (Pricing)
2. Spring Initializr (Search)

## Using IntelliJ
- Create New Project --> Gradle + Java
- GroupId: com, ArtifactId: pricing
- Use Default gradle wrapper
- Update build.gradle with dependecies from Search project.
- Create new package under src/main/java --> "com.pricing". And create SpringBootApplication class + Controllers + Mappings.
- Create new resource file (application.properties) under src/main/resources
- Either goto terminal or open terminal within IntelliJ.
- Do, gradle clean build
- Do, gradle bootRun
- Open, http://localhost:8190/pricing/hello


# Using Spring Initializr
We will setup a simple microservice using SpringBoot with Embedded Tomcat.

### Create Project
- Open [Spring Initializr](http://start.spring.io/)
- Select Gradle with Java and Spring Boot version (any)
- Give Group: com and Artifact: searchservice (This will create com.searchservice package under Java)
- In dependecies search for Jersey.
- Click on Generate Project.
- Once the project is downloaded then unzip it and copy it to "microservice_search" directory.

### Dependencies
- cd searchservice
- Include Spring Started and Tomcat dependecy.
- Do, gradle clean build. This will download all the dependencies.

### Java
- Create a simple class HelloController.java. Just a simple controller to say hello.
- In order to make this class scanned by Spring we need to give the ComponentScan annotation in our main class.
		`@ComponentScan(basePackages = "com.searchservice")`
See, SearchserviceApplication.java for more details.
- In which port does this run? 
We can specify the port details @ src/main/resources/application.properties as, server.port = 8090

### Run
- cd searchservice
- gcb (gradle clean build)
- We will use gradle plugin to run spring boot application, > gradle bootRun
- In the console you can see all the endpoints that are registeres, on which port tomcat is running etc.
<br>NOTE: The process won't complete. It holds at ~80%. It means it is up and running. You can hit the end-points.
- http://localhost:8090/hello

### Add another Mapping
- Just to make this more flexible add one more get call.
- First change the root mapping to our project name as, @RequestMapping("/search")
- Then add two methods with two different mappings like "/hello" and "/another"
- gcb
- gradle bootRun
<br>NOTE: You can see in the console our new end-points as, "/search/hello" and "/search/another".
