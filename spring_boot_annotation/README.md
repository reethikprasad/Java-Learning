# Java-Learning

OP 12 Annotations of Spring Boot Framework

1. @SpringBootApplication
@EnableAutoConfiguration + @ComponentScan + @Configuration

2. @Configration
this is a configuration class and it will return bean
//config class are class which has methods which will be returning Spring beans the spring beans
//object that is returning wil be managed by spring container

3. @Bean
used under config class which returns beans handle by spring container

4. @Autowired
used to inject dependency/objects can be done on object setter and constr

5. @Component-its object will be managed by spring container

  @Controller (Component,MVC Contoller)
  @Service
  @Respository
6. @ComponentScan
if we want to use a class from another package to current package

7. @Qualifier
The @Qualifier annotation is used to resolve the autowiring conflict, when there are multiple beans of same type

8. @Lazy
it basically means it will not release the object of method which is not in use
	
@RequestMapping-used to map value to method

9. ResponseBody 
The @ResponseBody annotation tells a controller that the object returned is automatically serialized into JSON and passed back into the HttpResponse object


10. RequestBody
11. @RestController
12. @PathVariable
@RequestParam("email") String email