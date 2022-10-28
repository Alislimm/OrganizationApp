package com.example.OrganizationApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {UserDetailsServiceAutoConfiguration.class})
@EnableFeignClients(basePackages = {"com.areeba.common", "com.example.OrganizationApp"})
@ComponentScan(basePackages = {"com.areeba.common", "com.areeba.security", "com.example.OrganizationApp"})
@EntityScan(basePackages = {"com.areeba.common", "com.example.OrganizationApp"})
@EnableJpaRepositories(basePackages = {"com.areeba.common", "com.example.OrganizationApp"})

public class OrganizationAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(OrganizationAppApplication.class, args);
	}

}
