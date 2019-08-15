package com.example.demo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("account")
public interface GreetingClient {
	@RequestMapping("/books")
	List<Book> greeting();
}