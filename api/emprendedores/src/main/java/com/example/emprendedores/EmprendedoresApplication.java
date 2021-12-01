package com.example.emprendedores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.example.request"})
@EntityScan("com.example.domain")
@EnableJpaRepositories("com.example.repository")
public class EmprendedoresApplication extends SpringBootServletInitializer {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(EmprendedoresApplication.class, args);
	}

}
