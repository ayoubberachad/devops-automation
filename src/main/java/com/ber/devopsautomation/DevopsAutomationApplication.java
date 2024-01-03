package com.ber.devopsautomation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DevopsAutomationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsAutomationApplication.class, args);
	}

}
