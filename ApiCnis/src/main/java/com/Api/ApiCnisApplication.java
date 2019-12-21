package com.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Api.Repository.TodoRepository;
import com.Api.entity.Todo;

@SpringBootApplication
public class ApiCnisApplication    {
	
	@Autowired  
	private  TodoRepository repository  ; 

	public static void main(String[] args) {
		SpringApplication.run(ApiCnisApplication.class, args);
	}


}
