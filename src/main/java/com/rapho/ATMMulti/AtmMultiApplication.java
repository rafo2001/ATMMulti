package com.rapho.ATMMulti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@SpringBootApplication
public class AtmMultiApplication {

	@GetMapping("tasaCambio")
	public String getMessage() {
		return "6.97";
	}

	public static void main(String[] args) {
		SpringApplication.run(AtmMultiApplication.class, args);
	}

}
