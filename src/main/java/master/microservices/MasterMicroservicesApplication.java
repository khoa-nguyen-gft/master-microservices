package master.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@ComponentScan({"master.microservices"})
public class MasterMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasterMicroservicesApplication.class, args);
		
	}

}
