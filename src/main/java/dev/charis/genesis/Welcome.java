package dev.charis.genesis;

import org.springframework.stereotype.Component;

@Component 
public class Welcome {
    public String getWelcomeMessage(){
        return "welcome to spring boot application";
    }
} 
