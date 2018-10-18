package com.tsys.fulapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class FulappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FulappApplication.class, args);
	}
}
