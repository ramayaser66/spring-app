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
-	 Routs provided by the @GetMapping. 
-	We have several routs in our application 
1.	Homepage (“/”)
You will find a page for the spring application
2.	Hello world greeting (“hello”)
You will have a page that returns the greeting hello world 
3.	Albums (“/myAlbums”)
You will have a page that renders three albums, each album with contain:
-	A title 
-	An artist 
-	A song count 
-	Length 
-	Image url 

4.	The Capitalized words (“/capitalized/ {words}”)
You will have a page that returns the word you replace in the rout capitalized 

> lab-12

 we continued working on  application named `Songer` using spring initializer and added the following dependencies:

  - JPA
  - postgresql 

  continue working on: 
 1. a class named Album, add an id property 
 make sure you have a default constructor 
 annotate with
 @Entity
 @Id
 @GeneratedValue

 2. create and interface and extended it with CrudRepository <Album, Integer>
 3. create a database in the terminal  

 4. in your AlbumController 
 annotate with: 
 @Autowired
 create AlbumRepository object

 5. create a map request for the following routs:

 -  ("/addAlbum")
 you will find a page that contains a form that enables the user to insert info about the album he wants to add.
 this request should be of type post 
	A title 
	An artist 
	A song count 
	Length 
	Image url 
    once the user clicks on add button he will be redirected to the albums page. 
 
 -  (“/albums”)
You will find a page that will list all the albums added by the user 









  









