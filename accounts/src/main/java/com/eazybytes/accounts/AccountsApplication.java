package com.eazybytes.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
//@OpenAPIDefinition(
//		info = @Info(
//				title = "Accounts microservice REST API Documentation",
//				description = "EazyBank Accounts microservice REST API Documentation",
//				version = "v1",
//				contact = @Contact(
//						name = "Madan Reddy",
//						email = "tutor@eazybytes.com",
//						url = "https://www.eazybytes.com"
//				),
//				license = @License(
//						name = "Apache 2.0",
//						url = "https://www.eazybytes.com"
//				)
//		),
//		externalDocs = @ExternalDocumentation(
//				description =  "EazyBank Accounts microservice REST API Documentation",
//				url = "https://www.eazybytes.com/swagger-ui.html"
//		)
//)
@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableFeignClients
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
