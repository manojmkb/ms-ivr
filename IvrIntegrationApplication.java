package com.getinsured.msivr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;


@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "IVR API", version = "1.0", description = "APIs for IVR Integration  "))
public class IvrIntegrationApplication {
	public static void main(String[] args) {
		SpringApplication.run(IvrIntegrationApplication.class, args);
	}


	
}
