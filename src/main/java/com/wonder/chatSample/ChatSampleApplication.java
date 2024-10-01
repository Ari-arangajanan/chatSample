package com.wonder.chatSample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.wonder.chatSample.mapper")
public class ChatSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatSampleApplication.class, args);
	}

}
