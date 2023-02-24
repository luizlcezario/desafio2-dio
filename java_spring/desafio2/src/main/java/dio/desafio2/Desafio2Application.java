package dio.desafio2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Desafio2Application {

	public static void main(String[] args) {
		SpringApplication.run(Desafio2Application.class, args);
	}

}
