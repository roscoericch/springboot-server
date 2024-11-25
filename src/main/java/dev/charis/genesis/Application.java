package dev.charis.genesis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
	private static final Logger Log = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		Log.info("Application started successfully");
		Welcome welcomeMessage = (Welcome) context.getBean(Welcome.class); 
		System.out.println(welcomeMessage.getWelcomeMessage());
	}

}
