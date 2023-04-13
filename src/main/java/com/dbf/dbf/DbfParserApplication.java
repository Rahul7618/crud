package com.dbf.dbf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan
public class DbfParserApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbfParserApplication.class, args);
	}

}
