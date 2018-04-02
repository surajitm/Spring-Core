# installation:
  ```
  1.Download STS.
  2.Create maven project
  3.Add spring-context dependency
  4.Run >mvn clean install
  
  * For easy reading of the bean file - create src file src/main/resources and 
    put all the applicationContext.xml there.
  
  ```

# Spring development process:
 ```
 1.Create bean configuration file.
 2.Create ApplicationContext[XML:ClassPathXMLApplicationContext]
 3.Retrieve beans.
 4.Use beans.
 5.close ApplicationContext.
 
 ```
 
 # Important question:
 
   * What is coupling and cohesion?
      ```
      #Coupling:
      Coupling is a measurement of how a class is dependent on other class.
      Generally loosely coupled classes are good class.
      EX: Loose Coupling is the central idea of spring DI.
      
      ```
      
      ```
      #Cohesion:
      Cohesion is a mesurement of how a class is related to other class.
      
      This is a low cohesion example:
      class Process{
         downloadWebContent();
         parseContent();
         storeContent();
      }
      
      #Apply cohesion:
      class Downloader{
          download();
      }
      
      class Parse(){
          parse();
      }
      
      class Store{
          store();
      }
      
      class App{
        Downloader.download();
        Parse.parse();
        Store.store();
      }

      ```
   * What is tight coupling and loose coupling?
     ```
     # Tight coupling: A class is fully depend on other class.So, if any code change is going to happen to dependency class it is going to affect the dependant class.
     
     # looseCoupling : A class is partially depend on other class.We switch any class implementation dynamically.
     ```
     
   * What is Spring beans?
   
   * What is Spring Container?
   
   * What are the container available ?
   
   * What is IOC?
   
   * What is dependency Injection?
   
   * Explain XML configuration for Constructor injection and Setter injection?
       * [Spring XML configuration](https://github.com/surajitm/spring-core/wiki/XML-configuration-spring) 
       
   * What is Component Scan?
       * [Component-Scan](https://github.com/surajitm/spring-core/wiki/Component-Scan-scan-using-XML-Configuration)
       
   * Explain Java configuration for constructor injection and Setter injection?
       * [Spring JAVA configuration](https://github.com/surajitm/spring-core/wiki/Spring-configuration-using-only-java)
       
 ## Misllenious : 
   * [Misllenious Question](https://github.com/surajitm/spring-core/wiki/Misllenious-Question)
   
 


