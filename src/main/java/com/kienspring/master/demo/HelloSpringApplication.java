package com.kienspring.master.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication

public class HelloSpringApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HelloSpringApplication.class, args);
		GirlFriend girlFriend =context.getBean(GirlFriend.class);
		System.out.println("IntanceGirlfriend"+girlFriend);
		System.out.println("Outfit of girlfriend:"+girlFriend.outfit);

	}

}
