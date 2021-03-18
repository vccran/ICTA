package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String home() {
		int a =5;
		int b =10;
		a =+ 10;
		b+=5;
		return "Jenkins app work as expected.";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
