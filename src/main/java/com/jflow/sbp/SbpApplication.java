package com.jflow.sbp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value= {"com.jflow.sbp.mapper"})
public class SbpApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbpApplication.class, args);
	}

}
