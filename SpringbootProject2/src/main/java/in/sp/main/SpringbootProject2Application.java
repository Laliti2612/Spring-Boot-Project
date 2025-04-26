package in.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages="in.sp.controller")
public class SpringbootProject2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProject2Application.class, args);
	}

}
