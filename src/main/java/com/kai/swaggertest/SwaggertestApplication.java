package com.kai.swaggertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@RestController
@SpringBootApplication
@EnableSwagger2
public class SwaggertestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggertestApplication.class, args);
	}

	@RequestMapping("/hallo")
	public String hallo () {
		return "hallo";
	}

}
