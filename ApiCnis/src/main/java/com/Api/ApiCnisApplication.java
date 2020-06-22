package com.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.CommandLinePropertySource;

import com.Api.Repository.TodoRepository;
import com.Api.entity.Todo;

@SpringBootApplication
public class ApiCnisApplication  implements  CommandLineRunner{
	
	@Autowired  
	private  TodoRepository repository  ; 

	public static void main(String[] args) {
		SpringApplication.run(ApiCnisApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	 Todo  todo  = new Todo()  ; 
	 todo.setName("mohammled");
	 
	 repository.save(todo) ;
		
	}


}
