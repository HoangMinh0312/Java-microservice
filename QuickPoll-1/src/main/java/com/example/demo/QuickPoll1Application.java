package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@SpringBootApplication(scanBasePackages = { "controller,config,security" })
@EntityScan(basePackages = { "model" })
@EnableJpaRepositories("repository")
public class QuickPoll1Application {

	public static void main(String[] args) {
		SpringApplication.run(QuickPoll1Application.class, args);
	}

}
