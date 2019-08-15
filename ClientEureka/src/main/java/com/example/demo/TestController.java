package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

	@Autowired
	GreetingClient proxyService;

	@RequestMapping("/dashboard")
	public List<Book> findme() {
		return proxyService.greeting();
	}
}
