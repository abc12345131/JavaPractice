package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@MapperScan("com.example.demo.mapper")
@SpringBootApplication(scanBasePackages = {"com.example.demo"})
public class MainApplication {

	public static void main(String[] args) {
		// 1. Basic
		// SpringApplication.run(MainApplication.class, args);

		// 2. Advanced
		// SpringApplication application = new SpringApplication(MainApplication.class);
		// application.setBannerMode(Banner.Mode.OFF);
		// application.run(args);

		// 3. Fluent API
		new SpringApplicationBuilder()
				.sources(MainApplication.class)
				.bannerMode(org.springframework.boot.Banner.Mode.OFF)
				.run(args);
	}
}
