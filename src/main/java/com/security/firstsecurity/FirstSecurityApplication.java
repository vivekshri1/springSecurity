package com.security.firstsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
@ComponentScan({"com.security.firstsecurity.controller","com.security.firstsecurity.config"} )
public class FirstSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSecurityApplication.class, args);
	}

}
