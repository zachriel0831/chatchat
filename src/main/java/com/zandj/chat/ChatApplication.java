package com.zandj.chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(scanBasePackages = {"com.zandj"}
		,exclude={DataSourceAutoConfiguration.class,SecurityAutoConfiguration.class})
public class ChatApplication {

	public static void main(String[] args) {
		//yes!
		SpringApplication.run(ChatApplication.class, args);
	}

}
