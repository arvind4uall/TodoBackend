package com.arvind.todo;

import com.arvind.todo.springdata.TodoTaskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {
	@Autowired
	TodoTaskRepository repository;

	Logger logger= LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Data are- "+repository.findAll());
	}
}
