# spring-app


spring-app

## we created an application named `Songer` using spring initializer under the following specification:

-	Project: gradle project 
-	Language: Java language
-	Spring boot: default (2.4.5)
-	Packaging: jar
-	Java: 8 
Dependencies added:
-	Spring web 
-	Thymeleaf
-	Spring Boot DevTools

After generating the project it will be downloaded as a zip file, extract the file in the folder you want to work on. 
Use the Intelij Idea to work on the app. 
create: 
 a class named GeneralController. 
Annotated with a @Controller 
This allows the implemented classes to be auto detected through class path scanning. 
-	 Routs are provide the @GetMapping. 
-	We have several routs in our application 
1.	Homepage (“/”)
You will find a page for the spring application
2.	Hello world greeting (“hello”)
You will have a page that returns the greeting hello world 
3.	Albums (“/albums”)
You will have a page that renders three albums, each album with contain:
-	A title 
-	An artist 
-	A song count 
-	Length 
-	Image url 

4.	The Capitalized words (“/capitalized/ {words}”)
You will have a page that returns the word you replace in the rout capitalized 






