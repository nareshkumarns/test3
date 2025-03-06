package in.psa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestPsApplication {
	int x = 100;

	public static void main(String[] args) {
		SpringApplication.run(TestPsApplication.class, args);
	}

}
