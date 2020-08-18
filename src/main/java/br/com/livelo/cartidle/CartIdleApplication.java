package br.com.livelo.cartidle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableFeignClients
@SpringBootApplication
public class CartIdleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartIdleApplication.class, args);
	}

}
