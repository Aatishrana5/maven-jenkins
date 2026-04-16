package maven_jenkins.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DController {

	@RequestMapping("/test")
	public String getMessage() 
	{
		return "Welcome to Jenkins with Spring Boot!";
	}
	 @RequestMapping("/details")
	 public String getDetails() 
	 {
		 return "This is a sample application to demonstrate Jenkins integration with Spring Boot. uwu";
	 }
	}
